package Practica_2;

import java.util.Scanner;
public class Ejercicio_6 {
    Scanner sc = new Scanner(System.in);
    /*1. Implementar un programa donde se tiene el dato del día (puede ser número o letra) e
    informar a que día corresponde.*/
    public void dia() {
        System.out.print("Ingrese un día (1-7 para números o una letra inicial para el nombre del día): ");
        String dato = sc.nextLine().trim();
        switch (dato.toLowerCase()) {
            case "1":
            case "l":
                System.out.println("Lunes");
                break;
            case "2":
            case "m":
                System.out.println("Martes");
                break;
            case "3":
            case "x":
                System.out.println("Miércoles");
                break;
            case "4":
            case "j":
                System.out.println("Jueves");
                break;
            case "5":
            case "v":
                System.out.println("Viernes");
                break;
            case "6":
            case "s":
                System.out.println("Sábado");
                break;
            case "7":
            case "d":
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Entrada no válida. Ingrese un número del 1 al 7 o la inicial de un día de la semana.");
                break;
        }
    }
    /*2. Implementar un programa que sume los números del 1 al 10. Utilizar las tres estructuras
    de repetición: for, do-while, while.*/
    public void sumador(){
            // Suma utilizando un bucle for
            int sumaFor = 0;
            for (int i = 1; i <= 10; i++) {
                sumaFor += i;
            }
            System.out.println("Suma utilizando for: " + sumaFor);
            // Suma utilizando un bucle while
            int sumaWhile = 0;
            int i = 1;
            while (i <= 10) {
                sumaWhile += i;
                i++;
            }
            System.out.println("Suma utilizando while: " + sumaWhile);
            // Suma utilizando un bucle do-while
            int sumaDoWhile = 0;
            int j = 1;
            do {
                sumaDoWhile += j;
                j++;
            } while (j <= 10);
            System.out.println("Suma utilizando do-while: " + sumaDoWhile);
    }
    //3. Dado un valor booleano informar si es verdadero o falso.

    //4. Dado un carácter numérico informar si es un dígito o no.

}
