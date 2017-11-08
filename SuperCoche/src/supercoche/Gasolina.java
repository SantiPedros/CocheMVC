/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supercoche;

import java.awt.Graphics;
import java.awt.Image;
import java.net.URL;
import javax.imageio.ImageIO;
import static supercoche.Modelo.ANCHOGAME;

/**
 *
 * @author pc
 */
public class Gasolina {
    private Image imgGasolina;
    private Modelo model;
    private int x,y;
    private int ancho=20,alto=20;
    public Gasolina() {
        imgGasolina=this.leerImagen();
        this.x=(int)(Math.random()*600-50);
        this.y=(int)(Math.random()*600-50);
    }
    public Image leerImagen(){
        URL url=this.getClass().getResource("../imagenes/fuel.jpg");
        Image imagen=null;
        try {
            imagen=ImageIO.read(url);
        } catch (Exception e) {
            System.out.println("ERROR"+e.getMessage());
        }
        return imagen;
    }    
    public int puntoMedioX(){
        return (x+ancho/2);
    }
    public int puntoMedioY(){
        return (y+alto/2);
    }
    public Image getImgGasolina() {
        return imgGasolina;
    }
    public void dibujar(Graphics g){
        g.drawImage(imgGasolina,x,y,alto,ancho,null);
    }
    public void setX(int x) {
        this.x= x;
    }

    public void setY(int y) {
        this.y= y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
}
