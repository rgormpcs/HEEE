package Model.JPA;

import Model.DAO.ProvinciaDAO;
import Model.Entity.Provincia;

public class JPAProvinciaDAO extends JPAGenericDAO<Provincia, Integer> implements ProvinciaDAO {

    public JPAProvinciaDAO() {
        super(Provincia.class);
    }
}
