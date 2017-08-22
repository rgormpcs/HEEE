package Model.JPA;

import Model.Entity.Estudioshistoquimica;
import Model.DAO.EstudiosHistoquimicaDAO;

public class JPAEstudiosHistoquimicaDAO extends JPAGenericDAO<Estudioshistoquimica, Integer> implements EstudiosHistoquimicaDAO {

    public JPAEstudiosHistoquimicaDAO() {
        super(Estudioshistoquimica.class);
    }

}
