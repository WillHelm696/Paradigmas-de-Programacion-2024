package Ejercicio_12;

public class FacturaB extends Factura {
    private double monto;
    private int cuenta;
    // Constructor
    public FacturaB(String emisor, String cliente, double monto,int cuenta) {
        super(emisor, cliente);
        this.monto = monto;
        this.cuenta = cuenta;
    }

    // Método específico para imprimir la factura B
    @Override
    public void imprimirFactura() {
        System.out.println("Factura B");
        System.out.println("Emisor: " + emisor);
        System.out.println("Cliente: " + cliente);
        System.out.println("Monto: $" + monto);
        System.out.println("Nro Cuenta: " + cuenta);
    }

    // Métodos específicos para Factura B
    public double getMonto() {return monto;}
    public void setMonto(double monto) {this.monto = monto;}
    public double getDescuento() {return cuenta;}
    public void setDescuento(int cuenta) {this.cuenta = cuenta;}
}
