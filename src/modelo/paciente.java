package modelo;

import java.util.Date;

/**
 *
 * @author ANDRU
 */
public class paciente extends persona{

    private lugarProcedencia lugarprocedencia;
    private Date fechaDetencion;
    estado estado;
    private Boolean casa;
    persona persona;
    Clinica clinica;

    public paciente() {
    }

    public paciente(lugarProcedencia lugarprocedencia, Date fechaDetencion, estado estado, Boolean casa, persona persona, String documento, String nombre, String direccion, String telefono, String genero, Date fechaNacimiento) {
        super(documento, nombre, direccion, telefono, genero, fechaNacimiento);
        this.lugarprocedencia = lugarprocedencia;
        this.fechaDetencion = fechaDetencion;
        this.estado = estado;
        this.casa = casa;
        this.persona = persona;
    }

    public lugarProcedencia getLugarprocedencia() {
        return lugarprocedencia;
    }

    public void setLugarprocedencia(lugarProcedencia lugarprocedencia) {
        this.lugarprocedencia = lugarprocedencia;
    }

    public Date getFechaDetencion() {
        return fechaDetencion;
    }

    public void setFechaDetencion(Date fechaDetencion) {
        this.fechaDetencion = fechaDetencion;
    }

    public estado getEstado() {
        return estado;
    }

    public void setEstado(estado estado) {
        this.estado = estado;
    }

    public Boolean getCasa() {
        return casa;
    }

    public void setCasa(Boolean casa) {
        this.casa = casa;
    }

    public persona getPersona() {
        return persona;
    }

    public void setPersona(persona persona) {
        this.persona = persona;
    }

   

    
}