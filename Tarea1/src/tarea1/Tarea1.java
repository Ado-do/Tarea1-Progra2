package tarea1;

import java.util.Date;

public class Tarea1 {
    // Se usa formula para crear numeros aleatorios en cierto rango (con ayuda de Math)
    public Cliente crearCliente(String nombre, String rut, String direccion) {
        Cliente cliente = new Cliente(nombre, rut, new Direccion(direccion));
        return cliente;
    }
    public OrdenCompra crearOrdenCompra(Cliente cliente) {
        OrdenCompra orden = new OrdenCompra(cliente);
        return orden;
    }
    public Articulo crearPelicula(String nombre) {
        float peso = (float)((Math.floor(Math.random()*(10-1+1)+1)) / 10);
        float precio = (float)(1000 + Math.random() * (10000 - 1000));
        int calificacion = (int)Math.floor(Math.random()*(10-1+1)+1);
        Articulo pelicula = new Articulo("Pelicula en fisico: "+nombre, "Calificacion IMDb: "+calificacion+"/10", (float)peso, (int)precio);
        return pelicula;
    }
    public void crearDetalle(OrdenCompra orden, Articulo articulo, int cant) {
        orden.addDetalle(articulo, cant);
    }
    public void crearBoleta(OrdenCompra orden) {
        Cliente c = orden.getCliente();
        String num = "B"+(int)Math.floor(Math.random()*(10000-1000+1)+1000);
        orden.addDoc(new Boleta(num, c.getRut(), new Date(), c.getDireccion()));
    }
    public void crearFactura(OrdenCompra orden) {
        Cliente c = orden.getCliente();
        String num = "F"+(int)Math.floor(Math.random()*(10000-1000+1)+1000);
        orden.addDoc(new Factura(num, c.getRut(), new Date(), c.getDireccion()));
    }

    public static void main(String[] args) {
        Tarea1 test = new Tarea1();

        // Cliente cliente1 = test.crearCliente("Alonso Martinez", "19.654.123-K", "Barrio Universitario 1001");
        // OrdenCompra orden1 = test.crearOrdenCompra(cliente1);
        // Articulo shrek1 = test.crearPelicula("Shrek 1");
        // Articulo shrek2 = test.crearPelicula("Shrek 2");
        // Articulo shrek3 = test.crearPelicula("Shrek 3");
        // test.crearDetalle(orden1, shrek1, 2);
        // test.crearDetalle(orden1, shrek2, 1);
        // test.crearDetalle(orden1, shrek3, 3);
        // Efectivo pagoShrek = new Efectivo(orden1.calcPrecio()+10, new Date(), orden1)
        // orden1.addPagos(pagoShrek);
        // test.crearBoleta(orden1);
        // System.out.println(orden1.toString());
        
        Cliente cliente2 = test.crearCliente("Matias Bustos", "18.764.321-1", "Barrio Universitario 1006");
        OrdenCompra orden2 = test.crearOrdenCompra(cliente2);
        Articulo perfectBlue = test.crearPelicula("Perfect Blue");
        test.crearDetalle(orden2, perfectBlue, 4);
        Transferencia pago1Blue = new Transferencia(orden2.calcPrecio()/2, new Date(), orden2, "BancoEstado", "8732456");
        Transferencia pago2Blue = new Transferencia(orden2.calcPrecio()/2, new Date(), orden2, "BancoEstado", "2345234");
        orden2.addPagos(pago1Blue);
        orden2.addPagos(pago2Blue);
        test.crearFactura(orden2);
        System.out.println(orden2.toString());

        //Cliente cliente3 = test.crearCliente("Cristobal Vega", "20.543.765-4", "Barrio Universitario 1010");
        //OrdenCompra orden3 = test.crearOrdenCompra(cliente3);
        //Articulo scream = test.crearPelicula("Scream");
        //test.crearDetalle(orden3, scream, 1);
        //Tarjeta pagoScream = new Tarjeta(orden3.calcPrecio (), new Date (), orden3, "Debito", "5231183");
        //orden3.addPagos(pagoScream);
        //test.crearBoleta(orden3);
        //System.out.println(orden3.toString());

        //Cliente cliente4 = test.crearCliente("Franco Dias", "21.386.012-3", "Barrio Universitario 1011");
        //OrdenCompra orden4 = test.crearOrdenCompra(cliente4);
        //Articulo akira = test.crearPelicula("Akira");
        //Articulo perfectBlue = test.crearPelicula("Perfect Blue");
        //Articulo onePieceFilmRed = test.crearPelicula("One piece Film red");
        //Articulo theEndOfEvangelion = test.crearPelicula("The End of Evangelion");
        //test.crearDetalle(orden4, akira, 1);
        //test.crearDetalle(orden4, perfectBlue, 1);
        //test.crearDetalle(orden4, onePieceFilmRed, 1);
        //test.crearDetalle(orden4, theEndOfEvangelion, 1);
        //Efectivo pago1 = new Efectivo(orden4.calcPrecio()+520,new Date(), orden4);
        //orden4.addPagos(pago1);
        //test.crearFactura(orden4);
        //System.out.println(orden4.toString());
    }
}

