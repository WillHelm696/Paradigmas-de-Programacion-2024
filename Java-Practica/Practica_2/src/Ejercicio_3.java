import java.util.Arrays;
import java.util.Random;
public class Ejercicio_3 {
    Random rand = new Random();
    //1. Implementar un programa que defina un vector de tamaño 10 y completar con números del 1 al 10.
    public void llenar_vector(int[] array){
        for (int i = 0; i < array.length; i++) {
            array[i]=rand.nextInt(array.length*10);
        }
    }
    /*2. Reutilizando el código anterior, definir un programa que muestre la tabla del 3, luego la
    del 4 y finalmente la del 8.*/
    public int[] tabla_multiplo(int multiplo){
        int[] tabla = new int[10];
        for (int i = 0; i < 10; i++) {
            tabla[i]=(i+1)*multiplo;
        }
        return tabla;
    }

    /*3. Definir un vector y completar cada posición con números del 1 al 20. Una vez completado el
    vector sumar los valores generados. NO se debe realizar la misma operación de asignación
    del dato y suma en la misma estructura de repetición. NO utilizar una estructura for.*/
    public int suma_vector_aleatorio(int[] array){
        int i=0;
        int sum=0;
        while (i< array.length){
            array[i]=rand.nextInt(1,20);
            i++;
        }
        i=0;
        while (i< array.length){
            sum+=array[i];
            i++;
        }
        return sum;
    }
    //4. Definir una matriz de 2×2. Para cada posición (i,j), asignar el valor resultante de la operación valor = (2 ∗ i) + (j + 3).
    public int f(int i , int j){
        return (i*20+j);
    }
    public void llenar_matriz_f(int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j]=f(i,j);
            }
        }
    }
    /*5. Definir una matriz de 20×20 elementos. Completar dicha matriz con los valores generados por valor = fila ∗ 20 + columna.*/
    public int g(int i , int j){
        return (i*2+j+3);
    }
    public void llenar_matriz_g(int[][] matriz_2){
        for (int i = 0; i < matriz_2.length; i++) {
            for (int j = 0; j < matriz_2[i].length; j++) {
                matriz_2[i][j]=g(i,j);
            }
        }
    }

    public void print_matriz(int[][] matriz) {
        for (int n = 0; n < matriz.length; n++) {
            System.out.println( Arrays.toString( matriz[n] ) );
        }
    }
}
