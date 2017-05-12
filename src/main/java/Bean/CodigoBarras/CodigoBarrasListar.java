/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean.CodigoBarras;


import Model.Entity.Tipoestudio;
import Model.JPA.JPAFactoryDAO;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean(name = "codigoBarrasListar")

public class CodigoBarrasListar implements Serializable{

    /**
     * Creates a new instance of CodigoBarrasListar
     */
    
    private String nombreEstudio;
    private String anioDigitos;
    private Date fecha; 
    private int ordinal;
    List<Tipoestudio> totalEstudios;
    
    public CodigoBarrasListar() {
    ordinal =0;
    fecha = new Date(); 
    anioDigitos= new SimpleDateFormat("yy").format(fecha); 
    nombreEstudio="";
    
    
        
    
    }
    
    public void totalEstudios(){
   
    }
    
    public String codigoFormado(){
//         System.out.println("**********variable estudio:"+nombreEstudio);
//        totalEstudios=JPAFactoryDAO.getFactory().getTipoEstudioDAO().contarTipoEstudios("AMPUTACION");
//        for(int i=0; i<totalEstudios.size(); i++){
//        System.out.println("contenido ordinal:"+totalEstudios);
//        ordinal=ordinal+1;
//        }

/// se suma uno al ordinal de estudios del mismo tipo ya que este valor se almacena en base
//        ordinal= totalEstudios.size()+1;
        String codigo=nombreEstudio.charAt(0)+"-"+anioDigitos+"-"+String.valueOf(ordinal);
        
        return codigo;
    }
    //getter and setter

    public String getNombreEstudio() {
        return nombreEstudio;
    }

    public void setNombreEstudio(String nombreEstudio) {
        this.nombreEstudio = nombreEstudio;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    

    public String getEstudioInicial() {
        return nombreEstudio;
    }

    public void setEstudioInicial(String estudioInicial) {
        this.nombreEstudio = estudioInicial;
    }

    public String getAnioDigitos() {
        return anioDigitos;
    }

    public void setAnioDigitos(String anioDigitos) {
        this.anioDigitos = anioDigitos;
    }

    public int getOrdinal() {
        return ordinal;
    }

    public void setOrdinal(int ordinal) {
        this.ordinal = ordinal;
    }
    
    
    
}
