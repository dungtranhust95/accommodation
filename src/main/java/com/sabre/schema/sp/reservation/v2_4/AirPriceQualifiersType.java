//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.06.17 at 10:54:05 AM ICT 
//


package com.sabre.schema.sp.reservation.v2_4;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Specifies passenger numbers and types.
 * 
 * <p>Java class for AirPriceQualifiersType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AirPriceQualifiersType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SeatsRequested" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" maxOccurs="4" minOccurs="0"/&gt;
 *         &lt;element name="AirTravelerAvail" type="{http://services.sabre.com/sp/reservation/v2_4}TravelerInformationType" maxOccurs="4" minOccurs="0"/&gt;
 *         &lt;element name="PriceRequestOptions" type="{http://services.sabre.com/sp/reservation/v2_4}PriceRequestOptionsType" minOccurs="0"/&gt;
 *         &lt;element name="TravelerRating" type="{http://services.sabre.com/sp/reservation/v2_4}TravelerRatingType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="GoverningCarrierOverride" type="{http://services.sabre.com/sp/reservation/v2_4}GoverningCarrierOverrideType" minOccurs="0"/&gt;
 *         &lt;element name="VoluntaryChanges" type="{http://services.sabre.com/sp/reservation/v2_4}VoluntaryChangesSMPType" minOccurs="0"/&gt;
 *         &lt;element name="RetailerRules" type="{http://services.sabre.com/sp/reservation/v2_4}RetailerRulesType" minOccurs="0"/&gt;
 *         &lt;element name="TaxRules" type="{http://services.sabre.com/sp/reservation/v2_4}TaxRulesType" minOccurs="0"/&gt;
 *         &lt;element name="ValidatingCarrier" type="{http://services.sabre.com/sp/reservation/v2_4}ValidatingCarrierType" minOccurs="0"/&gt;
 *         &lt;element name="CabinPref" type="{http://services.sabre.com/sp/reservation/v2_4}CabinPrefType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="specificPTC_Indicator" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="tripType" type="{http://services.sabre.com/sp/reservation/v2_4}AirTripType" /&gt;
 *       &lt;attribute name="xOFares" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirPriceQualifiersType", propOrder = {
    "seatsRequested",
    "airTravelerAvail",
    "priceRequestOptions",
    "travelerRating",
    "governingCarrierOverride",
    "voluntaryChanges",
    "retailerRules",
    "taxRules",
    "validatingCarrier",
    "cabinPref"
})
public class AirPriceQualifiersType {

    @XmlElement(name = "SeatsRequested")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected List<BigInteger> seatsRequested;
    @XmlElement(name = "AirTravelerAvail")
    protected List<TravelerInformationType> airTravelerAvail;
    @XmlElement(name = "PriceRequestOptions")
    protected PriceRequestOptionsType priceRequestOptions;
    @XmlElement(name = "TravelerRating")
    protected List<TravelerRatingType> travelerRating;
    @XmlElement(name = "GoverningCarrierOverride")
    protected GoverningCarrierOverrideType governingCarrierOverride;
    @XmlElement(name = "VoluntaryChanges")
    protected VoluntaryChangesSMPType voluntaryChanges;
    @XmlElement(name = "RetailerRules")
    protected RetailerRulesType retailerRules;
    @XmlElement(name = "TaxRules")
    protected TaxRulesType taxRules;
    @XmlElement(name = "ValidatingCarrier")
    protected ValidatingCarrierType validatingCarrier;
    @XmlElement(name = "CabinPref")
    protected CabinPrefType cabinPref;
    @XmlAttribute(name = "specificPTC_Indicator")
    protected Boolean specificPTCIndicator;
    @XmlAttribute(name = "tripType")
    protected AirTripType tripType;
    @XmlAttribute(name = "xOFares")
    protected Boolean xoFares;

    /**
     * Gets the value of the seatsRequested property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the seatsRequested property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSeatsRequested().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
     * 
     * 
     */
    public List<BigInteger> getSeatsRequested() {
        if (seatsRequested == null) {
            seatsRequested = new ArrayList<BigInteger>();
        }
        return this.seatsRequested;
    }

    /**
     * Gets the value of the airTravelerAvail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airTravelerAvail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAirTravelerAvail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TravelerInformationType }
     * 
     * 
     */
    public List<TravelerInformationType> getAirTravelerAvail() {
        if (airTravelerAvail == null) {
            airTravelerAvail = new ArrayList<TravelerInformationType>();
        }
        return this.airTravelerAvail;
    }

