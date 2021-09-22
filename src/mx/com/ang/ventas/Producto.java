package mx.com.ang.ventas;

public class Producto {
    private int idProducto;
    private String nombre;
    private double precio;
    private static int contadorProductos;

    private Producto(){
        this.idProducto = ++Producto.contadorProductos;
    }

    public Producto(String nombre, double precio){
        this();
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getIdProducto() {
        return this.idProducto;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Producto{ id = ").append(this.getIdProducto());
        sb.append(", nombre = ").append(this.getNombre());
        sb.append(", precio = ").append(this.getPrecio());
        sb.append(" }");

        return sb.toString();
    }

}
