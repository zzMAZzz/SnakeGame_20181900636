package App;

import java.applet.AudioClip;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Snake extends JPanel{
    
    Color colorSnake = Color.BLACK;         // Color Serpiente
    Color colorComida = Color.BLACK;          // Color Comida
    int tamanomax, tamano, cantidad, res;   // Variables
    List<int[]> snake = new ArrayList<>();  // Array con las posiciones de la serpiente
    int[] comida = new int[2];                           // Array Comida
    String direccion = "right";             // Direccion de la Serpiente
    String direccionProxima = "right";
    int score = 0;
    int speed;
    boolean estado = true;
    boolean isWall;
    boolean soundOn;
    AudioClip soundFile;
    
    
    Thread hilo;
    Move move;
    
    public Snake(int tamanomax, int cantidad){
        
        this.tamanomax = tamanomax;
        this.cantidad = cantidad;
        this.tamano = tamanomax/cantidad;
        this.res = tamanomax%cantidad;
        
        
        soundFile = java.applet.Applet.newAudioClip(getClass().getResource("/Sonidos/effect.wav"));
        
        String Dificultad = Menu.txtSpeed.getText();
        switch(Dificultad){
            case "Easy":
                speed = 110;
                break;
            case "Medium":
                speed = 80;
                break;
            case "Hard":
                speed = 50;
                break;
        }
        
        /* La Serpiente inicia con dos casillas A y B */
        int[] a = {cantidad/2-1,cantidad/2-1};
        int[] b = {cantidad/2,cantidad/2-1};
        snake.add(a);
        snake.add(b);  
        generarComida();
        
        move = new Move();
        move.Objetos(this,speed);
        hilo = new Thread(move);
        hilo.start();
        
    }
    
    @Override
    public void paint(Graphics pintor){
        super.paint(pintor);
        pintor.setColor(colorSnake);
        
        /* Pinta la Serpiente */
        for (int[] sn:snake){
            pintor.fillRect((res/2+(sn[0])*tamano), (res/2+(sn[1])*tamano) , tamano-1, tamano-1);
        }
        
        /* Pinta la comida */
        pintor.setColor(colorComida);
        pintor.fillOval((res/2+(comida[0])*tamano), (res/2+(comida[1])*tamano) , tamano-1, tamano-1);
    
    }
    
    public void avanzar(){
        igualarDireccion();
        int[] ultimo = snake.get(snake.size()-1);
        int agregarx = 0;
        int agregary = 0;
        switch(direccion){
            case "right":   agregarx = 1;   break;
            case "left":    agregarx = -1;  break;
            case "up":      agregary = -1;  break;
            case "down":    agregary = 1;   break;
        }
        
        int[] nuevo;
        
        if (isWall){
            int[] aux = {ultimo[0]+agregarx,ultimo[1]+agregary};
            nuevo = aux;
            
        } else {
            int[] aux = {Math.floorMod((ultimo[0]+agregarx),cantidad), 
                        Math.floorMod((ultimo[1]+agregary),cantidad)};
            nuevo = aux;
        }
        
        //int[] nuevo = {Math.floorMod((ultimo[0]+agregarx),cantidad), 
        //                Math.floorMod((ultimo[1]+agregary),cantidad)};
        
        boolean existe = false;
        
        for (int[] sn:snake){
            if (nuevo[0]==sn[0] && nuevo[1]==sn[1]){
                 existe = true;
                 break;
            }
        }
        
        if(existe){
            JOptionPane.showMessageDialog(this, "Has perdido");
            
        } else if (nuevo[0]<0 || nuevo[0]>=cantidad || nuevo[1]<0 || nuevo[1]>=cantidad  ) {
            JOptionPane.showMessageDialog(this, "Has perdido");
            
        } else {
            if (nuevo[0]==comida[0] && nuevo[1]==comida[1]){
               snake.add(nuevo);
               generarComida();
               score++;
               if (soundOn){
                   soundFile.play();
               }
               if (score<10){
                   Game.LblScore.setText("000"+score);
               } else if (score<100){ 
                   Game.LblScore.setText("00"+score);
               } else if (score<1000){ 
                   Game.LblScore.setText("0"+score);
               } else {
                   Game.LblScore.setText(""+score);
               }   
            } else {
                snake.add(nuevo);
                snake.remove(0);
            }
        }
    }
    
    public void generarComida(){
        boolean existe  = false;
        int a = (int)(Math.random()*cantidad);
        int b = (int)(Math.random()*cantidad);
        for (int[] sn:snake){
            if (sn[0]==a && sn[1]==b){
                 existe = true;
                 generarComida();
                 break;
            }
        }
        if (!existe){
            this.comida[0]=a;
            this.comida[1]=b;
        }
    }
    
    public void cambiarDireccion(String dir){
        if ((this.direccion.equals("right")||this.direccion.equals("left"))
            && (dir.equals("up")||dir.equals("down"))){
            this.direccionProxima = dir;
        }
        if ((this.direccion.equals("up")||this.direccion.equals("down"))
            && (dir.equals("right")||dir.equals("left"))){
            this.direccionProxima = dir;
        }
    }
    
    public void igualarDireccion(){
        this.direccion = this.direccionProxima;
    }
    
    public void CambiarSonido(boolean active){
        this.soundOn = active;
    }
    
    public void CambiarEstado(boolean status){
        this.estado = status;
    }
    
    public void cambiarVelocidad(int speed){
        this.speed = speed;
    }
    
    public void cambiarParedes(boolean wall){
        this.isWall = wall;
    }
    
    
}
