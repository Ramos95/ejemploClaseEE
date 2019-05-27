/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ues.edu.sv.progra.webapp;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.inject.Named;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import ues.edu.sv.progra.beans.EmployeesFacadeLocal;
import ues.edu.sv.progra.liberaria.Employees;

/**
 *
 * @author estuardo
 */
@Named(value = "fmrEmpleado")
@ViewScoped
public class fmrEmpleado implements Serializable{

    /**
     * Creates a new instance of fmrEmpleado
     */
    @Inject
    private EmployeesFacadeLocal facade;
    
    private Employees employee = new Employees();
    
    private int emp_no;
    private Date bitrh_date;
    private String first_name;
    private String last_name;
    private String gender;
    private Date hire_Date;
    
    
    
    public fmrEmpleado() {
    }
    
    public List<Employees> todo(){
        return facade.findAll();
    }
    
    public String agregar(){        
        this.employee.setEmpNo(emp_no);
        this.employee.setBirthDate(bitrh_date);
        this.employee.setFirstName(first_name);
        this.employee.setLastName(last_name);
        this.employee.setGender(gender);
        this.employee.setHireDate(hire_Date);
        
        this.facade.create(employee);

        return "tabla.jsf?faces-redirect=true";
    }

    public int getEmp_no() {
        return emp_no;
    }

    public void setEmp_no(int emp_no) {
        this.emp_no = emp_no;
    }

    public Date getBitrh_date() {
        return bitrh_date;
    }

    public void setBitrh_date(Date bitrh_date) {
        this.bitrh_date = bitrh_date;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getHire_Date() {
        return hire_Date;
    }

    public void setHire_Date(Date hire_Date) {
        this.hire_Date = hire_Date;
    }
    
    
    
}
