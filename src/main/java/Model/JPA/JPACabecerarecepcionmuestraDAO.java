package Model.JPA;

import Model.DAO.CabecerarecepcionmuestraDAO;
import Model.Entity.Cabecerarecepcionmuestra;

public class JPACabecerarecepcionmuestraDAO extends JPAGenericDAO<Cabecerarecepcionmuestra, Integer> implements CabecerarecepcionmuestraDAO{
    
    public JPACabecerarecepcionmuestraDAO(){
        super(Cabecerarecepcionmuestra.class);
    }
    
}
