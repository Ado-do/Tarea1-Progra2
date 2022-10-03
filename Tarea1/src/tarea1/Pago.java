package tarea1;

import java.util.Date;

public abstract class Pago {
    private float monto;
    private Date fecha;
    
    public Pago() {
        
    }
}

class Efectivo extends Pago {

}

class Transferencia extends Pago {

}

class Tarjeta extends Pago {
       
}