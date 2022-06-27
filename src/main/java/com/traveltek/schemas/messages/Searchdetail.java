//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-793 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.07.05 at 09:06:43 AM ICT 
//


package com.traveltek.schemas.messages;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for searchdetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="searchdetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="child" type="{http://www.traveltek.com/schemas/messages}child" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="adults" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="children" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="startdate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="enddate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="resultkey" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="sid" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="nights" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="lineid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="shipid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="regionid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="voyagecode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="port" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="startport" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="withpricesonly" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchdetail", propOrder = {
    "child"
})
public class Searchdetail {

    @XmlElement(required = true)
    protected List<Child> child;
    @XmlAttribute
    protected BigInteger adults;
    @XmlAttribute
    protected BigInteger children;
    @XmlAttribute
    protected String startdate;
    @XmlAttribute
    protected String enddate;
    @XmlAttribute
    protected String resultkey;
    @XmlAttribute
    protected BigInteger sid;
    @XmlAttribute
    protected String type;
    @XmlAttribute
    protected BigInteger nights;
    @XmlAttribute
    protected String lineid;
    @XmlAttribute
    protected String shipid;
    @XmlAttribute
    protected String regionid;
    @XmlAttribute
    protected String voyagecode;
    @XmlAttribute
    protected String port;
    @XmlAttribute
    protected String startport;
    @XmlAttribute
    protected BigInteger withpricesonly;

    /**
     * Gets the value of the child property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the child property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChild().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Child }
     * 
     * 
     */
    public List<Child> getChild() {
        if (child == null) {
            child = new ArrayList<Child>();
        }
        return this.child;
    }

    /**
     * Gets the value of the adults property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAdults() {
        return adults;
    }

    /**
     * Sets the value of the adults property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAdults(BigInteger value) {
        this.adults = value;
    }

    /**
     * Gets the value of the children property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getChildren() {
        return children;
    }

    /**
     * Sets the value of the children property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setChildren(BigInteger value) {
        this.children = value;
    }

    /**
     * Gets the value of the startdate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartdate() {
        return startdate;
    }

    /**
     * Sets the value of the startdate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartdate(String value) {
        this.startdate = value;
    }

    /**
     * Gets the value of the enddate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnddate() {
        return enddate;
    }

    /**
     * Sets the value of the enddate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnddate(String value) {
        this.enddate = value;
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
     * Gets the value of the sid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSid() {
        return sid;
    }

    /**
     * Sets the value of the sid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSid(BigInteger value) {
        this.sid = value;
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
     * Gets the value of the nights property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNights() {
        return nights;
    }

    /**
     * Sets the value of the nights property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNights(BigInteger value) {
        this.nights = value;
    }

    /**
     * Gets the value of the lineid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineid() {
        return lineid;
    }

    /**
     * Sets the value of the lineid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineid(String value) {
        this.lineid = value;
    }

    /**
     * Gets the value of the shipid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipid() {
        return shipid;
    }

    /**
     * Sets the value of the shipid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipid(String value) {
        this.shipid = value;
    }

    /**
     * Gets the value of the regionid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegionid() {
        return regionid;
    }

    /**
     * Sets the value of the regionid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegionid(String value) {
        this.regionid = value;
    }

    /**
     * Gets the value of the voyagecode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVoyagecode() {
        return voyagecode;
    }

    /**
     * Sets the value of the voyagecode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVoyagecode(String value) {
        this.voyagecode = value;
    }

    /**
     * Gets the value of the port property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPort() {
        return port;
    }

    /**
     * Sets the value of the port property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPort(String value) {
        this.port = value;
    }

    /**
     * Gets the value of the startport property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartport() {
        return startport;
    }

    /**
     * Sets the value of the startport property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartport(String value) {
        this.startport = value;
    }

    /**
     * Gets the value of the withpricesonly property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWithpricesonly() {
        return withpricesonly;
    }

    /**
     * Sets the value of the withpricesonly property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWithpricesonly(BigInteger value) {
        this.withpricesonly = value;
    }

}
