//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.06.07 at 12:36:19 AM ICT 
//


package com.sabre.schema.hotel.content.v4_0_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Provides options to specify Hotel property information for which media content and descriptive info needs to retrieved.
 * 
 * <p>Java class for HotelRefs complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HotelRefs"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HotelRef" type="{http://services.sabre.com/hotel/content/v4_0_0}HotelRef"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace="content", name = "HotelRefs", propOrder = {
    "hotelRef"
})
public class HotelRefs {

    @XmlElement(name = "HotelRef", required = true)
    protected HotelRef hotelRef;

    /**
     * Gets the value of the hotelRef property.
     * 
     * @return
     *     possible object is
     *     {@link HotelRef }
     *     
     */
    public HotelRef getHotelRef() {
        return hotelRef;
    }

    /**
     * Sets the value of the hotelRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelRef }
     *     
     */
    public void setHotelRef(HotelRef value) {
        this.hotelRef = value;
    }

}
