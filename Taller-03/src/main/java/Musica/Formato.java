package Musica;

public abstract  class Formato {

    private int minutos;
    private int peso;
    private String artista;
    private String compositor;
    private String genero;

    public Formato(int minutos, int peso, String artista, String compositor, String genero) {
        this.minutos = minutos;
        this.peso = peso;
        this.artista = artista;
        this.compositor = compositor;
        this.genero = genero;
    }

    public abstract void reproducir();

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getCompositor() {
        return compositor;
    }

    public void setCompositor(String compositor) {
        this.compositor = compositor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
