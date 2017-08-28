package Model.JPA;

import Model.DAO.MarcadoresParteEHPkDAO;
import Model.Entity.MarcadorEsParteDeEhPK;

public class JPAMarcadoresParteEHPkDAO extends JPAGenericDAO<MarcadorEsParteDeEhPK, Integer> implements MarcadoresParteEHPkDAO {

    public JPAMarcadoresParteEHPkDAO() {
        super(MarcadorEsParteDeEhPK.class);
    }
}
