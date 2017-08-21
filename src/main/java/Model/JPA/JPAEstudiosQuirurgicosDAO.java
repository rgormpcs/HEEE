package Model.JPA;

import Model.DAO.EstudiosQuirurgicosDAO;
import Model.Entity.Estudiosquirurgicos;

public class JPAEstudiosQuirurgicosDAO extends JPAGenericDAO <Estudiosquirurgicos, Integer> implements EstudiosQuirurgicosDAO{
    
    public JPAEstudiosQuirurgicosDAO(){
        super(Estudiosquirurgicos.class);
    }
}
