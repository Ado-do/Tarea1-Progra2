package tarea1;

public class DetalleOrden {
    private Articulo articulo;
    private int cantidad;
    private OrdenCompra orden;

    public DetalleOrden(OrdenCompra orden, Articulo articulo, int cantidad) {
        this.orden = orden;
        this.articulo = articulo;
        this.cantidad = cantidad;
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

    public int getCantidad() {
        return cantidad;
    }
    public Articulo getArticulo() {
        return articulo;
    }
    public OrdenCompra getOrden() {
        return orden;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }
    public void setOrden(OrdenCompra orden) {
        this.orden = orden;
    }
    @Override
    public String toString() {
        return "Unidades: "+cantidad+"\n "+articulo.toString();
    }
}
