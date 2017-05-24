package Model.DAO;

import Model.Entity.Parroquia;
import java.util.List;

/*                                              Nombre de la TABLA, atributo incrementable*/
public interface ParroquiaDAO extends GenericDAO<Parroquia, Integer> {

    List<Parroquia> buscarParroquiaPorCanton(String idCanton);
}
