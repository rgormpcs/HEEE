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
@Table(name = "usuario")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Usuario.findAll", query = "SELECT u FROM Usuario u"),
    @NamedQuery(name = "Usuario.findByIdusuario", query = "SELECT u FROM Usuario u WHERE u.idusuario = :idusuario"),
    @NamedQuery(name = "Usuario.findByUsuariousuario", query = "SELECT u FROM Usuario u WHERE u.usuariousuario = :usuariousuario"),
    @NamedQuery(name = "Usuario.findByClaveusuario", query = "SELECT u FROM Usuario u WHERE u.claveusuario = :claveusuario"),
    @NamedQuery(name = "Usuario.findByTipousuario", query = "SELECT u FROM Usuario u WHERE u.tipousuario = :tipousuario"),
    @NamedQuery(name = "Usuario.findByEstadousuario", query = "SELECT u FROM Usuario u WHERE u.estadousuario = :estadousuario")})
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idusuario")
    private Integer idusuario;
    @Size(max = 50)
    @Column(name = "usuariousuario")
    private String usuariousuario;
    @Size(max = 20)
    @Column(name = "claveusuario")
    private String claveusuario;
    @Size(max = 1)
    @Column(name = "tipousuario")
    private String tipousuario;
    @Column(name = "estadousuario")
    private Boolean estadousuario;

    public Usuario() {
    }

    public Usuario(Integer idusuario) {
        this.idusuario = idusuario;
    }

    public Integer getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(Integer idusuario) {
        this.idusuario = idusuario;
    }

    public String getUsuariousuario() {
        return usuariousuario;
    }

    public void setUsuariousuario(String usuariousuario) {
        this.usuariousuario = usuariousuario;
    }

    public String getClaveusuario() {
        return claveusuario;
    }

    public void setClaveusuario(String claveusuario) {
        this.claveusuario = claveusuario;
    }

    public String getTipousuario() {
        return tipousuario;
    }

    public void setTipousuario(String tipousuario) {
        this.tipousuario = tipousuario;
    }

    public Boolean getEstadousuario() {
        return estadousuario;
    }

    public void setEstadousuario(Boolean estadousuario) {
        this.estadousuario = estadousuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idusuario != null ? idusuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.idusuario == null && other.idusuario != null) || (this.idusuario != null && !this.idusuario.equals(other.idusuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Entity.Usuario[ idusuario=" + idusuario + " ]";
    }
    
}
