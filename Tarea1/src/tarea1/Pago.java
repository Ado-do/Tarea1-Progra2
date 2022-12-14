package tarea1;

import java.util.Date;

public abstract class Pago {
    protected float monto; //! Se usa protected en vez de private para que la propiedad sea heredada a las subclases
    protected Date fecha; //! Se usa protected en vez de private para que la propiedad sea heredada a las subclases
    protected OrdenCompra orden;
    
    public Pago(float monto, Date fecha, OrdenCompra orden) {
        this.monto = monto;
        this.fecha = (fecha == null) ? new Date() : fecha;
        this.orden = orden;
    }
    public float getMonto() {
        return monto;
    }
    public Date getFecha() {
        return fecha;
    }
    public OrdenCompra getOrden() {
        return orden;
    }
    public void setMonto(float monto) {
        this.monto = monto;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public void setOrden(OrdenCompra orden) {
        this.orden = orden;
    }
    @Override
    public String toString() {
        return " Monto: $"+monto+"\n Fecha: "+fecha;
    }
}

class Efectivo extends Pago {
    public Efectivo(float monto, Date fecha, OrdenCompra orden) {
        super(monto, fecha, orden);
    }
    public float calcDevolucion(float montoTotal) {
        return (this.monto > montoTotal) ? (this.monto - montoTotal) : 0;
    }
    @Override
    public String toString() {
        return "Pago con efectivo:\n"+super.toString();
    }
}

class Transferencia extends Pago {
    private String banco;
    private String numCuenta;

    public Transferencia(float monto, Date fecha, OrdenCompra orden, String banco, String numCuenta) {
        super(monto, fecha, orden);
        this.banco = banco;
        this.numCuenta = numCuenta;
    }
    public String getBanco() {
        return banco;
    }
    public String getNumCuenta() {
        return numCuenta;
    }
    public void setBanco(String banco) {
        this.banco = banco;
    }
    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }
    @Override
    public String toString() {
        return "Pago por transferencia:\n"+super.toString()+"\n Banco: "+banco+"\n N??mero de cuenta: "+numCuenta;
    }
}

class Tarjeta extends Pago {
    private String tipo;
    private String numTransaccion;

    public Tarjeta(float monto, Date fecha, OrdenCompra orden, String tipo, String numTransaccion) {
        super(monto, fecha, orden);
        this.tipo = tipo;
        this.numTransaccion = numTransaccion;
    }
    public String getTipo() {
        return tipo;
    }
    public String getnumTransaccion() {
        return numTransaccion;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void setnumTransaccion(String numTransaccion) {
        this.numTransaccion = numTransaccion;
    }
    @Override
    public String toString() {
        return "Pago con tarjeta:\n"+super.toString()+"\n Tipo de tarjeta: "+tipo+"\n N??mero de transacci??n: "+numTransaccion;
    }
}