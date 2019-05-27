/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ues.edu.sv.progra.beans;

import java.util.List;
import javax.ejb.Local;
import ues.edu.sv.progra.liberaria.Titles;

/**
 *
 * @author estuardo
 */
@Local
public interface TitlesFacadeLocal {

    void create(Titles titles);

    void edit(Titles titles);

    void remove(Titles titles);

    Titles find(Object id);

    List<Titles> findAll();

    List<Titles> findRange(int[] range);

    int count();
    
}
