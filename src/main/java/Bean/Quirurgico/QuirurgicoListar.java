package Bean.Quirurgico;

import Bean.Menu.SessionBean;
import Model.Entity.Organossistemas;
import Model.Entity.Provincia;
import Model.Entity.Subtipo;
import Model.JPA.JPAFactoryDAO;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "quirurgicoListar")
@SessionScoped
public class QuirurgicoListar implements Serializable{
   String organosSistemasID;
   String subtipoID;
   List<Organossistemas> organosSistemas;
   List<Subtipo> subtipo;
//   List<Provincia> subtipo;
    
    
    
    SessionBean sesion = new SessionBean();
    String usuario ="";
    
    /*Método Constructor*/
    public QuirurgicoListar(){
        organosSistemasID="";
        subtipoID="";
        organosSistemas=null;
        subtipo=null;
       ListarOrganosSistemas();
       ListarSubtipo();
    }
    
    public void ListarOrganosSistemas(){
    organosSistemas=JPAFactoryDAO.getFactory().getOrganosSistemasDAO().find();
    System.out.println("entron a lista con el id:"+organosSistemasID);
    }
    
    public void ListarSubtipo(){
       subtipo=JPAFactoryDAO.getFactory().getSubtipoDAO().find();
       System.out.println("entron a lista con el id:"+subtipoID);
//    subtipo=JPAFactoryDAO.getFactory().getSubtipoDAO().find();
    }
    
    //getter and setter
    
    
    public String getOrganosSistemasID() {
        return organosSistemasID;
    }

    public void setOrganosSistemasID(String organosSistemasID) {
        this.organosSistemasID = organosSistemasID;
    }

    public String getSubtipoID() {
        return subtipoID;
    }

    public void setSubtipoID(String subtipoID) {
        this.subtipoID = subtipoID;
    }

    public List<Organossistemas> getOrganosSistemas() {
        
        return organosSistemas;
    }

    public void setOrganosSistemas(List<Organossistemas> organosSistemas) {
        this.organosSistemas = organosSistemas;
    }

    public List<Subtipo> getSubtipo() {
        
        return subtipo;
    }

    public void setSubtipo(List<Subtipo> subtipo) {
        this.subtipo = subtipo;
    }

    public SessionBean getSesion() {
        return sesion;
    }

    public void setSesion(SessionBean sesion) {
        this.sesion = sesion;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    
    
}