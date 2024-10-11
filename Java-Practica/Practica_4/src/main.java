import Ejercicio_12.*;
import Ejercicio_14.Casa;
import Ejercicio_15.Programador;

public class main {
    public static void main(String[] args) {
        System.out.println("12)------------------------------------------------------------------------------------------------------------------------------");
        // Crear una factura A
        FacturaA facturaA = new FacturaA("Empresa A", "Cliente A", 1000, 21);
        facturaA.imprimirFactura();
        System.out.println("\n----------------------\n");
        // Crear una factura B
        FacturaB facturaB = new FacturaB("Empresa B", "Cliente B", 1500,10205);
        facturaB.imprimirFactura();
        System.out.println("\n----------------------\n");
        // Crear una factura C
        FacturaC facturaC = new FacturaC("Empresa C", "Cliente C", 2000, 10);
        facturaC.imprimirFactura();
        System.out.println("13)------------------------------------------------------------------------------------------------------------------------------");
        // Crear un objeto de tipo Casa
        Casa miCasa = new Casa();

        // Mostrar los valores iniciales de los atributos de la casa
        miCasa.mostrarInformacionCasa();
        System.out.println("15)------------------------------------------------------------------------------------------------------------------------------");
        Programador miProgramador = new Programador();

    }
}
