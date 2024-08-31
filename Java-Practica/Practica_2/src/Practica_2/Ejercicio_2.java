package Practica_2;

public class Ejercicio_2 {

    //1. Implementar un programa que dado dos números informe cual es el mayor.
    public int Mayor(int a, int b){
        if (a>b)
            return a;
        else
            return b;
    }

    /*2. Declarar dos variables X e Y de tipo int, dos variables N y M de tipo double y asignar a cada una un valor.
    A continuación mostrar por pantalla el resultado de una serie de operaciones matematicas basicas entre ellas( las
    operaciones son a elección del alumno).*/
    public void Operaciones_Matematicas(int X, int Y, int N, int M){
        System.out.println("Para X="+X+", Y="+Y+", N="+N+", M="+M);
        System.out.println("X*N+Y*M="+(X*N+Y*M));
        System.out.println("(X+N)*(Y+M)="+(X+N)*(Y+M));
        System.out.println("(X/N)-(Y/M)="+(X/N-Y/M));
    }

    /*3. Declarar cuatro variables enteras A, B, C y D y asignarle un valor diferente a cada una. A
    continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C tome
    el valor de A, A tome el valor de D, D tome el valor de B. Mostrar los valores iniciales y
    los valores finales de cada variable.*/
    public void Cambio_Variable(int A, int B, int C, int D){
        System.out.println("Para A="+A+", B="+B+", C="+C+", D="+D);
        int Aux=B;
        B=C;
        C=A;
        A=D;
        D=Aux;
        System.out.println("Cambiando Variables queda A="+A+", B="+B+", C="+C+", D="+D);
    }

    /*4. Calcular el volumen de una esfera. Recordar que para calcular el volumen se debe utilizar
    la siguiente formula V = 4/3 ∗ π ∗ r siendo r^3 el radio de la esfera.*/
    public static double Volumen_Esfera(double r){
        double v=(4/3)*Math.PI*Math.pow(r,3) ;
        return v;
    }

    /*5. Calcular el área de un triángulo a partir de la longitud de sus lados. El calculo de un
    semiperímetro es p = 1/2 ∗ (a + b + c) siendo a, b y c las longitudes.*/
    public double Area_Triangulo(int a, int b, int c){
        int Area = (1/2)*(a + b + c);
        return Area;
    }
}
