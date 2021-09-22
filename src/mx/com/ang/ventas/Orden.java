package mx.com.ang.ventas;

public class Orden {
    private int idOrden;
    private Producto productos[];
    private static int contadorOrdenes;
    private int contadorProductos;
    private static final int MAX_PRODUCTOS = 10;

    public Orden(){
        this.idOrden = ++Orden.contadorOrdenes;
        this.productos = new Producto[Orden.MAX_PRODUCTOS];
    }

    public void agregarProducto(Producto producto){
        if(this.contadorProductos < Orden.MAX_PRODUCTOS)
            this.productos[this.contadorProductos++] = producto;
        else
            System.out.println("Has alcanzado el límite de productos: " + Orden.MAX_PRODUCTOS);
    }

    public double calcularTotal(){
        double total = 0;
        for(int i = 0; i < this.contadorProductos; i++){
            total += this.productos[i].getPrecio();
        }

        return total;
    }

    public void mostrarOrden(){
        System.out.println("----- FACTURA SIMPLIFICADO ----\n");
        System.out.println(" Orden #: \t" + this.idOrden + "\n");
        System.out.println("----- ID ----\t----- PRODUCTOS ----\t----- PRECIO ----");

        for(int i = 0; i < this.contadorProductos; i++){
            System.out.println(productos[i].getIdProducto() + "\t\t" + productos[i].getNombre() + "\t\t$ " + productos[i].getPrecio());
        }

        System.out.println(">> TOTAL: $ " + this.calcularTotal());
    }
}