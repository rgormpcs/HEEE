package Model.JPA;

import Model.DAO.SubtipoDAO;
import Model.Entity.Subtipo;

public class JPASubtipoDAO extends JPAGenericDAO<Subtipo, Integer> implements SubtipoDAO {

    public JPASubtipoDAO() {
        super(Subtipo.class);
    }
}
