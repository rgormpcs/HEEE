/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author EPN
 */
@Entity
@Table(name = "cabecerarecepcionmuestra")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cabecerarecepcionmuestra.findAll", query = "SELECT c FROM Cabecerarecepcionmuestra c"),
    @NamedQuery(name = "Cabecerarecepcionmuestra.findByIdcrm", query = "SELECT c FROM Cabecerarecepcionmuestra c WHERE c.idcrm = :idcrm"),
    @NamedQuery(name = "Cabecerarecepcionmuestra.findByFechatomamuestracrm", query = "SELECT c FROM Cabecerarecepcionmuestra c WHERE c.fechatomamuestracrm = :fechatomamuestracrm"),
    @NamedQuery(name = "Cabecerarecepcionmuestra.findByHoratomamuestracrm", query = "SELECT c FROM Cabecerarecepcionmuestra c WHERE c.horatomamuestracrm = :horatomamuestracrm"),
    @NamedQuery(name = "Cabecerarecepcionmuestra.findByTiposervicio", query = "SELECT c FROM Cabecerarecepcionmuestra c WHERE c.tiposervicio = :tiposervicio"),
    @NamedQuery(name = "Cabecerarecepcionmuestra.findByDescriptiposerviciocrm", query = "SELECT c FROM Cabecerarecepcionmuestra c WHERE c.descriptiposerviciocrm = :descriptiposerviciocrm"),
    @NamedQuery(name = "Cabecerarecepcionmuestra.findByTratamientopacientecrm", query = "SELECT c FROM Cabecerarecepcionmuestra c WHERE c.tratamientopacientecrm = :tratamientopacientecrm"),
    @NamedQuery(name = "Cabecerarecepcionmuestra.findByServiciocrm", query = "SELECT c FROM Cabecerarecepcionmuestra c WHERE c.serviciocrm = :serviciocrm"),
    @NamedQuery(name = "Cabecerarecepcionmuestra.findBySalacrm", query = "SELECT c FROM Cabecerarecepcionmuestra c WHERE c.salacrm = :salacrm"),
    @NamedQuery(name = "Cabecerarecepcionmuestra.findByCamacrm", query = "SELECT c FROM Cabecerarecepcionmuestra c WHERE c.camacrm = :camacrm"),
    @NamedQuery(name = "Cabecerarecepcionmuestra.findByPrioridad", query = "SELECT c FROM Cabecerarecepcionmuestra c WHERE c.prioridad = :prioridad"),
    @NamedQuery(name = "Cabecerarecepcionmuestra.findByDiagnosticopresunticocrm", query = "SELECT c FROM Cabecerarecepcionmuestra c WHERE c.diagnosticopresunticocrm = :diagnosticopresunticocrm"),
    @NamedQuery(name = "Cabecerarecepcionmuestra.findByResumenclinicocrm", query = "SELECT c FROM Cabecerarecepcionmuestra c WHERE c.resumenclinicocrm = :resumenclinicocrm"),
    @NamedQuery(name = "Cabecerarecepcionmuestra.findByMuestrapiezacrm", query = "SELECT c FROM Cabecerarecepcionmuestra c WHERE c.muestrapiezacrm = :muestrapiezacrm"),
    @NamedQuery(name = "Cabecerarecepcionmuestra.findByNumbloquescrm", query = "SELECT c FROM Cabecerarecepcionmuestra c WHERE c.numbloquescrm = :numbloquescrm"),
    @NamedQuery(name = "Cabecerarecepcionmuestra.findByNumplacascrm", query = "SELECT c FROM Cabecerarecepcionmuestra c WHERE c.numplacascrm = :numplacascrm"),
    @NamedQuery(name = "Cabecerarecepcionmuestra.findByRefrigeracionmuestra", query = "SELECT c FROM Cabecerarecepcionmuestra c WHERE c.refrigeracionmuestra = :refrigeracionmuestra"),
    @NamedQuery(name = "Cabecerarecepcionmuestra.findByTempambientemuestra", query = "SELECT c FROM Cabecerarecepcionmuestra c WHERE c.tempambientemuestra = :tempambientemuestra"),
    @NamedQuery(name = "Cabecerarecepcionmuestra.findByFechacreacrm", query = "SELECT c FROM Cabecerarecepcionmuestra c WHERE c.fechacreacrm = :fechacreacrm"),
    @NamedQuery(name = "Cabecerarecepcionmuestra.findByUsuariocreacrm", query = "SELECT c FROM Cabecerarecepcionmuestra c WHERE c.usuariocreacrm = :usuariocreacrm"),
    @NamedQuery(name = "Cabecerarecepcionmuestra.findByFechaactualizacrm", query = "SELECT c FROM Cabecerarecepcionmuestra c WHERE c.fechaactualizacrm = :fechaactualizacrm"),
    @NamedQuery(name = "Cabecerarecepcionmuestra.findByUsuarioactualizacrm", query = "SELECT c FROM Cabecerarecepcionmuestra c WHERE c.usuarioactualizacrm = :usuarioactualizacrm")})
