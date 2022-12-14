package App;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Fondo extends JPanel{

    Color Background = new Color(137,166,105);
    Color Borders = new Color(137,166,105);
    
    int tamanomax, tamano, cantidad,res;
    
    public Fondo(int tamanomax, int cantidad){
        this.tamanomax = tamanomax;
        this.cantidad = cantidad;
        this.tamano = tamanomax/cantidad;
        this.res = tamanomax%cantidad;
    }
    
    @Override
    public void paint(Graphics pintor){
        super.paint(pintor);
        
        /* Pinta o Dibuja el fondo y contorno en las casillas del lienzo. */
        for (int i = 0; i < cantidad; i++){
            for (int j = 0; j < cantidad; j++){
                pintor.setColor(Background);
                pintor.fillRect((res/2)+(i*tamano), (res/2)+(j*tamano) , tamano-1, tamano-1);
                pintor.setColor(Borders);
                pintor.drawRect((res/2)+(i*tamano), (res/2)+(j*tamano) , tamano-1, tamano-1);
            }
        }
        
    }
}


