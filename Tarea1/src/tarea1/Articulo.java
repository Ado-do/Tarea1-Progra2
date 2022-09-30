package tarea1;

public class Articulo {
    private String nombre;
    private float peso;
    private String descripcion;
    private float precio;

    public Articulo(String nombre, float peso, String descripcion, float precio) {
        this.nombre = nombre;
        this.peso = peso;
        this.descripcion = descripcion;
        this.precio = precio;
    }
    public float getPeso() {
        return this.peso;
    }
    public String getNombre() {
        return this.nombre;
    }
    public String getDescription() {
        return this.descripcion;
    }
    public float getPrecio() {
        return this.precio;
    }
}
