import Practica_2.Ejercicio_2;
import Practica_2.Ejercicio_3;
import Practica_2.Ejercicio_4;
import Practica_2.Ejercicio_6;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Scanner valor = new Scanner(System.in);

        int a = 1 ;
        int b = 2 ;
        int n = 3 ;
        int m = 4 ;
        Ejercicio_1 Obj_1 = new Ejercicio_1();

        System.out.println("Ejercicio 1 - Actividad 1---------------------------------------------------------------------------------");
        Obj_1.Actividad_1();
        System.out.println("Ejercicio 1 - Actividad 3---------------------------------------------------------------------------------");
        Obj_1.Actividad_3();
        System.out.println("Ejercicio 2 - Actividad 1---------------------------------------------------------------------------------");

        Ejercicio_2 Obj_2 = new Ejercicio_2();
        int may = Obj_2.Mayor(a,b);
        System.out.println("El mayor entre "+a+" y "+b+" es:"+may);
        System.out.println("Ejercicio 2 - Actividad 2---------------------------------------------------------------------------------");
        int x = a;
        int y = b;
        Obj_2.Operaciones_Matematicas(x,y,n,m);
        System.out.println("Ejercicio 2 - Actividad 3---------------------------------------------------------------------------------");
        int c = n;
        int d = m;
        Obj_2.Cambio_Variable(x,y,n,m);
        System.out.println("Ejercicio 2 - Actividad 4---------------------------------------------------------------------------------");
        double v= Obj_2.Volumen_Esfera(x);
        System.out.println("Para radio="+x+" el volumen de la esfera es :"+v);
        System.out.println("Ejercicio 2 - Actividad 5---------------------------------------------------------------------------------");
        double area= Obj_2.Area_Triangulo(a,b,c );
        System.out.println("Para los lados a="+a+", b="+b+", c="+c+" el area del triangulo es es :"+area);

        Ejercicio_3 Obj_3 = new Ejercicio_3();

        System.out.println("Ejercicio 3 - Actividad 1---------------------------------------------------------------------------------");
        int array[] = new  int [10];
        Obj_3.llenar_vector(array);
        System.out.println("Vector de 10 elementos: "+Arrays.toString(array));
        System.out.println("Ejercicio 3 - Actividad 2---------------------------------------------------------------------------------");
        int multiplo_3[] = Obj_3.tabla_multiplo(3);
        int multiplo_4[] = Obj_3.tabla_multiplo(4);
        int multiplo_8[] = Obj_3.tabla_multiplo(8);

        System.out.println("La tabla del 3 es: "+Arrays.toString(multiplo_3));
        System.out.println("La tabla del 4 es: "+Arrays.toString(multiplo_4));
        System.out.println("La tabla del 8 es: "+Arrays.toString(multiplo_8));
        System.out.println("Ejercicio 3 - Actividad 3---------------------------------------------------------------------------------");
        int array_2[]= new int[15];
        int suma = Obj_3.suma_vector_aleatorio(array_2);
        System.out.println("La suma del vector : "+Arrays.toString(array_2)+" del 1 al 20 es "+suma);
        System.out.println("Ejercicio 3 - Actividad 4---------------------------------------------------------------------------------");
        int matriz_1[][] = new int[2][2];
        Obj_3.llenar_matriz_f(matriz_1);
        System.out.println("La matriz 2x2 resultante de (2 * i) + (j + 3) es : ");
        Obj_3.print_matriz(matriz_1);
        System.out.println("Ejercicio 3 - Actividad 5---------------------------------------------------------------------------------");
        int matriz_2[][] = new int[20][20];
        Obj_3.llenar_matriz_g(matriz_2);
        System.out.println("La matriz 2x2 resultante de (20 * i) + j es :");
        Obj_3.print_matriz(matriz_2);

        Ejercicio_4 Obj_4 = new Ejercicio_4();
        System.out.println("Ejercicio 4 - Actividad 6---------------------------------------------------------------------------------");
        Obj_4.dia_laboral();
        System.out.println("Ejercicio 4 - Actividad 1---------------------------------------------------------------------------------");
        Obj_4.cadena_caracteres();
        System.out.println("Ejercicio 4 - Actividad 2---------------------------------------------------------------------------------");
        Obj_4.Buenos_Dias();
        System.out.println("Ejercicio 4 - Actividad 3---------------------------------------------------------------------------------");
        Obj_4.Paridad();
        System.out.println("Ejercicio 4 - Actividad 4---------------------------------------------------------------------------------");
        Obj_4.iva();
        System.out.println("Ejercicio 4 - Actividad 5---------------------------------------------------------------------------------");
        Obj_4.divicion();
        System.out.println("Ejercicio 4 - Actividad 6---------------------------------------------------------------------------------");
        Obj_4.promedio();
        System.out.println("Ejercicio 4 - Actividad 6---------------------------------------------------------------------------------");
        Obj_4.dia_laboral();

        Ejercicio_6 Obj_6 = new Ejercicio_6();

        System.out.println("Ejercicio 6 - Actividad 1---------------------------------------------------------------------------------");
        Obj_6.dia();

        System.out.println("Ejercicio 6 - Actividad 1---------------------------------------------------------------------------------");
        Obj_6.sumador();

        // Método main para crear una instancia de Persona
        Persona persona1 = new Persona("Meliza", " Perez", "Negro", 30);
        persona1.teñirseCabello("Rosa");
        persona1.cambiarApellido("Andres");
        persona1.cumplirAños();
        persona1.presentarse();
        System.out.println("Ejercicio - Actividad ---------------------------------------------------------------------------------");
        // Método main para crear una instancia de Punto
        Punto punto1 =new Punto(2,4,5,6);
        punto1.distancia();
        System.out.println("Ejercicio - Actividad ---------------------------------------------------------------------------------");
        // Método main para crear una instancia de Sumatoria
        Sumatoria sumatoria1 = new Sumatoria();
        Sumatoria sumatoria2 = new Sumatoria(3,4);
        sumatoria1.sumar();
        sumatoria2.sumar();
        System.out.println("Ejercicio - Actividad ---------------------------------------------------------------------------------");
        // Método main para crear instancias de Libro y mostrar sus detalles
        Libro libro2 = new Libro("978-0-452-28423-4", "1984", "George Orwell", 328);
        Libro libro3 = new Libro("978-0-7432-7356-5", "Cien Años de Soledad", "Gabriel García Márquez", 417);
        Libro libro4 = new Libro("978-0-14-044913-6", "La Odisea", "Homero", 541);
        Libro libro5 = new Libro("978-0-316-76948-0", "Harry Potter y la Piedra Filosofal", "J.K. Rowling", 309);

        // Informar los detalles de cada libro
        libro2.infoDelLibro();
        libro3.infoDelLibro();
        libro4.infoDelLibro();
        libro5.infoDelLibro();
    }
}