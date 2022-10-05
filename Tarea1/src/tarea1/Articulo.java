package tarea1;

public class Articulo {
    private String nombre;
    private String descripcion;
    private float peso;
    private float precio; // Este precio tiene el IVA agregado? (El resto del codigo lo escribi pensando que NO)

    public Articulo(String nombre, String descripcion, float peso, float precio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.peso = peso;
    }
    
    public String getNombre() {
        return nombre;
    }
    public String getDescription() {
        return descripcion;
    }
    public float getPeso() {
        return peso;
    }
    public float getPrecio() {
        return precio;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }
    public void setPrecio(float precio) {
        this.precio = precio;
    }
    @Override
    public String toString() {
        return "Articulo: "+nombre + "\n    Descripción: "+descripcion + "\n    Peso: "+peso+" Kg" + "\n    Precio = $"+precio;
    }
}
