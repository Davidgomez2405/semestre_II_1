package constructor;

public class Character {
    private String nombrePersonaje;
    private int vida;
    private int daño;
    private int costoElixir;
    public Character(String nombrePersonaje, int vida, int daño, int costoElixir) {
        this.nombrePersonaje = nombrePersonaje;
        this.vida = vida;
        this.daño = daño;
        this.costoElixir = costoElixir;

    }

    public String getNombrePersonaje() {
        return nombrePersonaje;
    }

    public void setNombrePersonaje(String nombrePersonaje) {
        this.nombrePersonaje = nombrePersonaje;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getDaño() {
        return daño;
    }

    public void setDaño(int daño) {
        this.daño = daño;
    }

    public int getCostoElixir() {
        return costoElixir;
    }

    public void setCostoElixir(int costoElixir) {
        this.costoElixir = costoElixir;
    }
    public void move(){

    }
}
