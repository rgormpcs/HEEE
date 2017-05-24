package Model.JPA;

import Model.DAO.CategoriaDAO;
import Model.Entity.Categoria;
import Model.Entity.Subcategoria;
import java.util.List;
import javax.persistence.Query;

public class JPACategoriaDAO extends JPAGenericDAO<Categoria, Integer> implements CategoriaDAO {

    public JPACategoriaDAO() {
        super(Categoria.class);
    }

    @Override
    public List<Categoria> buscarCategoriaPorID(String idTec) {
             List categoriaSeleccionada = null;
        try {
            String consulta = "select * from categoria where idtec=" + idTec;
            Query query = em.createNativeQuery(consulta, Categoria.class);
            categoriaSeleccionada = query.getResultList();
        } catch (Exception e) {
            System.out.println("error en la consulta SQL en categoria");
        }
        return categoriaSeleccionada;
    }
    
}
