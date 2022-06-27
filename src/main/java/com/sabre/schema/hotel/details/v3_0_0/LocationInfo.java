//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.06.07 at 10:14:00 PM ICT 
//


package com.sabre.schema.hotel.details.v3_0_0;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Property Location Information
 * 
 * <p>Java class for LocationInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LocationInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element name="Address" type="{http://services.sabre.com/hotel/details/v3_0_0}Address" minOccurs="0"/&gt;
 *         &lt;element name="Neighborhoods" type="{http://services.sabre.com/hotel/details/v3_0_0}Neighborhoods" minOccurs="0"/&gt;
 *         &lt;element name="Contact" type="{http://services.sabre.com/hotel/details/v3_0_0}Contact" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="Latitude" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *       &lt;attribute name="Longitude" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "details", name = "LocationInfo", propOrder = {
    "address",
    "neighborhoods",
    "contact"
})
public class LocationInfo {

    @XmlElement(name = "Address")
    protected Address address;
    @XmlElement(name = "Neighborhoods")
    protected Neighborhoods neighborhoods;
    @XmlElement(name = "Contact")
    protected Contact contact;
    @XmlAttribute(name = "Latitude")
    protected BigDecimal latitude;
    @XmlAttribute(name = "Longitude")
    protected BigDecimal longitude;

    /**
     * Gets the value of the address property.
     *
     * @return
     *     possible object is
     *     {@link Address }
     *
     */
    public Address getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     *
     * @param value
     *     allowed object is
     *     {@link Address }
     *
     */
    public void setAddress(Address value) {
        this.address = value;
    }

    /**
     * Gets the value of the neighborhoods property.
     *
     * @return
     *     possible object is
     *     {@link Neighborhoods }
     *
     */
    public Neighborhoods getNeighborhoods() {
        return neighborhoods;
    }

    /**
     * Sets the value of the neighborhoods property.
     *
     * @param value
     *     allowed object is
     *     {@link Neighborhoods }
     *     
     */
    public void setNeighborhoods(Neighborhoods value) {
        this.neighborhoods = value;
    }

    /**
     * Gets the value of the contact property.
     * 
     * @return
     *     possible object is
     *     {@link Contact }
     *     
     */
    public Contact getContact() {
        return contact;
    }

    /**
     * Sets the value of the contact property.
     * 
     * @param value
     *     allowed object is
     *     {@link Contact }
     *     
     */
    public void setContact(Contact value) {
        this.contact = value;
    }

    /**
     * Gets the value of the latitude property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLatitude() {
        return latitude;
    }

    /**
     * Sets the value of the latitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLatitude(BigDecimal value) {
        this.latitude = value;
    }

    /**
     * Gets the value of the longitude property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLongitude() {
        return longitude;
    }

    /**
     * Sets the value of the longitude property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLongitude(BigDecimal value) {
        this.longitude = value;
    }

}
