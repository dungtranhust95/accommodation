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
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * Address of a hotel
 * 
 * <p>Java class for Address complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Address"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element name="AddressLine1" type="{http://services.sabre.com/hotel/details/v3_0_0}StringLength0to500"/&gt;
 *         &lt;element name="AddressLine2" type="{http://services.sabre.com/hotel/details/v3_0_0}StringLength0to500" minOccurs="0"/&gt;
 *         &lt;element name="AddressLine3" type="{http://services.sabre.com/hotel/details/v3_0_0}StringLength0to500" minOccurs="0"/&gt;
 *         &lt;element name="CityName"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://services.sabre.com/hotel/details/v3_0_0&gt;StringLength0to50"&gt;
 *                 &lt;attribute name="CityCode" type="{http://services.sabre.com/hotel/details/v3_0_0}StringLength0to5" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="StateProv" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                 &lt;attribute name="StateCode" type="{http://services.sabre.com/hotel/details/v3_0_0}StringLength0to10" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="PostalCode" type="{http://services.sabre.com/hotel/details/v3_0_0}StringLength0to50"/&gt;
 *         &lt;element name="CountryName"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                 &lt;attribute name="Code" type="{http://services.sabre.com/hotel/details/v3_0_0}StringLength0to3" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "details", name = "Address", propOrder = {
    "addressLine1",
    "addressLine2",
    "addressLine3",
    "cityName",
    "stateProv",
    "postalCode",
    "countryName"
})
public class Address {

    @XmlElement(name = "AddressLine1")
    protected String addressLine1;
    @XmlElement(name = "AddressLine2")
    protected String addressLine2;
    @XmlElement(name = "AddressLine3")
    protected String addressLine3;
    @XmlElement(name = "CityName")
    protected Address.CityName cityName;
    @XmlElement(name = "StateProv")
    protected Address.StateProv stateProv;
    @XmlElement(name = "PostalCode")
    protected String postalCode;
    @XmlElement(name = "CountryName")
    protected Address.CountryName countryName;

    /**
     * Gets the value of the addressLine1 property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAddressLine1() {
        return addressLine1;
    }

    /**
     * Sets the value of the addressLine1 property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAddressLine1(String value) {
        this.addressLine1 = value;
    }

    /**
     * Gets the value of the addressLine2 property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAddressLine2() {
        return addressLine2;
    }

    /**
     * Sets the value of the addressLine2 property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAddressLine2(String value) {
        this.addressLine2 = value;
    }

    /**
     * Gets the value of the addressLine3 property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAddressLine3() {
        return addressLine3;
    }

    /**
     * Sets the value of the addressLine3 property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAddressLine3(String value) {
        this.addressLine3 = value;
    }

    /**
     * Gets the value of the cityName property.
     *
     * @return
     *     possible object is
     *     {@link Address.CityName }
     *
     */
    public Address.CityName getCityName() {
        return cityName;
    }

    /**
     * Sets the value of the cityName property.
     *
     * @param value
     *     allowed object is
     *     {@link Address.CityName }
     *
     */
    public void setCityName(Address.CityName value) {
        this.cityName = value;
    }

    /**
     * Gets the value of the stateProv property.
     *
     * @return
     *     possible object is
     *     {@link Address.StateProv }
     *
     */
    public Address.StateProv getStateProv() {
        return stateProv;
    }

    /**
     * Sets the value of the stateProv property.
     *
     * @param value
     *     allowed object is
     *     {@link Address.StateProv }
     *
     */
    public void setStateProv(Address.StateProv value) {
        this.stateProv = value;
    }

    /**
     * Gets the value of the postalCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    /**
     * Gets the value of the countryName property.
     *
     * @return
     *     possible object is
     *     {@link Address.CountryName }
     *
     */
    public Address.CountryName getCountryName() {
        return countryName;
    }

    /**
     * Sets the value of the countryName property.
     *
     * @param value
     *     allowed object is
     *     {@link Address.CountryName }
     *
     */
    public void setCountryName(Address.CountryName value) {
        this.countryName = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://services.sabre.com/hotel/details/v3_0_0&gt;StringLength0to50"&gt;
     *       &lt;attribute name="CityCode" type="{http://services.sabre.com/hotel/details/v3_0_0}StringLength0to5" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class CityName {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "CityCode")
        protected String cityCode;

        /**
         * Used for Character Strings, length 0 to 50.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the cityCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCityCode() {
            return cityCode;
        }

        /**
         * Sets the value of the cityCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCityCode(String value) {
            this.cityCode = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *       &lt;attribute name="Code" type="{http://services.sabre.com/hotel/details/v3_0_0}StringLength0to3" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class CountryName {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "Code")
        protected String code;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the code property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCode() {
            return code;
        }

        /**
         * Sets the value of the code property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCode(String value) {
            this.code = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *       &lt;attribute name="StateCode" type="{http://services.sabre.com/hotel/details/v3_0_0}StringLength0to10" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class StateProv {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "StateCode")
        protected String stateCode;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the stateCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStateCode() {
            return stateCode;
        }

        /**
         * Sets the value of the stateCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStateCode(String value) {
            this.stateCode = value;
        }

    }

}
