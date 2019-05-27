/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ues.edu.sv.progra.beans;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import ues.edu.sv.progra.liberaria.Titles;

/**
 *
 * @author estuardo
 */
@Stateless
public class TitlesFacade extends AbstractFacade<Titles> implements TitlesFacadeLocal {

    @PersistenceContext(unitName = "ues.edu.sv.progra_Beans_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TitlesFacade() {
        super(Titles.class);
    }
    
}
