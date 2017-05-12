package Model.JPA;

import Model.DAO.PacienteDAO;
import Model.Entity.Paciente;

public class JPAPacienteDAO extends JPAGenericDAO<Paciente, Integer> implements PacienteDAO{
    
    public JPAPacienteDAO(){
        super(Paciente.class);
    }
}
