/*Ejercicio 5
Crear una clase Rectangulo que modele rectángulos por medio de cuatro puntos (los vértices).
Dispondrá de dos constructores: uno que cree un rectángulo partiendo de sus cuatro
vértices y otro que cree un rectángulo partiendo de la base y la altura, de forma que su
vértice inferior izquierdo esté en (0,0). La clase también incluirá un método para calcular
la superficie y otro que desplace el rectángulo en el plano.
*/
//package Extencion.Punto;
public class Rectangulo {
    //Atributos
    //private Punto tupla;

    private int [] ladoA = new int[2];
    private int [] ladoB = new int[2];
    private int [] ladoC = new int[2];
    private int [] ladoD = new int[2];
    private int base;
    private int altura;
    //Constructor
    public Rectangulo(int Ax,int Ay,int Bx,int By,int Cx,int Cy,int Dx,int Dy) {
        if (Ax == Bx && Cx==Dx && By == Dy && Ay == Cy) {
            this.ladoA[0] = Ax;
            this.ladoA[1] = Ay;
            this.ladoA[1] = Bx;
            this.ladoB[0] = By;
            this.ladoB[1] = Cx;
            this.ladoC[0] = Cy;
            this.ladoC[1] = Dx;
            this.ladoD[0] = Dy;
            this.base = Cx-Ax;
            this.altura = By-Ay;
        }else{
            System.out.println("El Rectangulo no es valido");
        }
    }
    public Rectangulo(int base, int altura) {
        this.ladoA[0] = 0;
        this.ladoA[1] = 0;
        this.ladoB[0] = base;
        this.ladoB[1] = 0;
        this.ladoC[0] = 0;
        this.ladoC[1] = altura;
        this.ladoD[0] = base;
        this.ladoD[1] = altura;
        this.base = base;
        this.altura = altura;
    }
    //Metodos
    public void calcularSuperficie(){
        System.out.println("Las superficie es :"+(base * altura));

    }

    public void desplasarse(){

    }


}
