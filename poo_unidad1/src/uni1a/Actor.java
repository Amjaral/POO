package uni1a;

import java.util.ArrayList;

public class Actor {
    private String nombre;
    private int edad;
    private ArrayList<Pelicula> peliculas; // Suponiendo que quieres relacionarlo con películas

    // Constructor
    public Actor(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.peliculas = new ArrayList<>();
    }

    // Métodos para agregar películas
    public void agregarPelicula(Pelicula pelicula) {
        peliculas.add(pelicula);
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
