package tarea1;

public class Cliente {

    // Propiedades
    private String nombre;
    private String rut;

    public Cliente(String nombre, String rut) {
        this.nombre = nombre;
        this.rut = rut;

    }

    public String getNombre() {
        return nombre;
    }

    public String getRut() {
        return rut;
    }

    public String toString() {
        return "Cliente: " + nombre + "\n    Rut: " + rut;
    }
}

// Faltan getters, setters y toString
