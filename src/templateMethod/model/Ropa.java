package templateMethod.model;

import templateMethod.entities.Producto;

public class Ropa extends Producto {

    public Ropa(String id, String nombre, int precio, String marca, String tipo, String talla) {
        super(id, nombre, precio, marca, tipo);
    }
}
