/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean.BuscarEstudios;

import Model.Entity.Cabecerarecepcionmuestra;
import Model.JPA.JPAFactoryDAO;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author wilmer.valdiviezo
 */
@ManagedBean(name = "buscarEstudios")
@ViewScoped
public class BuscarEstudios implements Serializable{
    private static final long serialVersionUID = 1L;
    
    private List<Cabecerarecepcionmuestra> estudiosEnBase;
    
    
    
    public BuscarEstudios() {
        estudiosEnBase = null;
    }
    
    public void listarEstudios(){
        estudiosEnBase = JPAFactoryDAO.getFactory().getCabecerarecepcionmuestraDAO().find();
    }

    public List<Cabecerarecepcionmuestra> getEstudiosEnBase() {
        return estudiosEnBase;
    }

    public void setEstudiosEnBase(List<Cabecerarecepcionmuestra> estudiosEnBase) {
        this.estudiosEnBase = estudiosEnBase;
    }
    
    
}
