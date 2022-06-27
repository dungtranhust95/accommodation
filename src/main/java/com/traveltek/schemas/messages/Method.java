//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-793 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.09.20 at 10:52:04 PM ICT 
//


package com.traveltek.schemas.messages;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for method complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="method">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="searchdetail" type="{http://www.traveltek.com/schemas/messages}searchdetail"/>
 *       &lt;/sequence>
 *       &lt;attribute name="sitename" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="action" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="sessionkey" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="resultkey" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="status" type="{http://www.traveltek.com/schemas/messages}status" />
 *       &lt;attribute name="language" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="shipid" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="userid" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="portid" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="currency" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="referrer" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="subcode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="covercode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="loyaltyprogramid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="append" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="autorooms" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="waittime" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="maxresults" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="codetocruiseid" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "method", propOrder = {
    "searchdetail"
})
public class Method {

    @XmlElement(required = true)
    protected Searchdetail searchdetail;
    @XmlAttribute
    protected String sitename;
    @XmlAttribute
    protected String action;
    @XmlAttribute
    protected String sessionkey;
    @XmlAttribute
    protected String resultkey;
    @XmlAttribute
    protected Status status;
    @XmlAttribute
    protected String language;
    @XmlAttribute
    protected BigInteger shipid;
    @XmlAttribute
    protected BigInteger userid;
    @XmlAttribute
    protected BigInteger portid;
    @XmlAttribute
    protected String currency;
    @XmlAttribute
    protected String referrer;
    @XmlAttribute
    protected String subcode;
    @XmlAttribute
    protected String covercode;
    @XmlAttribute
    protected String loyaltyprogramid;
    @XmlAttribute
    protected String type;
    @XmlAttribute
    protected Boolean append;
    @XmlAttribute
    protected Boolean autorooms;
    @XmlAttribute
    protected BigInteger waittime;
    @XmlAttribute
    protected BigInteger maxresults;
    @XmlAttribute
    protected BigInteger codetocruiseid;

    /**
     * Gets the value of the searchdetail property.
     * 
     * @return
     *     possible object is
     *     {@link Searchdetail }
     *     
     */
    public Searchdetail getSearchdetail() {
        return searchdetail;
    }

    /**
     * Sets the value of the searchdetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link Searchdetail }
     *     
     */
    public void setSearchdetail(Searchdetail value) {
        this.searchdetail = value;
    }

    /**
     * Gets the value of the sitename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSitename() {
        return sitename;
    }

    /**
     * Sets the value of the sitename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSitename(String value) {
        this.sitename = value;
    }

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAction(String value) {
        this.action = value;
    }

    /**
     * Gets the value of the sessionkey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSessionkey() {
        return sessionkey;
    }

    /**
     * Sets the value of the sessionkey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSessionkey(String value) {
        this.sessionkey = value;
    }

    /**
     * Gets the value of the resultkey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResultkey() {
        return resultkey;
    }

    /**
     * Sets the value of the resultkey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResultkey(String value) {
        this.resultkey = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Status }
     *     
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Status }
     *     
     */
    public void setStatus(Status value) {
        this.status = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Gets the value of the shipid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getShipid() {
        return shipid;
    }

    /**
     * Sets the value of the shipid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setShipid(BigInteger value) {
        this.shipid = value;
    }

    /**
     * Gets the value of the userid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUserid() {
        return userid;
    }

    /**
     * Sets the value of the userid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUserid(BigInteger value) {
        this.userid = value;
    }

    /**
     * Gets the value of the portid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPortid() {
        return portid;
    }

    /**
     * Sets the value of the portid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPortid(BigInteger value) {
        this.portid = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the referrer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferrer() {
        return referrer;
    }

    /**
     * Sets the value of the referrer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferrer(String value) {
        this.referrer = value;
    }

    /**
     * Gets the value of the subcode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubcode() {
        return subcode;
    }

    /**
     * Sets the value of the subcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubcode(String value) {
        this.subcode = value;
    }

    /**
     * Gets the value of the covercode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCovercode() {
        return covercode;
    }

    /**
     * Sets the value of the covercode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCovercode(String value) {
        this.covercode = value;
    }

    /**
     * Gets the value of the loyaltyprogramid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoyaltyprogramid() {
        return loyaltyprogramid;
    }

    /**
     * Sets the value of the loyaltyprogramid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoyaltyprogramid(String value) {
        this.loyaltyprogramid = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the append property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAppend() {
        return append;
    }

    /**
     * Sets the value of the append property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAppend(Boolean value) {
        this.append = value;
    }

    /**
     * Gets the value of the autorooms property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutorooms() {
        return autorooms;
    }

    /**
     * Sets the value of the autorooms property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAutorooms(Boolean value) {
        this.autorooms = value;
    }

    /**
     * Gets the value of the waittime property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWaittime() {
        return waittime;
    }

    /**
     * Sets the value of the waittime property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWaittime(BigInteger value) {
        this.waittime = value;
    }

    /**
     * Gets the value of the maxresults property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxresults() {
        return maxresults;
    }

    /**
     * Sets the value of the maxresults property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxresults(BigInteger value) {
        this.maxresults = value;
    }

    /**
     * Gets the value of the codetocruiseid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCodetocruiseid() {
        return codetocruiseid;
    }

    /**
     * Sets the value of the codetocruiseid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCodetocruiseid(BigInteger value) {
        this.codetocruiseid = value;
    }

}