package tarea1;

public class Cliente {
    private String nombre;
    private String rut;
    private Direccion direccion;
    
    public Cliente(String nombre, String rut, Direccion direccion) {
        this.nombre = nombre;
        this.rut = rut;
        this.direccion = direccion;
    }
    public String getNombre() {
        return nombre;
    }
    public String getRut() {
        return rut;
    }
    public Direccion getDireccion() {
        return direccion;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setRut(String rut) {
        this.rut = rut;
    }
    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    @Override
    public String toString() {
        return "Cliente "+nombre+"\n RUT: "+rut+"\n "+direccion.getDireccion();
    }
}