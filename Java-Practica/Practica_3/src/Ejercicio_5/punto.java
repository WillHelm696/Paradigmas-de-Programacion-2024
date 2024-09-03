package Ejercicio_5;
class punto {
    private double x;
    private double y;

    // Constructor
    public punto() {}

    public punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Getters y setters
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    // Método toString para facilitar la impresión de un punto
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}