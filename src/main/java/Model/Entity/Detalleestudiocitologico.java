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
@Table(name = "detalleestudiocitologico")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Detalleestudiocitologico.findAll", query = "SELECT d FROM Detalleestudiocitologico d"),
    @NamedQuery(name = "Detalleestudiocitologico.findByIddec", query = "SELECT d FROM Detalleestudiocitologico d WHERE d.iddec = :iddec"),
    @NamedQuery(name = "Detalleestudiocitologico.findByDescripsubcategdec", query = "SELECT d FROM Detalleestudiocitologico d WHERE d.descripsubcategdec = :descripsubcategdec"),
    @NamedQuery(name = "Detalleestudiocitologico.findByIdsubcategoriadec", query = "SELECT d FROM Detalleestudiocitologico d WHERE d.idsubcategoriadec = :idsubcategoriadec")})
public class Detalleestudiocitologico implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "iddec")
    private Integer iddec;
    @Size(max = 200)
    @Column(name = "descripsubcategdec")
    private String descripsubcategdec;
    @Column(name = "idsubcategoriadec")
    private Integer idsubcategoriadec;
    @JoinColumn(name = "idcec", referencedColumnName = "idcec")
    @ManyToOne(optional = false)
    private Cabeceraestudiocitologico idcec;
    @JoinColumn(name = "idsubcategoria", referencedColumnName = "idsubcategoria")
    @ManyToOne(optional = false)
    private Subcategoria idsubcategoria;

    public Detalleestudiocitologico() {
    }

    public Detalleestudiocitologico(Integer iddec) {
        this.iddec = iddec;
    }

    public Integer getIddec() {
        return iddec;
    }

    public void setIddec(Integer iddec) {
        this.iddec = iddec;
    }

    public String getDescripsubcategdec() {
        return descripsubcategdec;
    }

    public void setDescripsubcategdec(String descripsubcategdec) {
        this.descripsubcategdec = descripsubcategdec;
    }

    public Integer getIdsubcategoriadec() {
        return idsubcategoriadec;
    }

    public void setIdsubcategoriadec(Integer idsubcategoriadec) {
        this.idsubcategoriadec = idsubcategoriadec;
    }

    public Cabeceraestudiocitologico getIdcec() {
        return idcec;
    }

    public void setIdcec(Cabeceraestudiocitologico idcec) {
        this.idcec = idcec;
    }

    public Subcategoria getIdsubcategoria() {
        return idsubcategoria;
    }

    public void setIdsubcategoria(Subcategoria idsubcategoria) {
        this.idsubcategoria = idsubcategoria;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iddec != null ? iddec.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Detalleestudiocitologico)) {
            return false;
        }
        Detalleestudiocitologico other = (Detalleestudiocitologico) object;
        if ((this.iddec == null && other.iddec != null) || (this.iddec != null && !this.iddec.equals(other.iddec))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Entity.Detalleestudiocitologico[ iddec=" + iddec + " ]";
    }
    
}
