package uni1a;

public class Investigador {
    private String nombre;
    private String temaInvestigacion;

    public Investigador(String nombre, String temaInvestigacion) {
        this.nombre = nombre;
        this.temaInvestigacion = temaInvestigacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTemaInvestigacion() {
        return temaInvestigacion;
    }

    public void mostrarDetalles() {
        System.out.println("Investigador: " + nombre);
        System.out.println("Tema de Investigación: " + temaInvestigacion);
    }
}