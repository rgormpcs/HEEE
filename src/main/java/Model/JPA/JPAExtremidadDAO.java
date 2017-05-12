package Model.JPA;


import Model.DAO.ExtremidadDAO;
import Model.Entity.Extremidades;

public class JPAExtremidadDAO extends JPAGenericDAO<Extremidades, Integer> implements ExtremidadDAO {

    public JPAExtremidadDAO() {
        super(Extremidades.class);
    }
   
}
