package Paquete;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class PanelFondo extends JPanel{
    Color Background = Color.gray;
    int tamanomax, tamano, cantidad,res;
    
    public PanelFondo(int tamanomax, int cantidad){
        this.tamanomax = tamanomax;
        this.cantidad = cantidad;
        this.tamano = tamanomax/cantidad;
        this.res = tamanomax%cantidad;
    }
    
    @Override
    public void paint(Graphics pintor){
        super.paint(pintor);
        pintor.setColor(Background);
        
        // Para el eje X e Y:
        for (int i = 0; i < cantidad; i++){
            for (int j = 0; j < cantidad; j++){
                pintor.fillRect((res/2)+(i*tamano), (res/2)+(j*tamano) , tamano-1, tamano-1);
            }
        }
        
    }
}


