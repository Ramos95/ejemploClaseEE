/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ues.edu.sv.progra.beans;

import java.util.List;
import javax.ejb.Local;
import ues.edu.sv.progra.liberaria.Salaries;

/**
 *
 * @author estuardo
 */
@Local
public interface SalariesFacadeLocal {

    void create(Salaries salaries);

    void edit(Salaries salaries);

    void remove(Salaries salaries);

    Salaries find(Object id);

    List<Salaries> findAll();

    List<Salaries> findRange(int[] range);

    int count();
    
}
