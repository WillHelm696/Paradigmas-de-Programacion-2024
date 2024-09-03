import java.util.Arrays;
import java.util.Scanner;

public class ahorcado {
    private char[] palabra;
    private char[] encontradas;
    private int encontrados;
    private int faltantes;
    private char letra;
    private int intentos;
    Scanner sc = new Scanner(System.in);

    public ahorcado(String palabra) {
        this.encontrados=0;
        this.faltantes = palabra.length();
        this.palabra = new char[palabra.length()];
        this.encontradas = new char[palabra.length()];
        for (int i = 0; i < palabra.length(); i++) {
            this.palabra[i]=palabra.charAt(i);
            this.encontradas[i]='_';
        }

        this.intentos = 7;
    }
    //Metodos
    public void jugar(){
        while (this.intentos > 0 && this.faltantes > 0){
            System.out.println("Número de letras (encontradas,faltantes):("+getEncontrados()+","+getFaltantes()+")");
            System.out.println("Número de oportunidades restantes:"+getIntentos());
            System.out.println("Estado Actual:"+ Arrays.toString(getEncontradas()));
            System.out.println("Ingrese una letra:");
            this.letra= sc.nextLine().charAt(0);
            if (esParte(this.letra)){
                System.out.println("Mensaje: ES UNA LETRA");
            }else {
                System.out.println("Mensaje: NO ES UNA LETRA");
            }
            System.out.println("————————————————————————");
        }
        if (intentos == 0){
            gameOver();
        }else {
            cangrulation();
        }
    }

    public boolean esParte(char letra) {
        boolean flag = false;
        for (int i = 0; i < this.palabra.length; i++) {
            if (this.palabra[i] == letra) {
                this.encontradas[i]=letra;
                this.encontrados++;
                this.faltantes--;
                flag = true;
            }
        }
        if (flag == false) {
            this.intentos--;
        }

        return flag;
    }
    public void gameOver(){
        System.out.println("Mensaje: Lo sentimos, no hay más oportunidades QQ\n");
    }
    public void cangrulation(){
        System.out.println("Juego terminado Ganaste");
    }
    // Geters y seters
    public int getFaltantes() {
        return faltantes;
    }

    public int getEncontrados() {
        return encontrados;
    }

    public char[] getEncontradas() {
        return this.encontradas;
    }

    public int getIntentos() {
        return intentos;
    }

}
