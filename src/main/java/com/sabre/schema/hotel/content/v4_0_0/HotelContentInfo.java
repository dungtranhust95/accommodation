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
 * Describes hotel information including images for a hotel.
 * 
 * <p>Java class for HotelContentInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HotelContentInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HotelInfo" type="{http://services.sabre.com/hotel/content/v4_0_0}HotelInfo"/&gt;
 *         &lt;sequence minOccurs="0"&gt;
 *           &lt;element name="HotelDescriptiveInfo" type="{http://services.sabre.com/hotel/content/v4_0_0}HotelDescriptiveInfo" minOccurs="0"/&gt;
 *           &lt;element name="HotelMediaInfo" type="{http://services.sabre.com/hotel/content/v4_0_0}HotelMediaInfo" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelContentInfo", propOrder = {
    "hotelInfo",
    "hotelDescriptiveInfo",
    "hotelMediaInfo"
})
public class HotelContentInfo {

    @XmlElement(name = "HotelInfo", required = true)
    protected HotelInfo hotelInfo;
    @XmlElement(name = "HotelDescriptiveInfo")
    protected HotelDescriptiveInfo hotelDescriptiveInfo;
    @XmlElement(name = "HotelMediaInfo")
    protected HotelMediaInfo hotelMediaInfo;

    /**
     * Gets the value of the hotelInfo property.
     * 
     * @return
     *     possible object is
     *     {@link HotelInfo }
     *     
     */
    public HotelInfo getHotelInfo() {
        return hotelInfo;
    }

    /**
     * Sets the value of the hotelInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelInfo }
     *     
     */
    public void setHotelInfo(HotelInfo value) {
        this.hotelInfo = value;
    }

    /**
     * Gets the value of the hotelDescriptiveInfo property.
     * 
     * @return
     *     possible object is
     *     {@link HotelDescriptiveInfo }
     *     
     */
    public HotelDescriptiveInfo getHotelDescriptiveInfo() {
        return hotelDescriptiveInfo;
    }

    /**
     * Sets the value of the hotelDescriptiveInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelDescriptiveInfo }
     *     
     */
    public void setHotelDescriptiveInfo(HotelDescriptiveInfo value) {
        this.hotelDescriptiveInfo = value;
    }

    /**
     * Gets the value of the hotelMediaInfo property.
     * 
     * @return
     *     possible object is
     *     {@link HotelMediaInfo }
     *     
     */
    public HotelMediaInfo getHotelMediaInfo() {
        return hotelMediaInfo;
    }

    /**
     * Sets the value of the hotelMediaInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelMediaInfo }
     *     
     */
    public void setHotelMediaInfo(HotelMediaInfo value) {
        this.hotelMediaInfo = value;
    }

}
