/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean.CodigoBarras;


import Model.Entity.Contadorestipoestudioanio;
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
    private int numeroEstudios;
    private int idTipoEstudio;
    private List<Contadorestipoestudioanio> EstudiosPorIdTipo;
    List<Tipoestudio> TiposEstudioporNombre;
    
    public CodigoBarrasListar() {
    numeroEstudios =0;
    fecha = new Date(); 
    anioDigitos= new SimpleDateFormat("yy").format(fecha); 
    nombreEstudio="";
    idTipoEstudio=0;
    EstudiosPorIdTipo=null;
    TiposEstudioporNombre= null;
    
        
    
    }
    
    public void totalEstudios(){
   
    }
    
    public String codigoFormado(){
//         System.out.println("**********variable estudio:"+nombreEstudio);
        String [] campoTipo={"nombrete"};
        String [] valorCampoTipo={nombreEstudio};
        TiposEstudioporNombre= JPAFactoryDAO.getFactory().getTipoEstudioDAO().find(campoTipo,valorCampoTipo);

        //sacar el id unicamente del estudio que esta en la coleccion anterior
        idTipoEstudio=TiposEstudioporNombre.get(0).getIdte();
        
        EstudiosPorIdTipo=JPAFactoryDAO.getFactory().getContadoresTipoEstudioAnioDAO().find();
        
        for (Contadorestipoestudioanio  obj : EstudiosPorIdTipo){
            if(obj.getIdte().getIdte()==idTipoEstudio){
            numeroEstudios+=1;
            }
        }
//        para sacar el numero del estudio que se esta ingresando en este momento
        numeroEstudios+=1;
        String codigo=nombreEstudio.charAt(0)+"-"+anioDigitos+"-"+String.valueOf(numeroEstudios);
        
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
        return numeroEstudios;
    }

    public void setOrdinal(int ordinal) {
        this.numeroEstudios = ordinal;
    }
    
    
    
}
