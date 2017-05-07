package Model.JPA;

import Model.DAO.ParroquiaDAO;
import Model.Entity.Canton;
import Model.Entity.Parroquia;
import java.util.List;
import javax.persistence.Query;

public class JPAParroquiaDAO extends JPAGenericDAO<Parroquia, Integer> implements ParroquiaDAO {

    public JPAParroquiaDAO() {
        super(Parroquia.class);
    }

    @Override
    public List<Parroquia> buscarParroquiaPorCanton(String idCanton) {
        List parroquiaSeleccionada = null;
        try {
            String consulta = "select * from parroquia where idcanton=" + idCanton;
            Query query = em.createNativeQuery(consulta, Parroquia.class);
            parroquiaSeleccionada = query.getResultList();
        } catch (Exception e) {
            System.out.println("error en la consulta SQL en canton");
        }
        return parroquiaSeleccionada;
    }

}
