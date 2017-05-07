/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Entity;

import java.io.Serializable;
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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author EPN
 */
@Entity
@Table(name = "estudiosrevision")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Estudiosrevision.findAll", query = "SELECT e FROM Estudiosrevision e"),
    @NamedQuery(name = "Estudiosrevision.findByIder", query = "SELECT e FROM Estudiosrevision e WHERE e.ider = :ider"),
    @NamedQuery(name = "Estudiosrevision.findByDescripcionsubtipoer", query = "SELECT e FROM Estudiosrevision e WHERE e.descripcionsubtipoer = :descripcionsubtipoer"),
    @NamedQuery(name = "Estudiosrevision.findByDescripcionrevisioner", query = "SELECT e FROM Estudiosrevision e WHERE e.descripcionrevisioner = :descripcionrevisioner"),
    @NamedQuery(name = "Estudiosrevision.findByNumestudioer", query = "SELECT e FROM Estudiosrevision e WHERE e.numestudioer = :numestudioer"),
    @NamedQuery(name = "Estudiosrevision.findByIddetallerecepcionmuestraer", query = "SELECT e FROM Estudiosrevision e WHERE e.iddetallerecepcionmuestraer = :iddetallerecepcionmuestraer")})
public class Estudiosrevision implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ider")
    private Integer ider;
    @Size(max = 200)
    @Column(name = "descripcionsubtipoer")
    private String descripcionsubtipoer;
    @Size(max = 200)
    @Column(name = "descripcionrevisioner")
    private String descripcionrevisioner;
    @Column(name = "numestudioer")
    private Integer numestudioer;
    @Column(name = "iddetallerecepcionmuestraer")
    private Integer iddetallerecepcionmuestraer;
    @JoinColumn(name = "idos", referencedColumnName = "idos")
    @ManyToOne(optional = false)
    private Organossistemas idos;
    @JoinColumn(name = "idsubtipo", referencedColumnName = "idsubtipo")
    @ManyToOne(optional = false)
    private Subtipo idsubtipo;

    public Estudiosrevision() {
    }

    public Estudiosrevision(Integer ider) {
        this.ider = ider;
    }

    public Integer getIder() {
        return ider;
    }

    public void setIder(Integer ider) {
        this.ider = ider;
    }

    public String getDescripcionsubtipoer() {
        return descripcionsubtipoer;
    }

    public void setDescripcionsubtipoer(String descripcionsubtipoer) {
        this.descripcionsubtipoer = descripcionsubtipoer;
    }

    public String getDescripcionrevisioner() {
        return descripcionrevisioner;
    }

    public void setDescripcionrevisioner(String descripcionrevisioner) {
        this.descripcionrevisioner = descripcionrevisioner;
    }

    public Integer getNumestudioer() {
        return numestudioer;
    }

    public void setNumestudioer(Integer numestudioer) {
        this.numestudioer = numestudioer;
    }

    public Integer getIddetallerecepcionmuestraer() {
        return iddetallerecepcionmuestraer;
    }

    public void setIddetallerecepcionmuestraer(Integer iddetallerecepcionmuestraer) {
        this.iddetallerecepcionmuestraer = iddetallerecepcionmuestraer;
    }

    public Organossistemas getIdos() {
        return idos;
    }

    public void setIdos(Organossistemas idos) {
        this.idos = idos;
    }

    public Subtipo getIdsubtipo() {
        return idsubtipo;
    }

    public void setIdsubtipo(Subtipo idsubtipo) {
        this.idsubtipo = idsubtipo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ider != null ? ider.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Estudiosrevision)) {
            return false;
        }
        Estudiosrevision other = (Estudiosrevision) object;
        if ((this.ider == null && other.ider != null) || (this.ider != null && !this.ider.equals(other.ider))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Entity.Estudiosrevision[ ider=" + ider + " ]";
    }
    
}
