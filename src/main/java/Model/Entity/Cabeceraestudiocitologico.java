/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author EPN
 */
@Entity
@Table(name = "cabeceraestudiocitologico")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cabeceraestudiocitologico.findAll", query = "SELECT c FROM Cabeceraestudiocitologico c"),
    @NamedQuery(name = "Cabeceraestudiocitologico.findByIdcec", query = "SELECT c FROM Cabeceraestudiocitologico c WHERE c.idcec = :idcec"),
    @NamedQuery(name = "Cabeceraestudiocitologico.findByDescripcioncitologicocec", query = "SELECT c FROM Cabeceraestudiocitologico c WHERE c.descripcioncitologicocec = :descripcioncitologicocec"),
    @NamedQuery(name = "Cabeceraestudiocitologico.findByNumestudiocec", query = "SELECT c FROM Cabeceraestudiocitologico c WHERE c.numestudiocec = :numestudiocec"),
    @NamedQuery(name = "Cabeceraestudiocitologico.findByIddetallerecepcionmuestracec", query = "SELECT c FROM Cabeceraestudiocitologico c WHERE c.iddetallerecepcionmuestracec = :iddetallerecepcionmuestracec")})
public class Cabeceraestudiocitologico implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idcec")
    private Integer idcec;
    @Size(max = 200)
    @Column(name = "descripcioncitologicocec")
    private String descripcioncitologicocec;
    @Column(name = "numestudiocec")
    private Integer numestudiocec;
    @Column(name = "iddetallerecepcionmuestracec")
    private Integer iddetallerecepcionmuestracec;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idcec")
    private List<Detalleestudiocitologico> detalleestudiocitologicoList;

    public Cabeceraestudiocitologico() {
    }

    public Cabeceraestudiocitologico(Integer idcec) {
        this.idcec = idcec;
    }

    public Integer getIdcec() {
        return idcec;
    }

    public void setIdcec(Integer idcec) {
        this.idcec = idcec;
    }

    public String getDescripcioncitologicocec() {
        return descripcioncitologicocec;
    }

    public void setDescripcioncitologicocec(String descripcioncitologicocec) {
        this.descripcioncitologicocec = descripcioncitologicocec;
    }

    public Integer getNumestudiocec() {
        return numestudiocec;
    }

    public void setNumestudiocec(Integer numestudiocec) {
        this.numestudiocec = numestudiocec;
    }

    public Integer getIddetallerecepcionmuestracec() {
        return iddetallerecepcionmuestracec;
    }

    public void setIddetallerecepcionmuestracec(Integer iddetallerecepcionmuestracec) {
        this.iddetallerecepcionmuestracec = iddetallerecepcionmuestracec;
    }

    @XmlTransient
    public List<Detalleestudiocitologico> getDetalleestudiocitologicoList() {
        return detalleestudiocitologicoList;
    }

    public void setDetalleestudiocitologicoList(List<Detalleestudiocitologico> detalleestudiocitologicoList) {
        this.detalleestudiocitologicoList = detalleestudiocitologicoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcec != null ? idcec.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cabeceraestudiocitologico)) {
            return false;
        }
        Cabeceraestudiocitologico other = (Cabeceraestudiocitologico) object;
        if ((this.idcec == null && other.idcec != null) || (this.idcec != null && !this.idcec.equals(other.idcec))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Entity.Cabeceraestudiocitologico[ idcec=" + idcec + " ]";
    }
    
}
