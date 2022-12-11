package App;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Move implements Runnable{
    
    Snake snake;
    boolean estado = true;
    int sleep = 160;
    
    public Move(){
    }
    
    public void Objetos(Snake snake, int speed){
        this.snake = snake;
        this.sleep = speed;
    }
    
    @Override
    public void run() {
        while(estado){
            snake.avanzar();
            snake.repaint();
             try {
                 Thread.sleep(sleep);
             } catch (InterruptedException ex) {
                 Logger.getLogger(Move.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
    }
    

}
