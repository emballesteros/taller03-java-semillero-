package Musica;

public class Mp3 extends Formato{

    public Mp3(int minutos, int peso, String artista, String compositor, String genero) {
        super(minutos, peso, artista, compositor, genero);
    }

    @Override
    public void reproducir() {
        System.out.println("Formato MP3:" + " Minutos: " + this.getMinutos() + " Peso: " + this.getPeso()
        + " Artista: " + this.getArtista() + " Genero: " + this.getGenero());
    }
}