public class Cabecerarecepcionmuestra implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcrm")
    private Integer idcrm;
    @Column(name = "fechatomamuestracrm")
    @Temporal(TemporalType.DATE)
    private Date fechatomamuestracrm;
    @Column(name = "horatomamuestracrm")
    @Temporal(TemporalType.TIME)
    private Date horatomamuestracrm;
    @Size(max = 50)
    @Column(name = "tiposervicio")
    private String tiposervicio;
    @Size(max = 17)
    @Column(name = "descriptiposerviciocrm")
    private String descriptiposerviciocrm;
    @Size(max = 200)
    @Column(name = "tratamientopacientecrm")
    private String tratamientopacientecrm;
    @Size(max = 30)
    @Column(name = "serviciocrm")
    private String serviciocrm;
    @Size(max = 30)
    @Column(name = "salacrm")
    private String salacrm;
    @Size(max = 5)
    @Column(name = "camacrm")
    private String camacrm;
    @Size(max = 50)
    @Column(name = "prioridad")
    private String prioridad;
    @Size(max = 250)
    @Column(name = "diagnosticopresunticocrm")
    private String diagnosticopresunticocrm;
    @Size(max = 250)
    @Column(name = "resumenclinicocrm")
    private String resumenclinicocrm;
    @Size(max = 250)
    @Column(name = "muestrapiezacrm")
    private String muestrapiezacrm;
    @Column(name = "numbloquescrm")
    private Integer numbloquescrm;
    @Column(name = "numplacascrm")
    private Integer numplacascrm;
    @Column(name = "refrigeracionmuestra")
    private Integer refrigeracionmuestra;
    @Column(name = "tempambientemuestra")
    private Integer tempambientemuestra;
    @Column(name = "fechacreacrm")
    @Temporal(TemporalType.DATE)
    private Date fechacreacrm;
    @Column(name = "usuariocreacrm")
    private Integer usuariocreacrm;
    @Column(name = "fechaactualizacrm")
    @Temporal(TemporalType.DATE)
    private Date fechaactualizacrm;
    @Column(name = "usuarioactualizacrm")
    private Integer usuarioactualizacrm;
    @JoinColumn(name = "iddoctor", referencedColumnName = "iddoctor")
    @ManyToOne(optional = false)
    private Doctor iddoctor;
    @JoinColumn(name = "idhospital", referencedColumnName = "idhospital")
    @ManyToOne(optional = false)
    private Hospital idhospital;
    @JoinColumn(name = "idpaciente", referencedColumnName = "idpaciente")
    @ManyToOne(optional = false)
    private Paciente idpaciente;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idcrm")
    private List<Detallerecepcionmuestra> detallerecepcionmuestraList;

    public Cabecerarecepcionmuestra() {
    }

    public Cabecerarecepcionmuestra(Integer idcrm) {
        this.idcrm = idcrm;
    }

    public Integer getIdcrm() {
        return idcrm;
    }

    public void setIdcrm(Integer idcrm) {
        this.idcrm = idcrm;
    }

    public Date getFechatomamuestracrm() {
        return fechatomamuestracrm;
    }

    public void setFechatomamuestracrm(Date fechatomamuestracrm) {
        this.fechatomamuestracrm = fechatomamuestracrm;
    }

    public Date getHoratomamuestracrm() {
        return horatomamuestracrm;
    }

    public void setHoratomamuestracrm(Date horatomamuestracrm) {
        this.horatomamuestracrm = horatomamuestracrm;
    }

    public String getTiposervicio() {
        return tiposervicio;
    }

    public void setTiposervicio(String tiposervicio) {
        this.tiposervicio = tiposervicio;
    }

    public String getDescriptiposerviciocrm() {
        return descriptiposerviciocrm;
    }

    public void setDescriptiposerviciocrm(String descriptiposerviciocrm) {
        this.descriptiposerviciocrm = descriptiposerviciocrm;
    }

    public String getTratamientopacientecrm() {
        return tratamientopacientecrm;
    }

    public void setTratamientopacientecrm(String tratamientopacientecrm) {
        this.tratamientopacientecrm = tratamientopacientecrm;
    }

    public String getServiciocrm() {
        return serviciocrm;
    }

    public void setServiciocrm(String serviciocrm) {
        this.serviciocrm = serviciocrm;
    }

    public String getSalacrm() {
        return salacrm;
    }

    public void setSalacrm(String salacrm) {
        this.salacrm = salacrm;
    }

    public String getCamacrm() {
        return camacrm;
    }

    public void setCamacrm(String camacrm) {
        this.camacrm = camacrm;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public String getDiagnosticopresunticocrm() {
        return diagnosticopresunticocrm;
    }

    public void setDiagnosticopresunticocrm(String diagnosticopresunticocrm) {
        this.diagnosticopresunticocrm = diagnosticopresunticocrm;
    }

    public String getResumenclinicocrm() {
        return resumenclinicocrm;
    }

    public void setResumenclinicocrm(String resumenclinicocrm) {
        this.resumenclinicocrm = resumenclinicocrm;
    }

    public String getMuestrapiezacrm() {
        return muestrapiezacrm;
    }

    public void setMuestrapiezacrm(String muestrapiezacrm) {
        this.muestrapiezacrm = muestrapiezacrm;
    }

    public Integer getNumbloquescrm() {
        return numbloquescrm;
    }

    public void setNumbloquescrm(Integer numbloquescrm) {
        this.numbloquescrm = numbloquescrm;
    }

    public Integer getNumplacascrm() {
        return numplacascrm;
    }

    public void setNumplacascrm(Integer numplacascrm) {
        this.numplacascrm = numplacascrm;
    }

    public Integer getRefrigeracionmuestra() {
        return refrigeracionmuestra;
    }

    public void setRefrigeracionmuestra(Integer refrigeracionmuestra) {
        this.refrigeracionmuestra = refrigeracionmuestra;
    }

    public Integer getTempambientemuestra() {
        return tempambientemuestra;
    }

    public void setTempambientemuestra(Integer tempambientemuestra) {
        this.tempambientemuestra = tempambientemuestra;
    }

    public Date getFechacreacrm() {
        return fechacreacrm;
    }

    public void setFechacreacrm(Date fechacreacrm) {
        this.fechacreacrm = fechacreacrm;
    }

    public Integer getUsuariocreacrm() {
        return usuariocreacrm;
    }

    public void setUsuariocreacrm(Integer usuariocreacrm) {
        this.usuariocreacrm = usuariocreacrm;
    }

    public Date getFechaactualizacrm() {
        return fechaactualizacrm;
    }

    public void setFechaactualizacrm(Date fechaactualizacrm) {
        this.fechaactualizacrm = fechaactualizacrm;
    }

    public Integer getUsuarioactualizacrm() {
        return usuarioactualizacrm;
    }

    public void setUsuarioactualizacrm(Integer usuarioactualizacrm) {
        this.usuarioactualizacrm = usuarioactualizacrm;
    }

    public Doctor getIddoctor() {
        return iddoctor;
    }

    public void setIddoctor(Doctor iddoctor) {
        this.iddoctor = iddoctor;
    }

    public Hospital getIdhospital() {
        return idhospital;
    }

    public void setIdhospital(Hospital idhospital) {
        this.idhospital = idhospital;
    }

    public Paciente getIdpaciente() {
        return idpaciente;
    }

    public void setIdpaciente(Paciente idpaciente) {
        this.idpaciente = idpaciente;
    }

    @XmlTransient
    public List<Detallerecepcionmuestra> getDetallerecepcionmuestraList() {
        return detallerecepcionmuestraList;
    }

    public void setDetallerecepcionmuestraList(List<Detallerecepcionmuestra> detallerecepcionmuestraList) {
        this.detallerecepcionmuestraList = detallerecepcionmuestraList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcrm != null ? idcrm.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cabecerarecepcionmuestra)) {
            return false;
        }
        Cabecerarecepcionmuestra other = (Cabecerarecepcionmuestra) object;
        if ((this.idcrm == null && other.idcrm != null) || (this.idcrm != null && !this.idcrm.equals(other.idcrm))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Entity.Cabecerarecepcionmuestra[ idcrm=" + idcrm + " ]";
    }
    
}
