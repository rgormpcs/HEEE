package Model.JPA;

import Model.DAO.EstudiosAmputacionesDAO;
import Model.Entity.Estudiosamputaciones;

public class JPAEstudiosAmputacionesDAO extends JPAGenericDAO <Estudiosamputaciones, Integer> implements EstudiosAmputacionesDAO {

    public JPAEstudiosAmputacionesDAO() {
        super(Estudiosamputaciones.class);
    }
}
