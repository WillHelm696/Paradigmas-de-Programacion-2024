package Ejercicio_12;

public class FacturaA extends Factura {
    private double monto;
    private double iva; // Impuesto aplicado
    // Constructor
    public FacturaA(String emisor, String cliente, double monto, double iva) {
        super(emisor, cliente);
        this.monto = monto;
        this.iva = iva;
    }

    // Método específico para imprimir la factura A
    @Override
    public void imprimirFactura() {
        System.out.println("Factura A");
        System.out.println("Emisor: " + emisor);
        System.out.println("Cliente: " + cliente);
        System.out.println("Monto: $" + monto);
        System.out.println("IVA: " + iva + "%");
        System.out.println("Total: $" + (monto + (monto * iva / 100)));
    }

    // Métodos específicos para Factura A
    public double getMonto() {return monto;}
    public void setMonto(double monto) {this.monto = monto;}
    public double getIva() {return iva;}
    public void setIva(double iva) {this.iva = iva;}
}

