/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gbond.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
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
@SequenceGenerator(name = "du_seq", sequenceName = "du_seq", initialValue = 1, allocationSize=1)
@XmlRootElement
//@XmlType(propOrder={"unit_name"})
@XmlAccessorType(XmlAccessType.FIELD)
public class DataUnits implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "du_seq")
      @XmlTransient
    private Long id;
    
    @XmlElement
    private String unit_name;

     @XmlTransient
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

   
    public String getUnit_name() {
        return unit_name;
    }

    public void setUnit_name(String unit_name) {
        this.unit_name = unit_name;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + (this.id != null ? this.id.hashCode() : 0);
        hash = 97 * hash + (this.unit_name != null ? this.unit_name.hashCode() : 0);
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
        final DataUnits other = (DataUnits) obj;
        if (this.id != other.id) {
            return false;
        }
        if ((this.unit_name == null) ? (other.unit_name != null) : !this.unit_name.equals(other.unit_name)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return  unit_name ;
    }

     
}
