/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.persistencewithjpa2;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author jakob
 */
@Entity
public class Employee extends Person implements Serializable
{

    int soSecNr;
    public Employee()
    {
        
    }
    public int getSoSecNr()
    {
        return soSecNr;
    }

    public void setSoSecNr(int soSecNr)
    {
        this.soSecNr = soSecNr;
    }

    public float getWage()
    {
        return wage;
    }

    public void setWage(float wage)
    {
        this.wage = wage;
    }

    public String getTaxClass()
    {
        return taxClass;
    }

    public void setTaxClass(String taxClass)
    {
        this.taxClass = taxClass;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public Date getBirthDate()
    {
        return birthDate;
    }

    public void setBirthDate(Date birthDate)
    {
        this.birthDate = birthDate;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public boolean isIsMarried()
    {
        return isMarried;
    }

    public void setIsMarried(boolean isMarried)
    {
        this.isMarried = isMarried;
    }

    public List<Person> getSupervised()
    {
        return supervised;
    }

    public void setSupervised(List<Person> supervised)
    {
        this.supervised = supervised;
    }

    public List<Grade> getGrades()
    {
        return grades;
    }

    public void setGrades(List<Grade> grades)
    {
        this.grades = grades;
    }
    float wage;
    String taxClass;
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    @Override
    public int hashCode()
    {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object)
    {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Employee))
        {
            return false;
        }
        Employee other = (Employee) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)))
        {
            return false;
        }
        return true;
    }

    @Override
    public String toString()
    {
        return "com.mycompany.persistencewithjpa2.Employee[ id=" + id + " ]";
    }
    
}
