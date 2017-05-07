/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author EPN
 */
@Entity
@Table(name = "detallerecepcionmuestra")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Detallerecepcionmuestra.findAll", query = "SELECT d FROM Detallerecepcionmuestra d"),
    @NamedQuery(name = "Detallerecepcionmuestra.findByIddrm", query = "SELECT d FROM Detallerecepcionmuestra d WHERE d.iddrm = :iddrm"),
    @NamedQuery(name = "Detallerecepcionmuestra.findByCodigobarras", query = "SELECT d FROM Detallerecepcionmuestra d WHERE d.codigobarras = :codigobarras"),
    @NamedQuery(name = "Detallerecepcionmuestra.findByDiagnosticomacrosdrm", query = "SELECT d FROM Detallerecepcionmuestra d WHERE d.diagnosticomacrosdrm = :diagnosticomacrosdrm"),
    @NamedQuery(name = "Detallerecepcionmuestra.findByDiagnosticotecnormaldrm", query = "SELECT d FROM Detallerecepcionmuestra d WHERE d.diagnosticotecnormaldrm = :diagnosticotecnormaldrm"),
    @NamedQuery(name = "Detallerecepcionmuestra.findByCalidadmuestradrm", query = "SELECT d FROM Detallerecepcionmuestra d WHERE d.calidadmuestradrm = :calidadmuestradrm"),
    @NamedQuery(name = "Detallerecepcionmuestra.findByMotivocalidadmuestradrm", query = "SELECT d FROM Detallerecepcionmuestra d WHERE d.motivocalidadmuestradrm = :motivocalidadmuestradrm"),
    @NamedQuery(name = "Detallerecepcionmuestra.findByDiagnosticomicrosdrm", query = "SELECT d FROM Detallerecepcionmuestra d WHERE d.diagnosticomicrosdrm = :diagnosticomicrosdrm"),
    @NamedQuery(name = "Detallerecepcionmuestra.findByOpcionsolicnuevcortesdrm", query = "SELECT d FROM Detallerecepcionmuestra d WHERE d.opcionsolicnuevcortesdrm = :opcionsolicnuevcortesdrm"),
    @NamedQuery(name = "Detallerecepcionmuestra.findByRealizarnuevoscortes", query = "SELECT d FROM Detallerecepcionmuestra d WHERE d.realizarnuevoscortes = :realizarnuevoscortes"),
    @NamedQuery(name = "Detallerecepcionmuestra.findByNumcortesdrm", query = "SELECT d FROM Detallerecepcionmuestra d WHERE d.numcortesdrm = :numcortesdrm"),
    @NamedQuery(name = "Detallerecepcionmuestra.findByObservacionsolicnuevcortesdrm", query = "SELECT d FROM Detallerecepcionmuestra d WHERE d.observacionsolicnuevcortesdrm = :observacionsolicnuevcortesdrm"),
    @NamedQuery(name = "Detallerecepcionmuestra.findByConclusiondiagnosticadrm", query = "SELECT d FROM Detallerecepcionmuestra d WHERE d.conclusiondiagnosticadrm = :conclusiondiagnosticadrm"),
    @NamedQuery(name = "Detallerecepcionmuestra.findByEstudioespecialdrm", query = "SELECT d FROM Detallerecepcionmuestra d WHERE d.estudioespecialdrm = :estudioespecialdrm"),
    @NamedQuery(name = "Detallerecepcionmuestra.findByObservacionestudioespecialdrm", query = "SELECT d FROM Detallerecepcionmuestra d WHERE d.observacionestudioespecialdrm = :observacionestudioespecialdrm"),
    @NamedQuery(name = "Detallerecepcionmuestra.findByEstadoestudiodrm", query = "SELECT d FROM Detallerecepcionmuestra d WHERE d.estadoestudiodrm = :estadoestudiodrm"),
    @NamedQuery(name = "Detallerecepcionmuestra.findByFechacreadrm", query = "SELECT d FROM Detallerecepcionmuestra d WHERE d.fechacreadrm = :fechacreadrm"),
    @NamedQuery(name = "Detallerecepcionmuestra.findByUsuariocreadrm", query = "SELECT d FROM Detallerecepcionmuestra d WHERE d.usuariocreadrm = :usuariocreadrm"),
    @NamedQuery(name = "Detallerecepcionmuestra.findByFechaactualizadrm", query = "SELECT d FROM Detallerecepcionmuestra d WHERE d.fechaactualizadrm = :fechaactualizadrm"),
    @NamedQuery(name = "Detallerecepcionmuestra.findByUsuarioactualizadrm", query = "SELECT d FROM Detallerecepcionmuestra d WHERE d.usuarioactualizadrm = :usuarioactualizadrm")})
