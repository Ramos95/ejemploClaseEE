/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ues.edu.sv.progra.beans;

import java.util.List;
import javax.ejb.Local;
import ues.edu.sv.progra.liberaria.DeptManager;

/**
 *
 * @author estuardo
 */
@Local
public interface DeptManagerFacadeLocal {

    void create(DeptManager deptManager);

    void edit(DeptManager deptManager);

    void remove(DeptManager deptManager);

    DeptManager find(Object id);

    List<DeptManager> findAll();

    List<DeptManager> findRange(int[] range);

    int count();
    
}
