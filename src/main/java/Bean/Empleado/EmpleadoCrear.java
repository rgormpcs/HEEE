package Bean.Empleado;

import Bean.Menu.SessionBean;
import Model.Entity.Cargo;
import Model.Entity.Empleado;
import Model.Entity.Especialidad;
import Model.Entity.Usuario;
import Model.JPA.JPAFactoryDAO;
import java.io.Serializable;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;

@ManagedBean(name = "empleadoController")
@ViewScoped
public class EmpleadoCrear implements Serializable {

    private static final long serialVersionUID = 1L;

    private Empleado empleado;
    private Usuario usuario;
    private List<Cargo> cargos;
    private List<Especialidad> especialidades;
    private Cargo cargo;
    private Especialidad especialidad;

    private int CargoID;
    private int EspecialidadID;

    SessionBean sesion = new SessionBean();

    private List<Empleado> verificarExistenciaVector;

    /*Método Constructor*/
    public EmpleadoCrear() {
        this.empleado = new Empleado(); //Inicialización de la variable 
        this.usuario = new Usuario();
        cargos = null;
        this.CargoID = 0;
        especialidades = null;
        this.EspecialidadID = 0;
        this.cargo = new Cargo();
        this.especialidad = new Especialidad();

        listarCargo();
        listarEspecialidad();
    }

    /*MÉTODO PARA HACER EL REGISTRO DE UN EMPLEADO*/
    public void registrarEmpleado() {
        try {
            //this.usuario.setIdUsuario(empleado);
            this.cargo.setIdcargo(this.CargoID);
            System.out.println("CARGO ID" + CargoID);
            this.especialidad.setIdespecialidad(this.EspecialidadID);
            System.out.println("ESPECIALIDAD ID" + EspecialidadID);
            JPAFactoryDAO.getFactory().getEmpleadoDAO().create(empleado);
            //usuarioEJB.create(usuario);
            //mensaje
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Aviso", "Registro de Empleado con éxito"));
        } catch (Exception e) {
            //mensaje
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Aviso", "Registro de Empleado fallido !!!"));
        }
    }

    /*Método para listar los cargos que tiene el Empleado*/
    public void listarCargo() {
        cargos = JPAFactoryDAO.getFactory().getCargoDAO().find();
    }

    /*Método para listar las especialidades que tiene el Empleado*/
    public void listarEspecialidad() {
        especialidades = JPAFactoryDAO.getFactory().getEspecialidadDAO().find();
    }

    /*Getters & Setters*/
    public Empleado getEmpleado() {
        if (this.empleado == null) {
            this.empleado = new Empleado();
        }
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

    public SessionBean getSesion() {
        return sesion;
    }

    public void setSesion(SessionBean sesion) {
        this.sesion = sesion;
    }

    public List<Empleado> getVerificarExistenciaVector() {
        return verificarExistenciaVector;
    }

    public void setVerificarExistenciaVector(List<Empleado> verificarExistenciaVector) {
        this.verificarExistenciaVector = verificarExistenciaVector;
    }

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

    public int getEspecialidadID() {
        return EspecialidadID;
    }

    public void setEspecialidadID(int EspecialidadID) {
        this.EspecialidadID = EspecialidadID;
    }

}
