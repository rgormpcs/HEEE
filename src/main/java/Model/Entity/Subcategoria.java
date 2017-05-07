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
@Table(name = "subcategoria")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Subcategoria.findAll", query = "SELECT s FROM Subcategoria s"),
    @NamedQuery(name = "Subcategoria.findByIdsubcategoria", query = "SELECT s FROM Subcategoria s WHERE s.idsubcategoria = :idsubcategoria"),
    @NamedQuery(name = "Subcategoria.findByNombresubcategoria", query = "SELECT s FROM Subcategoria s WHERE s.nombresubcategoria = :nombresubcategoria"),
    @NamedQuery(name = "Subcategoria.findByTipodatosubcategoria", query = "SELECT s FROM Subcategoria s WHERE s.tipodatosubcategoria = :tipodatosubcategoria"),
    @NamedQuery(name = "Subcategoria.findByNombreetiquetasubcategoria", query = "SELECT s FROM Subcategoria s WHERE s.nombreetiquetasubcategoria = :nombreetiquetasubcategoria")})
public class Subcategoria implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idsubcategoria")
    private Integer idsubcategoria;
    @Size(max = 50)
    @Column(name = "nombresubcategoria")
    private String nombresubcategoria;
    @Size(max = 20)
    @Column(name = "tipodatosubcategoria")
    private String tipodatosubcategoria;
    @Size(max = 30)
    @Column(name = "nombreetiquetasubcategoria")
    private String nombreetiquetasubcategoria;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idsubcategoria")
    private List<Detalleestudiocitologico> detalleestudiocitologicoList;
    @JoinColumn(name = "idcategoria", referencedColumnName = "idcategoria")
    @ManyToOne(optional = false)
    private Categoria idcategoria;

    public Subcategoria() {
    }

    public Subcategoria(Integer idsubcategoria) {
        this.idsubcategoria = idsubcategoria;
    }

    public Integer getIdsubcategoria() {
        return idsubcategoria;
    }

    public void setIdsubcategoria(Integer idsubcategoria) {
        this.idsubcategoria = idsubcategoria;
    }

    public String getNombresubcategoria() {
        return nombresubcategoria;
    }

    public void setNombresubcategoria(String nombresubcategoria) {
        this.nombresubcategoria = nombresubcategoria;
    }

    public String getTipodatosubcategoria() {
        return tipodatosubcategoria;
    }

    public void setTipodatosubcategoria(String tipodatosubcategoria) {
        this.tipodatosubcategoria = tipodatosubcategoria;
    }

    public String getNombreetiquetasubcategoria() {
        return nombreetiquetasubcategoria;
    }

    public void setNombreetiquetasubcategoria(String nombreetiquetasubcategoria) {
        this.nombreetiquetasubcategoria = nombreetiquetasubcategoria;
    }

    @XmlTransient
    public List<Detalleestudiocitologico> getDetalleestudiocitologicoList() {
        return detalleestudiocitologicoList;
    }

    public void setDetalleestudiocitologicoList(List<Detalleestudiocitologico> detalleestudiocitologicoList) {
        this.detalleestudiocitologicoList = detalleestudiocitologicoList;
    }

    public Categoria getIdcategoria() {
        return idcategoria;
    }

    public void setIdcategoria(Categoria idcategoria) {
        this.idcategoria = idcategoria;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idsubcategoria != null ? idsubcategoria.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Subcategoria)) {
            return false;
        }
        Subcategoria other = (Subcategoria) object;
        if ((this.idsubcategoria == null && other.idsubcategoria != null) || (this.idsubcategoria != null && !this.idsubcategoria.equals(other.idsubcategoria))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Entity.Subcategoria[ idsubcategoria=" + idsubcategoria + " ]";
    }
    
}
