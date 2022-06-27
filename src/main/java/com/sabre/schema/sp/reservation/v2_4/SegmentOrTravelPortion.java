//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.06.17 at 10:54:05 AM ICT 
//


package com.sabre.schema.sp.reservation.v2_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SegmentOrTravelPortion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SegmentOrTravelPortion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AirlineCode" type="{http://services.sabre.com/sp/reservation/v2_4}CommonString" minOccurs="0"/&gt;
 *         &lt;element name="FlightNumber" type="{http://services.sabre.com/sp/reservation/v2_4}CommonString" minOccurs="0"/&gt;
 *         &lt;element name="OperatingFlightNumber" type="{http://services.sabre.com/sp/reservation/v2_4}CommonString" minOccurs="0"/&gt;
 *         &lt;element name="ClassOfService" type="{http://services.sabre.com/sp/reservation/v2_4}CommonString" minOccurs="0"/&gt;
 *         &lt;element name="DepartureDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="BoardPoint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="OffPoint" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="EquipmentType" type="{http://services.sabre.com/sp/reservation/v2_4}CommonString" minOccurs="0"/&gt;
 *         &lt;element name="ETicketNumber" type="{http://services.sabre.com/sp/reservation/v2_4}CommonString" minOccurs="0"/&gt;
 *         &lt;element name="ETicketCoupon" type="{http://services.sabre.com/sp/reservation/v2_4}CommonString" minOccurs="0"/&gt;
 *         &lt;element name="EMDNumber" type="{http://services.sabre.com/sp/reservation/v2_4}CommonString" minOccurs="0"/&gt;
 *         &lt;element name="EMDCoupon" type="{http://services.sabre.com/sp/reservation/v2_4}CommonString" minOccurs="0"/&gt;
 *         &lt;element name="MarketingCarrier" type="{http://services.sabre.com/sp/reservation/v2_4}CommonString" minOccurs="0"/&gt;
 *         &lt;element name="OperatingCarrier" type="{http://services.sabre.com/sp/reservation/v2_4}CommonString" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://services.sabre.com/sp/reservation/v2_4}UniqueIdentifier" /&gt;
 *       &lt;attribute name="sequence" type="{http://services.sabre.com/sp/reservation/v2_4}Numeric0to99999" /&gt;
 *       &lt;attribute name="advisory" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SegmentOrTravelPortion", propOrder = {
    "airlineCode",
    "flightNumber",
    "operatingFlightNumber",
    "classOfService",
    "departureDate",
    "boardPoint",
    "offPoint",
    "equipmentType",
    "eTicketNumber",
    "eTicketCoupon",
    "emdNumber",
    "emdCoupon",
    "marketingCarrier",
    "operatingCarrier"
})
public class SegmentOrTravelPortion {

    @XmlElement(name = "AirlineCode")
    protected String airlineCode;
    @XmlElement(name = "FlightNumber")
    protected String flightNumber;
    @XmlElement(name = "OperatingFlightNumber")
    protected String operatingFlightNumber;
    @XmlElement(name = "ClassOfService")
    protected String classOfService;
    @XmlElement(name = "DepartureDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar departureDate;
    @XmlElement(name = "BoardPoint")
    protected String boardPoint;
    @XmlElement(name = "OffPoint")
    protected String offPoint;
    @XmlElement(name = "EquipmentType")
    protected String equipmentType;
    @XmlElement(name = "ETicketNumber")
    protected String eTicketNumber;
    @XmlElement(name = "ETicketCoupon")
    protected String eTicketCoupon;
    @XmlElement(name = "EMDNumber")
    protected String emdNumber;
    @XmlElement(name = "EMDCoupon")
    protected String emdCoupon;
    @XmlElement(name = "MarketingCarrier")
    protected String marketingCarrier;
    @XmlElement(name = "OperatingCarrier")
    protected String operatingCarrier;
    @XmlAttribute(name = "id")
    protected String id;
    @XmlAttribute(name = "sequence")
    protected Integer sequence;
    @XmlAttribute(name = "advisory")
    protected Boolean advisory;

    /**
     * Gets the value of the airlineCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirlineCode() {
        return airlineCode;
    }

    /**
     * Sets the value of the airlineCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirlineCode(String value) {
        this.airlineCode = value;
    }

    /**
     * Gets the value of the flightNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightNumber() {
        return flightNumber;
    }

    /**
     * Sets the value of the flightNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightNumber(String value) {
        this.flightNumber = value;
    }

    /**
     * Gets the value of the operatingFlightNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatingFlightNumber() {
        return operatingFlightNumber;
    }

    /**
     * Sets the value of the operatingFlightNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatingFlightNumber(String value) {
        this.operatingFlightNumber = value;
    }

    /**
     * Gets the value of the classOfService property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassOfService() {
        return classOfService;
    }

    /**
     * Sets the value of the classOfService property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassOfService(String value) {
        this.classOfService = value;
    }

    /**
     * Gets the value of the departureDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDepartureDate() {
        return departureDate;
    }

    /**
     * Sets the value of the departureDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDepartureDate(XMLGregorianCalendar value) {
        this.departureDate = value;
    }

    /**
     * Gets the value of the boardPoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoardPoint() {
        return boardPoint;
    }

    /**
     * Sets the value of the boardPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoardPoint(String value) {
        this.boardPoint = value;
    }

    /**
     * Gets the value of the offPoint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOffPoint() {
        return offPoint;
    }

    /**
     * Sets the value of the offPoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOffPoint(String value) {
        this.offPoint = value;
    }

    /**
     * Gets the value of the equipmentType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquipmentType() {
        return equipmentType;
    }

    /**
     * Sets the value of the equipmentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquipmentType(String value) {
        this.equipmentType = value;
    }

    /**
     * Gets the value of the eTicketNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getETicketNumber() {
        return eTicketNumber;
    }

    /**
     * Sets the value of the eTicketNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setETicketNumber(String value) {
        this.eTicketNumber = value;
    }

    /**
     * Gets the value of the eTicketCoupon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getETicketCoupon() {
        return eTicketCoupon;
    }

    /**
     * Sets the value of the eTicketCoupon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setETicketCoupon(String value) {
        this.eTicketCoupon = value;
    }

    /**
     * Gets the value of the emdNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMDNumber() {
        return emdNumber;
    }

    /**
     * Sets the value of the emdNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMDNumber(String value) {
        this.emdNumber = value;
    }

    /**
     * Gets the value of the emdCoupon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEMDCoupon() {
        return emdCoupon;
    }

    /**
     * Sets the value of the emdCoupon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEMDCoupon(String value) {
        this.emdCoupon = value;
    }

    /**
     * Gets the value of the marketingCarrier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketingCarrier() {
        return marketingCarrier;
    }

    /**
     * Sets the value of the marketingCarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketingCarrier(String value) {
        this.marketingCarrier = value;
    }

    /**
     * Gets the value of the operatingCarrier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatingCarrier() {
        return operatingCarrier;
    }

    /**
     * Sets the value of the operatingCarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatingCarrier(String value) {
        this.operatingCarrier = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the sequence property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSequence() {
        return sequence;
    }

    /**
     * Sets the value of the sequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSequence(Integer value) {
        this.sequence = value;
    }

    /**
     * Gets the value of the advisory property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdvisory() {
        return advisory;
    }

    /**
     * Sets the value of the advisory property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdvisory(Boolean value) {
        this.advisory = value;
    }

}
