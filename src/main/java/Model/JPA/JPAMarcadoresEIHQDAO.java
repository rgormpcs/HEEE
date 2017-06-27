package Model.JPA;

import Model.DAO.MarcadoresEIHQDAO;
import Model.DAO.ProvinciaDAO;
import Model.Entity.Marcadoreseihq;

public class JPAMarcadoresEIHQDAO extends JPAGenericDAO<Marcadoreseihq, Integer> implements MarcadoresEIHQDAO {

    public JPAMarcadoresEIHQDAO() {
        super(Marcadoreseihq.class);
    }
}
