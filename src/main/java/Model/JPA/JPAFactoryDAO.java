package Model.JPA;

import Model.DAO.CabecerarecepcionmuestraDAO;
import Model.DAO.CantonDAO;
import Model.DAO.DetallerecepcionmuestraDAO;
import Model.DAO.DoctorDAO;
import Model.DAO.EmpleadoDAO;

import Model.DAO.FactoryDAO;
import Model.DAO.HospitalDAO;
import Model.DAO.MenuDAO;
import Model.DAO.PacienteDAO;
import Model.DAO.ParroquiaDAO;
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
    public HospitalDAO getHospitalDAO(){
        return new JPAHospitalDAO();
    }
    
    @Override
    public DoctorDAO getDoctorDAO(){
        return new JPADoctorDAO();
    }
    
    @Override
    public PacienteDAO getPacienteDAO(){
        return new JPAPacienteDAO();
    }
    
    @Override
    public CabecerarecepcionmuestraDAO getCabecerarecepcionmuestraDAO(){
        return new JPACabecerarecepcionmuestraDAO();
    }
    
    /*
    @Override
    public DetallerecepcionmuestraDAO getDetallerecepcionmuestraDAO(){
        return new JPADetallerecepcionmuestraDAO();
    }
    */
    
}
