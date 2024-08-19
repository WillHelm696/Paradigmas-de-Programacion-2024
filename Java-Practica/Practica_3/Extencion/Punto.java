package Extencion;

//2. Definir una clase Punto. Generar dos instancias P1 y P2. Comprobar la distancia que existe desde P1 a P2
public class Punto {
    //Atributos
    public int x1;
    public int y1;
    public int x2;
    public int y2;
    //Constructor
    Punto(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    //Getters
    public int getX1(){
        return x1;
    }
    public int getY1(){
        return y1;
    }
    public int getX2(){
        return x2;
    }
    public int getY2(){
        return y2;
    }
    //Setters
    public void setX1(int x1){
        this.x1 = x1;
    }
    public void setY1(int y1){
        this.y1 = y1;
    }
    public void setX2(int x2){
        this.x2 = x2;
    }
    public void setY2(int y2){
        this.y2 = y2;
    }
    //Metodos
    public void distancia(){
        double dis = Math.sqrt( Math.pow((x1 - x2),2) + Math.pow((y1 - y2),2) );
        System.out.println("La distancia entre (" + x1 + ", " + y1 + ") y (" + x2 + ", " + y2 + ") es: " + dis);
    }
}
