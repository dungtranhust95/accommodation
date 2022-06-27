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
import javax.xml.bind.annotation.XmlType;


/**
 * AirSegment is a choice in original TIR schema, this was simplified for easier xsd -> JSON conversion.
 *                 For original schemas please refer to https://beta.developer.sabre.com/docs/soap_apis/management/itinerary/Get_Itinerary
 * 
 * <p>Java class for SegmentAssociation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SegmentAssociation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="AirSegment" type="{http://services.sabre.com/sp/reservation/v2_4}SegmentAssociationTag" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://services.sabre.com/sp/reservation/v2_4}SegmentAssociationsAttributes"/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SegmentAssociation", propOrder = {
    "airSegment"
})
public class SegmentAssociation {

    @XmlElement(name = "AirSegment")
    protected SegmentAssociationTag airSegment;
    @XmlAttribute(name = "Id")
    protected String id;
    @XmlAttribute(name = "SegmentAssociationId")
    protected String segmentAssociationId;
    @XmlAttribute(name = "Sequence")
    protected String sequence;

    /**
     * Gets the value of the airSegment property.
     * 
     * @return
     *     possible object is
     *     {@link SegmentAssociationTag }
     *     
     */
    public SegmentAssociationTag getAirSegment() {
        return airSegment;
    }

    /**
     * Sets the value of the airSegment property.
     * 
     * @param value
     *     allowed object is
     *     {@link SegmentAssociationTag }
     *     
     */
    public void setAirSegment(SegmentAssociationTag value) {
        this.airSegment = value;
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
     * Gets the value of the segmentAssociationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegmentAssociationId() {
        return segmentAssociationId;
    }

    /**
     * Sets the value of the segmentAssociationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegmentAssociationId(String value) {
        this.segmentAssociationId = value;
    }

    /**
     * Gets the value of the sequence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSequence() {
        return sequence;
    }

    /**
     * Sets the value of the sequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSequence(String value) {
        this.sequence = value;
    }

}