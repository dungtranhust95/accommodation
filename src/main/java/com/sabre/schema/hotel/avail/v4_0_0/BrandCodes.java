//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.06.07 at 12:36:19 AM ICT 
//


package com.sabre.schema.hotel.avail.v4_0_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 Optional. Limit  Maximum 20
 *             
 * 
 * <p>Java class for BrandCodes complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BrandCodes"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence maxOccurs="20"&gt;
 *         &lt;element name="BrandCode" type="{http://services.sabre.com/hotel/avail/v4_0_0}AlphaNumericLength1to20"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BrandCodes", propOrder = {
    "brandCodes"
})
public class BrandCodes {

    @XmlElement(name = "BrandCode", required = true)
    protected List<String> brandCodes;

    /**
     * Gets the value of the brandCodes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the brandCodes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBrandCodes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getBrandCodes() {
        if (brandCodes == null) {
            brandCodes = new ArrayList<String>();
        }
        return this.brandCodes;
    }

}
