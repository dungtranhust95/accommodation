//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.06.17 at 10:54:05 AM ICT 
//


package com.sabre.schema.sp.reservation.v2_4;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Open Reservation Element Type used to store accounting field data
 *                 Transaction is a choice in original TIR schema, this was simplified for easier xsd -> JSON conversion.
 *                 For original schemas please refer to https://beta.developer.sabre.com/docs/soap_apis/management/itinerary/Get_Itinerary
 * 
 * <p>Java class for AccountingField complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountingField"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Transaction" type="{http://services.sabre.com/sp/reservation/v2_4}AccountingTransaction" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountingField", propOrder = {
    "transaction"
})
public class AccountingField {

    @XmlElement(name = "Transaction")
    protected AccountingTransaction transaction;

    /**
     * Gets the value of the transaction property.
     * 
     * @return
     *     possible object is
     *     {@link AccountingTransaction }
     *     
     */
    public AccountingTransaction getTransaction() {
        return transaction;
    }

    /**
     * Sets the value of the transaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountingTransaction }
     *     
     */
    public void setTransaction(AccountingTransaction value) {
        this.transaction = value;
    }

}
