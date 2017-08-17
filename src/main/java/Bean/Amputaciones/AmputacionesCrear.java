/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean.Amputaciones;

import Bean.Menu.Navegar;
import Model.Entity.Cabeceraestudiocitologico;
import Model.Entity.Cabecerarecepcionmuestra;
import Model.Entity.Detallerecepcionmuestra;

import Model.Entity.Doctor;
import Model.Entity.Estudiosamputaciones;

import Model.Entity.Hospital;
import Model.Entity.Paciente;
import Model.Entity.Parroquia;
import Model.Entity.Partes;
import Model.JPA.JPAFactoryDAO;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.view.ViewScoped;

@ManagedBean(name = "amputacionesCrear")
@ViewScoped
//@RequestScoped
public class AmputacionesCrear implements Serializable {

    private List<Hospital> hospitalesEnBase;
    private List<Doctor> doctoresEnBase;
    private List<Paciente> pacientesEnBase;
    private Cabecerarecepcionmuestra cabecera;
    private Doctor doctor;
    private Paciente paciente;
    private Parroquia parroquia;
    private int parroquiaID;
    private Hospital hospital;
    private int partesID;
    private int numeroEstudio;
    private Partes partes;
    private Estudiosamputaciones estudioAmputaciones;

    public AmputacionesCrear() {
        doctoresEnBase = null;
        pacientesEnBase = null;
        hospitalesEnBase = null;
        this.cabecera = new Cabecerarecepcionmuestra();
        this.doctor = new Doctor();
        this.partes = new Partes();
        this.paciente = new Paciente();
        this.hospital = new Hospital();
        this.parroquia = new Parroquia();
        parroquiaID = 0;
        partesID = 0;
        numeroEstudio = 0;
        this.estudioAmputaciones = new Estudiosamputaciones();
    }

    public void registrarAmputaciones() {
        System.out.println("guardar");

        this.parroquia.setIdparroquia(this.parroquiaID);
        this.hospital.setIdparroquia(parroquia);
        JPAFactoryDAO.getFactory().getHospitalDAO().create(hospital);

        JPAFactoryDAO.getFactory().getDoctorDAO().create(doctor);
        JPAFactoryDAO.getFactory().getPacienteDAO().create(paciente);

        //asignacion FK a cabecera
        hospitalesEnBase = JPAFactoryDAO.getFactory().getHospitalDAO().find();
        this.cabecera.setIdhospital(hospitalesEnBase.get(hospitalesEnBase.size() - 1));
        doctoresEnBase = JPAFactoryDAO.getFactory().getDoctorDAO().find();
        this.cabecera.setIddoctor(doctoresEnBase.get(doctoresEnBase.size() - 1));
        pacientesEnBase = JPAFactoryDAO.getFactory().getPacienteDAO().find();
        this.cabecera.setIdpaciente(pacientesEnBase.get(pacientesEnBase.size() - 1));
        JPAFactoryDAO.getFactory().getCabecerarecepcionmuestraDAO().create(cabecera);

        this.partes.setIdpartes(partesID);
        this.estudioAmputaciones.setIdpartes(partes);
        JPAFactoryDAO.getFactory().getEstudiosAmputacionesDAO().create(estudioAmputaciones);


    }

    //getter and setter
    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
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

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Cabecerarecepcionmuestra getCabecera() {
        return cabecera;
    }

    public void setCabecera(Cabecerarecepcionmuestra cabecera) {
        this.cabecera = cabecera;
    }

    public int getPartesID() {
        return partesID;
    }

    public void setPartesID(int partesID) {
        this.partesID = partesID;
    }

    public Partes getPartes() {
        return partes;
    }

    public void setPartes(Partes partes) {
        this.partes = partes;
    }

    public Estudiosamputaciones getEstudioAmputaciones() {
        return estudioAmputaciones;
    }

    public void setEstudioAmputaciones(Estudiosamputaciones estudioAmputaciones) {
        this.estudioAmputaciones = estudioAmputaciones;
    }

}
