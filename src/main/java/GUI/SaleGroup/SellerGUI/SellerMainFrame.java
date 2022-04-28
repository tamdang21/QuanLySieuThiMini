package GUI.SaleGroup.SellerGUI;

import DAL.DataAcessObject.SanPhamDAO;
import DAL.DataModels.ChiTietHoaDon;
import DAL.DataModels.SanPham;
import GUI.SaleGroup.LoginGui.Component.Button;
import GUI.SaleGroup.LoginGui.Component.ButtonUI;
import GUI.SaleGroup.SellerGUI.Component.MenuItem;
import GUI.SaleGroup.SellerGUI.Component.OrderItem;
import GUI.SaleGroup.SellerGUI.Component.ScrollPanel;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.ScrollPane;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author huykh
 */
public class SellerMainFrame extends javax.swing.JFrame {

    /**
     * Creates new form SellerMainFrame
     */
    public SellerMainFrame() {
        initComponents();
        init();
        this.getContentPane().setBackground(Color.decode("#189AB4"));
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        itemContainer = new GUI.SaleGroup.SellerGUI.Component.RoundPanel();
        filterPanel = new javax.swing.JPanel();
        textFieldIcon1 = new GUI.SaleGroup.SellerGUI.Component.TextFieldIcon();
        jComboBox1 = new javax.swing.JComboBox<>();
        mainContainer = new GUI.SaleGroup.SellerGUI.Component.RoundPanel();
        spaceBottom = new javax.swing.JPanel();
        paymentPanel = new GUI.SaleGroup.SellerGUI.Component.RoundPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        paymentInfo = new javax.swing.JPanel();
        lbTotalMoney = new javax.swing.JLabel();
        lbDiscount = new javax.swing.JLabel();
        lbMoney = new javax.swing.JLabel();
        lbTextTotal = new javax.swing.JLabel();
        lbTextDiscount = new javax.swing.JLabel();
        lbTextMoney = new javax.swing.JLabel();
        txtPhoneNumber = new GUI.SaleGroup.SellerGUI.Component.TextFieldIcon();
        txtVoucher = new GUI.SaleGroup.SellerGUI.Component.TextFieldIcon();
        lbVoucher = new javax.swing.JLabel();
        lbsoDt = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        leftPanel = new GUI.SaleGroup.SellerGUI.Component.RoundPanel();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        imagePanel1 = new GUI.SaleGroup.SellerGUI.Component.ImagePanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1080, 620));
        getContentPane().setLayout(new java.awt.BorderLayout(15, 0));

        itemContainer.setBackground(new java.awt.Color(24, 154, 180));
        itemContainer.setPreferredSize(new java.awt.Dimension(300, 300));
        itemContainer.setRadius(0);
        itemContainer.setLayout(new java.awt.BorderLayout(15, 15));

        filterPanel.setBackground(new java.awt.Color(24, 154, 180));
        filterPanel.setPreferredSize(new java.awt.Dimension(650, 55));

        textFieldIcon1.setTextHeadIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/SaleGroup/SellerGUI/Image/search.png"))); // NOI18N
        textFieldIcon1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldIcon1ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "đồ uống", "đồ ăn vặt", "đồ ăn chế biến", "nhu yếu phẩm", "đồ dùng khác" }));

        javax.swing.GroupLayout filterPanelLayout = new javax.swing.GroupLayout(filterPanel);
        filterPanel.setLayout(filterPanelLayout);
        filterPanelLayout.setHorizontalGroup(
            filterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, filterPanelLayout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textFieldIcon1, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );
        filterPanelLayout.setVerticalGroup(
            filterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(filterPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(filterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textFieldIcon1, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(jComboBox1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        itemContainer.add(filterPanel, java.awt.BorderLayout.NORTH);

        mainContainer.setBackground(new java.awt.Color(255, 255, 255));
        mainContainer.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 0, 10, 1));
        mainContainer.setRadius(0);
        mainContainer.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 10, 10));
        itemContainer.add(mainContainer, java.awt.BorderLayout.CENTER);

        spaceBottom.setPreferredSize(new java.awt.Dimension(648, 0));

        javax.swing.GroupLayout spaceBottomLayout = new javax.swing.GroupLayout(spaceBottom);
        spaceBottom.setLayout(spaceBottomLayout);
        spaceBottomLayout.setHorizontalGroup(
            spaceBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 686, Short.MAX_VALUE)
        );
        spaceBottomLayout.setVerticalGroup(
            spaceBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        itemContainer.add(spaceBottom, java.awt.BorderLayout.PAGE_END);

        getContentPane().add(itemContainer, java.awt.BorderLayout.CENTER);

        paymentPanel.setBackground(new java.awt.Color(43, 133, 161));
        paymentPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        paymentPanel.setForeground(new java.awt.Color(51, 255, 51));
        paymentPanel.setPreferredSize(new java.awt.Dimension(293, 600));
        paymentPanel.setRadius(0);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ĐƠN HÀNG");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("XÓA HẾT");

        paymentInfo.setBackground(new java.awt.Color(43, 133, 161));

        lbTotalMoney.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbTotalMoney.setForeground(new java.awt.Color(255, 255, 255));
        lbTotalMoney.setText("TỔNG TIỀN:");

        lbDiscount.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbDiscount.setForeground(new java.awt.Color(255, 255, 255));
        lbDiscount.setText("GIẢM GIÁ:");

        lbMoney.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbMoney.setForeground(new java.awt.Color(255, 255, 255));
        lbMoney.setText("TIỀN PHẢI THU:");

        lbTextTotal.setBackground(new java.awt.Color(255, 255, 255));
        lbTextTotal.setForeground(new java.awt.Color(255, 255, 255));
        lbTextTotal.setText("tong tien");

        lbTextDiscount.setForeground(new java.awt.Color(255, 255, 255));
        lbTextDiscount.setText("giam gia");

        lbTextMoney.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbTextMoney.setForeground(new java.awt.Color(255, 255, 255));
        lbTextMoney.setText("tien phai thu");

        txtPhoneNumber.setBackground(new java.awt.Color(255, 255, 255));

        txtVoucher.setBackground(new java.awt.Color(255, 255, 255));

        lbVoucher.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbVoucher.setForeground(new java.awt.Color(255, 255, 255));
        lbVoucher.setText("MÃ VOUCHER:");

        lbsoDt.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbsoDt.setForeground(new java.awt.Color(255, 255, 255));
        lbsoDt.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbsoDt.setText("SỐ ĐT:");
        lbsoDt.setToolTipText("");

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("+");
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout paymentInfoLayout = new javax.swing.GroupLayout(paymentInfo);
        paymentInfo.setLayout(paymentInfoLayout);
        paymentInfoLayout.setHorizontalGroup(
            paymentInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paymentInfoLayout.createSequentialGroup()
                .addGroup(paymentInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paymentInfoLayout.createSequentialGroup()
                        .addGroup(paymentInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(paymentInfoLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(paymentInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbMoney)
                                    .addComponent(lbTotalMoney)))
                            .addGroup(paymentInfoLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lbDiscount, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(paymentInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbTextDiscount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbTextTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbTextMoney, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paymentInfoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(paymentInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(paymentInfoLayout.createSequentialGroup()
                                .addComponent(lbVoucher)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(paymentInfoLayout.createSequentialGroup()
                                .addComponent(lbsoDt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(paymentInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtVoucher, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(paymentInfoLayout.createSequentialGroup()
                                .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        paymentInfoLayout.setVerticalGroup(
            paymentInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paymentInfoLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(paymentInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(lbsoDt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(paymentInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbVoucher, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtVoucher, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paymentInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(paymentInfoLayout.createSequentialGroup()
                        .addComponent(lbTextMoney)
                        .addGap(3, 3, 3))
                    .addGroup(paymentInfoLayout.createSequentialGroup()
                        .addGroup(paymentInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(paymentInfoLayout.createSequentialGroup()
                                .addComponent(lbTextTotal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(paymentInfoLayout.createSequentialGroup()
                                .addComponent(lbTotalMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)))
                        .addGroup(paymentInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbTextDiscount)
                            .addComponent(lbDiscount))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbMoney))))
        );

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(43, 133, 161));
        jButton2.setText("THANH TOÁN");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPanel1.setPreferredSize(new java.awt.Dimension(271, 350));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout paymentPanelLayout = new javax.swing.GroupLayout(paymentPanel);
        paymentPanel.setLayout(paymentPanelLayout);
        paymentPanelLayout.setHorizontalGroup(
            paymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paymentInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(paymentPanelLayout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(paymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paymentPanelLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, paymentPanelLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97))))
            .addGroup(paymentPanelLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(paymentPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        paymentPanelLayout.setVerticalGroup(
            paymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paymentPanelLayout.createSequentialGroup()
                .addGroup(paymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(paymentPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(paymentPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(paymentInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(paymentPanel, java.awt.BorderLayout.EAST);

        leftPanel.setBackground(new java.awt.Color(43, 133, 161));
        leftPanel.setPreferredSize(new java.awt.Dimension(80, 631));
        leftPanel.setRadius(0);

        jButton3.setBackground(new java.awt.Color(43, 133, 161));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/SaleGroup/SellerGUI/Image/logout.png"))); // NOI18N
        jButton3.setBorder(null);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ĐĂNG XUẤT");

        imagePanel1.setBackground(new java.awt.Color(43, 133, 161));
        imagePanel1.setImage(new javax.swing.ImageIcon(getClass().getResource("/GUI/SaleGroup/SellerGUI/Image/storeiconwhite.png"))); // NOI18N

        javax.swing.GroupLayout imagePanel1Layout = new javax.swing.GroupLayout(imagePanel1);
        imagePanel1.setLayout(imagePanel1Layout);
        imagePanel1Layout.setHorizontalGroup(
            imagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        imagePanel1Layout.setVerticalGroup(
            imagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 71, Short.MAX_VALUE)
        );

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("QUẢN LÝ");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("BÁN HÀNG");

        javax.swing.GroupLayout leftPanelLayout = new javax.swing.GroupLayout(leftPanel);
        leftPanel.setLayout(leftPanelLayout);
        leftPanelLayout.setHorizontalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(leftPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(leftPanelLayout.createSequentialGroup()
                                .addGap(0, 2, Short.MAX_VALUE)
                                .addComponent(jLabel1))
                            .addComponent(imagePanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(leftPanelLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(leftPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        leftPanelLayout.setVerticalGroup(
            leftPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, leftPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(imagePanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(0, 0, 0)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 353, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(32, 32, 32))
        );

        getContentPane().add(leftPanel, java.awt.BorderLayout.LINE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textFieldIcon1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldIcon1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldIcon1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(SellerMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SellerMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SellerMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SellerMainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        FlatLightLaf.setup();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SellerMainFrame().setVisible(true);
            }
        });
    }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel filterPanel;
    private GUI.SaleGroup.SellerGUI.Component.ImagePanel imagePanel1;
    private GUI.SaleGroup.SellerGUI.Component.RoundPanel itemContainer;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbDiscount;
    private javax.swing.JLabel lbMoney;
    private javax.swing.JLabel lbTextDiscount;
    private javax.swing.JLabel lbTextMoney;
    private javax.swing.JLabel lbTextTotal;
    private javax.swing.JLabel lbTotalMoney;
    private javax.swing.JLabel lbVoucher;
    private javax.swing.JLabel lbsoDt;
    private GUI.SaleGroup.SellerGUI.Component.RoundPanel leftPanel;
    private GUI.SaleGroup.SellerGUI.Component.RoundPanel mainContainer;
    private javax.swing.JPanel paymentInfo;
    private GUI.SaleGroup.SellerGUI.Component.RoundPanel paymentPanel;
    private javax.swing.JPanel spaceBottom;
    private GUI.SaleGroup.SellerGUI.Component.TextFieldIcon textFieldIcon1;
    private GUI.SaleGroup.SellerGUI.Component.TextFieldIcon txtPhoneNumber;
    private GUI.SaleGroup.SellerGUI.Component.TextFieldIcon txtVoucher;
    // End of variables declaration//GEN-END:variables
    private ScrollPanel<SanPham, MenuItem> scrollPanelMenu;
    private ScrollPanel<ChiTietHoaDon, OrderItem> scrollPanelOrder;
       
    private void init() {
        mainContainer.setLayout(null);
        
        this.scrollPanelMenu = new ScrollPanel(665, 505);
        mainContainer.add(this.scrollPanelMenu);
        
//        for (int i=0;i<20;i++){
//            MenuItem menuItem = new MenuItem();
//            scrollPanelMenu.addToPanel(menuItem);
//        }
        
        this.scrollPanelOrder = new ScrollPanel(271, 350);
        jPanel1.setLayout(null);
        jPanel1.add(this.scrollPanelOrder);
        
//        for (int i=0;i<20;i++){
//            OrderItem item = new OrderItem();
//            scrollPanelOrder.addToPanel(item);
//        }
//        getMenuItemFromDatabase();
    }
    
    // Insert du lieu moi chay dc
    private void getMenuItemFromDatabase(){
        SanPhamDAO spdao = new SanPhamDAO();
        List<SanPham> list = spdao.selectAll();
        for (SanPham sp:list){
            MenuItem menuItem = new MenuItem(sp);
            System.out.println(sp);
            scrollPanelMenu.addToPanel(menuItem);
        }
    }
        
        
            
        
        


    
}