public class Detallerecepcionmuestra implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "iddrm")
    private Integer iddrm;
    @Size(max = 13)
    @Column(name = "codigobarras")
    private String codigobarras;
    @Size(max = 250)
    @Column(name = "diagnosticomacrosdrm")
    private String diagnosticomacrosdrm;
    @Size(max = 250)
    @Column(name = "diagnosticotecnormaldrm")
    private String diagnosticotecnormaldrm;
    @Size(max = 20)
    @Column(name = "calidadmuestradrm")
    private String calidadmuestradrm;
    @Size(max = 150)
    @Column(name = "motivocalidadmuestradrm")
    private String motivocalidadmuestradrm;
    @Size(max = 250)
    @Column(name = "diagnosticomicrosdrm")
    private String diagnosticomicrosdrm;
    @Column(name = "opcionsolicnuevcortesdrm")
    private Boolean opcionsolicnuevcortesdrm;
    @Size(max = 200)
    @Column(name = "realizarnuevoscortes")
    private String realizarnuevoscortes;
    @Column(name = "numcortesdrm")
    private Integer numcortesdrm;
    @Size(max = 250)
    @Column(name = "observacionsolicnuevcortesdrm")
    private String observacionsolicnuevcortesdrm;
    @Size(max = 250)
    @Column(name = "conclusiondiagnosticadrm")
    private String conclusiondiagnosticadrm;
    @Size(max = 200)
    @Column(name = "estudioespecialdrm")
    private String estudioespecialdrm;
    @Size(max = 250)
    @Column(name = "observacionestudioespecialdrm")
    private String observacionestudioespecialdrm;
    @Column(name = "estadoestudiodrm")
    private Boolean estadoestudiodrm;
    @Column(name = "fechacreadrm")
    @Temporal(TemporalType.DATE)
    private Date fechacreadrm;
    @Column(name = "usuariocreadrm")
    private Integer usuariocreadrm;
    @Column(name = "fechaactualizadrm")
    @Temporal(TemporalType.DATE)
    private Date fechaactualizadrm;
    @Column(name = "usuarioactualizadrm")
    private Integer usuarioactualizadrm;
    @JoinColumn(name = "idcrm", referencedColumnName = "idcrm")
    @ManyToOne(optional = false)
    private Cabecerarecepcionmuestra idcrm;
    @JoinColumn(name = "idte", referencedColumnName = "idte")
    @ManyToOne(optional = false)
    private Tipoestudio idte;

    public Detallerecepcionmuestra() {
    }

    public Detallerecepcionmuestra(Integer iddrm) {
        this.iddrm = iddrm;
    }

    public Integer getIddrm() {
        return iddrm;
    }

    public void setIddrm(Integer iddrm) {
        this.iddrm = iddrm;
    }

    public String getCodigobarras() {
        return codigobarras;
    }

    public void setCodigobarras(String codigobarras) {
        this.codigobarras = codigobarras;
    }

    public String getDiagnosticomacrosdrm() {
        return diagnosticomacrosdrm;
    }

    public void setDiagnosticomacrosdrm(String diagnosticomacrosdrm) {
        this.diagnosticomacrosdrm = diagnosticomacrosdrm;
    }

    public String getDiagnosticotecnormaldrm() {
        return diagnosticotecnormaldrm;
    }

    public void setDiagnosticotecnormaldrm(String diagnosticotecnormaldrm) {
        this.diagnosticotecnormaldrm = diagnosticotecnormaldrm;
    }

    public String getCalidadmuestradrm() {
        return calidadmuestradrm;
    }

    public void setCalidadmuestradrm(String calidadmuestradrm) {
        this.calidadmuestradrm = calidadmuestradrm;
    }

    public String getMotivocalidadmuestradrm() {
        return motivocalidadmuestradrm;
    }

    public void setMotivocalidadmuestradrm(String motivocalidadmuestradrm) {
        this.motivocalidadmuestradrm = motivocalidadmuestradrm;
    }

    public String getDiagnosticomicrosdrm() {
        return diagnosticomicrosdrm;
    }

    public void setDiagnosticomicrosdrm(String diagnosticomicrosdrm) {
        this.diagnosticomicrosdrm = diagnosticomicrosdrm;
    }

    public Boolean getOpcionsolicnuevcortesdrm() {
        return opcionsolicnuevcortesdrm;
    }

    public void setOpcionsolicnuevcortesdrm(Boolean opcionsolicnuevcortesdrm) {
        this.opcionsolicnuevcortesdrm = opcionsolicnuevcortesdrm;
    }

    public String getRealizarnuevoscortes() {
        return realizarnuevoscortes;
    }

    public void setRealizarnuevoscortes(String realizarnuevoscortes) {
        this.realizarnuevoscortes = realizarnuevoscortes;
    }

    public Integer getNumcortesdrm() {
        return numcortesdrm;
    }

    public void setNumcortesdrm(Integer numcortesdrm) {
        this.numcortesdrm = numcortesdrm;
    }

    public String getObservacionsolicnuevcortesdrm() {
        return observacionsolicnuevcortesdrm;
    }

    public void setObservacionsolicnuevcortesdrm(String observacionsolicnuevcortesdrm) {
        this.observacionsolicnuevcortesdrm = observacionsolicnuevcortesdrm;
    }

    public String getConclusiondiagnosticadrm() {
        return conclusiondiagnosticadrm;
    }

    public void setConclusiondiagnosticadrm(String conclusiondiagnosticadrm) {
        this.conclusiondiagnosticadrm = conclusiondiagnosticadrm;
    }

    public String getEstudioespecialdrm() {
        return estudioespecialdrm;
    }

    public void setEstudioespecialdrm(String estudioespecialdrm) {
        this.estudioespecialdrm = estudioespecialdrm;
    }

    public String getObservacionestudioespecialdrm() {
        return observacionestudioespecialdrm;
    }

    public void setObservacionestudioespecialdrm(String observacionestudioespecialdrm) {
        this.observacionestudioespecialdrm = observacionestudioespecialdrm;
    }

    public Boolean getEstadoestudiodrm() {
        return estadoestudiodrm;
    }

    public void setEstadoestudiodrm(Boolean estadoestudiodrm) {
        this.estadoestudiodrm = estadoestudiodrm;
    }

    public Date getFechacreadrm() {
        return fechacreadrm;
    }

    public void setFechacreadrm(Date fechacreadrm) {
        this.fechacreadrm = fechacreadrm;
    }

    public Integer getUsuariocreadrm() {
        return usuariocreadrm;
    }

    public void setUsuariocreadrm(Integer usuariocreadrm) {
        this.usuariocreadrm = usuariocreadrm;
    }

    public Date getFechaactualizadrm() {
        return fechaactualizadrm;
    }

    public void setFechaactualizadrm(Date fechaactualizadrm) {
        this.fechaactualizadrm = fechaactualizadrm;
    }

    public Integer getUsuarioactualizadrm() {
        return usuarioactualizadrm;
    }

    public void setUsuarioactualizadrm(Integer usuarioactualizadrm) {
        this.usuarioactualizadrm = usuarioactualizadrm;
    }

    public Cabecerarecepcionmuestra getIdcrm() {
        return idcrm;
    }

    public void setIdcrm(Cabecerarecepcionmuestra idcrm) {
        this.idcrm = idcrm;
    }

    public Tipoestudio getIdte() {
        return idte;
    }

    public void setIdte(Tipoestudio idte) {
        this.idte = idte;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iddrm != null ? iddrm.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Detallerecepcionmuestra)) {
            return false;
        }
        Detallerecepcionmuestra other = (Detallerecepcionmuestra) object;
        if ((this.iddrm == null && other.iddrm != null) || (this.iddrm != null && !this.iddrm.equals(other.iddrm))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Entity.Detallerecepcionmuestra[ iddrm=" + iddrm + " ]";
    }
    
}
