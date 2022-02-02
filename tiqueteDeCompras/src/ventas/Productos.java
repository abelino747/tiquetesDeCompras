package ventas;


public class Productos {
    
    // atributos
    private int idProducto;
    private String nombre;
    private double precio;
    private static int contador;

    // sobrecarga de constructores
    private Productos() {
        this.idProducto = ++Productos.contador;
    }

    public Productos(String nombre, double precio) {
        this();
        this.nombre = nombre;
        this.precio = precio;
    }

    // no tiene set el idProducto por que se inicializa desde el constructor
    public int getIdProducto() {
        return idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Productos{idProducto=").append(idProducto);
        sb.append(", nombre=").append(nombre);
        sb.append(", precio=").append(precio);
        sb.append('}');
        return sb.toString();
    }
   
    
    
    
    
}
