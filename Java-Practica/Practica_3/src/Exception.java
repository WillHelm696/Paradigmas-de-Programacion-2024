import java.util.Random;
import java.util.Scanner;

/*Ejercicio 9
Crear una clase con un método main() que genere un objeto de la clase Exception dentro
de un bloque try. Proporcione al constructor de Exception un argumento String. Para lanzar la
excepción puede probar con cualquier caso. Capture la excepción dentro de una cláusula catch e
imprima el argumento String. Añada una clausula finally e imprima un mensaje para demostrar
que pasó por allí.*/
public class Exception {
    //Atributo
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();
    //Constructor
    public void Exception() {}
    //Metodo
    public int binario(){
        return rand.nextInt(0,1);
    }

    public int numeros(){
        System.out.println("Ingrese un numero");
        return sc.nextInt();
    }
}
