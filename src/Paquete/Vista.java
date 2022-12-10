package Paquete;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Vista extends javax.swing.JFrame{
    Snake snakeh;
    public Vista() {
        /* "t" es el tamaño y "c" la cantidad de casillas, es decir 30 x 30. */
        int t = 600; int c = 30;
        initComponents();
        
        /* Establece el color de Fondo para el Form. */
        Color Background = new Color(137,187,2);
        this.getContentPane().setBackground(Background);
        this.setLocationRelativeTo(null);   // Centrar Ventana
        
        /* Pinta la serpiente al inicio */
        snakeh = new Snake(t,c);
        this.add(snakeh);
        snakeh.setBounds(10,10,t,t);
        snakeh.setOpaque(false);
        
        /* Pinta el lienzo del juego */
        Fondo fondo = new Fondo(t,c);
        this.add(fondo);
        fondo.setBounds(10,10,t,t);
        
        txtKeyPress.requestFocus(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Btn_Exit = new javax.swing.JButton();
        Avanzar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtKeyPress = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(145, 196, 5));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        Btn_Exit.setBackground(new java.awt.Color(0, 0, 0));
        Btn_Exit.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Btn_Exit.setForeground(new java.awt.Color(255, 255, 255));
        Btn_Exit.setText("X");
        Btn_Exit.setToolTipText("Cerrar"); // NOI18N
        Btn_Exit.setBorder(null);
        Btn_Exit.setContentAreaFilled(false);
        Btn_Exit.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Btn_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ExitActionPerformed(evt);
            }
        });

        Avanzar.setText("Avanzar");
        Avanzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AvanzarActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("\"Hola\"");

        txtKeyPress.setText("jTextField1");
        txtKeyPress.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtKeyPressKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Btn_Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Avanzar)
                        .addGap(56, 56, 56))
                    .addComponent(txtKeyPress, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Btn_Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(Avanzar)
                .addGap(76, 76, 76)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 402, Short.MAX_VALUE)
                .addComponent(txtKeyPress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 662, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ExitActionPerformed
        System.exit(0);
        
    }//GEN-LAST:event_Btn_ExitActionPerformed

    private void AvanzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AvanzarActionPerformed
        snakeh.avanzar();
        snakeh.repaint();
        txtKeyPress.requestFocus(true);
    }//GEN-LAST:event_AvanzarActionPerformed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
    }//GEN-LAST:event_formKeyPressed

    private void txtKeyPressKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtKeyPressKeyPressed
        jLabel1.setText("Tecla: " + evt.getKeyCode());
        switch(evt.getKeyCode()){
            case 37, KeyEvent.VK_A -> snakeh.cambiarDireccion("left");
            case 38, KeyEvent.VK_W -> snakeh.cambiarDireccion("up");
            case 39, KeyEvent.VK_D ->snakeh.cambiarDireccion("right");
            case 40, KeyEvent.VK_S ->snakeh.cambiarDireccion("down");
            default -> {}
        }
    }//GEN-LAST:event_txtKeyPressKeyPressed

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
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Avanzar;
    private javax.swing.JButton Btn_Exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtKeyPress;
    // End of variables declaration//GEN-END:variables

}
