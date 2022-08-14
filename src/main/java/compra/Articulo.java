
package compra;

public class Articulo {
    private int articuloId;
    private String nombreArticulo;

    public Articulo() {
    }

    public Articulo(int articuloId, String nombreArticulo) {
        this.articuloId = articuloId;
        this.nombreArticulo = nombreArticulo;
    }

    public int getArticuloId() {
        return articuloId;
    }

    public void setArticuloId(int articuloId) {
        this.articuloId = articuloId;
    }

    public String getNombreArticulo() {
        return nombreArticulo;
    }

    public void setNombreArticulo(String nombreArticulo) {
        this.nombreArticulo = nombreArticulo;
    }

  
    
}
