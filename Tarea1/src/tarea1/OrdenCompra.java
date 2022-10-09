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
        estado = "\"Creando orden de compra\"";
        detalles = new ArrayList<DetalleOrden>(); // Se CREAN detalles mas adelante
        pagos = new ArrayList<Pago>(); // Se AGREGAN clientes mas adelante
    }
    public void addDetalle(Articulo articulo, int cantidad) { // SETTER DETALLES
        detalles.add(new DetalleOrden(this, articulo, cantidad));
        estado = "\"Detalles agregados\"";
    }
    public void addPagos(Pago... pagosIngresados) { // SETTER PAGOS
        for (Pago pago : pagosIngresados) {
            this.pagos.add(pago);
            estado = "\"Procesando pago\"";
        }
    }
    public void addDoc(DocTributario doc) { // SETTER DOCUMENTO
        doc.setOrden(this);
        this.documento = doc;
        if (doc instanceof Boleta) {
            estado = "\"Boleta generada\"";
        } else {
            estado = "\"Factura generada\"";
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
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public void setDetalles(ArrayList<DetalleOrden> detalles) {
        this.detalles = detalles;
    }
    public void setPagos(ArrayList<Pago> pagos) {
        this.pagos = pagos;
    }
    public void setDoc(DocTributario doc) {
        this.documento = doc;
    }

    @Override
    public String toString() {
        String string = "*** Orden de Compra:\n";
        string += cliente.toString()+"\nFecha: "+fecha+"\nEstado: "+estado+"\n";
        if (this.detalles != null) {
            string += "** Detalles de orden:\n";
            for (DetalleOrden detalleOrden : detalles) {
                string += " "+detalleOrden.toString()+"\n";
            }
        }
        if (this.pagos != null) {
            string += "** Pagos registrados:\n";
            boolean hayEfectivo = false;
            float vuelto = 0;
            for (Pago pago : pagos) {
                string += pago.toString()+"\n";
                if (pago instanceof Efectivo) {
                    hayEfectivo = true;
                    vuelto = ((Efectivo)pago).calcDevolucion(this.calcPrecio());
                }
            }
            if (hayEfectivo) {
                string += " Vuelto: $"+vuelto+"\n";
            }
        }
        if (this.documento != null) {
            string += "** Documento tributario:\n"+documento.toString();
        }
        return string;
    }
}
