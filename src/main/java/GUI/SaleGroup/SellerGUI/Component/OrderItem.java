/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI.SaleGroup.SellerGUI.Component;

/**
 *
 * @author huykh
 */
public class OrderItem extends RoundPanel {

    /**
     * Creates new form OrderItem
     */
    public OrderItem() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imagePanel1 = new GUI.SaleGroup.SellerGUI.Component.ImagePanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(240, 92));
        setRadius(30);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        imagePanel1.setBackground(new java.awt.Color(255, 255, 255));
        imagePanel1.setImage(new javax.swing.ImageIcon(getClass().getResource("/GUI/SaleGroup/LoginGui/Image/icons8-user-100.png"))); // NOI18N

        javax.swing.GroupLayout imagePanel1Layout = new javax.swing.GroupLayout(imagePanel1);
        imagePanel1.setLayout(imagePanel1Layout);
        imagePanel1Layout.setHorizontalGroup(
            imagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );
        imagePanel1Layout.setVerticalGroup(
            imagePanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        add(imagePanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 60, 60));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(29, 186, 218));
        jLabel1.setText("<html>Nước ngọt cocacola 500ml + ly đá rat ngon");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 140, 30));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(29, 186, 218));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("30.000");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 100, 20));
        add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 80, -1));

        jButton1.setBackground(new java.awt.Color(255, 153, 153));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("X");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 30, 20));

        jLabel3.setForeground(new java.awt.Color(29, 186, 218));
        jLabel3.setText("30.000");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 160, 20));

        jLabel4.setForeground(new java.awt.Color(29, 186, 218));
        jLabel4.setText("Giá:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 30, 20));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private GUI.SaleGroup.SellerGUI.Component.ImagePanel imagePanel1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSpinner jSpinner1;
    // End of variables declaration//GEN-END:variables
}
