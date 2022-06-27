//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.06.10 at 10:00:19 PM ICT 
//


package com.sabre.schema.hotel.pricecheck.v4_0_0;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TaxGroupsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxGroupsType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TaxGroup" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="TaxDescription" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="Code" use="required" type="{http://services.sabre.com/hotel/pricecheck/v4_0_0}OTACodeType" /&gt;
 *                 &lt;attribute name="Description" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="Amount" use="required" type="{http://services.sabre.com/hotel/pricecheck/v4_0_0}Amount" /&gt;
 *                 &lt;attribute name="CurrencyCode" use="required" type="{http://services.sabre.com/hotel/pricecheck/v4_0_0}StringLength3WithNoSpace" /&gt;
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
@XmlType(namespace = "checkRate", name = "TaxGroupsType", propOrder = {
    "taxGroups"
})
public class TaxGroupsType {

    @XmlElement(name = "TaxGroup", required = true)
    protected List<TaxGroupsType.TaxGroup> taxGroups;

    /**
     * Gets the value of the taxGroups property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxGroups property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxGroups().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxGroupsType.TaxGroup }
     * 
     * 
     */
    public List<TaxGroupsType.TaxGroup> getTaxGroups() {
        if (taxGroups == null) {
            taxGroups = new ArrayList<TaxGroupsType.TaxGroup>();
        }
        return this.taxGroups;
    }


    /**
     * Represents a tax type applicable.
     * 
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="TaxDescription" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="Code" use="required" type="{http://services.sabre.com/hotel/pricecheck/v4_0_0}OTACodeType" /&gt;
     *       &lt;attribute name="Description" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="Amount" use="required" type="{http://services.sabre.com/hotel/pricecheck/v4_0_0}Amount" /&gt;
     *       &lt;attribute name="CurrencyCode" use="required" type="{http://services.sabre.com/hotel/pricecheck/v4_0_0}StringLength3WithNoSpace" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "taxDescription"
    })
    public static class TaxGroup {

        @XmlElement(name = "TaxDescription")
        protected TaxGroupsType.TaxGroup.TaxDescription taxDescription;
        @XmlAttribute(name = "Code", required = true)
        protected int code;
        @XmlAttribute(name = "Description")
        protected String description;
        @XmlAttribute(name = "Amount", required = true)
        protected BigDecimal amount;
        @XmlAttribute(name = "CurrencyCode", required = true)
        protected String currencyCode;

        /**
         * Gets the value of the taxDescription property.
         * 
         * @return
         *     possible object is
         *     {@link TaxGroupsType.TaxGroup.TaxDescription }
         *     
         */
        public TaxGroupsType.TaxGroup.TaxDescription getTaxDescription() {
            return taxDescription;
        }

        /**
         * Sets the value of the taxDescription property.
         * 
         * @param value
         *     allowed object is
         *     {@link TaxGroupsType.TaxGroup.TaxDescription }
         *     
         */
        public void setTaxDescription(TaxGroupsType.TaxGroup.TaxDescription value) {
            this.taxDescription = value;
        }

        /**
         * Gets the value of the code property.
         * 
         */
        public int getCode() {
            return code;
        }

        /**
         * Sets the value of the code property.
         * 
         */
        public void setCode(int value) {
            this.code = value;
        }

        /**
         * Gets the value of the description property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDescription() {
            return description;
        }

        /**
         * Sets the value of the description property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDescription(String value) {
            this.description = value;
        }

        /**
         * Gets the value of the amount property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getAmount() {
            return amount;
        }

        /**
         * Sets the value of the amount property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setAmount(BigDecimal value) {
            this.amount = value;
        }

        /**
         * Gets the value of the currencyCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCurrencyCode() {
            return currencyCode;
        }

        /**
         * Sets the value of the currencyCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCurrencyCode(String value) {
            this.currencyCode = value;
        }


        /**
         * Description of tax.
         * 
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
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
            "texts"
        })
        public static class TaxDescription {

            @XmlElement(name = "Text", required = true)
            protected List<String> texts;

            /**
             * Gets the value of the texts property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the texts property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getTexts().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getTexts() {
                if (texts == null) {
                    texts = new ArrayList<String>();
                }
                return this.texts;
            }

        }

    }

}
