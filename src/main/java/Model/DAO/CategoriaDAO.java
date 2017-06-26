package Model.DAO;

import Model.Entity.Categoria;
import java.util.List;
/*                                              Nombre de la TABLA, atributo incrementable*/
public interface CategoriaDAO extends GenericDAO<Categoria, Integer>{
    
    List<Categoria> buscarCategoriaPorID(String idTec);
}
