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
@SequenceGenerator(name = "dt_seq", sequenceName = "dt_seq", initialValue = 1, allocationSize=1)
@XmlRootElement
//@XmlType(propOrder={"datatype_name"})
@XmlAccessorType(XmlAccessType.FIELD)
public class DataType implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "dt_seq")
      @XmlTransient
    private Long id;
    
    @XmlElement
    private String datatype_name;

  
  
      @XmlTransient
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

   
    public String getDatatype_name() {
        return datatype_name;
    }

    public void setDatatype_name(String datatype_name) {
        this.datatype_name = datatype_name;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + (this.id != null ? this.id.hashCode() : 0);
        hash = 59 * hash + (this.datatype_name != null ? this.datatype_name.hashCode() : 0);
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
        final DataType other = (DataType) obj;
        if (this.id != other.id) {
            return false;
        }
        if ((this.datatype_name == null) ? (other.datatype_name != null) : !this.datatype_name.equals(other.datatype_name)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return datatype_name ;
    }

   
    
}
