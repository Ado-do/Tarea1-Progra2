package tarea1;

import java.util.Date;

public abstract class DocTributario {
    private String numero;
    private String rut;
    private Date fecha;
    public OrdenCompra orden;
    
    public DocTributario() {
        
    }
    // Faltan getters, setters y toString
}

class Boleta extends DocTributario {
    float precioSinIVA = orden.calcPrecioSinIVA();
    float IVA = orden.calcIVA();
    float precio = orden.calcPrecio();
   
    public Boleta() {
        super();
    }
}

class Factura extends DocTributario {
    float precioSinIVA = orden.calcPrecioSinIVA();

    public Factura() {
        super();
    }
}