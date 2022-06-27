//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.06.07 at 10:14:00 PM ICT 
//


package com.sabre.schema.hotel.details.v3_0_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.sabre.schema.stl_payload.v02_02.STLRequestPayload;


/**
 * Hotel Detail Request
 * 
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://services.sabre.com/STL_Payload/v02_02}STL_Request_Payload"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="POS" type="{http://services.sabre.com/hotel/details/v3_0_0}POS" minOccurs="0"/&gt;
 *         &lt;element name="SearchCriteria" type="{http://services.sabre.com/hotel/details/v3_0_0}SearchCriteria"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "pos",
    "searchCriteria"
})
@XmlRootElement(name = "GetHotelDetailsRQ")
public class GetHotelDetailsRQ
    extends STLRequestPayload
{

    @XmlElement(name = "POS")
    protected POS pos;
    @XmlElement(name = "SearchCriteria", required = true)
    protected SearchCriteria searchCriteria;

    /**
     * Gets the value of the pos property.
     *
     * @return
     *     possible object is
     *     {@link POS }
     *
     */
    public POS getPOS() {
        return pos;
    }

    /**
     * Sets the value of the pos property.
     *
     * @param value
     *     allowed object is
     *     {@link POS }
     *
     */
    public void setPOS(POS value) {
        this.pos = value;
    }

    /**
     * Gets the value of the searchCriteria property.
     *
     * @return
     *     possible object is
     *     {@link SearchCriteria }
     *
     */
    public SearchCriteria getSearchCriteria() {
        return searchCriteria;
    }

    /**
     * Sets the value of the searchCriteria property.
     *
     * @param value
     *     allowed object is
     *     {@link SearchCriteria }
     *     
     */
    public void setSearchCriteria(SearchCriteria value) {
        this.searchCriteria = value;
    }

}
