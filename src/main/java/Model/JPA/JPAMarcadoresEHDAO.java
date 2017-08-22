package Model.JPA;

import Model.DAO.MarcadoresEHDAO;
import Model.Entity.Marcadoreseh;

public class JPAMarcadoresEHDAO extends JPAGenericDAO<Marcadoreseh, Integer> implements MarcadoresEHDAO {

    public JPAMarcadoresEHDAO() {
        super(Marcadoreseh.class);
    }
}
