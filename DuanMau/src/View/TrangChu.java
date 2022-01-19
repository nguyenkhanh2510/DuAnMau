package View;

import Untils.XImage;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Timer;

public class TrangChu extends javax.swing.JFrame {

    public TrangChu() {
        initComponents();
        //setLocationRelativeTo(null);
        init();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        btndangxuat = new javax.swing.JButton();
        btnketthuc = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JToolBar.Separator();
        btnchuyende = new javax.swing.JButton();
        btnkhoahoc = new javax.swing.JButton();
        btnnguoihoc = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JToolBar.Separator();
        btnhuongdan = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblDongHo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnidangnhap = new javax.swing.JMenuItem();
        mnidangxuat = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        mnidoimk = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mniketthu = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mninguoihoc = new javax.swing.JMenuItem();
        mmnichuyende = new javax.swing.JMenuItem();
        mnikhoahoc = new javax.swing.JMenuItem();
        mniqlnhanvien = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mniNHTN = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        mniBDK = new javax.swing.JMenuItem();
        mniDTK = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        mniDTCD = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        mniHDSD = new javax.swing.JMenuItem();
        mniGTSPP = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HỆ THỐNG QUẢN LÝ ĐÀO TẠO");

        jToolBar1.setRollover(true);

        btndangxuat.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btndangxuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Log out.png"))); // NOI18N
        btndangxuat.setText("Đăng Xuất");
        btndangxuat.setFocusable(false);
        btndangxuat.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btndangxuat.setMargin(new java.awt.Insets(2, 16, 2, 16));
        btndangxuat.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btndangxuat);

