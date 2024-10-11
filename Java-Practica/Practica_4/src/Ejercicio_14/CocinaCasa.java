package Ejercicio_14;

public class CocinaCasa {
    private boolean esIndependiente;
    private int numeroDeFuegos;

    public CocinaCasa() {
        this.esIndependiente = false;
        this.numeroDeFuegos = 0;
    }

    public int getNumeroDeFuegos() {
        return numeroDeFuegos;
    }
    public void setNumeroDeFuegos(int numeroDeFuegos) {
        this.numeroDeFuegos = numeroDeFuegos;
    }
    public boolean isEsIndependiente() {
        return esIndependiente;
    }
    public void setEsIndependiente(boolean esIndependiente) {
        this.esIndependiente = esIndependiente;
    }
}
