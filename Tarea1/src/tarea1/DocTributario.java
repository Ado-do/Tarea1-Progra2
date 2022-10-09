package tarea1;

import java.util.Date;

public abstract class DocTributario {

    private String numero;
    private String rut;
    private Date fecha;
    private Direccion direccion;
    private OrdenCompra orden;
    
    public DocTributario(String numero, String rut, Date fecha, Direccion direccion) {
        this.numero = numero;
        this.rut = rut;
        this.fecha = (fecha == null) ? new Date() : fecha;
        this.direccion = direccion;
    }
    public String getNumero() {
        return numero;
    }
    public String getRut() {
        return rut;
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
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public void setRut(String rut) {
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
        return " Número: "+numero+"\n RUT: "+rut+"\n Fecha: "+fecha+"\n Dirección: "+direccion.getDireccion();
    }
}

class Boleta extends DocTributario {
    
    public Boleta(String numero, String rut, Date fecha, Direccion direccion) {
        super(numero, rut, fecha, direccion);
    }
    @Override
    public String toString() {
        return "Boleta:\n"+super.toString();
    }
}

class Factura extends DocTributario {
    
    public Factura(String numero, String rut, Date fecha, Direccion direccion) {
        super(numero, rut, fecha, direccion);
    }
    @Override
    public String toString() {
        return "Factura:\n"+super.toString();
    }
}
