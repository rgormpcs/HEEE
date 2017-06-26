package Model.DAO;

import Model.Entity.Subcategoria;
import java.util.List;
/*                                              Nombre de la TABLA, atributo incrementable*/
public interface SubcategoriaDAO extends GenericDAO<Subcategoria, Integer>{
    List<Subcategoria> buscarSubcategoriaPorID(String idCategoria);
    
}
