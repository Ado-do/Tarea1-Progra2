package tarea1;

import java.util.Date;

public abstract class DocTributario {
    private String numero;
    private String rut;
    private Date fecha;
    private OrdenCompra orden;
    
    public DocTributario() {
        
    }
    // Faltan getters, setters y toString
}

class Boleta extends DocTributario {
    // Agregar cosas de boletas
    
    public Boleta() {
        super();
    }
}

class Factura extends DocTributario {
    // Agregar cosas de facturas
    
    public Factura() {
        super();
    }
}