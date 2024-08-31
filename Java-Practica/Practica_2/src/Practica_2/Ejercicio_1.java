package Practica_2;
public class Ejercicio_1 {

    int a = 0;
    int b = 0;
    int c = 0;
    boolean v = false;

    public void Actividad_1() {
        a = 2;
        a++;
        System.out.println("a) Para a=2 entonces a++ es " + a);
        a = 2;
        b = a++;
        System.out.println("b) Para a=2 entonces b=a++ es " + b);
        a = 2;
        b = ++a;
        System.out.println("c) Para a=2 entonces b=++a es " + b);
        a = 2;
        b = 1;
        b += a;
        System.out.println("d) Para a=2 y b=1 entonces b+=a es " + b);
        b = 1;
        b *= 5;
        System.out.println("e) Para b=1 entonces b*=5 es " + b);
        a = 2;
        b = 1;
        b += -a + 5;
        System.out.println("f) Para a=2 y b=1 entonces b+=-a+5 es " + b);
        a = 2;
        b = 2;
        //a += b– ;
        System.out.println("g) Para a=2 y b=2 entonces a += b– es " + b);
        a = 2;
        b = 3;
        c = 5;
        a++;
        b += a;
        c *= b;
        b -= 3;
        a %= 2;
        c /= 5;
        System.out.println("h) Para a=2 , b=3 y c=5 entonces a++; b += a; c *= b; b -= 3; a %= 2; c /= 5; es a=" + a + " y b=" + b + " c=" + c);
        a = 1;
        b = 2;
        b++;
        b = ++a;
        a *= 2;
        b += a;
        a = ++b + 2;
        System.out.println("i) Para b=2 y b=2 entonces b++; b = ++a; a *= 2; b += a; a = ++b + 2; es a=" + a + " b=" + b + " c=" + c);
        a = 1;
        b = 4;
        a++;
        b += a;
        b -= a;
        ++b;
        a = ++b;
        //b =–a+b;
        System.out.println("j) Para b=2 y b=2 entonces a++; b += a; a *= 4; b -= a; ++b; a = ++b; b =–a+b; es a=" + a + " b=" + b + " c=" + c);
    }

    public void Actividad_3() {
        a=1;
        b=2;
        v=(a++<b);
        System.out.println("a) Para a=1 y b=2 entonces a++ < b es " + v);
        a=1;
        b=2;
        v=(++a<b);
        System.out.println("b) Para a=1 y b=2 entonces ++a < b es " + v);
        a=1;
        b=2;
        v=(++a>=b);
        System.out.println("c) Para a=1 y b=2 entonces ++a >= b es " + v);
        /*
        a=1;
        v= (a
        */
        a=1;
        v= (a != 1);
        System.out.println("e) Para a=1 entonces a != 1 es " + v);
        a=1;
        b=2;
        v=(b++<10 && a==1);
        System.out.println("f) Para a=1 y b=2 entonces b++<10 && a==1 es " + v);
        a=1;
        b=2;
        v=(b==1 && a>=1);
        System.out.println("g) Para a=1 y b=2 entonces b==1 && a>=1 es " + v);
        a=1;
        b=2;
        v=(b<10 || a++==2);
        System.out.println("h) Para a=1 y b=2 entonces b<10 || a++==2 es " + v);
        a=1;
        b=2;
        v=false; //(–b<=1 || a<=10);
        System.out.println("i) Para a=1 y b=2 entonces –b<=1 || a<=10 es " + v);
        a=1;
        b=2;
        v=false; //(a–==2 || b==1);
        System.out.println("j) Para a=1 y b=2 entonces –b<=1 || a<=10 es " + v);
        a=1;
        b=2;
        v=false; //!(a==1 && ++b==1);
        System.out.println("k) Para a=1 y b=2 entonces a++ < b es " + v);
    }
}