        btnketthuc.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnketthuc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Stop.png"))); // NOI18N
        btnketthuc.setText("Kết Thúc");
        btnketthuc.setFocusable(false);
        btnketthuc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnketthuc.setMargin(new java.awt.Insets(2, 16, 2, 16));
        btnketthuc.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnketthuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnketthucActionPerformed(evt);
            }
        });
        jToolBar1.add(btnketthuc);
        jToolBar1.add(jSeparator2);

        btnchuyende.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnchuyende.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Lists.png"))); // NOI18N
        btnchuyende.setText("Chuyên Đề");
        btnchuyende.setFocusable(false);
        btnchuyende.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnchuyende.setMargin(new java.awt.Insets(2, 16, 2, 16));
        btnchuyende.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnchuyende);

        btnkhoahoc.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnkhoahoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Certificate.png"))); // NOI18N
        btnkhoahoc.setText("Khoá Học");
        btnkhoahoc.setFocusable(false);
        btnkhoahoc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnkhoahoc.setMargin(new java.awt.Insets(2, 16, 2, 16));
        btnkhoahoc.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnkhoahoc);

        btnnguoihoc.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnnguoihoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Clien list.png"))); // NOI18N
        btnnguoihoc.setText("Người Học");
        btnnguoihoc.setFocusable(false);
        btnnguoihoc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnnguoihoc.setMargin(new java.awt.Insets(2, 16, 2, 16));
        btnnguoihoc.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnnguoihoc);
        jToolBar1.add(jSeparator3);

        btnhuongdan.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnhuongdan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Help.png"))); // NOI18N
        btnhuongdan.setText("Hướng Dẫn");
        btnhuongdan.setFocusable(false);
        btnhuongdan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnhuongdan.setMargin(new java.awt.Insets(2, 16, 2, 16));
        btnhuongdan.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(btnhuongdan);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Info.png"))); // NOI18N
        jLabel2.setText("HỆ THỐNG ĐÀO TẠO");

        lblDongHo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Alarm.png"))); // NOI18N
        lblDongHo.setText("jLabel3");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblDongHo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblDongHo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/fptpoly.png"))); // NOI18N
        jLabel1.setOpaque(true);

        jMenu1.setText("Hệ thống");
        jMenu1.setMargin(new java.awt.Insets(1, 3, 1, 1));

        mnidangnhap.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnidangnhap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Key.png"))); // NOI18N
        mnidangnhap.setText("Đăng nhập");
        mnidangnhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnidangnhapActionPerformed(evt);
            }
        });
        jMenu1.add(mnidangnhap);

        mnidangxuat.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnidangxuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Exit.png"))); // NOI18N
        mnidangxuat.setText("Đăng xuất");
        jMenu1.add(mnidangxuat);
        jMenu1.add(jSeparator6);

        mnidoimk.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_3, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnidoimk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Refresh.png"))); // NOI18N
        mnidoimk.setText("Đổi mật khẩu");
        mnidoimk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnidoimkActionPerformed(evt);
            }
        });
        jMenu1.add(mnidoimk);
        jMenu1.add(jSeparator1);

        mniketthu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_4, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniketthu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Stop.png"))); // NOI18N
        mniketthu.setText("Kết thúc");
        mniketthu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniketthuActionPerformed(evt);
            }
        });
        jMenu1.add(mniketthu);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Quản lý");
        jMenu2.setMargin(new java.awt.Insets(1, 1, 1, 1));
        jMenu2.setMaximumSize(new java.awt.Dimension(54, 32767));
        jMenu2.setPreferredSize(new java.awt.Dimension(60, 19));

        mninguoihoc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_U, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mninguoihoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Clien list.png"))); // NOI18N
        mninguoihoc.setText("Người Học");
        jMenu2.add(mninguoihoc);

        mmnichuyende.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mmnichuyende.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Lists.png"))); // NOI18N
        mmnichuyende.setText("Chuyên Đề");
        jMenu2.add(mmnichuyende);

        mnikhoahoc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnikhoahoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Certificate.png"))); // NOI18N
        mnikhoahoc.setText("Khoá Học");
        mnikhoahoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnikhoahocActionPerformed(evt);
            }
        });
        jMenu2.add(mnikhoahoc);

        mniqlnhanvien.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniqlnhanvien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/User group.png"))); // NOI18N
        mniqlnhanvien.setText("Nhân Viên");
        jMenu2.add(mniqlnhanvien);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Thống Kê");
        jMenu3.setMargin(new java.awt.Insets(1, 1, 1, 1));
        jMenu3.setPreferredSize(new java.awt.Dimension(63, 19));

        mniNHTN.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniNHTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Clien list.png"))); // NOI18N
        mniNHTN.setText("Người Học Từng năm");
        jMenu3.add(mniNHTN);
        jMenu3.add(jSeparator4);

        mniBDK.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_J, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniBDK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Lists.png"))); // NOI18N
        mniBDK.setText("Bảng Điểm Khoá");
        jMenu3.add(mniBDK);

        mniDTK.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_K, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniDTK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Certificate.png"))); // NOI18N
        mniDTK.setText("Bảng Điểm Từng Khoá");
        mniDTK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDTKActionPerformed(evt);
            }
        });
        jMenu3.add(mniDTK);
        jMenu3.add(jSeparator5);

        mniDTCD.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniDTCD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/User group.png"))); // NOI18N
        mniDTCD.setText("Doanh Thu Từng Chuyên Đề");
        jMenu3.add(mniDTCD);

        jMenuBar1.add(jMenu3);

        jMenu5.setText("Trợ Giúp");
        jMenu5.setMargin(new java.awt.Insets(1, 1, 1, 1));
        jMenu5.setPreferredSize(new java.awt.Dimension(63, 19));

        mniHDSD.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_5, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniHDSD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Help.png"))); // NOI18N
        mniHDSD.setText("Hướng dẫn sử dụng");
        mniHDSD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniHDSDActionPerformed(evt);
            }
        });
        jMenu5.add(mniHDSD);

        mniGTSPP.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_6, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mniGTSPP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Info.png"))); // NOI18N
        mniGTSPP.setText("Giới Thiệu sản phẩm");
        mniGTSPP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniGTSPPActionPerformed(evt);
            }
        });
        jMenu5.add(mniGTSPP);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 771, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnidoimkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnidoimkActionPerformed

    }//GEN-LAST:event_mnidoimkActionPerformed

    private void mnikhoahocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnikhoahocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnikhoahocActionPerformed

    private void mniDTKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDTKActionPerformed

    }//GEN-LAST:event_mniDTKActionPerformed

    private void mniHDSDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniHDSDActionPerformed

    }//GEN-LAST:event_mniHDSDActionPerformed

    private void mniGTSPPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniGTSPPActionPerformed

    }//GEN-LAST:event_mniGTSPPActionPerformed

    private void btnketthucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnketthucActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnketthucActionPerformed

    private void mnidangnhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnidangnhapActionPerformed
        new DangNhap(this, true).setVisible(true);
    }//GEN-LAST:event_mnidangnhapActionPerformed

    private void mniketthuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniketthuActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mniketthuActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrangChu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrangChu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnchuyende;
    private javax.swing.JButton btndangxuat;
    private javax.swing.JButton btnhuongdan;
    private javax.swing.JButton btnketthuc;
    private javax.swing.JButton btnkhoahoc;
    private javax.swing.JButton btnnguoihoc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator2;
    private javax.swing.JToolBar.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblDongHo;
    private javax.swing.JMenuItem mmnichuyende;
    private javax.swing.JMenuItem mniBDK;
    private javax.swing.JMenuItem mniDTCD;
    private javax.swing.JMenuItem mniDTK;
    private javax.swing.JMenuItem mniGTSPP;
    private javax.swing.JMenuItem mniHDSD;
    private javax.swing.JMenuItem mniNHTN;
    private javax.swing.JMenuItem mnidangnhap;
    private javax.swing.JMenuItem mnidangxuat;
    private javax.swing.JMenuItem mnidoimk;
    private javax.swing.JMenuItem mniketthu;
    private javax.swing.JMenuItem mnikhoahoc;
    private javax.swing.JMenuItem mninguoihoc;
    private javax.swing.JMenuItem mniqlnhanvien;
    // End of variables declaration//GEN-END:variables

    private void init() {
        this.setLocationRelativeTo(null);
        this.setIconImage(XImage.getAppIcon());
        new ChaoDialog(this, true).setVisible(true);
        new DangNhap(this, true).setVisible(true);
        new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date d = new Date();
                SimpleDateFormat formater = new SimpleDateFormat("hh:mm:ss aa");
                String text = formater.format(d);
                lblDongHo.setText(text);
            }
        }).start();
    }
}
