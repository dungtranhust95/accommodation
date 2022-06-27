//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.06.07 at 10:14:00 PM ICT 
//


package com.sabre.schema.hotel.details.v3_0_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Used to give the information to filter of Hotel Content
 * 
 * <p>Java class for HotelContentRef complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HotelContentRef"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DescriptiveInfoRef" type="{http://services.sabre.com/hotel/details/v3_0_0}DescriptiveInfoRef" minOccurs="0"/&gt;
 *         &lt;element name="MediaRef" type="{http://services.sabre.com/hotel/details/v3_0_0}MediaRef" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelContentRef", propOrder = {
    "descriptiveInfoRef",
    "mediaRef"
})
public class HotelContentRef {

    @XmlElement(name = "DescriptiveInfoRef")
    protected DescriptiveInfoRef descriptiveInfoRef;
    @XmlElement(name = "MediaRef")
    protected MediaRef mediaRef;

    /**
     * Gets the value of the descriptiveInfoRef property.
     *
     * @return
     *     possible object is
     *     {@link DescriptiveInfoRef }
     *
     */
    public DescriptiveInfoRef getDescriptiveInfoRef() {
        return descriptiveInfoRef;
    }

    /**
     * Sets the value of the descriptiveInfoRef property.
     *
     * @param value
     *     allowed object is
     *     {@link DescriptiveInfoRef }
     *
     */
    public void setDescriptiveInfoRef(DescriptiveInfoRef value) {
        this.descriptiveInfoRef = value;
    }

    /**
     * Gets the value of the mediaRef property.
     *
     * @return
     *     possible object is
     *     {@link MediaRef }
     *
     */
    public MediaRef getMediaRef() {
        return mediaRef;
    }

    /**
     * Sets the value of the mediaRef property.
     *
     * @param value
     *     allowed object is
     *     {@link MediaRef }
     *     
     */
    public void setMediaRef(MediaRef value) {
        this.mediaRef = value;
    }

}
