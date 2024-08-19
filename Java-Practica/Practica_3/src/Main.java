
public class Main {
    public static void main(String[] args) {
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
        System.out.println("--------------------------------------------------------------------------------------------");
        Exception exception1;
        try {
            // Generar y lanzar una excepción
            int b = exception1.binario();
            int a = exception1.numeros();
            throw new Exception("Este es el mensaje de la excepción."+(a/b));
        } catch (Exception e) {
            // Capturar la excepción y imprimir el mensaje
            System.out.println("Se ha capturado una excepción: " + e.getMessage());
        } finally {
            // Bloque finally que siempre se ejecuta
            System.out.println("El bloque finally se ha ejecutado.");
        }
    }
}