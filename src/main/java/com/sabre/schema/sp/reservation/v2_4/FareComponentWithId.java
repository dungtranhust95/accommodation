//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.06.17 at 10:54:05 AM ICT 
//


package com.sabre.schema.sp.reservation.v2_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FareComponentWithId complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FareComponentWithId"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://services.sabre.com/sp/reservation/v2_4}FareComponent"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FareComponentID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareComponentWithId", propOrder = {
    "fareComponentID"
})
public class FareComponentWithId
    extends FareComponent
{

    @XmlElement(name = "FareComponentID")
    protected Integer fareComponentID;

    /**
     * Gets the value of the fareComponentID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFareComponentID() {
        return fareComponentID;
    }

    /**
     * Sets the value of the fareComponentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFareComponentID(Integer value) {
        this.fareComponentID = value;
    }

}