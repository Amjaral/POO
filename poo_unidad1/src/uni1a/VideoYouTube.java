package uni1a;

public class VideoYouTube extends ContenidoAudiovisual {
    private String canal;
    private int vistas;

    public VideoYouTube(String titulo, int duracionEnMinutos, String genero, String canal, int vistas) {
        super(titulo, duracionEnMinutos, genero);
        this.canal = canal;
        this.vistas = vistas;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Video de YouTube:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Canal: " + canal);
        System.out.println("Vistas: " + vistas);
        System.out.println();
    }

    // Getters y Setters
    public String getCanal() {
        return canal;
    }

    public void setCanal(String canal) {
        this.canal = canal;
    }

    public int getVistas() {
        return vistas;
    }

    public void setVistas(int vistas) {
        this.vistas = vistas;
    }
}