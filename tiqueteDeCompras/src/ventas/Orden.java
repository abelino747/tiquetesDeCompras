package ventas;

public class Orden {

    private final int idOrden;
    // arreglo vacio 
    private Productos[] Producto;
    static int contadorOrden;
    private int contadorProduct;
    private static final int MAXPRODUCTOS = 5;

    public Orden() {

        this.idOrden = ++Orden.contadorOrden;
        this.Producto = new Productos[Orden.MAXPRODUCTOS];

    }

    public void agregarProducto(Productos Produc) {
        if (this.contadorProduct < Orden.MAXPRODUCTOS) {

            Producto[contadorProduct++] = Produc;

        } else {
            System.out.println("Se supero el numero maximo de productos permitidos...");
        }

    }

    public double calcularTotal() {

        double total = 0;
        for (int i = 0; i < this.contadorProduct; i++) {

            //Productos producto = this.Producto[i];
            //total += producto.getPrecio();
            // simplifica las 2 lines ade codigo anterior 
            total += this.Producto[i].getPrecio();
        }
        return total;

    }

    public void mostrarOrden() {
        System.out.println(" el id de la orden es  : " + this.idOrden);

        double valorTotal = calcularTotal();
        System.out.println(" total Orden sin IVA: $" + valorTotal);

        System.out.println(" Productos de la orden : ");
        for (int i = 0; i < this.contadorProduct; i++) {
            System.out.println(this.Producto[i]);

        }

    }

    public double iva() {
        double impuesto = this.calcularTotal() * 0.19;
        return impuesto;
    }

}
