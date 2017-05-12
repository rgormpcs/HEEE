package Model.DAO;


import Model.Entity.Partes;
import java.util.List;



/*                                              Nombre de la TABLA, atributo incrementable*/
public interface ParteDAO extends GenericDAO<Partes, Integer>{
    
    public List<Partes> buscarPartePorExtremidad(String idExtremidad);
    
}
