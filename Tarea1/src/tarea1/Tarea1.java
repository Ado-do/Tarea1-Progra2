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
        float peso = (float)(Math.floor(Math.random()*(10-1+1)+1) / 10);
        float precio = (float) (1000 + Math.random() * (10000 - 1000));
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
        orden.addDoc(new Boleta(num, c.getRut(), null, c.getDireccion()));
    }

    public static void main(String[] args) {
        Tarea1 test = new Tarea1();

        Cliente cliente1 = test.crearCliente("Alonso Martinez", "19.654.123-K", "Barrio Universitario 1001");
        OrdenCompra orden1 = test.crearOrdenCompra(cliente1);
        Articulo shrek1 = test.crearPelicula("Shrek 1");
        Articulo shrek2 = test.crearPelicula("Shrek 2");
        Articulo shrek3 = test.crearPelicula("Shrek 3");
        test.crearDetalle(orden1, shrek1, 2);
        test.crearDetalle(orden1, shrek2, 1);
        test.crearDetalle(orden1, shrek3, 3);
        orden1.addPagos(new Efectivo(orden1.calcPrecio()+10, null));
        test.crearBoleta(orden1);
        System.out.println(orden1.toString());

        Cliente cliente2 = test.crearCliente("Matias Bustos", "18.764.321-1", "Barrio Universitario 1006");
        

        Cliente cliente3 = test.crearCliente("Cristobal Vega", "20.543.765-4", "Barrio Universitario 1010");


        Cliente cliente4 = test.crearCliente("Franco Dias", "21.386.012-3", "Barrio Universitario 1011");
    }
}

