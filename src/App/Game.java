package App;

import java.applet.AudioClip;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.Timer;



public class Game extends JFrame{
    
    // Variables
    Snake snake;
    Fondo fondo;
    InicialDraw draw;
    Move move = new Move();
    Menu menu;
    
    
    boolean isPlaying = false;
    int t = 600; int c = 30;
    int time = 0;
    int sound = 0;
    boolean isSound = true;
    boolean isWall;
    
    
    public Game() {
        initComponents();
        //Color Background = new Color(30,30,30);
        Color Background = new Color(88,105,68);
        this.getContentPane().setBackground(Background);
        this.setLocationRelativeTo(null);   // Centrar Ventana
        draw = new InicialDraw(t,c);
        this.add(draw);
        draw.setBounds(10,10,t,t);
        draw.setOpaque(false);
        LblLevel.setText(Menu.txtSpeed.getText());
        lblStart.setVisible(true);
        PanelGO.setVisible(false);
        txtKeyPress.requestFocus(true);
    }
    
    public void play(){
        /* Pinta la serpiente al inicio */
        snake = new Snake(t,c);
        this.add(snake);
        snake.setBounds(10,10,t,t);
        snake.setOpaque(false);
        
        /* Pinta el lienzo del juego */
        fondo = new Fondo(t,c);
        this.add(fondo);
        fondo.setBounds(10,10,t,t);
        
        /* Modifica la configuracion de Sonido */
        snake.CambiarSonido(isSound);
        
        /* Modifica si hay paredes o no */
        if (Menu.cbWall.isSelected()){
            isWall = true;
        } else {
            isWall = false;
        }
        snake.cambiarParedes(isWall);
        lblStart.setVisible(false);
        timerGame.start();
    }
    
