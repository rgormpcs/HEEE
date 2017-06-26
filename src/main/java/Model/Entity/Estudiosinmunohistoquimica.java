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
@Table(name = "estudiosinmunohistoquimica", catalog = "siap", schema = "public")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Estudiosinmunohistoquimica.findAll", query = "SELECT e FROM Estudiosinmunohistoquimica e"),
    @NamedQuery(name = "Estudiosinmunohistoquimica.findByIdeihq", query = "SELECT e FROM Estudiosinmunohistoquimica e WHERE e.ideihq = :ideihq"),
    @NamedQuery(name = "Estudiosinmunohistoquimica.findByDescripcionestudioeihq", query = "SELECT e FROM Estudiosinmunohistoquimica e WHERE e.descripcionestudioeihq = :descripcionestudioeihq"),
    @NamedQuery(name = "Estudiosinmunohistoquimica.findByNumeroeihq", query = "SELECT e FROM Estudiosinmunohistoquimica e WHERE e.numeroeihq = :numeroeihq"),
    @NamedQuery(name = "Estudiosinmunohistoquimica.findByIddetallerecepcionmuestraeihq", query = "SELECT e FROM Estudiosinmunohistoquimica e WHERE e.iddetallerecepcionmuestraeihq = :iddetallerecepcionmuestraeihq")})
public class Estudiosinmunohistoquimica implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ideihq")
    private Integer ideihq;
    @Size(max = 100)
    @Column(name = "descripcionestudioeihq")
    private String descripcionestudioeihq;
    @Column(name = "numeroeihq")
    private Integer numeroeihq;
    @Column(name = "iddetallerecepcionmuestraeihq")
    private Integer iddetallerecepcionmuestraeihq;
    @JoinTable(name = "marcadores_es_parte_de_eihq", joinColumns = {
        @JoinColumn(name = "ideihq", referencedColumnName = "ideihq")}, inverseJoinColumns = {
        @JoinColumn(name = "idmarcadorihq", referencedColumnName = "idmarcadorihq")})
    @ManyToMany
    private Collection<Marcadoreseihq> marcadoreseihqCollection;

    public Estudiosinmunohistoquimica() {
    }

    public Estudiosinmunohistoquimica(Integer ideihq) {
        this.ideihq = ideihq;
    }

    public Integer getIdeihq() {
        return ideihq;
    }

    public void setIdeihq(Integer ideihq) {
        this.ideihq = ideihq;
    }

    public String getDescripcionestudioeihq() {
        return descripcionestudioeihq;
    }

    public void setDescripcionestudioeihq(String descripcionestudioeihq) {
        this.descripcionestudioeihq = descripcionestudioeihq;
    }

    public Integer getNumeroeihq() {
        return numeroeihq;
    }

    public void setNumeroeihq(Integer numeroeihq) {
        this.numeroeihq = numeroeihq;
    }

    public Integer getIddetallerecepcionmuestraeihq() {
        return iddetallerecepcionmuestraeihq;
    }

    public void setIddetallerecepcionmuestraeihq(Integer iddetallerecepcionmuestraeihq) {
        this.iddetallerecepcionmuestraeihq = iddetallerecepcionmuestraeihq;
    }

    @XmlTransient
    public Collection<Marcadoreseihq> getMarcadoreseihqCollection() {
        return marcadoreseihqCollection;
    }

    public void setMarcadoreseihqCollection(Collection<Marcadoreseihq> marcadoreseihqCollection) {
        this.marcadoreseihqCollection = marcadoreseihqCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ideihq != null ? ideihq.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Estudiosinmunohistoquimica)) {
            return false;
        }
        Estudiosinmunohistoquimica other = (Estudiosinmunohistoquimica) object;
        if ((this.ideihq == null && other.ideihq != null) || (this.ideihq != null && !this.ideihq.equals(other.ideihq))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Entity.Estudiosinmunohistoquimica[ ideihq=" + ideihq + " ]";
    }
    
}
