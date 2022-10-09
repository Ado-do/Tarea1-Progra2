package tarea1;

public class Cliente {

    // Propiedades
    private String nombre;
    private String rut;
    private Direccion direccion;

    public Cliente(String nombre, String rut, Direccion direccion) {
        this.nombre = nombre;
        this.rut = rut;
        this.direccion = direccion;

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
