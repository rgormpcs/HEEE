package Model.JPA;

import Model.DAO.DoctorDAO;
import Model.Entity.Doctor;

public class JPADoctorDAO extends JPAGenericDAO<Doctor, Integer> implements DoctorDAO {

    public JPADoctorDAO() {
        super(Doctor.class);
    }
    
}
