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
 * <p>Java class for SegmentAssociationList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SegmentAssociationList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SegmentAssociationTag" type="{http://services.sabre.com/sp/reservation/v2_4}SegmentAssociationTag" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SegmentAssociationId" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SegmentAssociationList", propOrder = {
    "segmentAssociationTag",
    "segmentAssociationId"
})
public class SegmentAssociationList {

    @XmlElement(name = "SegmentAssociationTag")
    protected List<SegmentAssociationTag> segmentAssociationTag;
    @XmlElement(name = "SegmentAssociationId", type = Integer.class)
    protected List<Integer> segmentAssociationId;

    /**
     * Gets the value of the segmentAssociationTag property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the segmentAssociationTag property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSegmentAssociationTag().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SegmentAssociationTag }
     * 
     * 
     */
    public List<SegmentAssociationTag> getSegmentAssociationTag() {
        if (segmentAssociationTag == null) {
            segmentAssociationTag = new ArrayList<SegmentAssociationTag>();
        }
        return this.segmentAssociationTag;
    }

    /**
     * Gets the value of the segmentAssociationId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the segmentAssociationId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSegmentAssociationId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getSegmentAssociationId() {
        if (segmentAssociationId == null) {
            segmentAssociationId = new ArrayList<Integer>();
        }
        return this.segmentAssociationId;
    }

}
