/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author EPN
 */
@Entity
@Table(name = "estudioshistoquimica", catalog = "siap", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Estudioshistoquimica.findAll", query = "SELECT e FROM Estudioshistoquimica e"),
    @NamedQuery(name = "Estudioshistoquimica.findByIdeh", query = "SELECT e FROM Estudioshistoquimica e WHERE e.ideh = :ideh"),
    @NamedQuery(name = "Estudioshistoquimica.findByDescripcioneh", query = "SELECT e FROM Estudioshistoquimica e WHERE e.descripcioneh = :descripcioneh"),
    @NamedQuery(name = "Estudioshistoquimica.findByNumeroeh", query = "SELECT e FROM Estudioshistoquimica e WHERE e.numeroeh = :numeroeh"),
    @NamedQuery(name = "Estudioshistoquimica.findByIddetallerecepcionmuestraeh", query = "SELECT e FROM Estudioshistoquimica e WHERE e.iddetallerecepcionmuestraeh = :iddetallerecepcionmuestraeh")})
public class Estudioshistoquimica implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ideh")
    private Integer ideh;
    @Size(max = 100)
    @Column(name = "descripcioneh")
    private String descripcioneh;
    @Column(name = "numeroeh")
    private Integer numeroeh;
    @Column(name = "iddetallerecepcionmuestraeh")
    private Integer iddetallerecepcionmuestraeh;
    @JoinTable(name = "marcador_es_parte_de_eh", joinColumns = {
        @JoinColumn(name = "ideh", referencedColumnName = "ideh")}, inverseJoinColumns = {
        @JoinColumn(name = "idmarcadoreh", referencedColumnName = "idmarcadoreh")})
    @ManyToMany
    private Collection<Marcadoreseh> marcadoresehCollection;

    public Estudioshistoquimica() {
    }

    public Estudioshistoquimica(Integer ideh) {
        this.ideh = ideh;
    }

    public Integer getIdeh() {
        return ideh;
    }

    public void setIdeh(Integer ideh) {
        this.ideh = ideh;
    }

    public String getDescripcioneh() {
        return descripcioneh;
    }

    public void setDescripcioneh(String descripcioneh) {
        this.descripcioneh = descripcioneh;
    }

    public Integer getNumeroeh() {
        return numeroeh;
    }

    public void setNumeroeh(Integer numeroeh) {
        this.numeroeh = numeroeh;
    }

    public Integer getIddetallerecepcionmuestraeh() {
        return iddetallerecepcionmuestraeh;
    }

    public void setIddetallerecepcionmuestraeh(Integer iddetallerecepcionmuestraeh) {
        this.iddetallerecepcionmuestraeh = iddetallerecepcionmuestraeh;
    }

    @XmlTransient
    public Collection<Marcadoreseh> getMarcadoresehCollection() {
        return marcadoresehCollection;
    }

    public void setMarcadoresehCollection(Collection<Marcadoreseh> marcadoresehCollection) {
        this.marcadoresehCollection = marcadoresehCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ideh != null ? ideh.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Estudioshistoquimica)) {
            return false;
        }
        Estudioshistoquimica other = (Estudioshistoquimica) object;
        if ((this.ideh == null && other.ideh != null) || (this.ideh != null && !this.ideh.equals(other.ideh))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Entity.Estudioshistoquimica[ ideh=" + ideh + " ]";
    }
    
}
