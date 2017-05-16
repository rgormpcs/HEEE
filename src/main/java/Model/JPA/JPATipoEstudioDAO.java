package Model.JPA;

import Model.DAO.TipoEstudioDAO;
import Model.Entity.Tipoestudio;

public class JPATipoEstudioDAO extends JPAGenericDAO<Tipoestudio, Integer> implements TipoEstudioDAO {

    public JPATipoEstudioDAO() {
        super(Tipoestudio.class);
    }
}
