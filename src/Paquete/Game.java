package Paquete;

import java.applet.AudioClip;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.Timer;


public class Game extends javax.swing.JFrame{
    
    Snake snake;
    int t = 600; int c = 30;
    int time = 0;
    int sound = 0;
    
    
    public Game() {
        
        /* "t" es el tamaño y "c" la cantidad de casillas, es decir 30 x 30. */
        initComponents();
        
        /* Establece el color de Fondo para el Form. */
        //Color Background = new Color(30,30,30);
        Color Background = new Color(88,105,68);
        this.getContentPane().setBackground(Background);
        this.setLocationRelativeTo(null);   // Centrar Ventana
        
        /* Pinta la serpiente al inicio */
        snake = new Snake(t,c);
        this.add(snake);
        snake.setBounds(10,10,t,t);
        snake.setOpaque(false);
        
        /* Pinta el lienzo del juego */
        Fondo fondo = new Fondo(t,c);
        this.add(fondo);
        fondo.setBounds(10,10,t,t);
        txtKeyPress.requestFocus(true);
        
        Timer timeGame = new Timer(1000, new ActionListener(){
            public void actionPerformed(ActionEvent e){
                
                int MM = time/60;
                int SS = time%60;
                
                if (MM<10 && SS<10){
                    LblTime.setText("0"+ MM + ":0" + SS);
                } else if (MM<10){
                    LblTime.setText("0"+ MM + ":" + SS);
                } else if (SS<10){
                    LblTime.setText(MM + ":0" + SS);
                } else {
                    LblTime.setText(MM + ":" + SS);
                }

                time++;
            }
        }); 
        
        timeGame.start();
    }
   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Btn_Exit = new javax.swing.JButton();
        txtKeyPress = new javax.swing.JTextField();
        LblScore = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        LblTime = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        LblScore1 = new javax.swing.JLabel();
        BtnSound = new javax.swing.JButton();
        BtnHome = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

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

        txtKeyPress.setText("jTextField1");
        txtKeyPress.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtKeyPressKeyPressed(evt);
            }
        });

        LblScore.setFont(new java.awt.Font("DS-Digital", 0, 48)); // NOI18N
        LblScore.setForeground(new java.awt.Color(255, 255, 255));
        LblScore.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblScore.setText("0000");

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("SCORE:");

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("TIME");

        LblTime.setFont(new java.awt.Font("DS-Digital", 0, 48)); // NOI18N
        LblTime.setForeground(new java.awt.Color(255, 255, 255));
        LblTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblTime.setText("00:00");

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("LEVEL:");

        LblScore1.setFont(new java.awt.Font("DS-Digital", 0, 48)); // NOI18N
        LblScore1.setForeground(new java.awt.Color(255, 255, 255));
        LblScore1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblScore1.setText("EASY");

        BtnSound.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Sound.png"))); // NOI18N
        BtnSound.setBorder(null);
        BtnSound.setContentAreaFilled(false);
        BtnSound.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSoundActionPerformed(evt);
            }
        });

        BtnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/home.png"))); // NOI18N
        BtnHome.setBorder(null);
        BtnHome.setContentAreaFilled(false);
        BtnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnHomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(Btn_Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(txtKeyPress, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LblScore, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LblScore1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LblTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(BtnSound, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(Btn_Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LblScore)
                .addGap(57, 57, 57)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LblScore1)
                .addGap(58, 58, 58)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LblTime)
                .addGap(103, 103, 103)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnSound, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(82, 82, 82)
                .addComponent(txtKeyPress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setEnabled(false);
        jPanel2.setFocusable(false);
        jPanel2.setOpaque(false);
        jPanel2.setRequestFocusEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 363, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 255, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 620, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(160, 160, 160))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
    }//GEN-LAST:event_formKeyPressed

    private void txtKeyPressKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtKeyPressKeyPressed
        switch(evt.getKeyCode()){
            case 37, KeyEvent.VK_A -> snake.cambiarDireccion("left");
            case 38, KeyEvent.VK_W -> snake.cambiarDireccion("up");
            case 39, KeyEvent.VK_D -> snake.cambiarDireccion("right");
            case 40, KeyEvent.VK_S -> snake.cambiarDireccion("down");
            case KeyEvent.VK_P -> snake.cambiarDireccion("down");
            default -> {}
        }
    }//GEN-LAST:event_txtKeyPressKeyPressed

    private void Btn_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ExitActionPerformed
        System.exit(0);

    }//GEN-LAST:event_Btn_ExitActionPerformed

    private void BtnSoundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSoundActionPerformed
        ImageIcon iconoS= new ImageIcon("src/Images/sound.png");
        ImageIcon iconoM= new ImageIcon("src/Images/mute.png");
        switch(sound){
            case 0:
               BtnSound.setIcon(iconoM);
               sound = 1;
               snake.CambiarSonido(false);
               break;
            case 1:
                BtnSound.setIcon(iconoS);
                sound = 0;
                snake.CambiarSonido(true);
                break; 
        }
        txtKeyPress.requestFocus(false);
    }//GEN-LAST:event_BtnSoundActionPerformed

    private void BtnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnHomeActionPerformed

        snake.hilo.stop();
        txtKeyPress.requestFocus(false);
    }//GEN-LAST:event_BtnHomeActionPerformed

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
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Game().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnHome;
    private javax.swing.JButton BtnSound;
    private javax.swing.JButton Btn_Exit;
    public static javax.swing.JLabel LblScore;
    public static javax.swing.JLabel LblScore1;
    private static javax.swing.JLabel LblTime;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtKeyPress;
    // End of variables declaration//GEN-END:variables

}
