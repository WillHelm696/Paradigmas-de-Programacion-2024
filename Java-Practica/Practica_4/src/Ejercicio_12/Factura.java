package Ejercicio_12;
/* Ejercicio 12.
Construir una clase FacturaA, FacturaB y FacturaC que descienda de la clase Factura. Para
la clase abstracta debe definir al menos dos atributos específicos llamados emisor y cliente y, al
menos, un método llamado imprimirFactura. Para cada clase defina los atributos necesarios y
métodos propios de cada especialización.*/
abstract class Factura {
    protected String emisor;
    protected String cliente;

    // Constructor de la clase Factura
    public Factura(String emisor, String cliente) {
        this.emisor = emisor;
        this.cliente = cliente;
    }

    // Método abstracto que deberá ser implementado por las subclases
    public abstract void imprimirFactura();

    // Métodos getters y setters para los atributos comunes
    public String getEmisor() {return emisor;}
    public void setEmisor(String emisor) {this.emisor = emisor;}
    public String getCliente() {return cliente;}
    public void setCliente(String cliente) {this.cliente = cliente;}
}
