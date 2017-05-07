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
@Table(name = "estudiosamputaciones")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Estudiosamputaciones.findAll", query = "SELECT e FROM Estudiosamputaciones e"),
    @NamedQuery(name = "Estudiosamputaciones.findByIdea", query = "SELECT e FROM Estudiosamputaciones e WHERE e.idea = :idea"),
    @NamedQuery(name = "Estudiosamputaciones.findByDescripcionamputacionea", query = "SELECT e FROM Estudiosamputaciones e WHERE e.descripcionamputacionea = :descripcionamputacionea"),
    @NamedQuery(name = "Estudiosamputaciones.findByNumeroestudioea", query = "SELECT e FROM Estudiosamputaciones e WHERE e.numeroestudioea = :numeroestudioea"),
    @NamedQuery(name = "Estudiosamputaciones.findByIddetallerecepcionmuestraea", query = "SELECT e FROM Estudiosamputaciones e WHERE e.iddetallerecepcionmuestraea = :iddetallerecepcionmuestraea")})
public class Estudiosamputaciones implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idea")
    private Integer idea;
    @Size(max = 200)
    @Column(name = "descripcionamputacionea")
    private String descripcionamputacionea;
    @Column(name = "numeroestudioea")
    private Integer numeroestudioea;
    @Column(name = "iddetallerecepcionmuestraea")
    private Integer iddetallerecepcionmuestraea;
    @JoinColumn(name = "idpartes", referencedColumnName = "idpartes")
    @ManyToOne(optional = false)
    private Partes idpartes;

    public Estudiosamputaciones() {
    }

    public Estudiosamputaciones(Integer idea) {
        this.idea = idea;
    }

    public Integer getIdea() {
        return idea;
    }

    public void setIdea(Integer idea) {
        this.idea = idea;
    }

    public String getDescripcionamputacionea() {
        return descripcionamputacionea;
    }

    public void setDescripcionamputacionea(String descripcionamputacionea) {
        this.descripcionamputacionea = descripcionamputacionea;
    }

    public Integer getNumeroestudioea() {
        return numeroestudioea;
    }

    public void setNumeroestudioea(Integer numeroestudioea) {
        this.numeroestudioea = numeroestudioea;
    }

    public Integer getIddetallerecepcionmuestraea() {
        return iddetallerecepcionmuestraea;
    }

    public void setIddetallerecepcionmuestraea(Integer iddetallerecepcionmuestraea) {
        this.iddetallerecepcionmuestraea = iddetallerecepcionmuestraea;
    }

    public Partes getIdpartes() {
        return idpartes;
    }

    public void setIdpartes(Partes idpartes) {
        this.idpartes = idpartes;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idea != null ? idea.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Estudiosamputaciones)) {
            return false;
        }
        Estudiosamputaciones other = (Estudiosamputaciones) object;
        if ((this.idea == null && other.idea != null) || (this.idea != null && !this.idea.equals(other.idea))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Entity.Estudiosamputaciones[ idea=" + idea + " ]";
    }
    
}
