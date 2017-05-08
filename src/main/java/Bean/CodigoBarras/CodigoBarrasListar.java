/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean.CodigoBarras;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean(name = "codigoBarrasListar")
@SessionScoped
public class CodigoBarrasListar implements Serializable{

    /**
     * Creates a new instance of CodigoBarrasListar
     */
    
    private String estudioInicial;
    private String anioDigitos;
    private int ordinal;
    
    
    public CodigoBarrasListar() {
    estudioInicial="A";
    anioDigitos="16";
    ordinal=4792;
    
    }
    
    public String codigoFormado(){
        String codigo=estudioInicial+"-"+anioDigitos+"-"+String.valueOf(ordinal);
        
        return codigo;
    }
    //getter and setter
    
    

    public String getEstudioInicial() {
        return estudioInicial;
    }

    public void setEstudioInicial(String estudioInicial) {
        this.estudioInicial = estudioInicial;
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
