/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean.Empleado;

import Model.Entity.Cargo;
import Model.Entity.Especialidad;
import Model.JPA.JPAFactoryDAO;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;


@ManagedBean(name = "empleadoListar")
@ViewScoped
public class EmpleadoListar implements Serializable{

    private List<Cargo> cargos;
    private List<Especialidad> especialidades;
    
    
    public EmpleadoListar() {
    cargos = null;
    especialidades = null;
    listarCargo();
    listarEspecialidad();
    }
    
        /*Método para listar los cargos que tiene el Empleado*/
    public void listarCargo() {
        cargos = JPAFactoryDAO.getFactory().getCargoDAO().find();
    }

    /*Método para listar las especialidades que tiene el Empleado*/
    public void listarEspecialidad() {
        especialidades = JPAFactoryDAO.getFactory().getEspecialidadDAO().find();
    }
    
      public void resetCombo(){
          System.out.println("entro  a reset combo");
        cargos = null;
    especialidades = null;
     String msg = "";
    UIViewRoot viewRoot = FacesContext.getCurrentInstance().getViewRoot();
    String id = viewRoot.getViewId();
 
    
    }
    

    //getter and setter
    public List<Cargo> getCargos() {
        return cargos;
    }

    public void setCargos(List<Cargo> cargos) {
        this.cargos = cargos;
    }

    public List<Especialidad> getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(List<Especialidad> especialidades) {
        this.especialidades = especialidades;
    }
    
    
}
