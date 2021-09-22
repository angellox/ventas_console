package mx.com.ang.ventas.test;
import mx.com.ang.ventas.Orden;
import mx.com.ang.ventas.Producto;

public class TestVentas {
    public static void main(String[] args) {
    
        Producto p1 = new Producto("Tennis Nike", 1679.00);
        Producto p2 = new Producto("Boletos AC/DC", 850.00);
        Producto p3 = new Producto("Lámpara Zent", 569.00);
        Producto p4 = new Producto("Sombrero Dubai", 399.90);
        
        // Agregando productos
        Orden orden = new Orden();
        orden.agregarProducto(p1);
        orden.agregarProducto(p2);
        orden.agregarProducto(p3);
        orden.agregarProducto(p4);

        // Mostrando orden
        orden.mostrarOrden();
    }
}
