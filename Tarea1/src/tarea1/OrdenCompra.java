package tarea1;

import java.util.Date;
import java.util.ArrayList;

public class OrdenCompra {
    private Date fecha;
    private String estado;
    private ArrayList<DetalleOrden> ordenes;

    public OrdenCompra() {
        fecha = new Date();
        estado = "En espera de aprobación";
        ordenes = new ArrayList<DetalleOrden>();    // Crear detalles de orden
    }
    public float calcPrecioSinIVA() {
        float total = 0;
        for (DetalleOrden detalleOrden : ordenes) {
            total += detalleOrden.calcPrecioSinIVA();
        }
        return total;
    }
    public float calcIVA() {
        float total = 0;
        for (DetalleOrden detalleOrden : ordenes) {
            total += detalleOrden.calcIVA();
        }
        return total;
    }
    public float calcPrecio() {
        float total = 0;
        for (DetalleOrden detalleOrden : ordenes) {
            total += detalleOrden.calcPrecio();
        }
        return total;
    }
    public float calcPeso() {
        float total = 0;
        for (DetalleOrden detalleOrden : ordenes) {
            total += detalleOrden.calcPeso();
        }
        return total;
    }
    public String toString() {
        return "a"; // Resumen de la orden
    }
}
