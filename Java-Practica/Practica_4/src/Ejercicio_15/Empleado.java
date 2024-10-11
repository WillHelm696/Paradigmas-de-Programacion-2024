package Ejercicio_15;

public class Empleado {
    private String nombre;
    private String cedula;
    private int edad;
    private boolean casado;
    private double salario;

    public Empleado() {}

    public Empleado(String nombre, String cedula, int edad, boolean casado, double salario) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;
        this.casado = casado;
        this.salario = salario;
    }

    public void clasificacion(int edad) {
        if (21 >= this.edad) {
            System.out.println("Prinsipiante");
        } else if (this.edad > 22 || edad < 35) {
            System.out.println("Intermediario");
        } else if (this.edad > 35) {
            System.out.println("Senior");
        }
    }
    public void mostrarInformacionEmpleado() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Cedula: " + this.cedula);
        System.out.println("Edad: " + this.edad);
        System.out.println("Casado: " + this.casado);
        System.out.println("Salario: " + this.salario);
    }
    public void aumetarSalario(double aumento) {
        this.salario += aumento;
    }
}
