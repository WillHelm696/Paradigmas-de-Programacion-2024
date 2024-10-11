package Ejercicio_14;

public class SalonCasa {
    private int numeroDeTelevisores;
    private String tipoSalon;

    public SalonCasa() {
        this.numeroDeTelevisores = 0;
        this.tipoSalon = "“desconocido";
    }

    public void getSalonCasa(int numeroDeTelevisores) {
        this.numeroDeTelevisores = numeroDeTelevisores;

    }
    public int getNumeroDeTelevisores() {
        return numeroDeTelevisores;
    }
    public void setNumeroDeTelevisores(int numeroDeTelevisores) {
        this.numeroDeTelevisores = numeroDeTelevisores;
    }
    public String getTipoSalon() {
        return tipoSalon;
    }
}
