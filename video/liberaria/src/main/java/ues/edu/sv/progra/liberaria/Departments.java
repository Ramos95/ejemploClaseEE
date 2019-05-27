/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ues.edu.sv.progra.liberaria;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author estuardo
 */
@Entity
@Table(name = "departments", catalog = "employees", schema = "", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"dept_name"})})
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Departments.findAll", query = "SELECT d FROM Departments d")
    , @NamedQuery(name = "Departments.findByDeptNo", query = "SELECT d FROM Departments d WHERE d.deptNo = :deptNo")
    , @NamedQuery(name = "Departments.findByDeptName", query = "SELECT d FROM Departments d WHERE d.deptName = :deptName")})
public class Departments implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "dept_no", nullable = false, length = 4)
    private String deptNo;
    @Basic(optional = false)
    @Column(name = "dept_name", nullable = false, length = 40)
    private String deptName;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "departments", fetch = FetchType.LAZY)
    private List<DeptEmp> deptEmpList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "departments", fetch = FetchType.LAZY)
    private List<DeptManager> deptManagerList;

    public Departments() {
    }

    public Departments(String deptNo) {
        this.deptNo = deptNo;
    }

    public Departments(String deptNo, String deptName) {
        this.deptNo = deptNo;
        this.deptName = deptName;
    }

    public String getDeptNo() {
        return deptNo;
    }

    public void setDeptNo(String deptNo) {
        this.deptNo = deptNo;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    @XmlTransient
    public List<DeptEmp> getDeptEmpList() {
        return deptEmpList;
    }

    public void setDeptEmpList(List<DeptEmp> deptEmpList) {
        this.deptEmpList = deptEmpList;
    }

    @XmlTransient
    public List<DeptManager> getDeptManagerList() {
        return deptManagerList;
    }

    public void setDeptManagerList(List<DeptManager> deptManagerList) {
        this.deptManagerList = deptManagerList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (deptNo != null ? deptNo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Departments)) {
            return false;
        }
        Departments other = (Departments) object;
        if ((this.deptNo == null && other.deptNo != null) || (this.deptNo != null && !this.deptNo.equals(other.deptNo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ues.edu.sv.progra.liberaria.Departments[ deptNo=" + deptNo + " ]";
    }
    
}
