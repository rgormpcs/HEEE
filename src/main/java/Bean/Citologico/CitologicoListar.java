/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean.Citologico;


import Model.Entity.Categoria;
import Model.Entity.Subcategoria;
import Model.JPA.JPAFactoryDAO;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;


import javax.faces.model.SelectItem;
import javax.faces.model.SelectItemGroup;


/**
 *
 * @author mpcs
 */
@ManagedBean(name = "citologicoListar")
@RequestScoped
public class CitologicoListar {

    
    
    private String [] categoriasID;

    private String [] subcategoriaMaterial;
    private String [] subcategoriaEdades;
    private String [] subcategoriaParidad;
    private String [] subcategoriaAnticoncepcion;
    private String [] subcategoriaTerapiaHormonal;
    private String [] subcategoriaFechas;
    private String [] subcategoriaLiquidos;
    private String [] subcategoriaLavado;
    private String [] subcategoriaPaaf;
    private String [] subcategoriaCepillado;
            
    private List<Categoria> categorias;
    private List<Subcategoria> subcategorias;
    private String[] selectedCars;
    /**
     * Creates a new instance of NewJSFManagedBean
     */
    public CitologicoListar() {
        
        categorias=null;
        
        
    }
    
    public List<Categoria> listarCategoria(String idTec){
        categorias=JPAFactoryDAO.getFactory().getCategoriaDAO().buscarCategoriaPorID(idTec);
        return categorias;
    }
    public List<Subcategoria> listarSubcategoria(String categoriaID){
        subcategorias=JPAFactoryDAO.getFactory().getSubcategoriaDAO().buscarSubcategoriaPorID(categoriaID);
        Collections.reverse(subcategorias);
        return subcategorias;
    }
   
    
    public String[] getSelectedCars() {
        return selectedCars;
    }

    public String[] getSubcategoriaCepillado() {
        return subcategoriaCepillado;
    }

    //getter and setter
    public void setSubcategoriaCepillado(String[] subcategoriaCepillado) {
        this.subcategoriaCepillado = subcategoriaCepillado;
    }

    public String[] getSubcategoriaEdades() {
        return subcategoriaEdades;
    }

    public void setSubcategoriaEdades(String[] subcategoriaEdades) {
        this.subcategoriaEdades = subcategoriaEdades;
    }

    public String[] getSubcategoriaParidad() {
        return subcategoriaParidad;
    }

    public void setSubcategoriaParidad(String[] subcategoriaParidad) {
        this.subcategoriaParidad = subcategoriaParidad;
    }

    public String[] getSubcategoriaAnticoncepcion() {
        return subcategoriaAnticoncepcion;
    }

    public void setSubcategoriaAnticoncepcion(String[] subcategoriaAnticoncepcion) {
        this.subcategoriaAnticoncepcion = subcategoriaAnticoncepcion;
    }

    public String[] getSubcategoriaTerapiaHormonal() {
        return subcategoriaTerapiaHormonal;
    }

    public void setSubcategoriaTerapiaHormonal(String[] subcategoriaTerapiaHormonal) {
        this.subcategoriaTerapiaHormonal = subcategoriaTerapiaHormonal;
    }

    public String[] getSubcategoriaFechas() {
        return subcategoriaFechas;
    }

    public void setSubcategoriaFechas(String[] subcategoriaFechas) {
        this.subcategoriaFechas = subcategoriaFechas;
    }

    public String[] getSubcategoriaLiquidos() {
        return subcategoriaLiquidos;
    }

    public void setSubcategoriaLiquidos(String[] subcategoriaLiquidos) {
        this.subcategoriaLiquidos = subcategoriaLiquidos;
    }

    public String[] getSubcategoriaLavado() {
        return subcategoriaLavado;
    }

    public void setSubcategoriaLavado(String[] subcategoriaLavado) {
        this.subcategoriaLavado = subcategoriaLavado;
    }

    public String[] getSubcategoriaPaaf() {
        return subcategoriaPaaf;
    }

    public void setSubcategoriaPaaf(String[] subactegoriaPaaf) {
        this.subcategoriaPaaf = subactegoriaPaaf;
    }
 
    
    public List<Subcategoria> getSubcategorias() {
        return subcategorias;
    }

    public void setSubcategorias(List<Subcategoria> subcategorias) {
        this.subcategorias = subcategorias;
    }

    public String[] getCategoriasID() {
        return categoriasID;
    }

    public void setCategoriasID(String[] categoriasID) {
        this.categoriasID = categoriasID;
    }

    public String[] getSubcategoriaMaterial() {
        return subcategoriaMaterial;
    }

    public void setSubcategoriaMaterial(String[] subcategoriaMaterial) {
        this.subcategoriaMaterial = subcategoriaMaterial;
    }

  


    public List<Categoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(List<Categoria> categorias) {
        this.categorias = categorias;
    }
    
    
    
}
