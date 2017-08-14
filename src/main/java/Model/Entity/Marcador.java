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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "marcador")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Marcador.findAll", query = "SELECT m FROM Marcador m"),
    @NamedQuery(name = "Marcador.findByIdmarcador", query = "SELECT m FROM Marcador m WHERE m.idmarcador = :idmarcador"),
    @NamedQuery(name = "Marcador.findByDescripcionmarcador", query = "SELECT m FROM Marcador m WHERE m.descripcionmarcador = :descripcionmarcador")})
public class Marcador implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idmarcador")
    private Integer idmarcador;
    @Size(max = 50)
    @Column(name = "descripcionmarcador")
    private String descripcionmarcador;
    @JoinColumn(name = "idte", referencedColumnName = "idte")
    @ManyToOne(optional = false)
    private Tipoestudio idte;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idmarcador")
    private List<Detalleestudioespecial> detalleestudioespecialList;

    public Marcador() {
    }

    public Marcador(Integer idmarcador) {
        this.idmarcador = idmarcador;
    }

    public Integer getIdmarcador() {
        return idmarcador;
    }

    public void setIdmarcador(Integer idmarcador) {
        this.idmarcador = idmarcador;
    }

    public String getDescripcionmarcador() {
        return descripcionmarcador;
    }

    public void setDescripcionmarcador(String descripcionmarcador) {
        this.descripcionmarcador = descripcionmarcador;
    }

    public Tipoestudio getIdte() {
        return idte;
    }

    public void setIdte(Tipoestudio idte) {
        this.idte = idte;
    }

    @XmlTransient
    public List<Detalleestudioespecial> getDetalleestudioespecialList() {
        return detalleestudioespecialList;
    }

    public void setDetalleestudioespecialList(List<Detalleestudioespecial> detalleestudioespecialList) {
        this.detalleestudioespecialList = detalleestudioespecialList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idmarcador != null ? idmarcador.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Marcador)) {
            return false;
        }
        Marcador other = (Marcador) object;
        if ((this.idmarcador == null && other.idmarcador != null) || (this.idmarcador != null && !this.idmarcador.equals(other.idmarcador))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Entity.Marcador[ idmarcador=" + idmarcador + " ]";
    }
    
}
