package Model.JPA;

import Model.DAO.MarcadoresParteEHDAO;
import Model.Entity.MarcadorEsParteDeEh;

public class JPAMarcadoresParteEHDAO extends JPAGenericDAO<MarcadorEsParteDeEh, Integer> implements MarcadoresParteEHDAO {

    public JPAMarcadoresParteEHDAO() {
        super(MarcadorEsParteDeEh.class);
    }
}
