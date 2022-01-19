/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcHelper {

    private static String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static String url = "jdbc:sqlserver://localhost:" + 1433 + ";DatabaseName=DuAnMau";
    private static String user = "sa";
    private static String pass = "123456";

    static {
        try {
            Class.forName(driver);
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

    public static PreparedStatement getPrepare(String sql, Object... args) throws SQLException {

        Connection con = DriverManager.getConnection(url, user, pass);
        PreparedStatement ps;
        if (sql.startsWith("{")) {

            ps = con.prepareCall(sql);
        } else {
            ps = con.prepareStatement(sql);
        }
        for (int i = 0; i < args.length; i++) {
            ps.setObject(i + 1, args[i]);
        }
        return ps;
    }

    public static ResultSet query(String sql, Object... args) throws SQLException {
        PreparedStatement ps = getPrepare(sql, args);
        return ps.executeQuery();
    }

    public static int update(String sql, Object... args) {
        try {
            PreparedStatement ps = getPrepare(sql, args);
            try {
                return ps.executeUpdate();
            } finally {
                ps.getConnection().close();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static Object Value(String sql, Object... args) {
        try {
            ResultSet rs = JdbcHelper.query(sql, args);
            if (rs.next()) {
                return rs.getObject(0);
            }
            rs.getStatement().getConnection().close();
            return null;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
