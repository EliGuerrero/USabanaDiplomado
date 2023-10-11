package templateMethod.model;


import templateMethod.entities.Producto;

public class Alimento extends Producto {

    private final String fechaVencimiento;

    public Alimento(String id, String nombre, int precio, String marca, String tipo, String fechaVencimiento) {
        super(id, nombre, precio, marca, tipo);
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }
}