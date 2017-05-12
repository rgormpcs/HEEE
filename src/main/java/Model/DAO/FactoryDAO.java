package Model.DAO;

import Model.JPA.JPAFactoryDAO;

/*En esta clase abstracta se hace la invocación de cada una de las entidades DAO*/
/*Invocación a todas las DAO Entidades, se debe crear por cada una de las Entidades una Factory y un DAO*/
public abstract class FactoryDAO {

    protected static FactoryDAO factory = new JPAFactoryDAO();

    public static FactoryDAO getFactory() {
        return factory;
    }
    
    /*Por cada tabla que se tiene se debe de crear una clase DAO*/
    /*              NombreEntidadDAO  getXXXDAO();*/
    public abstract EmpleadoDAO getEmpleadoDAO();
    public abstract UsuarioDAO getUsuarioDAO();
    public abstract MenuDAO getMenuDAO();
    
    //cabecera del estudio
    public abstract HospitalDAO getHospitalDAO();
    public abstract DoctorDAO getDoctorDAO();
    public abstract PacienteDAO getPacienteDAO();
    public abstract CabecerarecepcionmuestraDAO getCabecerarecepcionmuestraDAO();
    //public abstract DetallerecepcionmuestraDAO getDetallerecepcionmuestraDAO();
    

    //estudio amputaciones
    
    public abstract ProvinciaDAO getProvinciaDAO();
    public abstract CantonDAO getCantonDAO();
    public abstract ParroquiaDAO getParroquiaDAO();
    

}
