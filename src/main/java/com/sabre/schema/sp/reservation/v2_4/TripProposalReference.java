//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.06.17 at 10:54:05 AM ICT 
//


package com.sabre.schema.sp.reservation.v2_4;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for TripProposalReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TripProposalReference"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ProposalId"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://services.sabre.com/sp/reservation/v2_4&gt;ProposalIDType"&gt;
 *                 &lt;attribute name="snapshotId" type="{http://services.sabre.com/sp/reservation/v2_4}UUIDType" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="OptionIds" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="OptionId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
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
@XmlType(name = "TripProposalReference", propOrder = {
    "proposalId",
    "optionIds"
})
public class TripProposalReference {

    @XmlElement(name = "ProposalId", required = true)
    protected TripProposalReference.ProposalId proposalId;
    @XmlElement(name = "OptionIds")
    protected TripProposalReference.OptionIds optionIds;

    /**
     * Gets the value of the proposalId property.
     * 
     * @return
     *     possible object is
     *     {@link TripProposalReference.ProposalId }
     *     
     */
    public TripProposalReference.ProposalId getProposalId() {
        return proposalId;
    }

    /**
     * Sets the value of the proposalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TripProposalReference.ProposalId }
     *     
     */
    public void setProposalId(TripProposalReference.ProposalId value) {
        this.proposalId = value;
    }

    /**
     * Gets the value of the optionIds property.
     * 
     * @return
     *     possible object is
     *     {@link TripProposalReference.OptionIds }
     *     
     */
    public TripProposalReference.OptionIds getOptionIds() {
        return optionIds;
    }

    /**
     * Sets the value of the optionIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link TripProposalReference.OptionIds }
     *     
     */
    public void setOptionIds(TripProposalReference.OptionIds value) {
        this.optionIds = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="OptionId" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "optionId"
    })
    public static class OptionIds {

        @XmlElement(name = "OptionId")
        protected List<String> optionId;

        /**
         * Gets the value of the optionId property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the optionId property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOptionId().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getOptionId() {
            if (optionId == null) {
                optionId = new ArrayList<String>();
            }
            return this.optionId;
        }

    }


    /**
     * ID of TripProposal related to PNR
     * 
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://services.sabre.com/sp/reservation/v2_4&gt;ProposalIDType"&gt;
     *       &lt;attribute name="snapshotId" type="{http://services.sabre.com/sp/reservation/v2_4}UUIDType" /&gt;
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
    public static class ProposalId {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "snapshotId")
        protected String snapshotId;

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
         * Gets the value of the snapshotId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSnapshotId() {
            return snapshotId;
        }

        /**
         * Sets the value of the snapshotId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSnapshotId(String value) {
            this.snapshotId = value;
        }

    }

}
