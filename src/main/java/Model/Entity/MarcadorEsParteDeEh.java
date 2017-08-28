/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Entity;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author mpcs
 */
@Entity
@Table(name = "marcador_es_parte_de_eh")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MarcadorEsParteDeEh.findAll", query = "SELECT m FROM MarcadorEsParteDeEh m")
    , @NamedQuery(name = "MarcadorEsParteDeEh.findByIdmarcadoreh", query = "SELECT m FROM MarcadorEsParteDeEh m WHERE m.marcadorEsParteDeEhPK.idmarcadoreh = :idmarcadoreh")
    , @NamedQuery(name = "MarcadorEsParteDeEh.findByIdeh", query = "SELECT m FROM MarcadorEsParteDeEh m WHERE m.marcadorEsParteDeEhPK.ideh = :ideh")})
public class MarcadorEsParteDeEh implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected MarcadorEsParteDeEhPK marcadorEsParteDeEhPK;

    public MarcadorEsParteDeEh() {
    }

    public MarcadorEsParteDeEh(MarcadorEsParteDeEhPK marcadorEsParteDeEhPK) {
        this.marcadorEsParteDeEhPK = marcadorEsParteDeEhPK;
    }

    public MarcadorEsParteDeEh(int idmarcadoreh, int ideh) {
        this.marcadorEsParteDeEhPK = new MarcadorEsParteDeEhPK(idmarcadoreh, ideh);
    }

    public MarcadorEsParteDeEhPK getMarcadorEsParteDeEhPK() {
        return marcadorEsParteDeEhPK;
    }

    public void setMarcadorEsParteDeEhPK(MarcadorEsParteDeEhPK marcadorEsParteDeEhPK) {
        this.marcadorEsParteDeEhPK = marcadorEsParteDeEhPK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (marcadorEsParteDeEhPK != null ? marcadorEsParteDeEhPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MarcadorEsParteDeEh)) {
            return false;
        }
        MarcadorEsParteDeEh other = (MarcadorEsParteDeEh) object;
        if ((this.marcadorEsParteDeEhPK == null && other.marcadorEsParteDeEhPK != null) || (this.marcadorEsParteDeEhPK != null && !this.marcadorEsParteDeEhPK.equals(other.marcadorEsParteDeEhPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Entity.MarcadorEsParteDeEh[ marcadorEsParteDeEhPK=" + marcadorEsParteDeEhPK + " ]";
    }
    
}
