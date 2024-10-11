package Ejercicio_12;

public class FacturaC extends Factura {
    private double monto;
    private double descuento; // Descuento aplicado
    // Constructor
    public FacturaC(String emisor, String cliente, double monto, double descuento) {
        super(emisor, cliente);
        this.monto = monto;
        this.descuento = descuento;
    }

    // Método específico para imprimir la factura C
    @Override
    public void imprimirFactura() {
        System.out.println("Factura C");
        System.out.println("Emisor: " + emisor);
        System.out.println("Cliente: " + cliente);
        System.out.println("Monto original: $" + monto);
        System.out.println("Descuento: " + descuento + "%");
        System.out.println("Total con descuento: $" + (monto - (monto * descuento / 100)));
    }

    // Métodos específicos para Factura C
    public double getMonto() {return monto;}
    public void setMonto(double monto) {this.monto = monto;}
    public double getDescuento() {return descuento;}
    public void setDescuento(double descuento) {this.descuento = descuento;}
}