    public Timer timerGame = new Timer(1000, (ActionEvent e) -> {
            int MM = time/60;
            int SS = time%60;
            if (!PanelGO.isVisible()){
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
    
    
    public void reset(){
        snake.hilo.stop();
        timerGame.stop();
        LblTime.setText("00:00");
        LblScore.setText("0000");
        lblStart.setVisible(true);
        this.remove(snake);
        this.remove(fondo);
        time = 0;
        this.isPlaying = false;
        draw = new InicialDraw(t,c);
        this.add(draw);
        draw.setBounds(10,10,t,t);
        draw.setOpaque(false);
        txtKeyPress.requestFocus(true);
    }
    
    public void ShowGameOver(){
        PanelGO.setVisible(true);
    }
    
    public void HiddenGameOver(){
        PanelGO.setVisible(false);
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
        LblBS1 = new javax.swing.JLabel();
        BtnSound = new javax.swing.JButton();
        BtnHome = new javax.swing.JButton();
        BtnReset = new javax.swing.JButton();
        BtnBS1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        LblLevel = new javax.swing.JLabel();
        BtnBS2 = new javax.swing.JLabel();
        LblBS2 = new javax.swing.JLabel();
        BtnBS3 = new javax.swing.JLabel();
        LblBS3 = new javax.swing.JLabel();
        PanelGO = new javax.swing.JPanel();
        lblGameOver2 = new javax.swing.JLabel();
        lblGameOver1 = new javax.swing.JLabel();
        BtnResetGO = new javax.swing.JButton();
        lblStart = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");
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
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel1.add(Btn_Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 7, 41, 41));

        txtKeyPress.setText("jTextField1");
        txtKeyPress.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtKeyPressKeyPressed(evt);
            }
        });
        jPanel1.add(txtKeyPress, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 714, 0, -1));

        LblScore.setFont(new java.awt.Font("DS-Digital", 0, 40)); // NOI18N
        LblScore.setForeground(new java.awt.Color(255, 255, 255));
        LblScore.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblScore.setText("0000");
        jPanel1.add(LblScore, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, 86, 200, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("SCORE:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, 54, 200, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("TIME");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, 236, 200, -1));

        LblTime.setFont(new java.awt.Font("DS-Digital", 0, 40)); // NOI18N
        LblTime.setForeground(new java.awt.Color(255, 255, 255));
        LblTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblTime.setText("00:00");
        jPanel1.add(LblTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, 268, 200, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("LEVEL:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 145, 190, -1));

        LblBS1.setFont(new java.awt.Font("DS-Digital", 0, 25)); // NOI18N
        LblBS1.setForeground(new java.awt.Color(255, 255, 255));
        LblBS1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        LblBS1.setText("SCR1");
        jPanel1.add(LblBS1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 60, -1));

        BtnSound.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Sound.png"))); // NOI18N
        BtnSound.setBorder(null);
        BtnSound.setContentAreaFilled(false);
        BtnSound.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSoundActionPerformed(evt);
            }
        });
        jPanel1.add(BtnSound, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 550, -1, -1));

        BtnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/home.png"))); // NOI18N
        BtnHome.setBorder(null);
        BtnHome.setContentAreaFilled(false);
        BtnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnHomeActionPerformed(evt);
            }
        });
        jPanel1.add(BtnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 550, -1, -1));

        BtnReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/reset.png"))); // NOI18N
        BtnReset.setBorder(null);
        BtnReset.setContentAreaFilled(false);
        BtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnResetActionPerformed(evt);
            }
        });
        jPanel1.add(BtnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 550, -1, -1));

        BtnBS1.setFont(new java.awt.Font("DS-Digital", 0, 25)); // NOI18N
        BtnBS1.setForeground(new java.awt.Color(255, 255, 255));
        BtnBS1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BtnBS1.setText("0000");
        jPanel1.add(BtnBS1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 410, 88, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 204, 51));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("BEST SCORE:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 200, -1));

        LblLevel.setFont(new java.awt.Font("DS-Digital", 0, 40)); // NOI18N
        LblLevel.setForeground(new java.awt.Color(255, 255, 255));
        LblLevel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblLevel.setText("EASY");
        jPanel1.add(LblLevel, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, 177, 200, -1));

        BtnBS2.setFont(new java.awt.Font("DS-Digital", 0, 25)); // NOI18N
        BtnBS2.setForeground(new java.awt.Color(255, 255, 255));
        BtnBS2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BtnBS2.setText("0000");
        jPanel1.add(BtnBS2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 440, 88, -1));

        LblBS2.setFont(new java.awt.Font("DS-Digital", 0, 25)); // NOI18N
        LblBS2.setForeground(new java.awt.Color(255, 255, 255));
        LblBS2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        LblBS2.setText("SCR2");
        jPanel1.add(LblBS2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 60, -1));

        BtnBS3.setFont(new java.awt.Font("DS-Digital", 0, 25)); // NOI18N
        BtnBS3.setForeground(new java.awt.Color(255, 255, 255));
        BtnBS3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BtnBS3.setText("0000");
        jPanel1.add(BtnBS3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 470, 88, -1));

        LblBS3.setFont(new java.awt.Font("DS-Digital", 0, 25)); // NOI18N
        LblBS3.setForeground(new java.awt.Color(255, 255, 255));
        LblBS3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        LblBS3.setText("SCR3");
        jPanel1.add(LblBS3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 60, -1));

        PanelGO.setBackground(new java.awt.Color(0, 0, 0));
        PanelGO.setEnabled(false);
        PanelGO.setFocusable(false);
        PanelGO.setRequestFocusEnabled(false);

        lblGameOver2.setFont(new java.awt.Font("Goethe", 0, 30)); // NOI18N
        lblGameOver2.setForeground(new java.awt.Color(255, 255, 255));
        lblGameOver2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGameOver2.setText("Press the restart button");

        lblGameOver1.setFont(new java.awt.Font("Goethe", 1, 48)); // NOI18N
        lblGameOver1.setForeground(new java.awt.Color(255, 255, 255));
        lblGameOver1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGameOver1.setText("Game Over");

        BtnResetGO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/reset.png"))); // NOI18N
        BtnResetGO.setBorder(null);
        BtnResetGO.setContentAreaFilled(false);
        BtnResetGO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnResetGOActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelGOLayout = new javax.swing.GroupLayout(PanelGO);
        PanelGO.setLayout(PanelGOLayout);
        PanelGOLayout.setHorizontalGroup(
            PanelGOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelGOLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblGameOver2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(PanelGOLayout.createSequentialGroup()
                .addGap(173, 173, 173)
                .addComponent(BtnResetGO)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelGOLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(lblGameOver1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        PanelGOLayout.setVerticalGroup(
            PanelGOLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelGOLayout.createSequentialGroup()
                .addContainerGap(29, Short.MAX_VALUE)
                .addComponent(lblGameOver1)
                .addGap(26, 26, 26)
                .addComponent(BtnResetGO)
                .addGap(33, 33, 33)
                .addComponent(lblGameOver2)
                .addGap(43, 43, 43))
        );

        lblStart.setFont(new java.awt.Font("Goethe", 0, 48)); // NOI18N
        lblStart.setForeground(new java.awt.Color(255, 255, 255));
        lblStart.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStart.setText("Press Any Key to Start");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblStart, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PanelGO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 620, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(lblStart)
                .addGap(123, 123, 123)
                .addComponent(PanelGO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
    }//GEN-LAST:event_formKeyPressed

    private void txtKeyPressKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtKeyPressKeyPressed
        if (!isPlaying){
            switch(evt.getKeyCode()){
                default -> {this.remove(draw); play(); isPlaying = true;}
            }
        }
        switch(evt.getKeyCode()){
            case 37, KeyEvent.VK_A -> snake.cambiarDireccion("left");
            case 38, KeyEvent.VK_W -> snake.cambiarDireccion("up");
            case 39, KeyEvent.VK_D -> snake.cambiarDireccion("right");
            case 40, KeyEvent.VK_S -> snake.cambiarDireccion("down");
            case KeyEvent.VK_P -> snake.cambiarDireccion("down");
        }
        txtKeyPress.requestFocus(true);
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
               isSound = false;
               break;
            case 1:
                BtnSound.setIcon(iconoS);
                sound = 0;
                isSound = true;
                break; 
        }
        snake.CambiarSonido(isSound);
        txtKeyPress.requestFocus(false);
    }//GEN-LAST:event_BtnSoundActionPerformed

    private void BtnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnHomeActionPerformed
        Menu menu = new Menu();
        menu.MostrarMenu();
        reset();
        this.dispose();
        this.setVisible(false);
    }//GEN-LAST:event_BtnHomeActionPerformed

    private void BtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnResetActionPerformed
        reset();
        PanelGO.setVisible(false);
        txtKeyPress.requestFocus(false);
    }//GEN-LAST:event_BtnResetActionPerformed

    private void BtnResetGOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnResetGOActionPerformed
        reset();
        PanelGO.setVisible(false);
        txtKeyPress.requestFocus(false);
    }//GEN-LAST:event_BtnResetGOActionPerformed

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
    public static javax.swing.JLabel BtnBS1;
    public static javax.swing.JLabel BtnBS2;
    public static javax.swing.JLabel BtnBS3;
    private javax.swing.JButton BtnHome;
    private javax.swing.JButton BtnReset;
    private javax.swing.JButton BtnResetGO;
    private javax.swing.JButton BtnSound;
    private javax.swing.JButton Btn_Exit;
    public static javax.swing.JLabel LblBS1;
    public static javax.swing.JLabel LblBS2;
    public static javax.swing.JLabel LblBS3;
    public static javax.swing.JLabel LblLevel;
    public static javax.swing.JLabel LblScore;
    public static javax.swing.JLabel LblTime;
    public static javax.swing.JPanel PanelGO;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    public static javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblGameOver1;
    private javax.swing.JLabel lblGameOver2;
    private javax.swing.JLabel lblStart;
    private javax.swing.JTextField txtKeyPress;
    // End of variables declaration//GEN-END:variables

}
