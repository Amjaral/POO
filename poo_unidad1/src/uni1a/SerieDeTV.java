/**
 * Class SerieDeTV
 */
package uni1a;

import java.util.ArrayList;
import java.util.List;

public class SerieDeTV extends ContenidoAudiovisual {
    private int temporadas;
    private List<Temporada> listaTemporadas;

    public SerieDeTV(String titulo, int duracionEnMinutos, String genero, int temporadas) {
        super(titulo, duracionEnMinutos, genero);
        this.temporadas = temporadas;
        this.listaTemporadas = new ArrayList<>();
    }

    public void agregarTemporada(Temporada temporada) {
        listaTemporadas.add(temporada);
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles de la Serie de TV:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Temporadas: " + this.temporadas);
        System.out.println("Detalles de las temporadas:");
        for (Temporada temporada : listaTemporadas) {
            temporada.mostrarDetalles();
        }
        System.out.println();
    }
}