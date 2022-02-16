/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Untils;

import Helper.MsgBox;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Admin
 */
public class UtilityHelper {

    public static boolean CheckNull(JTextField txt, String title) {
        String check = txt.getText();
        if (check.isEmpty()) {
            MsgBox.alert(txt.getRootPane(), title + " Không để trống");
            txt.setBackground(Color.RED);
            return true;
        }
        return false;
    }

    public static boolean checkNullPass(JPasswordField txt, String title) {
        String pass = new String(txt.getPassword());
        if (pass.trim().isEmpty()) {
            MsgBox.alert(txt.getRootPane(), title + " Không được để trống");
            txt.setBackground(Color.red);
            return true;
        }
        return false;
    }

    public static boolean checkPass(JPasswordField txt, String title) {
        if (UtilityHelper.checkNullPass(txt, title)) {
            return true;
        }
        String pass = new String(txt.getPassword());
        String mau = "\\w+";
        if (!pass.matches(mau)) {
            MsgBox.alert(txt.getRootPane(), title + "Không được chứa ký tự đặc biệt");
            txt.setBackground(Color.red);
            return true;
        }
        return false;
    }

    public static boolean CheckNullArea(JTextArea txt, String title) {
        String check = txt.getText();
        if (check.isEmpty()) {
            MsgBox.alert(txt.getRootPane(), title + " Không để trống");
            txt.setBackground(Color.RED);
            return true;
        }
        return false;
    }

    public static boolean checkLength(JTextField txt, int doDai, String title) {
        if (UtilityHelper.CheckNull(txt, title)) {
            return true;
        }
        String check = txt.getText();
        if (check.length() > doDai) {
            MsgBox.alert(txt.getRootPane(), title + " Không quá " + doDai + " ký tự");
            txt.setBackground(Color.red);
            return true;
        }
        return false;
    }

    public static boolean checkSODuong(JTextField txt, String title) {
        if (UtilityHelper.CheckNull(txt, title)) {
            return true;
        }
        try {
            int i = Integer.parseInt(txt.getText());
            if (i < 0) {
                MsgBox.alert(txt.getRootPane(), title + " lớn hơn 0");
                txt.setBackground(Color.red);
                return true;
            }
        } catch (Exception e) {
            MsgBox.alert(txt.getRootPane(), title + " phải là số nguyên dương");
            txt.setBackground(Color.red);
            return true;
        }
        return false;
    }

    public static boolean checkSoThuc(JTextField txt, String title) {
        if (UtilityHelper.CheckNull(txt, title)) {
            return true;
        }
        try {
            float i = Float.parseFloat(txt.getText());
            if (i < 0) {
                MsgBox.alert(txt.getRootPane(), title + " lớn hơn 0");
                txt.setBackground(Color.red);
                return true;
            }
        } catch (Exception e) {
            MsgBox.alert(txt.getRootPane(), title + " phải là số");
            txt.setBackground(Color.red);
            return true;
        }
        return false;
    }

    public static boolean CheckHinh(JLabel lbl) {
        if (lbl.getToolTipText().equals("")) {
            MsgBox.alert(lbl.getRootPane(), "Hình không để trống");
            return true;
        }
        return false;
    }
}
