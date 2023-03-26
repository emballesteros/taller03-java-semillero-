package Musica;

public class Wav extends Formato{
    public Wav(int minutos, int peso, String artista, String compositor, String genero) {
        super(minutos, peso, artista, compositor, genero);
    }

    @Override
    public void reproducir() {
        System.out.println("Formato Wav:" + " Minutos: " + this.getMinutos() + " Peso: " + this.getPeso()
                + " Artista: " + this.getArtista() + " Genero: " + this.getGenero());
    }
}
