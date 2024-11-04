/**
 * Class Pelicula
 */
package uni1a;
import java.util.ArrayList;
import java.util.List;

// Subclase Pelicula que extiende de ContenidoAudiovisual

    public class Pelicula extends ContenidoAudiovisual {
        private String estudio;
        private List<Actor> actores;

        public Pelicula(String titulo, int duracionEnMinutos, String genero, String estudio) {
            super(titulo, duracionEnMinutos, genero);
            this.estudio = estudio;
            this.actores = new ArrayList<>();
        }

        public void agregarActor(Actor actor) {
            actores.add(actor);
            actor.agregarPelicula(this); // Relación bidireccional
        }

        @Override
        public void mostrarDetalles() {
            System.out.println("Detalles de la película:");
            System.out.println("ID: " + getId());
            System.out.println("Título: " + getTitulo());
            System.out.println("Duración en minutos: " + getDuracionEnMinutos());
            System.out.println("Género: " + getGenero());
            System.out.println("Estudio: " + estudio);
            System.out.println("Actores: ");
            for (Actor actor : actores) {
                System.out.println("- " + actor.getNombre());
            }
            System.out.println();
        }
    }