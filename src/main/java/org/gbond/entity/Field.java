/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gbond.entity;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import java.io.Serializable;
import java.lang.ref.Reference;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author abondar
 */
@Entity
@SequenceGenerator(name = "req_seq", sequenceName = "req_seq", initialValue = 1, allocationSize=1)
@XmlRootElement
@XmlSeeAlso({Credentials.class,DataType.class,DataUnits.class,Platform.class,Reference.class,Semantics.class,Status.class})
//@XmlType(propOrder={"listId","customer","ShopList"})
@XmlAccessorType(XmlAccessType.FIELD)
@XStreamAlias("fieldDefinitions")
public class Field implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "req_seq")
    @XmlElement
    private Long id;
    @XmlElement
    private String name;
    @XmlElement
    private String description;
    @XmlElement
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateTime;
    
    @XmlElement
    private Integer netflowID;

    @ManyToOne( targetEntity = Status.class  )
    @XmlElement
    private Status status; 
    
    
    @ManyToOne(targetEntity = DataType.class)
    @XmlElement
    private DataType dataType;
    

    @ManyToOne(targetEntity = Semantics.class )
    @XmlElement
    private Semantics semantics ;
    
    
    @ManyToOne(targetEntity = DataUnits.class )
    @XmlElement
    private DataUnits dataUnits ;
   
    
    @ManyToOne(targetEntity = Credentials.class )
    @XmlElement
    private Credentials credentials ;
   
    
  
   
    @ManyToOne(targetEntity = Platform.class)
    @XmlElement
    private Platform platform;
    
  
    
   
    @XmlElement
    private String reference ;
    
    
    @XmlTransient
    private Boolean validated;

    public Integer getNetflowID() {
        return netflowID;
    }

    public void setNetflowID(Integer netflowID) {
        this.netflowID = netflowID;
    }

   public String getName() {
        return name;
    }

    public void setName(String Name) {
        this.name = Name;
    }

   
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

   
    public String getDescription() {
        return description;
    }

    public void setDescription(String Description) {
        this.description = Description;
    }
    

    
    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

   
    public Status getStatus() {
        return status;
    }
    public void setStatus(Status status) {
        this.status = status;
    }

    public DataType getDataType() {
        return dataType;
    }
 public void setDataType(DataType dataType) {
        this.dataType = dataType;
    }

   
    public Semantics getSemantics() {
        return semantics;
    }

    public void setSemantics(Semantics semantics) {
        this.semantics = semantics;
    }

   
    public DataUnits getDataUnits() {
        return dataUnits;
    }

    public void setDataUnits(DataUnits dataUnits) {
        this.dataUnits = dataUnits;
    }

    
   
    public Platform getPlatform() {
        return platform;
    }

    public void setPlatform(Platform platform) {
        this.platform = platform;
    }

    @XmlTransient
    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

  
    public Boolean isValidated() {
        return validated;
    }

    public void setValidated(Boolean validated) {
        this.validated = validated;
    }

    public Credentials getCredentials() {
        return credentials;
    }

    public void setCredentials(Credentials credentials) {
        this.credentials = credentials;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + (this.id != null ? this.id.hashCode() : 0);
        hash = 37 * hash + (this.name != null ? this.name.hashCode() : 0);
        hash = 37 * hash + (this.description != null ? this.description.hashCode() : 0);
        hash = 37 * hash + (this.updateTime != null ? this.updateTime.hashCode() : 0);
        hash = 37 * hash + (this.netflowID != null ? this.netflowID.hashCode() : 0);
        hash = 37 * hash + (this.status != null ? this.status.hashCode() : 0);
        hash = 37 * hash + (this.dataType != null ? this.dataType.hashCode() : 0);
        hash = 37 * hash + (this.semantics != null ? this.semantics.hashCode() : 0);
        hash = 37 * hash + (this.dataUnits != null ? this.dataUnits.hashCode() : 0);
        hash = 37 * hash + (this.credentials != null ? this.credentials.hashCode() : 0);
        hash = 37 * hash + (this.platform != null ? this.platform.hashCode() : 0);
        hash = 37 * hash + (this.reference != null ? this.reference.hashCode() : 0);
        hash = 37 * hash + (this.validated != null ? this.validated.hashCode() : 0);
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
        final Field other = (Field) obj;
        if (!this.id.equals(other.id) && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.updateTime, other.updateTime)) {
            return false;
        }
        if (!Objects.equals(this.netflowID, other.netflowID)) {
            return false;
        }
        if (!Objects.equals(this.status, other.status)) {
            return false;
        }
        if (!Objects.equals(this.dataType, other.dataType)) {
            return false;
        }
        if (!Objects.equals(this.semantics, other.semantics)) {
            return false;
        }
        if (!Objects.equals(this.dataUnits, other.dataUnits)) {
            return false;
        }
        if (!Objects.equals(this.credentials, other.credentials)) {
            return false;
        }
        if (!Objects.equals(this.platform, other.platform)) {
            return false;
        }
        if (!Objects.equals(this.reference, other.reference)) {
            return false;
        }
        if (!Objects.equals(this.validated, other.validated)) {
            return false;
        }
        return true;
    }

    
    
    
    

    
    

    @Override
    public String toString() {
        return  name ;
    }

   

 

}

