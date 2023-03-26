package Musica;

public class VideoMp4 extends Formato{

    private String creador;
    private String tipovideo;

    public VideoMp4(int minutos, int peso, String artista, String compositor, String genero, String creador, String tipovideo) {
        super(minutos, peso, artista, compositor, genero);
        this.creador = creador;
        this.tipovideo = tipovideo;
    }

    @Override
    public void reproducir() {
        System.out.println("Formato VideoMP4:" + " Creador: " + this.getCreador() + " Tipo de Video: " + this.getTipovideo()
                + " Reprodución de solo Audio");
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public String getTipovideo() {
        return tipovideo;
    }

    public void setTipovideo(String tipovideo) {
        this.tipovideo = tipovideo;
    }
}
