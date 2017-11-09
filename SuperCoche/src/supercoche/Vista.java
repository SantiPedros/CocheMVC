//constructor.
   /* Vista(){
        this.ancho=ancho;
        this.alto=alto;
        this.setSize(600,200);
        this.setLayout(new BorderLayout());
        JLabel fondo=new JLabel(new ImageIcon("/imagenes/parking.png"));
        this.add(fondo);
        setLayout(new FlowLayout());  // --> no funciona no se porque, preguntar maÃ±ana.
        font=new Font("Sans-serif",Font.BOLD,30);
         this.setVisible(true);*/
package supercoche;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Vista extends JFrame{
    private int ancho,alto;
    private String contador="";
    private int posicion;
    private Font font;
    private String msg="";
    private Coche coche;
    private ArrayList<Herramientas> conos;
    private Gasolina gas;

      Vista(Coche coche, Gasolina gas){
        this.coche=coche;
        this.gas=gas;
        this.ancho=ancho;
        this.alto=alto;
        this.setBounds(60, 60, 1200, 700);
        this.setUndecorated(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        font= new Font("Arial", Font.BOLD, 20);
        this.setVisible(true);
    }
    
    @Override
    public void paint(Graphics g){
        g.setColor(Color.blue);
        g.fillRect(0, 0, 1200, 700);
        g.setColor(Color.WHITE);
       // g.drawRect(xRect, yRect, 30, 30);
        Dimension tam=getSize();
        ImageIcon imagen=new ImageIcon(getClass().getResource("/imagenes/parking.png"));
        g.drawImage(imagen.getImage(), 0, 0, tam.width,tam.height,null);
        g.setFont(font);
        
        g.drawRect(1000, 90, 120, 50);
        g.setColor(Color.blue);
        g.fillRect(1000, 90, 120, 50);
        g.setColor(Color.yellow);
        g.drawString(contador,1010, 120);
        
        g.drawString(msg,400, 200);
        coche.dibujar(g);
        for(int i=0;i<conos.size();i++){
            conos.get(i).dibujar(g);
        }
        
        gas.dibujar(g);
    }
    //funcion para el marcador del juego.
    public void setContador(int puntos){
        contador="Puntos: "+puntos;
    }
    //funcion para aÃ±adir el mensaje final del juego.
    public void setMessage(String msg){
        this.msg=msg;
    }
    public void setCoche(Coche coche) {
        this.coche = coche;
    }

    public void setConos(ArrayList<Herramientas> conos) {
        this.conos = conos;
    }
    
    public void setGas(Gasolina gas) {
        this.gas = gas;
    }
}
