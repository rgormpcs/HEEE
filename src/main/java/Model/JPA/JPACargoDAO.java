/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.JPA;

import Model.DAO.CargoDAO;
import Model.Entity.Cargo;

/**
 *
 * @author wilmer.valdiviezo
 */
public class JPACargoDAO extends JPAGenericDAO<Cargo, Integer> implements CargoDAO{
    
    public JPACargoDAO() {
        super(Cargo.class);
    }
    
}
