//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.06.07 at 10:14:00 PM ICT 
//


package com.sabre.schema.hotel.details.v3_0_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 Hotel summary information
 *             
 * 
 * <p>Java class for HotelInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HotelInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element name="TierLabels" type="{http://services.sabre.com/hotel/details/v3_0_0}TierLabels" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="HotelCode" use="required" type="{http://services.sabre.com/hotel/details/v3_0_0}StringLength0to20" /&gt;
 *       &lt;attribute name="CodeContext" use="required" type="{http://services.sabre.com/hotel/details/v3_0_0}CodeContextType" /&gt;
 *       &lt;attribute name="HotelName" type="{http://services.sabre.com/hotel/details/v3_0_0}StringLength0to500" /&gt;
 *       &lt;attribute name="ChainCode" type="{http://services.sabre.com/hotel/details/v3_0_0}StringLength0to20" /&gt;
 *       &lt;attribute name="ChainName" type="{http://services.sabre.com/hotel/details/v3_0_0}StringLength0to500" /&gt;
 *       &lt;attribute name="BrandCode" type="{http://services.sabre.com/hotel/details/v3_0_0}StringLength0to50" /&gt;
 *       &lt;attribute name="BrandName" type="{http://services.sabre.com/hotel/details/v3_0_0}StringLength0to500" /&gt;
 *       &lt;attribute name="Status" type="{http://services.sabre.com/hotel/details/v3_0_0}PropertyStatusType" /&gt;
 *       &lt;attribute name="SabreRating" type="{http://services.sabre.com/hotel/details/v3_0_0}StringLength0to10" /&gt;
 *       &lt;attribute name="SabreHotelCode" type="{http://services.sabre.com/hotel/details/v3_0_0}StringLength1to20" /&gt;
 *       &lt;attribute name="Logo" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "details", name = "HotelInfo", propOrder = {
    "tierLabels"
})
public class HotelInfo {

    @XmlElement(name = "TierLabels")
    protected TierLabels tierLabels;
    @XmlAttribute(name = "HotelCode", required = true)
    protected String hotelCode;
    @XmlAttribute(name = "CodeContext", required = true)
    protected CodeContextType codeContext;
    @XmlAttribute(name = "HotelName")
    protected String hotelName;
    @XmlAttribute(name = "ChainCode")
    protected String chainCode;
    @XmlAttribute(name = "ChainName")
    protected String chainName;
    @XmlAttribute(name = "BrandCode")
    protected String brandCode;
    @XmlAttribute(name = "BrandName")
    protected String brandName;
    @XmlAttribute(name = "Status")
    protected PropertyStatusType status;
    @XmlAttribute(name = "SabreRating")
    protected String sabreRating;
    @XmlAttribute(name = "SabreHotelCode")
    protected String sabreHotelCode;
    @XmlAttribute(name = "Logo")
    @XmlSchemaType(name = "anyURI")
    protected String logo;

    /**
     * Gets the value of the tierLabels property.
     * 
     * @return
     *     possible object is
     *     {@link TierLabels }
     *     
     */
    public TierLabels getTierLabels() {
        return tierLabels;
    }

    /**
     * Sets the value of the tierLabels property.
     * 
     * @param value
     *     allowed object is
     *     {@link TierLabels }
     *     
     */
    public void setTierLabels(TierLabels value) {
        this.tierLabels = value;
    }

    /**
     * Gets the value of the hotelCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelCode() {
        return hotelCode;
    }

    /**
     * Sets the value of the hotelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelCode(String value) {
        this.hotelCode = value;
    }

    /**
     * Gets the value of the codeContext property.
     * 
     * @return
     *     possible object is
     *     {@link CodeContextType }
     *     
     */
    public CodeContextType getCodeContext() {
        return codeContext;
    }

    /**
     * Sets the value of the codeContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeContextType }
     *     
     */
    public void setCodeContext(CodeContextType value) {
        this.codeContext = value;
    }

    /**
     * Gets the value of the hotelName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelName() {
        return hotelName;
    }

    /**
     * Sets the value of the hotelName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelName(String value) {
        this.hotelName = value;
    }

    /**
     * Gets the value of the chainCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChainCode() {
        return chainCode;
    }

    /**
     * Sets the value of the chainCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChainCode(String value) {
        this.chainCode = value;
    }

    /**
     * Gets the value of the chainName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChainName() {
        return chainName;
    }

    /**
     * Sets the value of the chainName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChainName(String value) {
        this.chainName = value;
    }

    /**
     * Gets the value of the brandCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrandCode() {
        return brandCode;
    }

    /**
     * Sets the value of the brandCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrandCode(String value) {
        this.brandCode = value;
    }

    /**
     * Gets the value of the brandName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrandName() {
        return brandName;
    }

    /**
     * Sets the value of the brandName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrandName(String value) {
        this.brandName = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link PropertyStatusType }
     *     
     */
    public PropertyStatusType getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyStatusType }
     *     
     */
    public void setStatus(PropertyStatusType value) {
        this.status = value;
    }

    /**
     * Gets the value of the sabreRating property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSabreRating() {
        return sabreRating;
    }

    /**
     * Sets the value of the sabreRating property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSabreRating(String value) {
        this.sabreRating = value;
    }

    /**
     * Gets the value of the sabreHotelCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSabreHotelCode() {
        return sabreHotelCode;
    }

    /**
     * Sets the value of the sabreHotelCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSabreHotelCode(String value) {
        this.sabreHotelCode = value;
    }

    /**
     * Gets the value of the logo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogo() {
        return logo;
    }

    /**
     * Sets the value of the logo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogo(String value) {
        this.logo = value;
    }

}
