/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean.Amputaciones;

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
@RequestScoped
public class AmputacionesListar implements Serializable {

    private UbicacionListar ubicacionListar = new UbicacionListar();

    String extremidadesID;
    String partesID;

    List<Extremidades> listaExtremidades;
    List<Partes> listaPartes;

    /**
     * Creates a new instance of AmputacionesListar
     */
    public AmputacionesListar() {

        extremidadesID = "";
        partesID = "";
        listaExtremidades = null;
        listaExtremidades = null;
        listarExtremidades();
    }

    public void listarExtremidades() {

        listaExtremidades = JPAFactoryDAO.getFactory().getExtremidadDAO().find();

    }

    public void resetCombo() {
//        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", "Ingrese los datos del nuevo estudio."));
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO,"laksdj", "Ingrese nuevos datos del estudio");
        FacesContext.getCurrentInstance().addMessage(null, message);

        extremidadesID = "";
        partesID = "";
        listarExtremidades();
        listaExtremidades = null;
        
        ubicacionListar.resetCombo();
    
    }
    
    public void volver(){
//        System.out.println("usuario del faces:"+FacesContext.getCurrentInstance().getExternalContext().getSessionMap().get("usuario"));
//        String redireccion = "/principal/bienvenida.HeeSiap";  
//        System.out.println("redireccion:"+redireccion);
        
//    
//    DefaultMenuItem item = new DefaultMenuItem();
//    item.setUrl(redireccion);
System.out.println("*******************dlkfjal");

// try {
//            System.out.println("LOGRO REDIRECCIONAR A UN NUEVO FORMULARIO");
//            FacesContext.getCurrentInstance().getExternalContext().redirect("../Inicio/paginaInicial.xhtml");
//        } catch (Exception e) {
//            System.out.println("FALLO LA REDIRECCION A UN NUEVO FORMULARIO");
//            e.printStackTrace();
//        }

//    Navegar.direccionarInicio();
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
        System.out.println("informacion de extremidadID:" + extremidadesID);
        listaPartes = JPAFactoryDAO.getFactory().getParteDAO().buscarPartePorExtremidad(extremidadesID);
        return listaPartes;
    }

    public void setListaPartes(List<Partes> listaPartes) {
        this.listaPartes = listaPartes;
    }

}
