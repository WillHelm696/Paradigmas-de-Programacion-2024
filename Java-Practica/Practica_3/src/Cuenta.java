/*Ejercicio 4
Crea una clase Cuenta (bancaria) con atributos para el número de cuenta (un entero), el
DNI del cliente (otro entero largo), el saldo actual y el interés anual que se aplica a la
cuenta (porcentaje). Define en la clase los siguientes métodos:
    Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés
    actualizarSaldo(): actualizará el saldo de la cuenta aplicándole el interés diario (interés
    anual dividido entre 365 aplicado al saldo actual).
    ingresar(double): permitirá ingresar una cantidad en la cuenta.
    retirar(double): permitirá sacar una cantidad de la cuenta (si hay saldo).
    Método que nos permita mostrar el saldo de la cuenta
    Método que nos permita mostrar todos los datos de la cuenta.
*/
public class Cuenta {
    //Atributos
    private int numeroCuenta;
    private int dni;
    private int interes;
    private double saldo;

    //Constructor
    public Cuenta(int numeroCuenta, int dni, double saldo, int interes) {
        this.numeroCuenta = numeroCuenta;
        this.dni = dni;
        this.saldo = saldo;
        this.interes = interes;
    }

    public Cuenta(){}
    //Metodos
    public void actualizarSaldo() {
        this.saldo = this.saldo + (interes/360)*(this.saldo);
        System.out.println("Saldo actualizado con intereses: " + this.saldo);
    }
    public void ingresar(double saldo) {
        this.saldo += saldo;
        System.out.println("Saldo ingresado: " + this.saldo);
    }
    public void retirar(double cantidad) {
        if (cantidad > this.saldo) {
            System.out.println("Saldo insuficiente");
        } else {
            this.saldo -= cantidad;
            System.out.println("Saldo retirado: " + this.saldo);
        }
    }
    public void mostrarSaldo() {
        System.out.println("Saldo: " + this.saldo);
    }
    public void datosCuenta(){
        System.out.println("Numero Cuenta: " + this.numeroCuenta);
        System.out.println("Dni: " + this.dni);
        System.out.println("Interes: " + this.interes);
        System.out.println("Saldo: " + this.saldo);
    }

}
