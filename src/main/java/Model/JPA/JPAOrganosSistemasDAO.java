package Model.JPA;

import Model.DAO.OrganosSistemasDAO;
import Model.Entity.Organossistemas;

public class JPAOrganosSistemasDAO extends JPAGenericDAO<Organossistemas, Integer> implements OrganosSistemasDAO {

    public JPAOrganosSistemasDAO() {
        super(Organossistemas.class);
    }
}
