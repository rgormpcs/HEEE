/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean.Empleado;

import Model.Entity.Cargo;
import Model.Entity.Empleado;
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
public class EmpleadoListar implements Serializable {

    private List<Cargo> cargos;
    private List<Especialidad> especialidades;
    
    private List<Empleado> empleadoLista;
    private List<Empleado> empleadoFiltrado;
    private Cargo cargo;
    private Especialidad especialidad;
    
    private int CargoID;

    public EmpleadoListar() {
        cargos = null;
        especialidades = null;
        listarCargo();
        listarEspecialidad();
        
        empleadoLista = null;
        empleadoFiltrado = null;
        this.CargoID = 0;
    }

    /*Método para listar los cargos que tiene el Empleado*/
    public void listarCargo() {
        cargos = JPAFactoryDAO.getFactory().getCargoDAO().find();
    }

    /*Método para listar las especialidades que tiene el Empleado*/
    public void listarEspecialidad() {
        especialidades = JPAFactoryDAO.getFactory().getEspecialidadDAO().find();
    }

    public void resetCombo() {
        System.out.println("entro  a reset combo");
        cargos = null;
        especialidades = null;
        String msg = "";
        UIViewRoot viewRoot = FacesContext.getCurrentInstance().getViewRoot();
        String id = viewRoot.getViewId();
    }

    /*Método para listar todos los empleados que han sido registrados, se usa en la vista de Búsqueda de Empleados*/
    public void listarEmpleadosRegistrados() {
        this.cargo.getIdcargo();
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

    public List<Empleado> getEmpleadoLista() {
        this.empleadoLista = null;
        if (this.empleadoLista == null){
            this.empleadoLista = JPAFactoryDAO.getFactory().getEmpleadoDAO().find();
        }
        return this.empleadoLista;
    }

    public void setEmpleadoLista(List<Empleado> empleadoLista) {
        this.empleadoLista = empleadoLista;
    }

    public List<Empleado> getEmpleadoFiltrado() {
        return this.empleadoFiltrado;
    }

    public void setEmpleadoFiltrado(List<Empleado> empleadoFiltrado) {
        this.empleadoFiltrado = empleadoFiltrado;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    public int getCargoID() {
        return CargoID;
    }

    public void setCargoID(int CargoID) {
        this.CargoID = CargoID;
    }
    

}
