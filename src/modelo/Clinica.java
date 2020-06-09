
package modelo;

/**
 *
 * @author ANDRU
 */
public class Clinica {
    private String nombre;
    private String direccion;
    private paciente paciente;
    private personaSalud personalSalud;

    public Clinica() {
    }

    public Clinica(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
}
