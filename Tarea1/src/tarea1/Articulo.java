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
        return peso;
    }
    public String getNombre() {
        return nombre;
    }
    public String getDescription() {
        return descripcion;
    }
    public float getPrecio() {
        return precio;
    }
}
