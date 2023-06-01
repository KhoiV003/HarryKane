/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GiaoDienQL;

import java.awt.Container;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Le Anh Tuan Dung
 */
public class QLNV extends javax.swing.JFrame {
    private TrangChuQL mainql;
    /**
     * Creates new form QLNV
     */
    public QLNV() {
        initComponents();
        edit();
    }
    
    public QLNV(TrangChuQL frame) {
        initComponents();
        this.mainql = frame;
        edit();
    }
    
    public void edit()
    {
        /*String[] columnNames = {"Họ và tên", "Ngày sinh", "Địa chỉ", "Email", "Lương", "Tên đăng nhập"};
        Object[][] data = {
            {"Trần Quang  Huy", "09/09/1999", "132 Tran Hung Dao street", "abc@gmail.com", 100, "trangquanghuy"},
            {"Nguyễn Quang Linh", "15/07/1998", "Tp.HCM", "quanglinh@gmail.com", 120, "nguyenquanglinh"},
            {"Nguyễn Anh Trường", "16/05/1998", "Tp.HCM", "anhtruong@gmail.com", 120, "nguyenanhtruong"}
        };
        tableModel = new DefaultTableModel(data, columnNames);*/

        // Tạo JTable với DefaultTableModel
        DefaultTableModel model = (DefaultTableModel) this.jTable1.getModel();
        model.addRow(new Object[] {"NV01" , "Trần Quang Huy", "09/09/1999", "132 Tran Hung Dao street", "abc@gmail.com", 100, "trangquanghuy"});
        model.addRow(new Object[] {"NV02", "Nguyễn Quang Linh", "15/07/1998", "Tp.HCM", "quanglinh@gmail.com", 120, "nguyenquanglinh"});
        model.addRow(new Object[] {"NV03", "Nguyễn Anh Trường", "16/05/1998", "Tp.HCM", "anhtruong@gmail.com", 120, "nguyenanhtruong"});
    }

    public JTable get_jtable()
    {
        return this.jTable1;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(39, 55, 60));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã nhân viên", "Họ và tên", "Ngày sinh", "Địa chỉ", "Email", "Lương", "Tài khoản"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Thêm nhân viên");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Xóa");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Sửa");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3)
                .addGap(12, 12, 12))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        mainql.show_window(new ThemNV(this));
    }//GEN-LAST:event_jButton1ActionPerformed

    public void show_qlnv(){
        this.mainql.show_window(this);
    }
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int selectedRow = this.jTable1.getSelectedRow();
        if(selectedRow != -1){
            int option = JOptionPane.showOptionDialog(null, "Xác nhận xóa nhân viên này?", "Confirmation",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);

            if (option == JOptionPane.YES_OPTION) {
                DefaultTableModel model = (DefaultTableModel) this.jTable1.getModel();
                model.removeRow(selectedRow);
            } else if (option == JOptionPane.NO_OPTION) {
                 JOptionPane.showMessageDialog(null, "Hủy");
            }
        }
        else{
            JOptionPane.showMessageDialog(this, "Vui lòng nhọn nhân viên để xóa!", "Thông báo", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        // TODO add your handling code here:
        String manv_input =  this.jTextField1.getText();
        String Hoten_input = this.jTextField1.getText();
        String tk_input = this.jTextField1.getText();
        Object[][] data = {
                    
                };
                String[] colum = {"Mã nhân viên", "Họ và tên", "Ngày sinh", "Địa chỉ", "Email", "Lương", "Tài khoản"};
                DefaultTableModel model_new = new DefaultTableModel(data, colum);
                JTable table_new = new JTable(model_new);
        
        //DefaultTableModel model = (DefaultTableModel) this.jTable1.getModel();
        if(this.jTextField1.getText().length()==0){
            this.jScrollPane1.setViewportView(null);
                this.jScrollPane1.revalidate();
                this.jScrollPane1.repaint();
                this.jScrollPane1.setViewportView(this.jTable1);
                this.jScrollPane1.revalidate();
                this.jScrollPane1.repaint();
        }else{
        for(int row = 0; row < this.jTable1.getRowCount(); row++)
        {
            String manv = (String) this.jTable1.getValueAt(row, 0);
            String Hoten = (String) this.jTable1.getValueAt(row, 1);
            String ngaysinh = (String) this.jTable1.getValueAt(row, 2);
            String diachi = (String) this.jTable1.getValueAt(row, 3);
            String email = (String) this.jTable1.getValueAt(row, 4);
            Integer luong = (Integer) this.jTable1.getValueAt(row, 5);
            String taikhoan = (String) this.jTable1.getValueAt(row, 6);
            if(manv.contains(manv_input) || Hoten.contains(Hoten_input) || taikhoan.contains(tk_input)){
                String hoten = (String) this.jTable1.getValueAt(row, 1);
                //String ngaysinh = (String) this.jTable1.getValueAt(row, 2);
                //String diachi = (String) this.jTable1.getValueAt(row, 3);
                //String email = (String) this.jTable1.getValueAt(row, 4);
                //Integer luong = (Integer) this.jTable1.getValueAt(row, 5);
                //String taikhoan = (String) this.jTable1.getValueAt(row, 6);
                /*int Luong = 0;
                        try {
                            Luong = Integer.parseInt(luong);
                        } catch (NumberFormatException e) {
                             // Xử lý lỗi khi không thể chuyển đổi thành số nguyên
                             e.printStackTrace();
                        }*/
                //Xóa các components trong ScrollPane
                //Container content = (Container) this.jScrollPane1.getViewport().getView();
                //content.removeAll();
                this.jScrollPane1.setViewportView(null);
                this.jScrollPane1.revalidate();
                this.jScrollPane1.repaint();
                //Tạo jtable mới
                //Object[][] data = {
                 // {manv , hoten, ngaysinh, diachi, email, luong, taikhoan}  
                //};
                //String[] colum = {"Mã nhân viên", "Họ và tên", "Ngày sinh", "Địa chỉ", "Email", "Lương", "Tài khoản"};
                //DefaultTableModel model_new = new DefaultTableModel(data, colum);
                //JTable table_new = new JTable(model_new);
                model_new.addRow(new Object[] {manv , Hoten, ngaysinh, diachi, email, luong, taikhoan});
                //this.jScrollPane1.setViewportView(table_new);
                //this.jScrollPane1.revalidate();
                //this.jScrollPane1.repaint();
            }           
        }
            this.jScrollPane1.setViewportView(table_new);
                this.jScrollPane1.revalidate();
                this.jScrollPane1.repaint();
        
        }
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(QLNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QLNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QLNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QLNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QLNV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

    public Object get_jtable_obj() {
        return this.jTable1;
    }
}
