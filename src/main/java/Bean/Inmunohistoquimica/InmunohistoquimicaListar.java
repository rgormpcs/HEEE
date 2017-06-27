/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean.Inmunohistoquimica;

import Model.Entity.Marcadoreseihq;
import Model.JPA.JPAFactoryDAO;
import java.util.List;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author EPN
 */
@ManagedBean(name = "inmunohistoquimicaListar")
@RequestScoped
public class InmunohistoquimicaListar {

    private List<Marcadoreseihq>  marcadores;
    private String[] marcadoresSeleccionados;

    
    public InmunohistoquimicaListar() {
        marcadores=null;
        marcadoresSeleccionados=null;
    }

    public List<Marcadoreseihq> getMarcadores() {
        marcadores=JPAFactoryDAO.getFactory().getMarcadoresEIHQ().find();
        return marcadores;
    }

    public void setMarcadores(List<Marcadoreseihq> marcadores) {
        this.marcadores = marcadores;
    }

    public String[] getMarcadoresSeleccionados() {
        return marcadoresSeleccionados;
    }

    public void setMarcadoresSeleccionados(String[] marcadoresSeleccionados) {
        this.marcadoresSeleccionados = marcadoresSeleccionados;
    }

  
    
}
