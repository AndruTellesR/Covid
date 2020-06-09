package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.persona;
import servicio.conexion;
import servicio.pacienteServicio;
import vista.registro;
import modelo.paciente;

/**
 *
 * @author ANDRU
 */
public class controlador implements ActionListener {

    private registro formulario;

    public controlador() {
    }

    public controlador(registro formulario) {
        this.formulario = formulario;
        actionListener(this);
    }

    private void actionListener(ActionListener controlador) {
        formulario.btnregistrar.addActionListener(controlador);
        formulario.btncancelar.addActionListener(controlador);
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        try {

            if (evento.getActionCommand().contentEquals("Registrar")) {
                String documento = formulario.txtdocumento.getText();
                String nombre = formulario.txtnombre.getText();
                String Direccion = formulario.txtdireccion.getText();
                String telefono = formulario.txttelefono.getText();
                String genero = formulario.comGenero.getSelectedItem().toString();
                String fecha = formulario.txtfecha.getText();
                String procedencia = formulario.txtprocedencia.getText();
                
                persona persona = new persona(documento, nombre, Direccion, telefono, genero,null);
                paciente pa = new paciente();
                pa.setPersona(persona);
                
                controlador servicio = new controlador();
                servicio.persona(pa);
                
                
            } else if (evento.getActionCommand().contentEquals("Limpiar")) {

                formulario.txtnombre.setText(" ");
                formulario.txtdocumento.setText(" ");
                formulario.txtdireccion.setText(" ");
                formulario.txttelefono.setText(" ");
                formulario.txtfecha.setText(" ");
                formulario.txtprocedencia.setText(" ");
            }
        } catch (Exception e) {

        }
    }
    
    public void persona(paciente paciente){
        try{
            paciente u = new paciente();
           pacienteServicio us = new pacienteServicio();
           us.guardar(conexion.obtener(), paciente.getPersona());
        }catch(Exception e){}
    }
}
