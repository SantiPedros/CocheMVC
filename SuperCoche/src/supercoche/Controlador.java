/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supercoche;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Controlador implements KeyListener{
private Modelo model;
private Vista view;
public Controlador(){
    model=new Modelo();
    view=new Vista(model.getCoche(),model.getHer(),model.getGas());
    view.addKeyListener(this);
}
    @Override
    public void keyTyped(KeyEvent ke) {
        
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        if(ke.getKeyCode()==KeyEvent.VK_UP){
            model.moverArriba();
        }
        if(ke.getKeyCode()==KeyEvent.VK_DOWN){
            model.moverAbajo();
        }
        if(ke.getKeyCode()==KeyEvent.VK_LEFT){
            model.moverIzquierda();
        }
        if(ke.getKeyCode()==KeyEvent.VK_RIGHT){
            model.moverDerecha();
        }
        view.setContador(model.getContador());
        model.comprobar();
        view.setCoche(model.getCoche());
        view.setGas(model.getGas());
        view.setHer(model.getHer());
        view.repaint();
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        
    }
    
}
