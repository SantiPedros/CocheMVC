/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supercoche;

public class Modelo {
    public static final int ANCHOGAME=600;
    public static final int ALTOGAME=600;
    private int contador;
    private long tGame;
    private long tFin,tInicio;
    private boolean fin;
    private Coche coche=new Coche();
    private Herramientas her=new Herramientas();
    private Gasolina gas=new Gasolina();
    
    public void moverAbajo(){
        if(coche.getY()>ALTOGAME)coche.setY(-ALTOGAME);
        coche.setY(15);
    }
    public void moverArriba(){
        if(coche.getY()<0)coche.setY(ALTOGAME);
        coche.setY(-15);
    }
    public void moverDerecha(){
        if(coche.getX()>ANCHOGAME)coche.setX(-ALTOGAME);
        coche.setX(15);
    }
    public void moverIzquierda(){
        if(coche.getX()<0)coche.setX(ANCHOGAME);
        coche.setX(-15);
    }
    public void cambiarPosicionHerramientas(){
        her.setY((int)(Math.random()*ANCHOGAME-50));
        her.setX((int)(Math.random()*ALTOGAME-50));
    }
    public void cambiarPosicionGasolina(){
        gas.setY((int)(Math.random()*ANCHOGAME-50));
        gas.setX((int)(Math.random()*ALTOGAME-50));
    }
    public void comprobar(){
        if(coche.getX()-her.getX()<100 && coche.getY()-her.getY()<100){
            contador++;
            this.cambiarPosicionHerramientas();
        }
        if(coche.getX()-gas.getX()<100 && coche.getY()-gas.getY()<100){
            contador+=10;
            this.cambiarPosicionGasolina();
        }
    }
    public Coche getCoche() {
        return coche;
    }
    public Herramientas getHer() {
        return her;
    }

    public Gasolina getGas() {
        return gas;
    }
    public int getContador() {
        return contador;
    }
}
