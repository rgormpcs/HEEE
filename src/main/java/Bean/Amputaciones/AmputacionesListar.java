/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean.Amputaciones;

import Model.DAO.ExtremidadDAO;
import Model.Entity.Extremidades;
import Model.Entity.Partes;
import Model.JPA.JPAFactoryDAO;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.inject.Named;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author mpcs
 */
@ManagedBean(name = "amputacionesListar")
@SessionScoped
public class AmputacionesListar implements Serializable {
    
    String extremidadesID;
    String partesID;
    
    List<Extremidades> listaExtremidades;
    List<Partes> listaPartes;
    
    /**
     * Creates a new instance of AmputacionesListar
     */
    public AmputacionesListar() {
        extremidadesID="";
        partesID="";
        listaExtremidades=null;
        listaExtremidades=null;
        listarExtremidades();
    }
    public void listarExtremidades(){
        
        listaExtremidades=JPAFactoryDAO.getFactory().getExtremidadDAO().find();
   
    }
    //getter and setter

    public String getExtremidadesID() {
        return extremidadesID;
    }

    public void setExtremidadesID(String extremidadesID) {
        this.extremidadesID = extremidadesID;
    }

    public String getPartesID() {
        return partesID;
    }

    public void setPartesID(String partesID) {
        this.partesID = partesID;
    }

    public List<Extremidades> getListaExtremidades() {
        return listaExtremidades;
    }

    public void setListaExtremidades(List<Extremidades> listaExtremidades) {
        this.listaExtremidades = listaExtremidades;
    }

    public List<Partes> getListaPartes() {
          System.out.println("informacion de extremidadID:"+extremidadesID);
        listaPartes=JPAFactoryDAO.getFactory().getParteDAO().buscarPartePorExtremidad(extremidadesID);
        return listaPartes;
    }

    public void setListaPartes(List<Partes> listaPartes) {
        this.listaPartes = listaPartes;
    }
    
    
    

   
}
