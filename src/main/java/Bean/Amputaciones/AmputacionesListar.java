/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean.Amputaciones;

import Bean.Menu.Navegar;
import Bean.Ubicacion.UbicacionListar;
import Model.Entity.Extremidades;
import Model.Entity.Partes;
import Model.JPA.JPAFactoryDAO;
import java.io.Serializable;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;

/**
 *
 * @author mpcs
 */
@ManagedBean(name = "amputacionesListar")
@ViewScoped
//@RequestScoped
public class AmputacionesListar implements Serializable {

    private UbicacionListar ubicacionListar;
    private Navegar navegar;
    String extremidadesID;
    String partesID;

    List<Extremidades> listaExtremidades;
    List<Partes> listaPartes;

    /**
     * Creates a new instance of AmputacionesListar
     */
    public AmputacionesListar() {
        ubicacionListar = new UbicacionListar();
        navegar = new Navegar();
        extremidadesID = "0";
        partesID = "0";
        listaExtremidades = null;
        listaExtremidades = null;
        listarExtremidades();
        
        
    }

    public void listarExtremidades() {

        listaExtremidades = JPAFactoryDAO.getFactory().getExtremidadDAO().find();

    }


    public void resetCombo() {
//        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", "Ingrese los datos del nuevo estudio."));
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO,"Mensaje:", "Ingrese los nuevos datos del estudio");
        FacesContext.getCurrentInstance().addMessage(null, message);

        extremidadesID = "0";
        partesID = "0";
        listaExtremidades = null;
        listarExtremidades();
        
        
        ubicacionListar.resetCombo();
    
    }
    public void volver(){
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO,"Mensaje:", "Hasta pronto");
        FacesContext.getCurrentInstance().addMessage(null, message);
        
        navegar.direccionarInicio();
        System.out.println("paso del metodo de navegar");
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
        listaPartes = JPAFactoryDAO.getFactory().getParteDAO().buscarPartePorExtremidad(extremidadesID);
        System.out.println("informacion de extremidadID:" + extremidadesID);
        System.out.println("informacion de parteID:"+partesID);
        return listaPartes;
    }

    public void setListaPartes(List<Partes> listaPartes) {
        this.listaPartes = listaPartes;
    }

}
