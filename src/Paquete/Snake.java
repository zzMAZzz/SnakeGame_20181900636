package Paquete;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;

public class Snake extends JPanel{
    
    Color ColorSnake = Color.BLACK;
    Color ColorComida = Color.red;
    int tamanomax, tamano, cantidad,res;
    List<int[]> snake = new ArrayList<>();
    int[] comida;
    
    public Snake(int tamanomax, int cantidad){
        this.tamanomax = tamanomax;
        this.cantidad = cantidad;
        this.tamano = tamanomax/cantidad;
        this.res = tamanomax%cantidad;
        int[] a = {cantidad/2-1,cantidad/2-1};
        int[] b = {cantidad/2,cantidad/2-1};
        snake.add(a);
        snake.add(b);  
    }
    
    @Override
    public void paint(Graphics pintor){
        super.paint(pintor);
        pintor.setColor(ColorSnake);
        for (int[] sn:snake){
             pintor.fillRect((res/2+(sn[0])*tamano), (res/2+(sn[1])*tamano) , tamano-1, tamano-1);
        }

        
    }
    
}
