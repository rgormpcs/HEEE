package Model.JPA;

import Model.DAO.CantonDAO;

import Model.DAO.EmpleadoDAO;
import Model.DAO.ExtremidadDAO;

import Model.DAO.FactoryDAO;
import Model.DAO.MenuDAO;
import Model.DAO.ParroquiaDAO;
import Model.DAO.ParteDAO;
import Model.DAO.ProvinciaDAO;

import Model.DAO.UsuarioDAO;

/*Esta clase es una extención de la clase FactoryDAO, en donde se relaciona la entidad de la clase DAO
con el JPA*/
public class JPAFactoryDAO extends FactoryDAO {
    
    @Override        
    public EmpleadoDAO getEmpleadoDAO() {
        return new JPAEmpleadoDAO();
    }
 
    @Override        
    public UsuarioDAO getUsuarioDAO() {
        return new JPAUsuarioDAO();
    }

    @Override
    public MenuDAO getMenuDAO() {
        return new JPAMenuDAO();
    }

    @Override
    public ProvinciaDAO getProvinciaDAO() {
        return new JPAProvinciaDAO();
    }

    @Override
    public CantonDAO getCantonDAO() {
        return new JPACantonDAO();
    }

    @Override
    public ParroquiaDAO getParroquiaDAO() {
        return new JPAParroquiaDAO();
    }

    @Override
    public ExtremidadDAO getExtremidadDAO() {
        return new JPAExtremidadDAO();
    }

    @Override
    public ParteDAO getParteDAO() {
        return new JPAParteDAO();
    }


   
   
    
    
}
