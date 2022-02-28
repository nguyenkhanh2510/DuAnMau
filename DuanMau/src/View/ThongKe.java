/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Dao.KhoaHocDao;
import Dao.ThongKeDao;
import Helper.Auth;
import MoDel.KhoaHoc;
import Untils.UtilityHelper;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class ThongKe extends javax.swing.JDialog {

    ThongKeDao tkdao = new ThongKeDao();
    KhoaHocDao khdao = new KhoaHocDao();
    
    public ThongKe(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        init();
    }

    void init() {
        this.setLocationRelativeTo(null);
        this.fillTableNguoiHoc();
        this.fillComboboxKhoaHOc();
        this.filltableBangDiem();
        this.fillTableChuyende();
        this.fillcomboboxDoanhThu();
        this.filltableDoanhThu();
        this.selectTab(0);
        if (!Auth.isManager()) {
            tabs.remove(3);
        }
    }
    
    public void selectTab(int index) {
        tabs.setSelectedIndex(index);
    }

    void fillComboboxKhoaHOc() {
        DefaultComboBoxModel mol = (DefaultComboBoxModel) this.cbokhoahoc.getModel();
        mol.removeAllElements();
        List<KhoaHoc> list = khdao.SelectALL();
        for (KhoaHoc kh : list) {
            mol.addElement(kh);
        }
    }
    
    void filltableBangDiem() {
        DefaultTableModel mol = (DefaultTableModel)tbltkbangdiem.getModel();
        mol.setRowCount(0);
        KhoaHoc kh = (KhoaHoc)cbokhoahoc.getSelectedItem();
        List<Object[]> list = tkdao.getBangDiem(kh.getMaKH());
        for (Object[] row : list) {
            double diem = (Double) row[2];
            mol.addRow(new Object[]{
                row[0], row[1], diem, UtilityHelper.XepLoai(diem)
            });
        }   
    }
    
    void fillTableNguoiHoc() {
        DefaultTableModel mol = (DefaultTableModel)tbltknguoihoc.getModel();
        mol.setRowCount(0);
        List<Object[]> list = tkdao.getLuongNguoiHoc();
        for (Object[] row : list) {
            mol.addRow(new Object[]{
                row[0], row[1], row[2], row[3]
            });
        }
    }

    void fillTableChuyende() {
        DefaultTableModel mol = (DefaultTableModel) tbltkTHD.getModel();
        mol.setRowCount(0);
        List<Object[]> list = tkdao.getDiemChuyenDe();
        for (Object[] row : list) {
            mol.addRow(new Object[]{
                row[0], row[1], row[2], row[3], row[4]
            });
        }
    }

    void fillcomboboxDoanhThu() {
        DefaultComboBoxModel mol = (DefaultComboBoxModel) cbonam.getModel();
        mol.removeAllElements();
        List<Integer> list = khdao.selectbyYear();
        for (Integer year : list) {
            mol.addElement(year);
        }
    }

    void filltableDoanhThu() {
        DefaultTableModel mol = (DefaultTableModel)tbldoanhthu.getModel();
        mol.setRowCount(0);
        int nam = (Integer) this.cbonam.getSelectedItem();
        List<Object[]> list = this.tkdao.getDoanhThu(nam);
        for (Object[] row : list) {
            mol.addRow(row);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tabs = new javax.swing.JTabbedPane();
        pnlnguoihoc = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbltknguoihoc = new javax.swing.JTable();
        pnlbangdiem = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        cbokhoahoc = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbltkbangdiem = new javax.swing.JTable();
        pnltongdiem = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbltkTHD = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        pnlhien = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cbonam = new javax.swing.JComboBox<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbldoanhthu = new javax.swing.JTable();
        pnlAN = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tbldoanhthu1 = new javax.swing.JTable();
        cbonam1 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tổng Hợp Thống Kê");

        tbltknguoihoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Năm", "Số người học", "Đầu tiên ", "Sau Cùng"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbltknguoihoc);

        javax.swing.GroupLayout pnlnguoihocLayout = new javax.swing.GroupLayout(pnlnguoihoc);
        pnlnguoihoc.setLayout(pnlnguoihocLayout);
        pnlnguoihocLayout.setHorizontalGroup(
            pnlnguoihocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 722, Short.MAX_VALUE)
        );
        pnlnguoihocLayout.setVerticalGroup(
            pnlnguoihocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlnguoihocLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 142, Short.MAX_VALUE))
        );

        tabs.addTab("NGƯỜI HỌC", pnlnguoihoc);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Calendar.png"))); // NOI18N
        jLabel3.setText("KHÓA HỌC");

        cbokhoahoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbokhoahocActionPerformed(evt);
            }
        });

        tbltkbangdiem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã NH", "Họ Và Tên", "Điểm", "Xếp Loại"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tbltkbangdiem);

        javax.swing.GroupLayout pnlbangdiemLayout = new javax.swing.GroupLayout(pnlbangdiem);
        pnlbangdiem.setLayout(pnlbangdiemLayout);
        pnlbangdiemLayout.setHorizontalGroup(
            pnlbangdiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlbangdiemLayout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbokhoahoc, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 722, Short.MAX_VALUE)
        );
        pnlbangdiemLayout.setVerticalGroup(
            pnlbangdiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlbangdiemLayout.createSequentialGroup()
                .addGroup(pnlbangdiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbokhoahoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 146, Short.MAX_VALUE))
        );

        tabs.addTab("BẢNG ĐIỂM", pnlbangdiem);

        tbltkTHD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Chuyên Đề", "Tổng Số HV", "Cao Nhất", "Thấp Nhất", "Điểm TB"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tbltkTHD);

        javax.swing.GroupLayout pnltongdiemLayout = new javax.swing.GroupLayout(pnltongdiem);
        pnltongdiem.setLayout(pnltongdiemLayout);
        pnltongdiemLayout.setHorizontalGroup(
            pnltongdiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 722, Short.MAX_VALUE)
        );
        pnltongdiemLayout.setVerticalGroup(
            pnltongdiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnltongdiemLayout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 176, Short.MAX_VALUE))
        );

        tabs.addTab("TỔNG HỢP ĐIỂM", pnltongdiem);

        jPanel4.setLayout(new java.awt.CardLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Date.png"))); // NOI18N
        jLabel2.setText("Năm");

        cbonam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbonamActionPerformed(evt);
            }
        });

        tbldoanhthu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Chuyên Đề", "Số Khóa", "Số HV", "Doanh Thu", "HP Cao Nhất", "HP Thấp Nhất", "HP Trung Bình"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tbldoanhthu);

        javax.swing.GroupLayout pnlhienLayout = new javax.swing.GroupLayout(pnlhien);
        pnlhien.setLayout(pnlhienLayout);
        pnlhienLayout.setHorizontalGroup(
            pnlhienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlhienLayout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbonam, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlhienLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 702, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlhienLayout.setVerticalGroup(
            pnlhienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlhienLayout.createSequentialGroup()
                .addGroup(pnlhienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(pnlhienLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(cbonam, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.add(pnlhien, "card2");

        tbldoanhthu1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Chuyên Đề", "Số Khóa", "Số HV", "Doanh Thu", "HP Cao Nhất", "HP Thấp Nhất", "HP Trung Bình"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane5.setViewportView(tbldoanhthu1);

        cbonam1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbonam1ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Date.png"))); // NOI18N
        jLabel6.setText("Năm");

        javax.swing.GroupLayout pnlANLayout = new javax.swing.GroupLayout(pnlAN);
        pnlAN.setLayout(pnlANLayout);
        pnlANLayout.setHorizontalGroup(
            pnlANLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlANLayout.createSequentialGroup()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbonam1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlANLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 702, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlANLayout.setVerticalGroup(
            pnlANLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlANLayout.createSequentialGroup()
                .addGroup(pnlANLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(pnlANLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(cbonam1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jPanel4.add(pnlAN, "card3");

        tabs.addTab("DOANH THU", jPanel4);

        tabs.setSelectedIndex(1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabs)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tabs, javax.swing.GroupLayout.PREFERRED_SIZE, 404, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbokhoahocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbokhoahocActionPerformed
        this.filltableBangDiem();
    }//GEN-LAST:event_cbokhoahocActionPerformed

    private void cbonamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbonamActionPerformed
        this.filltableDoanhThu();
    }//GEN-LAST:event_cbonamActionPerformed

    private void cbonam1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbonam1ActionPerformed
        this.filltableDoanhThu();
    }//GEN-LAST:event_cbonam1ActionPerformed

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
            java.util.logging.Logger.getLogger(ThongKe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThongKe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThongKe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThongKe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ThongKe dialog = new ThongKe(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbokhoahoc;
    private javax.swing.JComboBox<String> cbonam;
    private javax.swing.JComboBox<String> cbonam1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JPanel pnlAN;
    private javax.swing.JPanel pnlbangdiem;
    private javax.swing.JPanel pnlhien;
    private javax.swing.JPanel pnlnguoihoc;
    private javax.swing.JPanel pnltongdiem;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JTable tbldoanhthu;
    private javax.swing.JTable tbldoanhthu1;
    private javax.swing.JTable tbltkTHD;
    private javax.swing.JTable tbltkbangdiem;
    private javax.swing.JTable tbltknguoihoc;
    // End of variables declaration//GEN-END:variables
}
