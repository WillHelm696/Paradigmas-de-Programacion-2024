import Ejercicio_5.Rectangulo;

public class Main {
    public static void main(String[] args) {
        System.out.println("4)--------------------------------------------------------------------------------------------");
        Cuenta cliente1 = new Cuenta(20649,48624789,1094.50,32);
        Cuenta cliente2 = new Cuenta(20749,47513686,1154.50,32);
        System.out.println("Cliente 1");
        cliente1.datosCuenta();
        System.out.println("Cliente 2");
        cliente2.datosCuenta();
        cliente2.retirar(150);
        cliente2.mostrarSaldo();
        cliente2.ingresar(20);
        cliente1.actualizarSaldo();
        System.out.println("5)--------------------------------------------------------------------------------------------");
        Rectangulo rectangulo1= new Rectangulo(3,4);
        System.out.println("Rectangulo 1: base=3,haltura=4");
        rectangulo1.mostrarVertices();
        System.out.println("despazarse 2 en vertical 3 en horizontal ");
        rectangulo1.desplazar(2,3);
        rectangulo1.mostrarVertices();

        Rectangulo rectangulo2= new Rectangulo(0,0,0,2,3,0,2,3);
        System.out.println("Rectangulo 2:(0,0),(0,2),(3,0),(2,3)");
        rectangulo2.mostrarVertices();
        System.out.println("despazarse 2 en vertical 3 en horizontal ");
        rectangulo2.desplazar(2,3);
        rectangulo2.mostrarVertices();

        System.out.println("6)--------------------------------------------------------------------------------------------");
        Fecha fecha1 = new Fecha(2023,1,1);
        fecha1.corta();
        System.out.println("el año es bisiesto");
        fecha1.bisiesto();
        System.out.println("actualizar fecha");
        fecha1.leer();
        fecha1.corta();
        System.out.println("8)--------------------------------------------------------------------------------------------");
        Ahorcado juego = new Ahorcado("matematica");
        juego.jugar();
        System.out.println("9)--------------------------------------------------------------------------------------------");
        try {
            // Generar una excepción con un mensaje
            throw new Exception("¡Ocurrió una excepción!");
        } catch (Exception e) {
            // Capturar la excepción y mostrar el mensaje
            System.out.println("Se capturó la excepción: " + e.getMessage());
        } finally {
            // Mensaje en el bloque finally
            System.out.println("Este mensaje se imprime siempre, independientemente de la excepción.");
        }
    }
}