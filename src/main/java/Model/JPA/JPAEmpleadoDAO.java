package Model.JPA;

import Model.DAO.EmpleadoDAO;
import Model.Entity.Empleado;

public class JPAEmpleadoDAO extends JPAGenericDAO<Empleado, Integer> implements EmpleadoDAO {

    public JPAEmpleadoDAO() {
        super(Empleado.class);
    }
}
