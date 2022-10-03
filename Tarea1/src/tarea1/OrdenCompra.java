package tarea1;

import java.util.Date;
import java.util.ArrayList;

public class OrdenCompra {
    private Cliente cliente;
    private Date fecha;
    private String estado;
    private ArrayList<DetalleOrden> detalles;
    private ArrayList<Pago> pagos;
    private DocTributario documento;

    public OrdenCompra() {
        // Hacer new de lista de DetalleOrden(es) para que sea una composicion (UML)
        // Pedir puntero a DocTrib para que sea agregacion (UML)
    }
    public float calcPrecioSinIVA() {
        float total = 0;
        for (DetalleOrden detalleOrden : detalles) {
            total += detalleOrden.calcPrecioSinIVA();
        }
        return total;
    }
    public float calcIVA() {
        float total = 0;
        for (DetalleOrden detalleOrden : detalles) {
            total += detalleOrden.calcIVA();
        }
        return total;
    }
    public float calcPrecio() {
        float total = 0;
        for (DetalleOrden detalleOrden : detalles) {
            total += detalleOrden.calcPrecio();
        }
        return total;
    }
    public float calcPeso() {
        float total = 0;
        for (DetalleOrden detalleOrden : detalles) {
            total += detalleOrden.calcPeso();
        }
        return total;
    }
    public String toString() { //TODO: Agregar otras propiedas (Cliente, pago, etc)
        String string = "Orden de Compra:\n";
        for (DetalleOrden detalleOrden : detalles) {
            string += detalleOrden.toString() + "\n";
        }
        return string;
    }
}
