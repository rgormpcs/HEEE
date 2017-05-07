package Bean.Empleado;

import Bean.Menu.SessionBean;
import Model.Entity.Empleado;
import Model.Entity.Usuario;
import Model.JPA.JPAFactoryDAO;
import java.io.Serializable;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;


@ManagedBean(name = "empleadoController")
public class EmpleadoCrear implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    private Empleado empleado;
    private Usuario usuario;
    
    SessionBean sesion = new SessionBean();
    
    private List<Empleado> verificarExistenciaVector;
    
    
    /*Método Constructor*/
    public EmpleadoCrear(){
        this.empleado = new Empleado(); //Inicialización de la variable 
        this.usuario = new Usuario();
    }
    
     /*MÉTODO PARA HACER EL REGISTRO DE UN EMPLEADO*/
    public void registrarEmpleado() {
        try {
            //this.usuario.setIdUsuario(empleado);
            JPAFactoryDAO.getFactory().getEmpleadoDAO().create(this.empleado);
            //usuarioEJB.create(usuario);
            //mensaje
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Aviso", "Registro de Empleado ingresado con éxito"));
            System.out.println("Empleado y Usuario ingresado con exito");
        } catch (Exception e) {
            //mensaje
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_FATAL, "Aviso", "Registro de Empleado no ingresado !!!"));
            System.out.println("Empleado y Usuario no ingresado");
        }
    }
    
    /*Método para validar los duplicados*/
    
    
    /*Getters & Setters*/

    public Empleado getEmpleado() {
       if(this.empleado == null) {
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
    
    
    
    
}
