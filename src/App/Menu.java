package App;

import java.awt.Color;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
        Color Background = new Color(0, 0, 0);
        this.getContentPane().setBackground(Background);
        this.setLocationRelativeTo(null);   // Centrar Ventana
        rdBtn1.requestFocus(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroup = new javax.swing.ButtonGroup();
        txtSpeed = new javax.swing.JTextField();
        btnEmpezar = new javax.swing.JButton();
        rdBtn3 = new javax.swing.JRadioButton();
        rdBtn2 = new javax.swing.JRadioButton();
        rdBtn1 = new javax.swing.JRadioButton();
        txtName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();

        txtSpeed.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSpeed.setText("Easy");
        txtSpeed.setEnabled(false);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(420, 560));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEmpezar.setBackground(new java.awt.Color(0, 0, 0));
        btnEmpezar.setFont(new java.awt.Font("Goethe", 1, 24)); // NOI18N
        btnEmpezar.setForeground(new java.awt.Color(255, 255, 255));
        btnEmpezar.setText("Empezar");
        btnEmpezar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpezarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEmpezar, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 430, 130, 60));

        rdBtn3.setBackground(new java.awt.Color(154, 204, 153));
        btnGroup.add(rdBtn3);
        rdBtn3.setFont(new java.awt.Font("Goethe", 1, 24)); // NOI18N
        rdBtn3.setText("dificil");
        rdBtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdBtn3ActionPerformed(evt);
            }
        });
        getContentPane().add(rdBtn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, -1, -1));

        rdBtn2.setBackground(new java.awt.Color(154, 204, 153));
        btnGroup.add(rdBtn2);
        rdBtn2.setFont(new java.awt.Font("Goethe", 1, 24)); // NOI18N
        rdBtn2.setText("medio");
        rdBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdBtn2ActionPerformed(evt);
            }
        });
        getContentPane().add(rdBtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 340, -1, -1));

        rdBtn1.setBackground(new java.awt.Color(154, 204, 153));
        btnGroup.add(rdBtn1);
        rdBtn1.setFont(new java.awt.Font("Goethe", 1, 24)); // NOI18N
        rdBtn1.setSelected(true);
        rdBtn1.setText("facil");
        rdBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdBtn1ActionPerformed(evt);
            }
        });
        getContentPane().add(rdBtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, -1, -1));

        txtName.setBackground(new java.awt.Color(154, 204, 153));
        txtName.setFont(new java.awt.Font("Goethe", 1, 48)); // NOI18N
        txtName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtName.setText("Nombre");
        txtName.setToolTipText("maximum 4 letters");
        txtName.setActionCommand("<Not Set>");
        txtName.setBorder(null);
        txtName.setMargin(new java.awt.Insets(6, 6, 0, 6));
        txtName.setName(""); // NOI18N
        txtName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNameFocusLost(evt);
            }
        });
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        getContentPane().add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 320, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/menu.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        btnExit.setBackground(new java.awt.Color(0, 0, 0));
        btnExit.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setText("X");
        btnExit.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnExit.setContentAreaFilled(false);
        btnExit.setRequestFocusEnabled(false);
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnExitMouseExited(evt);
            }
        });
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 4, 40, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rdBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdBtn2ActionPerformed
        txtSpeed.setText("Medium");
    }//GEN-LAST:event_rdBtn2ActionPerformed

    private void rdBtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdBtn3ActionPerformed
        txtSpeed.setText("Hard");
    }//GEN-LAST:event_rdBtn3ActionPerformed

    private void rdBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdBtn1ActionPerformed
        txtSpeed.setText("Easy");
    }//GEN-LAST:event_rdBtn1ActionPerformed

    private void btnExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseEntered
        btnExit.setBackground(Color.WHITE);
    }//GEN-LAST:event_btnExitMouseEntered

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseExited
        btnExit.setBackground(Color.BLACK);
    }//GEN-LAST:event_btnExitMouseExited

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        txtName.setText("");
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNameFocusGained
        String texto = txtName.getText();
        if (texto.equals("Nombre")){
            txtName.setText("");
        } else {
            txtName.setText(texto);
        }
    }//GEN-LAST:event_txtNameFocusGained

    private void txtNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNameFocusLost
        String texto = txtName.getText();
        if (!texto.equals("")){
            txtName.setText(texto);
        } else {
            txtName.setText("Nombre");
        }
    }//GEN-LAST:event_txtNameFocusLost

    private void btnEmpezarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpezarActionPerformed
        Game game = new Game();
        game.setVisible(true);
    }//GEN-LAST:event_btnEmpezarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEmpezar;
    private javax.swing.JButton btnExit;
    private javax.swing.ButtonGroup btnGroup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButton rdBtn1;
    private javax.swing.JRadioButton rdBtn2;
    private javax.swing.JRadioButton rdBtn3;
    private javax.swing.JTextField txtName;
    public static javax.swing.JTextField txtSpeed;
    // End of variables declaration//GEN-END:variables
}
