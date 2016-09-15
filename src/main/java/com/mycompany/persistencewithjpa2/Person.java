/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.persistencewithjpa2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;

/**
 *
 * @author jakob
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Person implements Serializable
{

    public Person()
    {
        
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

    public Person getSupervisor()
    {
        return supervisor;
    }

    public void setSupervisor(Person supervisor)
    {
        this.supervisor = supervisor;
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

    String firstName;
    String lastName;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    Date birthDate;
    
    int age;
    boolean isMarried;
    @ManyToOne
    private Person supervisor;
    @OneToMany(mappedBy = "supervisor")
            List<Person> supervised = new ArrayList<>();
    
    @OneToMany
    List<Grade> grades = new ArrayList<>();
    
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
        if (!(object instanceof Person))
        {
            return false;
        }
        Person other = (Person) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)))
        {
            return false;
        }
        return true;
    }

    @Override
    public String toString()
    {
        return "com.mycompany.persistencewithjpa2.Person[ id=" + id + " ]";
    }
    
}
