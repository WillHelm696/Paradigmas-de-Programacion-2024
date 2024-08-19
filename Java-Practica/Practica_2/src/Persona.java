/*1. Definir la clase Persona, reutilizando lo definido hasta el momento. Implementar al menos
4 métodos propios del comportamiento de la clase Persona y además los métodos getters
y setters. Finalmente, generar una instancia en el método main.*/

public class Persona {
    //Atributos
    public String nombre;
    public String apellido;
    public String cabello;
    public int edad;
    // Constructor
    public Persona(String nombre, String apellido, String color, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.cabello = color;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }
    public String getCabello() {
        return cabello;
    }
    public String getApellido() {
        return apellido;
    }
    public int getEdad() {
        return edad;
    }

    // Setters
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public void setCabello(String color) {
        this.cabello = color;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setNacimiento(int edad) {
        this.edad = edad;
    }

    //Metodos
    public void presentarse() {
        System.out.println("Mi nombre es"+ nombre+" y mi edad es "+edad);
    }
    public void teñirseCabello(String color) {
        this.cabello = color;
        System.out.println("Teñiste tu cabello a "+ cabello);
    }

    public void cambiarApellido(String apellido) {
        this.apellido = apellido;
        System.out.println("Cambiaste tu apellido a "+ apellido);
    }
    public void cumplirAños() {
        this.edad += 1;
    }
}
