package constructor;

public class Deck {
    private int numeroDeCartas;
    private int promedioElixir;
    private String calidadDeCarta;
    private int nivelDeCarta;
    public Deck(int numeroDeCartas, int promedioElixir, String calidadDeCarta, int nivelDeCarta) {
        this.numeroDeCartas = numeroDeCartas;
        this.promedioElixir = promedioElixir;
        this.calidadDeCarta = calidadDeCarta;
        this.nivelDeCarta = nivelDeCarta;
    }

    public int getNumeroDeCartas() {
        return numeroDeCartas;
    }

    public void setNumeroDeCartas(int numeroDeCartas) {
        this.numeroDeCartas = numeroDeCartas;
    }

    public int getPromedioElixir() {
        return promedioElixir;
    }

    public void setPromedioElixir(int promedioElixir) {
        this.promedioElixir = promedioElixir;
    }

    public String getCalidadDeCarta() {
        return calidadDeCarta;
    }

    public void setCalidadDeCarta(String calidadDeCarta) {
        this.calidadDeCarta = calidadDeCarta;
    }

    public int getNivelDeCarta() {
        return nivelDeCarta;
    }



    public void setNivelDeCarta(int nivelDeCarta) {
        this.nivelDeCarta = nivelDeCarta;

    }
}
