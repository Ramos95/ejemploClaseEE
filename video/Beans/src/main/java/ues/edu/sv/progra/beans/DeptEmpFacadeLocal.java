/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ues.edu.sv.progra.beans;

import java.util.List;
import javax.ejb.Local;
import ues.edu.sv.progra.liberaria.DeptEmp;

/**
 *
 * @author estuardo
 */
@Local
public interface DeptEmpFacadeLocal {

    void create(DeptEmp deptEmp);

    void edit(DeptEmp deptEmp);

    void remove(DeptEmp deptEmp);

    DeptEmp find(Object id);

    List<DeptEmp> findAll();

    List<DeptEmp> findRange(int[] range);

    int count();
    
}
