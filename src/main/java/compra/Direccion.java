
package compra;

public class Direccion {
   private String municipio;
   private String departamento;
   private String direccion;

    public Direccion() {
    }

    public Direccion(String municipio, String departamento, String direccion) {
        this.municipio = municipio;
        this.departamento = departamento;
        this.direccion = direccion;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
}
