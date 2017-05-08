package Model.JPA;

import Model.DAO.CantonDAO;
import Model.Entity.Canton;
import java.util.List;
import javax.persistence.Query;

public class JPACantonDAO extends JPAGenericDAO<Canton, Integer> implements CantonDAO {

    public JPACantonDAO() {
        super(Canton.class);
    }
   
    @Override
	public List<Canton> buscarCantonPorProvincia(String idProvincia){
	List cantonSeleccionado=null;
        try{
        String consulta="select * from canton where idprovincia="+idProvincia;
        Query query = em.createNativeQuery(consulta, Canton.class);
        cantonSeleccionado=query.getResultList();
            }catch(Exception e){
        System.out.println("error en la consulta SQL en canton");
            }
            return cantonSeleccionado;		
	}
}
