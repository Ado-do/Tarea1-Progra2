package tarea1;

import java.util.Date;

public abstract class DocTributario {

    private String numero;
    private String rut;
    private Date fecha;
    private Direccion direccion;
    public OrdenCompra orden;

    public DocTributario(String numero, String rut, Date fecha, Direccion direccion, OrdenCompra orden) {
        this.numero = numero;
        this.rut = rut;
        if (fecha == null) {
            this.fecha = new Date();
        } else {
            this.fecha = fecha;
        }
        this.direccion = direccion;
        this.orden = orden;

        // Faltan getters, setters y toString
    }

    public String getInfoCliente() {
        return (numero + rut);
    }

    public Date getFecha() {
        return fecha;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public OrdenCompra getOrden() {
        return orden;
    }

    public void setInfoCliente(String numero, String rut) {
        this.numero = numero;
        this.rut = rut;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public void setOrden(OrdenCompra orden) {
        this.orden = orden;
    }

    @Override
    public String toString() {
        return " Número: " + numero + "\n RUT: " + rut + "\n Fecha: " + fecha + "\n Dirección: " + direccion.getDireccion();
    }
}

class Boleta extends DocTributario {

    float precioSinIVA = orden.calcPrecioSinIVA();
    float IVA = orden.calcIVA();
    float precio = orden.calcPrecio();

    public Boleta(String numero, String rut, Date fecha, Direccion direccion, OrdenCompra orden) {
        super(numero, rut, fecha, direccion, orden);
    }
}

class Factura extends DocTributario {

    float precioSinIVA = orden.calcPrecioSinIVA();

    public Factura(String numero, String rut, Date fecha, Direccion direccion, OrdenCompra orden) {
        super(numero, rut, fecha, direccion, orden);
    }
}
