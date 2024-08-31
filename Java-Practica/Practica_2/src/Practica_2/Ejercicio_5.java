package Practica_2;

public class Ejercicio_5 {


    public static void main(String[] args) {
        Ejercicio_5 ejercicio = new Ejercicio_5();
        ejercicio.segm1();
        ejercicio.segm2();
    }

    public Ejercicio_5() {}

    public void segm1() {
        float sum=0; int i;
        for (i = 10; 1/i > sum; i--);{
            sum = sum + 1/i;
        }
        System.out.println(sum);
    }

    public void segm2() {
        float sum=0;
        for (int i = 10; 1/i > sum; i--){
            System.out.println("sum:"+sum+" i"+i);
            sum = sum + 1/i;
            }
        System.out.println(sum);
    }
}
