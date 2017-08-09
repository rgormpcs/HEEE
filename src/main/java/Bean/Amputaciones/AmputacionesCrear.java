/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean.Amputaciones;

import Bean.Menu.Navegar;

import Model.Entity.Doctor;

import Model.Entity.Hospital;
import Model.Entity.Parroquia;
import Model.JPA.JPAFactoryDAO;
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;

/**
 *
 * @author mpcs
 */
@ManagedBean(name = "amputacionesCrear")
@ViewScoped
//@RequestScoped
public class AmputacionesCrear implements Serializable {

    private Doctor doctor;
    private Hospital hospital;
    private Navegar navegar;
    private Parroquia parroquia;
    private int parroquiaID;

    /**
     * Creates a new instance of AmputacionesListar
     */
    public AmputacionesCrear() {
      this.doctor=new Doctor();
      this.hospital =new Hospital();
      this.parroquia = new Parroquia();
      this.parroquiaID =0;
    }

    public void guardar() {
       
       this.parroquia.setIdparroquia(this.parroquiaID);
       this.hospital.setIdparroquia(parroquia);

       JPAFactoryDAO.getFactory().getHospitalDAO().create(hospital);
       JPAFactoryDAO.getFactory().getDoctorDAO().create(doctor);
    }

    //getter and setter

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Navegar getNavegar() {
        return navegar;
    }

    public void setNavegar(Navegar navegar) {
        this.navegar = navegar;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public Parroquia getParroquia() {
        return parroquia;
    }

    public void setParroquia(Parroquia parroquia) {
        this.parroquia = parroquia;
    }

    public int getParroquiaID() {
        return parroquiaID;
    }

    public void setParroquiaID(int parroquiaID) {
        this.parroquiaID = parroquiaID;
    }


   
    
}
