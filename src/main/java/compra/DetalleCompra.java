
package compra;


public class DetalleCompra {
        Articulo articulo;
       private int cantidad;
    
    public DetalleCompra(){}
    public DetalleCompra(Articulo articulo, int cantidad) {
        this.articulo = articulo;
        this.cantidad = cantidad;
    }

    public DetalleCompra(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
   
    
}
