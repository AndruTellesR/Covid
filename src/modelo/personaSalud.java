package modelo;

import java.util.Date;

/**
 *
 * @author ANDRU
 */
public class personaSalud  extends persona{
  private  Especialidad especialidad;
  private Clinica clinica;
  private prueba prueba;

    public personaSalud() {
    }

    public personaSalud(Especialidad especialidad, Clinica clinica, prueba prueba, String documento, String nombre, String direccion, String telefono, String genero, Date fechaNacimiento) {
        super(documento, nombre, direccion, telefono, genero, fechaNacimiento);
        this.especialidad = especialidad;
        this.clinica = clinica;
        this.prueba = prueba;
    }

    

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    public Clinica getClinica() {
        return clinica;
    }

    public void setClinica(Clinica clinica) {
        this.clinica = clinica;
    }

    public prueba getPrueba() {
        return prueba;
    }

    public void setPrueba(prueba prueba) {
        this.prueba = prueba;
    }

   
    
    
}
