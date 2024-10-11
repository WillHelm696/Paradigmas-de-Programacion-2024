package Ejercicio_14;
/*Define tres clases: Casa, SalonCasa y CocinaCasa. La clase SalonCasa debe tener como
atributos numeroDeTelevisores (int) y tipoSalon (String) y disponer de un constructor que los
inicialice a 0 y “desconocido”.
La clase Casa tendrá los siguientes atributos de clase: superficie (double), direccion (String),
salonCasa (tipo SalonCasa) y cocina (tipo CocinaCasa).
La clase CocinaCasa debe tener como atributos esIndependiente (boolean) y numeroDeFuegos
(int) y un constructor que los inicialice a false y 0.
Definir un constructor para la clase Casa que establezca valores de defecto a los atributos
simples y que cree nuevos objetos si se trata de atributos objeto.
Compilar el código para comprobar que no presenta errores, crear un objeto de tipo Casa.
Comprueba que se inicializan correctamente consultando el valor de sus atributos después de
haber creado los objetos.*/
public class Casa {
    private double superficie;
    private String direccion;
    private SalonCasa salonCasa;
    private CocinaCasa cocinaCasa;

    public Casa() {
        this.superficie = 100.0;  // Ejemplo de valor por defecto
        this.direccion = "Desconocida";  // Valor por defecto
        this.salonCasa = new SalonCasa();
        this.cocinaCasa = new CocinaCasa();
    }

    public void mostrarInformacionCasa() {
        System.out.println("Superficie de la casa: " + superficie + " m²");
        System.out.println("Dirección de la casa: " + direccion);
        System.out.println("Salon: " + salonCasa.getTipoSalon() + ", Televisores: " + salonCasa.getNumeroDeTelevisores());
        System.out.println("Cocina es independiente: " + cocinaCasa.isEsIndependiente() + ", Número de fuegos: " + cocinaCasa.getNumeroDeFuegos());
    }

}
