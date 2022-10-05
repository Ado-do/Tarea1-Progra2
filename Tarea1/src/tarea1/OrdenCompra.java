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

    public OrdenCompra(Cliente cliente) {
        this.cliente = cliente;
        fecha = new Date();
        estado = "Creando orden de compra";
        detalles = new ArrayList<DetalleOrden>(); // Se CREAN detalles mas adelante
        pagos = new ArrayList<Pago>(); // Se AGREGAN clientes mas adelante
    }
    public void addDetalle(Articulo articulo, int cantidad) {
        detalles.add(new DetalleOrden(this, articulo, cantidad));
        estado = "Detalles agregados";
    }
    public void addPagos(Pago... pagosIngresados) {
        for (Pago pago : pagosIngresados) {
            this.pagos.add(pago);
            estado = "Procesando pago";
        }
    }
    public void addDoc(DocTributario doc) {
        this.documento = doc;
        if (documento.getClass().getSimpleName() == "Boleta") {
            estado = "Boleta generada";
        } else {
            estado = "Factura generada";
        }
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

    public Cliente getCliente() {
        return cliente;
    }
    public Date getFecha() {
        return fecha;
    }
    public String getEstado() {
        return estado;
    }
    public ArrayList<DetalleOrden> getDetalles() {
        return detalles;
    }
    public ArrayList<Pago> getPagos() {
        return pagos;
    }
    public DocTributario getDocumento() {
        return documento;
    }

    @Override
    public String toString() { //TODO: Agregar otras propiedades (Cliente, pago, etc)
        String string = "Orden de Compra:\n";
        for (DetalleOrden detalleOrden : detalles) {
            string += detalleOrden.toString() + "\n";
        }
        return string;
    }
}
