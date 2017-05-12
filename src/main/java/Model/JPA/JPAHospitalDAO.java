package Model.JPA;

import Model.DAO.HospitalDAO;
import Model.Entity.Hospital;

public class JPAHospitalDAO extends JPAGenericDAO<Hospital, Integer> implements HospitalDAO{
    
    public JPAHospitalDAO(){
        super(Hospital.class);
    }
    
}
