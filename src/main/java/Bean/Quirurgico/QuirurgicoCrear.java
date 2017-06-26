package Bean.Quirurgico;

import Bean.Menu.SessionBean;
import Model.Entity.Cabecerarecepcionmuestra;
import Model.Entity.Doctor;
import Model.Entity.Hospital;
import Model.Entity.Paciente;
import Model.JPA.JPAFactoryDAO;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "QxCrearController")
@RequestScoped
public class QuirurgicoCrear implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    private Doctor doctor;
    
    SessionBean sesion = new SessionBean();
    
    /*Método Constructor*/
    public QuirurgicoCrear(){
        this.doctor = new Doctor();
        
    }
    
    /*Método para hacer el registro del examen Qx en el módulo de la Secretaria*/
    public void registrarExamenQX(){
        
       JPAFactoryDAO.getFactory().getDoctorDAO().create(this.doctor);
       
    }
    
    /*Getters & Setters*/

    public Doctor getDoctor() {
        if(this.doctor == null) {
            this.doctor = new Doctor();
        }
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public SessionBean getSesion() {
        return sesion;
    }

    public void setSesion(SessionBean sesion) {
        this.sesion = sesion;
    }


    
}
