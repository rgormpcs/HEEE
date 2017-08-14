/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.JPA;

import Model.DAO.EspecialidadDAO;
import Model.Entity.Especialidad;

/**
 *
 * @author wilmer.valdiviezo
 */
public class JPAEspecialidadDAO extends JPAGenericDAO<Especialidad, Integer> implements EspecialidadDAO{
    
    public JPAEspecialidadDAO() {
        super(Especialidad.class);
    }
    
}
