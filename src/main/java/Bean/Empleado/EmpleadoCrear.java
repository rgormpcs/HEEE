/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean.Empleado;

import Model.Entity.Cargo;
import Model.Entity.Empleado;
import Model.Entity.Especialidad;
import Model.Entity.Usuario;
import java.io.Serializable;
import Model.JPA.JPAFactoryDAO;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.faces.view.ViewScoped;


@ManagedBean(name = "empleadoCrear")
@ViewScoped
@RequestScoped
public class EmpleadoCrear implements Serializable{

    private Empleado empleado;
    private Usuario usuario;
    private Cargo cargo;
    private Especialidad especialidad;
    private int CargoID;
    private int EspecialidadID;

    public EmpleadoCrear() {
        this.empleado = new Empleado();
        this.cargo = new Cargo();
        this.especialidad = new Especialidad();
        this.usuario = new Usuario();
        this.EspecialidadID = 0;
        this.CargoID = 0;
    }
    
    public void  registrarEmpleado(){
        System.out.println("entro a registrar Empleado");
            try {
            //this.usuario.setIdUsuario(empleado);
            
            this.cargo.setIdcargo(this.CargoID);
            this.empleado.setIdcargo(cargo);
            this.especialidad.setIdespecialidad(this.EspecialidadID);
            this.empleado.setIdespecialidad(especialidad);
            
            JPAFactoryDAO.getFactory().getEmpleadoDAO().create(empleado);
        
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Aviso", "Registro de Empleado con éxito"));
        } catch (Exception e) {
            //mensaje
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Aviso", "Registro de Empleado fallido !!!"));
        }
    }
    
  
    
    //getters and setters
    
    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    //getters and setter
    public void setEspecialidad(Especialidad especialidad) {    
        this.especialidad = especialidad;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public int getCargoID() {
        System.out.println("cargoid:"+CargoID);
        return CargoID;
    }

    public void setCargoID(int CargoID) {
        this.CargoID = CargoID;
    }

    public int getEspecialidadID() {
        System.out.println("Especialidadid:"+EspecialidadID);
        return EspecialidadID;
    }

    public void setEspecialidadID(int EspecialidadID) {
        this.EspecialidadID = EspecialidadID;
    }
    
    
            
}
