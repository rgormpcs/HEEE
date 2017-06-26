package Model.JPA;

import Model.DAO.SubcategoriaDAO;

import Model.Entity.Subcategoria;
import java.util.List;
import javax.persistence.Query;

public class JPASubcategoriaDAO extends JPAGenericDAO<Subcategoria, Integer> implements SubcategoriaDAO {

    public JPASubcategoriaDAO() {
        super(Subcategoria.class);
    }

    @Override
    public List<Subcategoria> buscarSubcategoriaPorID(String idCategoria) {
          List subcategoriaSeleccionada = null;
        try {
            String consulta = "select * from subcategoria where idcategoria=" + idCategoria;
            Query query = em.createNativeQuery(consulta, Subcategoria.class);
            subcategoriaSeleccionada = query.getResultList();
        } catch (Exception e) {
            System.out.println("error en la consulta SQL en subcategoria");
        }
        return subcategoriaSeleccionada;
    }
}
    