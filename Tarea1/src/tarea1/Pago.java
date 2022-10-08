package tarea1;

import java.util.Date;

public abstract class Pago {
    private Date fecha;
    public OrdenCompra OrdenCompra;
    private float monto = OrdenCompra.calcPrecio();
    public Pago() {
        
    }
}

class Efectivo extends Pago {
    float pago;
    public float calcDevolucion(float pago, float monto){
        return pago - monto; 
    }
}

class Transferencia extends Pago {
    private String banco;
    private String numCuenta;
}

class Tarjeta extends Pago {
       private String tipo;
       private String numTransacción;
}
