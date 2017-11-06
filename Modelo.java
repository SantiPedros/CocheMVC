package supercoche;
public class Modelo {
    private int x;
    private int y;
    private int contador;

    private void generarPosicion(){
        x=generarX();
        y=generarY();
    }
    private int generarX(){
        return (int)(Math.random()*1300-50);//Cambiar tamaño de imagen
    }
    private int generarY(){
        return (int) (Math.random()*700-50);//Cambiar tamaño de imagen
    }
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    public int getContador() {
        return contador;
    }
}
