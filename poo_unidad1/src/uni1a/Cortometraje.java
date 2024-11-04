package uni1a;

public class Cortometraje extends ContenidoAudiovisual {
    private String director;
    private String festival;

    public Cortometraje(String titulo, int duracionEnMinutos, String genero, String director, String festival) {
        super(titulo, duracionEnMinutos, genero);
        this.director = director;
        this.festival = festival;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Cortometraje:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Director: " + director);
        System.out.println("Festival: " + festival);
        System.out.println();
    }

    // Getters y Setters
    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getFestival() {
        return festival;
    }

    public void setFestival(String festival) {
        this.festival = festival;
    }
}