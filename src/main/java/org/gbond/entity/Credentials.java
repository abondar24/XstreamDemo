/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gbond.entity;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author abondar
 */
@Entity
@SequenceGenerator(name = "cr_seq", sequenceName = "cr_seq", initialValue = 1, allocationSize=1)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Credentials implements Serializable  {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "cr_seq")
     @XmlTransient
    private Long id;
    
    
    private String username;
    private String password;
    private Boolean netflowPolice;
    private String position;
    @XmlElement
    private String firstName;
    @XmlElement
    private String lastName;

    public Credentials() {
    }
    
    
    
    @XmlTransient
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    
    
    
    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean isNetflowPolice() {
        return netflowPolice;
    }

    public void setNetflowPolice(Boolean netflowPolice) {
        this.netflowPolice = netflowPolice;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + (this.id != null ? this.id.hashCode() : 0);
        hash = 97 * hash + (this.username != null ? this.username.hashCode() : 0);
        hash = 97 * hash + (this.password != null ? this.password.hashCode() : 0);
        hash = 97 * hash + (this.netflowPolice != null ? this.netflowPolice.hashCode() : 0);
        hash = 97 * hash + (this.position != null ? this.position.hashCode() : 0);
        hash = 97 * hash + (this.firstName != null ? this.firstName.hashCode() : 0);
        hash = 97 * hash + (this.lastName != null ? this.lastName.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Credentials other = (Credentials) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.username, other.username)) {
            return false;
        }
        if (!Objects.equals(this.password, other.password)) {
            return false;
        }
        if (!Objects.equals(this.netflowPolice, other.netflowPolice)) {
            return false;
        }
        if (!Objects.equals(this.position, other.position)) {
            return false;
        }
        if (!Objects.equals(this.firstName, other.firstName)) {
            return false;
        }
        if (!Objects.equals(this.lastName, other.lastName)) {
            return false;
        }
        return true;
    }

    
    @Override
    public String toString() {
        return  firstName + " " +lastName;
    }
    
    
    
}
