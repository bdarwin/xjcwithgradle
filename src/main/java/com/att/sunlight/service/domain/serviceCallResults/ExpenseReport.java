//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.08.20 at 11:35:54 PM SGT 
//


package com.att.sunlight.service.domain.serviceCallResults;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ExpenseT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ExpenseT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="user" type="{}UserT"/>
 *         &lt;element name="items" type="{}ItemListT"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExpenseT", propOrder = {
    "user",
    "items"
})
@XmlRootElement(name = "expenseReport")
public class ExpenseReport {

    @XmlElement(required = true)
    protected UserT user;
    @XmlElement(required = true)
    protected ItemListT items;

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link UserT }
     *     
     */
    public UserT getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link UserT }
     *     
     */
    public void setUser(UserT value) {
        this.user = value;
    }

    /**
     * Gets the value of the items property.
     * 
     * @return
     *     possible object is
     *     {@link ItemListT }
     *     
     */
    public ItemListT getItems() {
        return items;
    }

    /**
     * Sets the value of the items property.
     * 
     * @param value
     *     allowed object is
     *     {@link ItemListT }
     *     
     */
    public void setItems(ItemListT value) {
        this.items = value;
    }

}
