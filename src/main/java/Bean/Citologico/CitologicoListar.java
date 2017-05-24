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

    
    
    private String [] categoriasID1;
    private String [] categoriasID2;
    private String [] categoriasID3;
    private String [] categoriasID4;
    private String [] categoriasID5;
    private String [] categoriasID6;
    private String [] categoriasID7;
    private String [] categoriasID8;
    private String [] categoriasID9;
    private String [] categoriasID10;
    private String [] categoriasID11;
    private String [] categoriasID12;
    private String [] categoriasID13;
    
    private String [] subcategoriaID;
    private List<Categoria> categorias;
    private List<Subcategoria> subcategorias;
    private List<SelectItem> cars;
        private String[] selectedCars;
    /**
     * Creates a new instance of NewJSFManagedBean
     */
    public CitologicoListar() {
        
        categorias=null;
        
        
    }
    
    public List<Categoria> listarCategoria(String idTec){
// 

    String [] idtecValor={"2"};
    String [] idtec={"idtec"};
    
//    categorias=JPAFactoryDAO.getFactory().getCategoriaDAO().find(idtec,idtecValor);
categorias=JPAFactoryDAO.getFactory().getCategoriaDAO().buscarCategoriaPorID(idTec);
    return categorias;
    }
    public List<Subcategoria> listarSubcategoria(String categoriaID){
       String []categoriaValor={categoriaID};
       String []categoria={"idcategoria"};
    subcategorias=JPAFactoryDAO.getFactory().getSubcategoriaDAO().buscarSubcategoriaPorID(categoriaID);
    return subcategorias;
    }
    
    
    public String[] getSelectedCars() {
        return selectedCars;
    }

    //getter and setter
    public void setSelectedCars(String[] selectedCars) {    
        this.selectedCars = selectedCars;
    }

    public List<SelectItem> getCars() {
        return cars;
    }

    /*
    prueba
     */
    public void setCars(List<SelectItem> cars) {
        this.cars = cars;
    }    

    //fin prueba
    public String[] getSubcategoriaID() {
        return subcategoriaID;
    }

    public void setSubcategoriaID(String[] subcategoriaID) {
        this.subcategoriaID = subcategoriaID;
    }

    public List<Subcategoria> getSubcategorias() {
        return subcategorias;
    }

    public void setSubcategorias(List<Subcategoria> subcategorias) {
        this.subcategorias = subcategorias;
    }

    
    
  ///variables decombos categoria

    public String[] getCategoriasID1() {
        return categoriasID1;
    }

    public void setCategoriasID1(String[] categoriasID1) {
        this.categoriasID1 = categoriasID1;
    }

    public String[] getCategoriasID2() {
        return categoriasID2;
    }

    public void setCategoriasID2(String[] categoriasID2) {
        this.categoriasID2 = categoriasID2;
    }

    public String[] getCategoriasID3() {
        return categoriasID3;
    }

    public void setCategoriasID3(String[] categoriasID3) {
        this.categoriasID3 = categoriasID3;
    }

    public String[] getCategoriasID4() {
        return categoriasID4;
    }

    public void setCategoriasID4(String[] categoriasID4) {
        this.categoriasID4 = categoriasID4;
    }

    public String[] getCategoriasID5() {
        return categoriasID5;
    }

    public void setCategoriasID5(String[] categoriasID5) {
        this.categoriasID5 = categoriasID5;
    }

    public String[] getCategoriasID6() {
        return categoriasID6;
    }

    public void setCategoriasID6(String[] categoriasID6) {
        this.categoriasID6 = categoriasID6;
    }

    public String[] getCategoriasID7() {
        return categoriasID7;
    }

    public void setCategoriasID7(String[] categoriasID7) {
        this.categoriasID7 = categoriasID7;
    }

    public String[] getCategoriasID8() {
        return categoriasID8;
    }

    public void setCategoriasID8(String[] categoriasID8) {
        this.categoriasID8 = categoriasID8;
    }

    public String[] getCategoriasID9() {
        return categoriasID9;
    }

    public void setCategoriasID9(String[] categoriasID9) {
        this.categoriasID9 = categoriasID9;
    }

    public String[] getCategoriasID10() {
        return categoriasID10;
    }

    public void setCategoriasID10(String[] categoriasID10) {
        this.categoriasID10 = categoriasID10;
    }

    public String[] getCategoriasID11() {
        return categoriasID11;
    }

    public void setCategoriasID11(String[] categoriasID11) {
        this.categoriasID11 = categoriasID11;
    }

    public String[] getCategoriasID12() {
        return categoriasID12;
    }

    public void setCategoriasID12(String[] categoriasID12) {
        this.categoriasID12 = categoriasID12;
    }

    public String[] getCategoriasID13() {
        return categoriasID13;
    }

    public void setCategoriasID13(String[] categoriasID13) {
        this.categoriasID13 = categoriasID13;
    }
    
    
    
    
    //


    public List<Categoria> getCategorias() {
        return categorias;
    }

    public void setCategorias(List<Categoria> categorias) {
        this.categorias = categorias;
    }
    
    
    
}
