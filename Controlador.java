
package supercoche;


public class Controlador {
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
        
        if(ke.getKeyCode()==KeyEvent.VK_ESCAPE){
            System.exit(0);
        }
        
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
