package Model.JPA;

import Model.DAO.UsuarioDAO;
import Model.Entity.Usuario;

public class JPAUsuarioDAO extends JPAGenericDAO<Usuario, Integer> implements UsuarioDAO {

    public JPAUsuarioDAO() {
        super(Usuario.class);
    }
}
