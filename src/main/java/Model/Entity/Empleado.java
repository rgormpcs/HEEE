/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Entity;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author EPN
 */
@Entity
@Table(name = "empleado")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Empleado.findAll", query = "SELECT e FROM Empleado e"),
    @NamedQuery(name = "Empleado.findByIdempleado", query = "SELECT e FROM Empleado e WHERE e.idempleado = :idempleado"),
    @NamedQuery(name = "Empleado.findByNombresempleado", query = "SELECT e FROM Empleado e WHERE e.nombresempleado = :nombresempleado"),
    @NamedQuery(name = "Empleado.findByApellidosempleado", query = "SELECT e FROM Empleado e WHERE e.apellidosempleado = :apellidosempleado"),
    @NamedQuery(name = "Empleado.findByGeneroempleado", query = "SELECT e FROM Empleado e WHERE e.generoempleado = :generoempleado"),
    @NamedQuery(name = "Empleado.findByFechanacimiento", query = "SELECT e FROM Empleado e WHERE e.fechanacimiento = :fechanacimiento"),
    @NamedQuery(name = "Empleado.findByCeduidenempleado", query = "SELECT e FROM Empleado e WHERE e.ceduidenempleado = :ceduidenempleado"),
    @NamedQuery(name = "Empleado.findByDireccionempleado", query = "SELECT e FROM Empleado e WHERE e.direccionempleado = :direccionempleado"),
    @NamedQuery(name = "Empleado.findByNumtelempleado", query = "SELECT e FROM Empleado e WHERE e.numtelempleado = :numtelempleado"),
    @NamedQuery(name = "Empleado.findByEspecialidadempleado", query = "SELECT e FROM Empleado e WHERE e.especialidadempleado = :especialidadempleado")})
public class Empleado implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idempleado")
    private Integer idempleado;
    @Size(max = 50)
    @Column(name = "nombresempleado")
    private String nombresempleado;
    @Size(max = 50)
    @Column(name = "apellidosempleado")
    private String apellidosempleado;
    @Size(max = 1)
    @Column(name = "generoempleado")
    private String generoempleado;
    @Column(name = "fechanacimiento")
    @Temporal(TemporalType.DATE)
    private Date fechanacimiento;
    @Size(max = 10)
    @Column(name = "ceduidenempleado")
    private String ceduidenempleado;
    @Size(max = 50)
    @Column(name = "direccionempleado")
    private String direccionempleado;
    @Size(max = 10)
    @Column(name = "numtelempleado")
    private String numtelempleado;
    @Size(max = 50)
    @Column(name = "especialidadempleado")
    private String especialidadempleado;
    @Size(max = 50)
    @Column(name = "cargoempleado")
    private String cargoempleado;

    @JoinColumn(name = "idcargo", referencedColumnName = "idcargo")
    @ManyToOne(optional = false)
    private Cargo idcargo;
    @JoinColumn(name = "idespecialidad", referencedColumnName = "idespecialidad")
    @ManyToOne(optional = false)
    private Especialidad idespecialidad;

    public Empleado() {
    }

    public Empleado(Integer idempleado) {
        this.idempleado = idempleado;
    }

    public Integer getIdempleado() {
        return idempleado;
    }

    public void setIdempleado(Integer idempleado) {
        this.idempleado = idempleado;
    }

    public String getNombresempleado() {
        return nombresempleado;
    }

    public void setNombresempleado(String nombresempleado) {
        this.nombresempleado = nombresempleado;
    }

    public String getApellidosempleado() {
        return apellidosempleado;
    }

    public void setApellidosempleado(String apellidosempleado) {
        this.apellidosempleado = apellidosempleado;
    }

    public String getGeneroempleado() {
        return generoempleado;
    }

    public void setGeneroempleado(String generoempleado) {
        this.generoempleado = generoempleado;
    }

    public Date getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(Date fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public String getCeduidenempleado() {
        return ceduidenempleado;
    }

    public void setCeduidenempleado(String ceduidenempleado) {
        this.ceduidenempleado = ceduidenempleado;
    }

    public String getDireccionempleado() {
        return direccionempleado;
    }

    public void setDireccionempleado(String direccionempleado) {
        this.direccionempleado = direccionempleado;
    }

    public String getNumtelempleado() {
        return numtelempleado;
    }

    public void setNumtelempleado(String numtelempleado) {
        this.numtelempleado = numtelempleado;
    }

    public String getEspecialidadempleado() {
        return especialidadempleado;
    }

    public void setEspecialidadempleado(String especialidadempleado) {
        this.especialidadempleado = especialidadempleado;
    }

    public String getCargoempleado() {
        return cargoempleado;
    }

    public void setCargoempleado(String cargoempleado) {
        this.cargoempleado = cargoempleado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idempleado != null ? idempleado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Empleado)) {
            return false;
        }
        Empleado other = (Empleado) object;
        if ((this.idempleado == null && other.idempleado != null) || (this.idempleado != null && !this.idempleado.equals(other.idempleado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Entity.Empleado[ idempleado=" + idempleado + " ]";
    }

    public Cargo getIdcargo() {
        return idcargo;
    }

    public void setIdcargo(Cargo idcargo) {
        this.idcargo = idcargo;
    }

    public Especialidad getIdespecialidad() {
        return idespecialidad;
    }

    public void setIdespecialidad(Especialidad idespecialidad) {
        this.idespecialidad = idespecialidad;
    }

}
