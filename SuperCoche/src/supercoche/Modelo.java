/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supercoche;

import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class Modelo {
    public static final int ANCHOGAME=1200;
    public static final int ALTOGAME=700;
    private int contador;
    private long tGame;
    private long tFin,tInicio;
    private boolean fin;
    private Coche coche=new Coche();
    private int NCONOS=10;
    private ArrayList<Herramientas> conos;
    private Gasolina gas=new Gasolina();
    public Modelo(){
        conos=new ArrayList<Herramientas>(5);
        for(int i=0;i<NCONOS;i++){
            conos.add(new Herramientas(this));
        }
    }
    public void moverAbajo(){
        if(coche.getY()>ALTOGAME)coche.setY(-ALTOGAME);
        coche.setY(15);
    }
    public void moverArriba(){
        if(coche.getY()<0)coche.setY(ALTOGAME);
        coche.setY(-15);
    }
    public void moverDerecha(){
        if(coche.getX()>ANCHOGAME)coche.setX(-ANCHOGAME);
        coche.setX(15);
    }
    public void moverIzquierda(){
        if(coche.getX()<0)coche.setX(ANCHOGAME);
        coche.setX(-15);
    }
    /*public void cambiarPosicionHerramientas(){
        for(int i=0;i<NCONOS;i++){
            conos.get(i).setY((int)(Math.random()*ANCHOGAME-180));
            conos.get(i).setX((int)(Math.random()*ALTOGAME-180));
        }
        
    }*/
    public void cambiarPosicionGasolina(){
        gas.setX((int)(Math.random()*1020));
        gas.setY((int)(Math.random()*520));
    }
    public void comprobar(int tecla){
        for(int i=0;i<NCONOS;i++){
        if(Math.abs(coche.puntoMedioX()-conos.get(i).puntoMedioX())<110 && Math.abs(coche.puntoMedioY()-conos.get(i).puntoMedioY())<70){
            this.dejarQuieto(tecla);
        }
        }
        if(Math.abs(coche.puntoMedioX()-gas.puntoMedioX())<90 && Math.abs(coche.puntoMedioY()-gas.puntoMedioY())<45){
            contador++;
            this.cambiarPosicionGasolina();
        }
    }
    public void dejarQuieto(int tecla){
        switch(tecla){
            case KeyEvent.VK_UP:
                this.moverAbajo();
                break;
            case KeyEvent.VK_DOWN:
                this.moverArriba();
                break;
            case KeyEvent.VK_LEFT:
                this.moverDerecha();
                break;
            case KeyEvent.VK_RIGHT:
                this.moverIzquierda();
                break;
        }
    }
    public Coche getCoche() {
        return coche;
    }

    public ArrayList<Herramientas> getConos() {
        return conos;
    }

    public Gasolina getGas() {
        return gas;
    }
    public int getContador() {
        return contador;
    }
}
