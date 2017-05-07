package Model.JPA;

import Model.DAO.MenuDAO;
import Model.Entity.Menu;

public class JPAMenuDAO extends JPAGenericDAO<Menu, Integer> implements MenuDAO {

    public JPAMenuDAO() {
        super(Menu.class);
    }
}
