/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.cisco.netflowiebase.entity;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author abondar
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class FieldDefinitions {

    @XmlElement(type = Field.class , name = "field")
    private List<Field> r1;

    public List<Field> getR1() {
        return r1;
    }

    public void setR1(List<Field> r1) {
        this.r1 = r1;
    }
    
}
