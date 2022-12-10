package Paquete;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Move implements Runnable{
    
    Snake snake;
    boolean estado = true;
    
    public Move(Snake snake){
        this.snake = snake;
        
    }

    @Override
    public void run() {
        while(estado){
            snake.avanzar();
            snake.repaint();
             try {
                 Thread.sleep(150);
             } catch (InterruptedException ex) {
                 Logger.getLogger(Move.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
    }
    
    public void parar(){
        this.estado = false;
    }
    
}
