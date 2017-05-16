package Model.JPA;

import Model.DAO.ContadoresTipoEstudioAnioDAO;
import Model.Entity.Contadorestipoestudioanio;

public class JPAContadoresTipoEstudioAnioDAO extends JPAGenericDAO<Contadorestipoestudioanio, Integer> implements ContadoresTipoEstudioAnioDAO {

    public JPAContadoresTipoEstudioAnioDAO() {
        super(Contadorestipoestudioanio.class);
    }
}
