//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.06.07 at 12:36:19 AM ICT 
//


package com.sabre.schema.stl_messagecommon.v02_02;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CompletionCodes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CompletionCodes"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="Complete"/&gt;
 *     &lt;enumeration value="Incomplete"/&gt;
 *     &lt;enumeration value="NotProcessed"/&gt;
 *     &lt;enumeration value="Unknown"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CompletionCodes", namespace = "http://services.sabre.com/STL_MessageCommon/v02_02")
@XmlEnum
public enum CompletionCodes {

    @XmlEnumValue("Complete")
    COMPLETE("Complete"),
    @XmlEnumValue("Incomplete")
    INCOMPLETE("Incomplete"),
    @XmlEnumValue("NotProcessed")
    NOT_PROCESSED("NotProcessed"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    CompletionCodes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CompletionCodes fromValue(String v) {
        for (CompletionCodes c: CompletionCodes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}