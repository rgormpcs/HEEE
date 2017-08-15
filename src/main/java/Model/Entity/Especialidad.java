/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author mpcs
 */
@Entity
@Table(name = "especialidad")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Especialidad.findAll", query = "SELECT e FROM Especialidad e")
    , @NamedQuery(name = "Especialidad.findByIdespecialidad", query = "SELECT e FROM Especialidad e WHERE e.idespecialidad = :idespecialidad")
    , @NamedQuery(name = "Especialidad.findByNombreespecialidad", query = "SELECT e FROM Especialidad e WHERE e.nombreespecialidad = :nombreespecialidad")})
public class Especialidad implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idespecialidad")
    private Integer idespecialidad;
    @Size(max = 50)
    @Column(name = "nombreespecialidad")
    private String nombreespecialidad;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idespecialidad")
    private Collection<Empleado> empleadoCollection;

    public Especialidad() {
    }

    public Especialidad(Integer idespecialidad) {
        this.idespecialidad = idespecialidad;
    }

    public Integer getIdespecialidad() {
        return idespecialidad;
    }

    public void setIdespecialidad(Integer idespecialidad) {
        this.idespecialidad = idespecialidad;
    }

    public String getNombreespecialidad() {
        return nombreespecialidad;
    }

    public void setNombreespecialidad(String nombreespecialidad) {
        this.nombreespecialidad = nombreespecialidad;
    }

    @XmlTransient
    public Collection<Empleado> getEmpleadoCollection() {
        return empleadoCollection;
    }

    public void setEmpleadoCollection(Collection<Empleado> empleadoCollection) {
        this.empleadoCollection = empleadoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idespecialidad != null ? idespecialidad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Especialidad)) {
            return false;
        }
        Especialidad other = (Especialidad) object;
        if ((this.idespecialidad == null && other.idespecialidad != null) || (this.idespecialidad != null && !this.idespecialidad.equals(other.idespecialidad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Entity.Especialidad[ idespecialidad=" + idespecialidad + " ]";
    }
    
}
