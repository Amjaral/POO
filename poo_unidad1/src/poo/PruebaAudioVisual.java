package poo;
import uni1a.*;

public class PruebaAudioVisual {
    public static void main(String[] args) {
        System.out.println("Hello from Eclipse!");

        // Crear instancias de los contenidos audiovisuales
        ContenidoAudiovisual[] contenidos = new ContenidoAudiovisual[5]; // Cambiado a 5 para incluir todos

        // Crear una película y agregar actores
        Pelicula pelicula1 = new Pelicula("Avatar", 125, "Acción", "20th Century Studios");
        Actor actor1 = new Actor("Sam Worthington", 38); // Añadido edad al actor
        Actor actor2 = new Actor("Zoe Saldana", 45); // Añadido edad al actor
        pelicula1.agregarActor(actor1);
        pelicula1.agregarActor(actor2);
        contenidos[0] = pelicula1;

        // Crear una serie de TV y agregar temporadas
        SerieDeTV serie1 = new SerieDeTV("Game of Thrones", 60, "Fantasy", 8);
        serie1.agregarTemporada(new Temporada(1, 15));
        serie1.agregarTemporada(new Temporada(2, 17));
        contenidos[1] = serie1;

        // Crear un documental y agregar un investigador
        Investigador investigador = new Investigador("Alberto Castro", "Astrophysics");
        Documental documental = new Documental("Explorando el Cosmos", 45, "Science", "Astronomy", investigador);
        contenidos[2] = documental;

        // Crear nuevas instancias de VideoYouTube y Cortometraje
        VideoYouTube video1 = new VideoYouTube("Tutorial de Java", 10, "Educativo", "Canal de Programación", 10000);
        Cortometraje cortometraje1 = new Cortometraje("Cuerdas", 11, "Drama", "Pedro Solís García", "Goya 2014");
        contenidos[3] = video1; // Añadido a contenidos
        contenidos[4] = cortometraje1; // Añadido a contenidos

        // Mostrar los detalles de cada contenido audiovisual
        for (ContenidoAudiovisual contenido : contenidos) {
            if (contenido != null) { // Comprobar que el contenido no sea nulo
                contenido.mostrarDetalles();
            }
        }
    }
}