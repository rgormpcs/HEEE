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
    
    private Hospital hospital;
    private Doctor doctor;
    private Paciente paciente;
    private Cabecerarecepcionmuestra cabeceraEstudio; 
    
    SessionBean sesion = new SessionBean();
    String usuario ="";
    
    /*Método Constructor*/
    public QuirurgicoCrear(){
        System.out.println("ENTRO QX : ");
        this.hospital = new Hospital();        
        this.doctor = new Doctor();
        this.paciente = new Paciente();
        this.cabeceraEstudio = new Cabecerarecepcionmuestra();
        registrarExamenQX();
    }
    
    /*Método para hacer el registro del examen Qx en el módulo de la Secretaria*/
    public void registrarExamenQX(){
        
        System.out.println("ENTRO al metodo registrarExamenQX : ");
        try {  
            System.out.println("INSTITUCION : "+hospital.getInstituciondelsistema());
            System.out.println("UNIDAD OPERATIVA : "+hospital.getUnidadoperativa());
            
            JPAFactoryDAO.getFactory().getHospitalDAO().create(this.hospital);
            
            
            
        } catch (Exception e) {
        }
    }
    
    /*Getters & Setters*/

    public Hospital getHospital() {
        if(this.hospital == null){
            this.hospital = new Hospital();
        }
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Cabecerarecepcionmuestra getCabeceraEstudio() {
        return cabeceraEstudio;
    }

    public void setCabeceraEstudio(Cabecerarecepcionmuestra cabeceraEstudio) {
        this.cabeceraEstudio = cabeceraEstudio;
    }

    public SessionBean getSesion() {
        return sesion;
    }

    public void setSesion(SessionBean sesion) {
        this.sesion = sesion;
    }
    
    
}
