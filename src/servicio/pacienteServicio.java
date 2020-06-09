
package servicio;

import java.sql.*;

/**
 *
 * @author ANDRU
 */
public class pacienteServicio {

    public void guardar(Connection conexion, modelo.persona persona) throws SQLException {

        try {
            PreparedStatement consulta;
            consulta = conexion.prepareStatement("SELECT* FROM *  persona");
            consulta.setString(1, persona.getNombre());
            consulta.setString(2, persona.getDireccion());
            consulta.setString(3, persona.getGenero());
            consulta.setString(4, persona.getTelefono());
            consulta.setDate(5, (Date) persona.getFechaNacimiento());
            consulta.setString(6, persona.getDocumento());
           
            consulta.executeUpdate();

        } catch (SQLException ex) {
            throw new SQLDataException(ex);
        }
    }
}
