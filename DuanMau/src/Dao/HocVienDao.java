/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Helper.JdbcHelper;
import MoDel.HocVien;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class HocVienDao extends EdusysDao<HocVien, Object> {

    private static HocVien getMOdel(ResultSet rs) throws SQLException {
        HocVien hv = new HocVien();
        hv.setMaHV(rs.getInt("MaHV"));
        hv.setMaKH(rs.getInt("MaKH"));
        hv.setMaNH(rs.getString("MaNH"));
        hv.setDiem(rs.getFloat("Diem"));
        return hv;
    }

    @Override
    public void insert(HocVien entity) {
        String sql = "insert into HocVien(MaKH,MaNH,Diem) Values(?,?,?)";
        int i = JdbcHelper.update(sql, entity.getMaKH(), entity.getMaNH(), entity.getDiem());
    }

    @Override
    public void delete(Object entity) {
        String sql = "Delete from HocVien where MaHV = ?";
        int i = JdbcHelper.update(sql, entity);
    }

    @Override
    public void update(HocVien entity) {
        String sql = "Update HocVien set Diem = ? where MaHV = ?";
        int i = JdbcHelper.update(sql, entity.getDiem(), entity.getMaHV());
    }

    @Override
    public List<HocVien> SelectALL() {
        String sql = "select * from HocVien";
        return selectBySQL(sql);
    }

    @Override
    public HocVien SelectByID(Object entity) {
        try {
            String sql = "select * from HocVien where MaHV = ?";
            ResultSet rs = JdbcHelper.query(sql, entity);
            HocVien hv = null;
            if (rs.next()) {
                hv = HocVienDao.getMOdel(rs);
                return hv;
            }
            rs.getStatement().close();
            return null;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected List<HocVien> selectBySQL(String sql, Object... args) {
        try {
            ResultSet rs = null;
            try {
                List<HocVien> list = new ArrayList<>();
                rs = JdbcHelper.query(sql, args);
                while (rs.next()) {
                    HocVien hv = HocVienDao.getMOdel(rs);
                    list.add(hv);
                }
                return list;
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
