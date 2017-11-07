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
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JFrame;

public class Vista extends JFrame{
    private int ancho,alto;
    private String contador="";
    private int posicion;
    private Font font;
    private String msg="";
    private Coche coche;
    private Herramientas her;
    private Gasolina gas;

      Vista(Coche coche,Herramientas her, Gasolina gas){
        this.coche=coche;
        this.her=her;
        this.gas=gas;
        this.ancho=ancho;
        this.alto=alto;
        this.setBounds(300, 90, 600, 600);
        this.setUndecorated(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        font= new Font("Arial", Font.BOLD, 20);
        this.setVisible(true);
    }
    
    @Override
    public void paint(Graphics g){
        g.setColor(Color.blue);
        g.fillRect(0, 0, 600, 600);
        g.setColor(Color.WHITE);
       // g.drawRect(xRect, yRect, 30, 30);
        g.setFont(font);   
        g.drawString(contador,400, 300);
        g.drawString(msg,400, 200);
        coche.dibujar(g);
        her.dibujar(g);
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
    
    public void setHer(Herramientas her) {
        this.her = her;
    }

    public void setGas(Gasolina gas) {
        this.gas = gas;
    }
}
