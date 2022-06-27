//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.06.07 at 12:36:19 AM ICT 
//


package com.sabre.schema.hotel.avail.v4_0_0;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PrepaidQualifierType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PrepaidQualifierType"&gt;
 *   &lt;restriction base="{http://services.sabre.com/hotel/avail/v4_0_0}StringLength1to15"&gt;
 *     &lt;enumeration value="IncludePrepaid"/&gt;
 *     &lt;enumeration value="PrepaidOnly"/&gt;
 *     &lt;enumeration value="ExcludePrepaid"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PrepaidQualifierType")
@XmlEnum
public enum PrepaidQualifierType {


    /**
     * Inclusion of prepaid.
     * 
     */
    @XmlEnumValue("IncludePrepaid")
    INCLUDE_PREPAID("IncludePrepaid"),

    /**
     * Only prepaid is allowed.
     * 
     */
    @XmlEnumValue("PrepaidOnly")
    PREPAID_ONLY("PrepaidOnly"),

    /**
     * Exclusion of prepaid.
     * 
     */
    @XmlEnumValue("ExcludePrepaid")
    EXCLUDE_PREPAID("ExcludePrepaid");
    private final String value;

    PrepaidQualifierType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PrepaidQualifierType fromValue(String v) {
        for (PrepaidQualifierType c: PrepaidQualifierType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
