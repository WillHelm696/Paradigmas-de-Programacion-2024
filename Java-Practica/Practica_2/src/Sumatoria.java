/*Diseñar una clase Sumatoria que tenga: una variable vector de tipo entero y dos métodos,
uno que permita mostrar la tabla de multiplicar para cada variable y otro que permita
devolver la suma. Debe tener un constructor por defecto que les asigne valores entre 1 y 10
o bien un constructor para ingresar los dos valores. En el main de prueba deberá generar
dos instancias de la clase Sumatoria, mostrar las tablas de multiplicar y finalmente mostrar
la suma de ambas variables por pantalla.*/
import java.util.Random;
public class Sumatoria {
    //Atributos
    int [] vector = new int [2];
    Random rand = new Random();
    //Constructor
    public Sumatoria() {
        vector[0] = rand.nextInt(1,10);
        vector[1] = rand.nextInt(1,10);
    }
    public Sumatoria(int x, int y) {
        vector[0] = x;
        vector[1] = y;
    }
    //Metodos
    public int sumar() {
        return (vector[0] + vector[1]);
    }
    public void tablaMultiplicar(){
        int [] tabla1 = new int [10];
        int [] tabla2 = new int [10];
        for (int i = 0; i < 10; i++) {
            tabla1[i] = vector[0] * (i+1);
        }
        for (int i = 0; i < 10; i++) {
            tabla2[i] = vector[1] * (i+1);
        }
        System.out.println("La Tabla de"+vector[0]+" es :"+tabla1[0]);
        System.out.println("La Tabla de"+vector[1]+" es :"+tabla2[1]);
    }
}
