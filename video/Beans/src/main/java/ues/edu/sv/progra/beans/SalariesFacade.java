/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ues.edu.sv.progra.beans;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import ues.edu.sv.progra.liberaria.Salaries;

/**
 *
 * @author estuardo
 */
@Stateless
public class SalariesFacade extends AbstractFacade<Salaries> implements SalariesFacadeLocal {

    @PersistenceContext(unitName = "ues.edu.sv.progra_Beans_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public SalariesFacade() {
        super(Salaries.class);
    }
    
}
