package App;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;

public class InicialDraw extends JPanel{
    
    int tamanomax, tamano, cantidad, res;
    Color colorSnake = Color.BLACK;
    Color Background = new Color(137,166,105);
    Color Borders = new Color(137,166,105);
    List<int[]> snake = new ArrayList<>();
    
    public InicialDraw(int tamanomax, int cantidad){
        this.tamanomax = tamanomax;
        this.cantidad = cantidad;
        this.tamano = tamanomax/cantidad;
        this.res = tamanomax%cantidad;
    }
    
    @Override
    public void paint(Graphics pintor){
        super.paint(pintor);      
        int[] a = {cantidad/2-1,cantidad/2-1};
        int[] b = {cantidad/2,cantidad/2-1};
        snake.add(a);
        snake.add(b);
        for (int i = 0; i < cantidad; i++){
            for (int j = 0; j < cantidad; j++){
                pintor.setColor(Background);
                pintor.fillRect((res/2)+(i*tamano), (res/2)+(j*tamano) , tamano-1, tamano-1);
                pintor.setColor(Borders);
                pintor.drawRect((res/2)+(i*tamano), (res/2)+(j*tamano) , tamano-1, tamano-1);
            }
        }
        for (int[] sn:snake){
            pintor.setColor(colorSnake);
            pintor.fillRect((res/2+(sn[0])*tamano), (res/2+(sn[1])*tamano) , tamano-1, tamano-1); 
        }
    }
    
}
