/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author mpcs
 */
@Embeddable
public class MarcadorEsParteDeEhPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Column(name = "idmarcadoreh")
    private int idmarcadoreh;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ideh")
    private int ideh;

    public MarcadorEsParteDeEhPK() {
    }

    public MarcadorEsParteDeEhPK(int idmarcadoreh, int ideh) {
        this.idmarcadoreh = idmarcadoreh;
        this.ideh = ideh;
    }

    public int getIdmarcadoreh() {
        return idmarcadoreh;
    }

    public void setIdmarcadoreh(int idmarcadoreh) {
        this.idmarcadoreh = idmarcadoreh;
    }

    public int getIdeh() {
        return ideh;
    }

    public void setIdeh(int ideh) {
        this.ideh = ideh;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idmarcadoreh;
        hash += (int) ideh;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MarcadorEsParteDeEhPK)) {
            return false;
        }
        MarcadorEsParteDeEhPK other = (MarcadorEsParteDeEhPK) object;
        if (this.idmarcadoreh != other.idmarcadoreh) {
            return false;
        }
        if (this.ideh != other.ideh) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Entity.MarcadorEsParteDeEhPK[ idmarcadoreh=" + idmarcadoreh + ", ideh=" + ideh + " ]";
    }
    
}
