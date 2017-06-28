/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean.Menu;

import Model.Entity.Empleado;
import Model.Entity.Usuario;
import Model.JPA.JPAFactoryDAO;
//import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.faces.application.FacesMessage;
//import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author mpcs
 */
@ManagedBean(name = "ingresar")
@RequestScoped
//@SessionScoped
@ViewScoped
public class Ingresar implements Serializable {

    private String nombreUsuario=null;
    private String contrasenia=null;
    private Empleado Empleado= new Empleado();
//    private Usuario Usuario = new Usuario();
    private final FacesContext faceContext;
    private final HttpServletRequest httpServletRequest;
    /**
     * Creates a new instance of ingresar
     */
    public Ingresar() {
        this.faceContext = FacesContext.getCurrentInstance();
        
        this.httpServletRequest = ((HttpServletRequest)this.faceContext.getExternalContext().getRequest());
        
    }
    //
    public String validarIngreso(){
      System.out.println("instancia de faces:"+faceContext.getCurrentInstance().toString());  
    String redireccion = null;
    System.out.println("Ingreso validacion");
    System.out.println("Nombre:"+nombreUsuario);
    System.out.println("Contrasenia:"+contrasenia);
        String[] usuarioNombreCampo= {"usuariousuario"};
        String[] usuarioNombreValor= {nombreUsuario};

        List<Usuario> usuarioLista=JPAFactoryDAO.getFactory().getUsuarioDAO().find(usuarioNombreCampo, usuarioNombreValor);
       
            if (usuarioLista.isEmpty()){
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Aviso", "Usuario no existe"));
            }else{
                for(int i=0; i<usuarioLista.size();i++){
                System.out.println("informacion de usuario:"+usuarioLista.get(i).getUsuariousuario());
                if (usuarioLista.get(0).getClaveusuario().equals(contrasenia)){
                System.out.println("correcto entro");
                FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("usuario", usuarioLista.get(i));
                System.out.println("usuario del faces:"+FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("usuario"));
                redireccion = "/principal/bienvenida?faces-redirect=true";  

                }else{
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Aviso", "Datos Erróneos"));
                System.out.println("dato incorrecto");
                }
                }
            
            }
       

        return redireccion;
    }
    // getters and setters

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombre) {
        this.nombreUsuario = nombre;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

//    public Usuario getUsuario() {
//        return Usuario;
//    }
//
//    public void setUsuario(Usuario usuario) {
//        this.Usuario = usuario;
//    }
//
//    public Empleado getEmpleado() {
//        return Empleado;
//    }
//
//    public void setEmpleado(Empleado Empleado) {
//        this.Empleado = Empleado;
//    }
    
    
    
}