    /**
     * Gets the value of the priceRequestOptions property.
     * 
     * @return
     *     possible object is
     *     {@link PriceRequestOptionsType }
     *     
     */
    public PriceRequestOptionsType getPriceRequestOptions() {
        return priceRequestOptions;
    }

    /**
     * Sets the value of the priceRequestOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceRequestOptionsType }
     *     
     */
    public void setPriceRequestOptions(PriceRequestOptionsType value) {
        this.priceRequestOptions = value;
    }

    /**
     * Gets the value of the travelerRating property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the travelerRating property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTravelerRating().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TravelerRatingType }
     * 
     * 
     */
    public List<TravelerRatingType> getTravelerRating() {
        if (travelerRating == null) {
            travelerRating = new ArrayList<TravelerRatingType>();
        }
        return this.travelerRating;
    }

    /**
     * Gets the value of the governingCarrierOverride property.
     * 
     * @return
     *     possible object is
     *     {@link GoverningCarrierOverrideType }
     *     
     */
    public GoverningCarrierOverrideType getGoverningCarrierOverride() {
        return governingCarrierOverride;
    }

    /**
     * Sets the value of the governingCarrierOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link GoverningCarrierOverrideType }
     *     
     */
    public void setGoverningCarrierOverride(GoverningCarrierOverrideType value) {
        this.governingCarrierOverride = value;
    }

    /**
     * Gets the value of the voluntaryChanges property.
     * 
     * @return
     *     possible object is
     *     {@link VoluntaryChangesSMPType }
     *     
     */
    public VoluntaryChangesSMPType getVoluntaryChanges() {
        return voluntaryChanges;
    }

    /**
     * Sets the value of the voluntaryChanges property.
     * 
     * @param value
     *     allowed object is
     *     {@link VoluntaryChangesSMPType }
     *     
     */
    public void setVoluntaryChanges(VoluntaryChangesSMPType value) {
        this.voluntaryChanges = value;
    }

    /**
     * Gets the value of the retailerRules property.
     * 
     * @return
     *     possible object is
     *     {@link RetailerRulesType }
     *     
     */
    public RetailerRulesType getRetailerRules() {
        return retailerRules;
    }

    /**
     * Sets the value of the retailerRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link RetailerRulesType }
     *     
     */
    public void setRetailerRules(RetailerRulesType value) {
        this.retailerRules = value;
    }

    /**
     * Gets the value of the taxRules property.
     * 
     * @return
     *     possible object is
     *     {@link TaxRulesType }
     *     
     */
    public TaxRulesType getTaxRules() {
        return taxRules;
    }

    /**
     * Sets the value of the taxRules property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxRulesType }
     *     
     */
    public void setTaxRules(TaxRulesType value) {
        this.taxRules = value;
    }

    /**
     * Gets the value of the validatingCarrier property.
     * 
     * @return
     *     possible object is
     *     {@link ValidatingCarrierType }
     *     
     */
    public ValidatingCarrierType getValidatingCarrier() {
        return validatingCarrier;
    }

    /**
     * Sets the value of the validatingCarrier property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValidatingCarrierType }
     *     
     */
    public void setValidatingCarrier(ValidatingCarrierType value) {
        this.validatingCarrier = value;
    }

    /**
     * Gets the value of the cabinPref property.
     * 
     * @return
     *     possible object is
     *     {@link CabinPrefType }
     *     
     */
    public CabinPrefType getCabinPref() {
        return cabinPref;
    }

    /**
     * Sets the value of the cabinPref property.
     * 
     * @param value
     *     allowed object is
     *     {@link CabinPrefType }
     *     
     */
    public void setCabinPref(CabinPrefType value) {
        this.cabinPref = value;
    }

    /**
     * Gets the value of the specificPTCIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSpecificPTCIndicator() {
        return specificPTCIndicator;
    }

    /**
     * Sets the value of the specificPTCIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSpecificPTCIndicator(Boolean value) {
        this.specificPTCIndicator = value;
    }

    /**
     * Gets the value of the tripType property.
     * 
     * @return
     *     possible object is
     *     {@link AirTripType }
     *     
     */
    public AirTripType getTripType() {
        return tripType;
    }

    /**
     * Sets the value of the tripType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AirTripType }
     *     
     */
    public void setTripType(AirTripType value) {
        this.tripType = value;
    }

    /**
     * Gets the value of the xoFares property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isXOFares() {
        return xoFares;
    }

    /**
     * Sets the value of the xoFares property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setXOFares(Boolean value) {
        this.xoFares = value;
    }

}