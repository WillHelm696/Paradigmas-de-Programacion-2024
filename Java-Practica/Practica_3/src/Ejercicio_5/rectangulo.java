package Ejercicio_5;
/*Ejercicio 5
Crear una clase Rectangulo que modele rectángulos por medio de cuatro puntos (los vértices).
Dispondrá de dos constructores: uno que cree un rectángulo partiendo de sus cuatro
vértices y otro que cree un rectángulo partiendo de la base y la altura, de forma que su
vértice inferior izquierdo esté en (0,0). La clase también incluirá un método para calcular
la superficie y otro que desplace el rectángulo en el plano.
*/
public class rectangulo {
    //Atributos

    punto puntoA = new punto();
    punto puntoB = new punto();
    punto puntoC = new punto();
    punto puntoD = new punto();

    //Constructor
    public rectangulo(int Ax, int Ay, int Bx, int By, int Cx, int Cy, int Dx, int Dy) {
        if (Ax == Bx && Ay == Cy && Bx==Dx && Cy == Dy ) {
            puntoA.setX(Ax);
            puntoA.setY(Ay);
            puntoB.setX(Bx);
            puntoB.setY(By);
            puntoC.setX(Cx);
            puntoC.setY(Cy);
            puntoD.setX(Dx);
            puntoD.setY(Dy);
        }else{
            System.out.println("El Rectangulo no es valido");
        }
    }
    public rectangulo(int base, int altura) {
        puntoA.setX(0);
        puntoA.setY(0);
        puntoB.setX(0);
        puntoB.setY(altura);
        puntoC.setX(base);
        puntoC.setY(0);
        puntoD.setX(base);
        puntoD.setY(altura);
    }
    //Metodos
    public void calcularSuperficie() {
        double base = puntoC.getX() - puntoA.getX();
        double altura = puntoB.getY() - puntoA.getY();

        System.out.println("El Rectangulo es: " + base * altura );
    }

    // Método para desplazar el rectángulo en el plano
    public void desplazar(double deltaX, double deltaY) {
        puntoA.setX(puntoA.getX() + deltaX);
        puntoA.setY(puntoA.getY() + deltaY);
        puntoB.setX(puntoB.getX() + deltaX);
        puntoB.setY(puntoB.getY() + deltaY);
        puntoC.setX(puntoC.getX() + deltaX);
        puntoC.setY(puntoC.getY() + deltaY);
        puntoD.setX(puntoD.getX() + deltaX);
        puntoD.setY(puntoD.getY() + deltaY);
    }

    // Método para mostrar los vértices del rectángulo
    public void mostrarVertices() {
        System.out.println("Vértice 1: (" + this.puntoA.getX()+","+this.puntoA.getY()+")");
        System.out.println("Vértice 2: (" + this.puntoA.getX()+","+this.puntoB.getY()+")");
        System.out.println("Vértice 3: (" + this.puntoC.getX()+","+this.puntoC.getY()+")");
        System.out.println("Vértice 4: (" + this.puntoD.getX()+","+this.puntoD.getY()+")");
    }
}
