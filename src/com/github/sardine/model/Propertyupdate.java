//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.4-10/27/2009 06:09 PM(mockbuild)-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.12.23 at 06:27:19 PM PST 
//


package com.github.sardine.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element ref="{DAV:}remove"/>
 *         &lt;element ref="{DAV:}set"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "removeOrSet"
})
@XmlRootElement(name = "propertyupdate")
public class Propertyupdate {

    @XmlElements({
        @XmlElement(name = "remove", type = Remove.class),
        @XmlElement(name = "set", type = Set.class)
    })
    private List<Object> removeOrSet;

    /**
     * Gets the value of the removeOrSet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the removeOrSet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRemoveOrSet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Remove }
     * {@link Set }
     * 
     * 
     */
    public List<Object> getRemoveOrSet() {
        if (removeOrSet == null) {
            removeOrSet = new ArrayList<Object>();
        }
        return this.removeOrSet;
    }

}
