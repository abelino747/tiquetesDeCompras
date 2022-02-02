package ejecutar;

import ventas.*;

public class EjecutarVenta {

    public static void main(String[] args) {

        Productos producto1 = new Productos("camisa", 15000);
        Productos producto2 = new Productos("corbata", 5500);
        Productos producto3 = new Productos("pantalon", 45000);
        Productos producto4 = new Productos("saco", 65000);

        Orden orden1 = new Orden();
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.agregarProducto(producto3);
        orden1.agregarProducto(producto4);
        orden1.mostrarOrden();
        System.out.println("el total impuesto es : $ " + orden1.iva());
    }

}
