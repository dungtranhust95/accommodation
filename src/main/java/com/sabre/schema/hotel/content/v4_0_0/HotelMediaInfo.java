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
 * 
 *                 Contains infroamtion about various media types available for a particular hotel code.
 *             
 * 
 * <p>Java class for HotelMediaInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HotelMediaInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MediaItems" type="{http://services.sabre.com/hotel/content/v4_0_0}MediaItems"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelMediaInfo", propOrder = {
    "mediaItems"
})
public class HotelMediaInfo {

    @XmlElement(name = "MediaItems", required = true)
    protected MediaItems mediaItems;

    /**
     * Gets the value of the mediaItems property.
     * 
     * @return
     *     possible object is
     *     {@link MediaItems }
     *     
     */
    public MediaItems getMediaItems() {
        return mediaItems;
    }

    /**
     * Sets the value of the mediaItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link MediaItems }
     *     
     */
    public void setMediaItems(MediaItems value) {
        this.mediaItems = value;
    }

}