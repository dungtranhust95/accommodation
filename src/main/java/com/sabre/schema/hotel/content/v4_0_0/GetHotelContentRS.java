//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.06.07 at 12:36:19 AM ICT 
//


package com.sabre.schema.hotel.content.v4_0_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.sabre.schema.stl_payload.v02_02.STLResponsePayload;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://services.sabre.com/STL_Payload/v02_02}STL_Response_Payload"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="HotelContentInfos" type="{http://services.sabre.com/hotel/content/v4_0_0}HotelContentInfos" minOccurs="0"/&gt;
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
    "hotelContentInfos"
})
@XmlRootElement(name = "GetHotelContentRS")
public class GetHotelContentRS
    extends STLResponsePayload
{

    @XmlElement(name = "HotelContentInfos")
    protected HotelContentInfos hotelContentInfos;

    /**
     * Gets the value of the hotelContentInfos property.
     * 
     * @return
     *     possible object is
     *     {@link HotelContentInfos }
     *     
     */
    public HotelContentInfos getHotelContentInfos() {
        return hotelContentInfos;
    }

    /**
     * Sets the value of the hotelContentInfos property.
     * 
     * @param value
     *     allowed object is
     *     {@link HotelContentInfos }
     *     
     */
    public void setHotelContentInfos(HotelContentInfos value) {
        this.hotelContentInfos = value;
    }

}
