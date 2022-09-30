package tarea1;

public class DetalleOrden {
    private int cantidad;
    private Articulo articulo;

    public DetalleOrden(int cantidad, Articulo articulo) {
        this.cantidad = cantidad;
        this.articulo = articulo;
    }
    public float calcPrecioSinIVA() {
        return articulo.getPrecio() * cantidad;
    }
    public float calcIVA() {
        return (articulo.getPrecio() * 0.19f) * cantidad; 
    }
    public float calcPrecio() {
        return this.calcPrecioSinIVA() + this.calcIVA();
    }
    public float calcPeso() {
        return articulo.getPeso() * cantidad;
    }
    public String toString() {
        return "Detalles de la Orden: ("+ cantidad + " unidades)\n" + articulo.toString();
    }
}
