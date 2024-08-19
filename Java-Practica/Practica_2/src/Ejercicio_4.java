import java.util.Scanner;
public class Ejercicio_4 {
    Scanner scanner = new Scanner(System.in);
    //1. Diseñar un programa que permita ingresar diferentes caracteres, el programa solo se detendrá si se ingresa una letra X.
    public void cadena_caracteres() {
        char caracter;
        StringBuilder cadena = new StringBuilder();
        while (true){
            System.out.print("Ingrese un caracter (X para salir): ");
            caracter = scanner.next().charAt(0);
            if(caracter == 'X' || caracter == 'x'){
                break;
            }
            cadena.append(caracter);
        }
        System.out.println("La cadena formada es: "+cadena);
    }
    //2. Leer un nombre y muestre por pantalla: “Buenos días nombre_introducido”.
    public void Buenos_Dias(){
        System.out.print("Ingrese Su Nombre: ");
        String nombre = scanner.next();
        System.out.println("Buenos dias "+ nombre);
    }
    //3. Leer un número entero y calcule si es par o impar.
    public void Paridad(){
        System.out.print("Ingrese un valor entero ");
        int a = scanner.nextInt();
        System.out.print(",El valor "+a+" es: ");
        if(a %2 == 0){
            System.out.println("Par");
        } else {
            System.out.println("Impar");
        }
    }
    /*4. Leer un número por teclado que pida el precio de un producto (puede tener decimales) y
    calcule el precio final con IVA. El IVA será una constante que sera del 21 %.*/
    public void iva() {
        double precio;
        System.out.print("Precio del producto");
        precio = scanner.nextDouble();
        precio +=precio*(0.21);
        System.out.println("Precio del producto con IVA es "+precio);
    }
    /*5. Leer dos números por teclado y mostrar el resultado de la división del primero por el
    segundo. Se debe comprobar que el divisor no puede ser cero.*/
    public void divicion() {
        System.out.println("Ingrese dos valores:");
        double a=scanner.nextDouble();
        double b=scanner.nextDouble();
        if (b!=0){
            System.out.println("La divicion de "+a+"/"+b+" es"+(a/b));
        }
    }
    //6. Calcular el promedio de una serie de números que se leen por teclado.
    public void promedio(){
        double prom = 0;
        int cont = 0 ;
        while (true){
            System.out.print("Ingrese un numero : ");
            double a=scanner.nextDouble();
            prom+=a;
            cont=cont+1;
            if (a==0){
                break;
            }
        }
        System.out.println("El promedio es"+prom);
    }
    //7. Pedir un día de la semana y que nos diga si es un día laboral o no. Usar una instrucción switch para ello.

    public void dia_laboral() {
        int Dia;
        System.out.println("Ingrese un dia Semanal con 1-7");
        Dia = scanner.nextInt();
        switch (Dia){
            case 1: System.out.println("Es Un dia Laboral");
                break;
            case 2: System.out.println("Es Un dia Laboral");
                break;
            case 3: System.out.println("Es Un dia Laboral");
                break;
            case 4: System.out.println("Es Un dia Laboral");
                break;
            case 5: System.out.println("Es Un dia Laboral");
                break;
            case 6: System.out.println("No Es Un dia Laboral");
                break;
            case 7: System.out.println("No Es Un dia Laboral");
                break;
            default: System.out.println("No Es Un dia Semanal");
                break;

        }
    }
}
