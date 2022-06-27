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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Combines exemption rules connected with taxes.
 * 
 * <p>Java class for TaxRulesType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TaxRulesType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ExemptAllTaxes" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="ExemptTax" type="{http://services.sabre.com/sp/reservation/v2_4}TaxCodeType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxRulesType", propOrder = {
    "exemptAllTaxes",
    "exemptTax"
})
public class TaxRulesType {

    @XmlElement(name = "ExemptAllTaxes")
    protected Boolean exemptAllTaxes;
    @XmlElement(name = "ExemptTax")
    protected List<TaxCodeType> exemptTax;

    /**
     * Gets the value of the exemptAllTaxes property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isExemptAllTaxes() {
        return exemptAllTaxes;
    }

    /**
     * Sets the value of the exemptAllTaxes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setExemptAllTaxes(Boolean value) {
        this.exemptAllTaxes = value;
    }

    /**
     * Gets the value of the exemptTax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exemptTax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExemptTax().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxCodeType }
     * 
     * 
     */
    public List<TaxCodeType> getExemptTax() {
        if (exemptTax == null) {
            exemptTax = new ArrayList<TaxCodeType>();
        }
        return this.exemptTax;
    }

}
