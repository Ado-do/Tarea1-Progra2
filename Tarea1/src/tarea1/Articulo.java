package tarea1;

public class Articulo {
    private String nombre;
    private String descripcion;
    private float peso;
    private float precio; // Este precio tiene el IVA agregado? (El resto del codigo lo escribi pensando que NO)

    public Articulo(String nombre, String descripcion, float peso, float precio) {
        this.nombre = nombre;
        this.peso = peso;
        this.descripcion = descripcion;
        this.precio = precio;
    }
    public String getNombre() {
        return this.nombre;
    }
    public String getDescription() {
        return this.descripcion;
    }
    public float getPeso() {
        return this.peso;
    }
    public float getPrecio() {
        return this.precio;
    }
    public String toString() {
        return "Articulo: "+this.nombre + "\nDescripción: "+this.descripcion + "\nPeso: "+this.peso+" Kg" + "\nPrecio = $"+this.precio;
    }
}
