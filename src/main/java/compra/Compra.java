
package compra;

import conexion.DbConnect;
import controlador.Controlador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Compra {

    Connection connection;

    public Compra() {
        DbConnect con = new DbConnect();
        try {
            connection = con.getConnection();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Compra.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
//Controlador controlador = new Controlador();


    
    
    public boolean insertar(Articulo articulo, Pago pago, DetalleCompra detalleCompra, Direccion direccion ){
        PreparedStatement ps;
        try {
            ps = connection.prepareStatement("INSERT INTO CESAR.COMPRAS (PAGO_ID, ARTICULO, CATIDAD, MUNICIPIO, DEPARTAMENTO, DIRECCION, PAGO, ARTICULO_ID) \n" +
"	VALUES (?, ?, ?, ?, ?, ?, ?, ?)");
            ps.setInt(1, pago.getPagoId());
            ps.setString(2, articulo.getNombreArticulo());
            ps.setInt(3, detalleCompra.getCantidad());
            ps.setString(4, direccion.getMunicipio());
            ps.setString(5, direccion.getDepartamento());
            ps.setString(6, direccion.getDireccion());
            ps.setString(7, pago.getPago());
            ps.setInt(8, articulo.getArticuloId());
            
            ps.execute();
            JOptionPane.showMessageDialog(null, "registro Guardado");
            return true;
            
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, e);
            return false;
        }
    }

    public void insertar(Articulo articulo, String pago, DetalleCompra detalleCompra, String direccion) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    

}
