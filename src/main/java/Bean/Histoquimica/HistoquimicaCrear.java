package Bean.Histoquimica;

import Model.Entity.Cabecerarecepcionmuestra;
import Model.Entity.Doctor;
import Model.Entity.Estudiosamputaciones;
import Model.Entity.Estudioshistoquimica;
import Model.Entity.Hospital;
import Model.Entity.MarcadorEsParteDeEh;
import Model.Entity.MarcadorEsParteDeEhPK;
import Model.Entity.Marcadoreseh;
import Model.Entity.Paciente;
import Model.Entity.Parroquia;
import Model.Entity.Partes;
import Model.JPA.JPAFactoryDAO;
import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean(name = "histoquimicaCrear")
@RequestScoped
public class HistoquimicaCrear implements Serializable {

    private List<Hospital> hospitalesEnBase;
    private List<Estudioshistoquimica> estudioshistoquimicaEnBase;
    private List<Doctor> doctoresEnBase;
    private List<Paciente> pacientesEnBase;
    private String[] marcadoresSeleccionados;
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
    private Estudioshistoquimica estudioHistoquimica;
    private MarcadorEsParteDeEh marcadorParteEH;
    private MarcadorEsParteDeEhPK marcadorParteEHpk;

    public HistoquimicaCrear() {
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
        this.estudioHistoquimica = new Estudioshistoquimica();
        this.marcadorParteEH = new MarcadorEsParteDeEh();
        this.marcadorParteEHpk = new MarcadorEsParteDeEhPK();

    }

    public void regristrarHistoquimica() {
        System.out.println("ingreso a guardar himunohistoquimica");
        try {
            this.parroquia.setIdparroquia(parroquiaID);
            this.hospital.setIdparroquia(parroquia);
            JPAFactoryDAO.getFactory().getHospitalDAO().create(hospital);
            JPAFactoryDAO.getFactory().getDoctorDAO().create(doctor);
            JPAFactoryDAO.getFactory().getPacienteDAO().create(paciente);

            hospitalesEnBase = JPAFactoryDAO.getFactory().getHospitalDAO().find();
            this.cabecera.setIdhospital(hospitalesEnBase.get(hospitalesEnBase.size() - 1));
            doctoresEnBase = JPAFactoryDAO.getFactory().getDoctorDAO().find();
            this.cabecera.setIddoctor(doctoresEnBase.get(doctoresEnBase.size() - 1));
            pacientesEnBase = JPAFactoryDAO.getFactory().getPacienteDAO().find();
            this.cabecera.setIdpaciente(pacientesEnBase.get(pacientesEnBase.size() - 1));
            JPAFactoryDAO.getFactory().getCabecerarecepcionmuestraDAO().create(cabecera);
//                JPAFactoryDAO.getFactory().getEstudiosHistoquimicaDAO().create(estudioHistoquimica);

            estudioshistoquimicaEnBase = JPAFactoryDAO.getFactory().getEstudiosHistoquimicaDAO().find();

            for (String marcadoresSeleccionado : marcadoresSeleccionados) {
                System.out.println("marcador:" + marcadoresSeleccionado);
                this.marcadorParteEHpk.setIdeh(estudioshistoquimicaEnBase.get(estudioshistoquimicaEnBase.size() - 1).getIdeh());
                this.marcadorParteEHpk.setIdmarcadoreh(Integer.parseInt(marcadoresSeleccionado));
                this.marcadorParteEH.setMarcadorEsParteDeEhPK(marcadorParteEHpk);
                JPAFactoryDAO.getFactory().getMarcadoresParteEHDAO().create(marcadorParteEH);
            }
        } catch (Exception e) {
            System.out.println("Hubo errores al guardar el estudio");
        }

    }

    public String[] getMarcadoresSeleccionados() {
        return marcadoresSeleccionados;
    }

    public void setMarcadoresSeleccionados(String[] marcadoresSeleccionados) {
        this.marcadoresSeleccionados = marcadoresSeleccionados;
    }

    public Cabecerarecepcionmuestra getCabecera() {
        return cabecera;
    }

    public void setCabecera(Cabecerarecepcionmuestra cabecera) {
        this.cabecera = cabecera;
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

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public int getPartesID() {
        return partesID;
    }

    public void setPartesID(int partesID) {
        this.partesID = partesID;
    }

    public int getNumeroEstudio() {
        return numeroEstudio;
    }

    public void setNumeroEstudio(int numeroEstudio) {
        this.numeroEstudio = numeroEstudio;
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

    public Estudioshistoquimica getEstudioHistoquimica() {
        return estudioHistoquimica;
    }

    public void setEstudioHistoquimica(Estudioshistoquimica estudioHistoquimica) {
        this.estudioHistoquimica = estudioHistoquimica;
    }

    public MarcadorEsParteDeEh getMarcadorParteEH() {
        return marcadorParteEH;
    }

    public void setMarcadorParteEH(MarcadorEsParteDeEh marcadorParteEH) {
        this.marcadorParteEH = marcadorParteEH;
    }

    public MarcadorEsParteDeEhPK getMarcadorParteEHpk() {
        return marcadorParteEHpk;
    }

    public void setMarcadorParteEHpk(MarcadorEsParteDeEhPK marcadorParteEHpk) {
        this.marcadorParteEHpk = marcadorParteEHpk;
    }

}
