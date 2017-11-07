/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supercoche;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.net.URL;
import javax.imageio.ImageIO;
import static supercoche.Modelo.ALTOGAME;
import static supercoche.Modelo.ANCHOGAME;

/**
 *
 * @author pc
 */
public class Coche {
    private Image imgCoche;
    private int ancho=100;
    private int alto=100;
    private int x;
    private int y;

    public void setX(int x) {
        this.x += x;
    }

    public void setY(int y) {
        this.y += y;
    }
    public Coche() {
        imgCoche=this.leerImagen();
    }
    public Image leerImagen(){
        URL url=this.getClass().getResource("../imagenes/lamborghini.png");
        Image imagen=null;
        try {
            imagen=ImageIO.read(url);
        } catch (Exception e) {
            System.out.println("ERROR"+e.getMessage());
        }
        return imagen;
    }    

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Image getImgCoche() {
        return imgCoche;
    }
    public void dibujar(Graphics g){
        g.drawImage(imgCoche,x,y,ancho,alto,null);
    }
    
}
