//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.06.17 at 10:54:05 AM ICT 
//


package com.sabre.schema.stl_payload.v02_01;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.sabre.services.stl_payload.v02_01 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ApplicationResults_QNAME = new QName("http://services.sabre.com/STL_Payload/v02_01", "ApplicationResults");
    private final static QName _Results_QNAME = new QName("http://services.sabre.com/STL_Payload/v02_01", "Results");
    private final static QName _STLPayload_QNAME = new QName("http://services.sabre.com/STL_Payload/v02_01", "STL_Payload");
    private final static QName _STLRequestPayload_QNAME = new QName("http://services.sabre.com/STL_Payload/v02_01", "STL_Request_Payload");
    private final static QName _STLResponsePayload_QNAME = new QName("http://services.sabre.com/STL_Payload/v02_01", "STL_Response_Payload");
    private final static QName _STLNotifPayload_QNAME = new QName("http://services.sabre.com/STL_Payload/v02_01", "STL_Notif_Payload");
    private final static QName _ProblemInformation_QNAME = new QName("http://services.sabre.com/STL_Payload/v02_01", "ProblemInformation");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sabre.services.stl_payload.v02_01
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link STLRequestPayload }
     * 
     */
    public STLRequestPayload createSTLRequestPayload() {
        return new STLRequestPayload();
    }

    /**
     * Create an instance of {@link STLPayload }
     * 
     */
    public STLPayload createSTLPayload() {
        return new STLPayload();
    }

    /**
     * Create an instance of {@link STLResponsePayload }
     * 
     */
    public STLResponsePayload createSTLResponsePayload() {
        return new STLResponsePayload();
    }

    /**
     * Create an instance of {@link ApplicationResults }
     * 
     */
    public ApplicationResults createApplicationResults() {
        return new ApplicationResults();
    }

    /**
     * Create an instance of {@link Results }
     * 
     */
    public Results createResults() {
        return new Results();
    }

    /**
     * Create an instance of {@link STLNotifPayload }
     * 
     */
    public STLNotifPayload createSTLNotifPayload() {
        return new STLNotifPayload();
    }

    /**
     * Create an instance of {@link ProblemInformation }
     * 
     */
    public ProblemInformation createProblemInformation() {
        return new ProblemInformation();
    }

    /**
     * Create an instance of {@link SystemSpecificResults }
     * 
     */
    public SystemSpecificResults createSystemSpecificResults() {
        return new SystemSpecificResults();
    }

    /**
     * Create an instance of {@link HostCommand }
     * 
     */
    public HostCommand createHostCommand() {
        return new HostCommand();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ApplicationResults }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ApplicationResults }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.sabre.com/STL_Payload/v02_01", name = "ApplicationResults", substitutionHeadNamespace = "http://services.sabre.com/STL_Payload/v02_01", substitutionHeadName = "Results")
    public JAXBElement<ApplicationResults> createApplicationResults(ApplicationResults value) {
        return new JAXBElement<ApplicationResults>(_ApplicationResults_QNAME, ApplicationResults.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Results }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Results }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.sabre.com/STL_Payload/v02_01", name = "Results")
    public JAXBElement<Results> createResults(Results value) {
        return new JAXBElement<Results>(_Results_QNAME, Results.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link STLPayload }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link STLPayload }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.sabre.com/STL_Payload/v02_01", name = "STL_Payload")
    public JAXBElement<STLPayload> createSTLPayload(STLPayload value) {
        return new JAXBElement<STLPayload>(_STLPayload_QNAME, STLPayload.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link STLRequestPayload }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link STLRequestPayload }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.sabre.com/STL_Payload/v02_01", name = "STL_Request_Payload", substitutionHeadNamespace = "http://services.sabre.com/STL_Payload/v02_01", substitutionHeadName = "STL_Payload")
    public JAXBElement<STLRequestPayload> createSTLRequestPayload(STLRequestPayload value) {
        return new JAXBElement<STLRequestPayload>(_STLRequestPayload_QNAME, STLRequestPayload.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link STLResponsePayload }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link STLResponsePayload }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.sabre.com/STL_Payload/v02_01", name = "STL_Response_Payload", substitutionHeadNamespace = "http://services.sabre.com/STL_Payload/v02_01", substitutionHeadName = "STL_Payload")
    public JAXBElement<STLResponsePayload> createSTLResponsePayload(STLResponsePayload value) {
        return new JAXBElement<STLResponsePayload>(_STLResponsePayload_QNAME, STLResponsePayload.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link STLNotifPayload }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link STLNotifPayload }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.sabre.com/STL_Payload/v02_01", name = "STL_Notif_Payload", substitutionHeadNamespace = "http://services.sabre.com/STL_Payload/v02_01", substitutionHeadName = "STL_Payload")
    public JAXBElement<STLNotifPayload> createSTLNotifPayload(STLNotifPayload value) {
        return new JAXBElement<STLNotifPayload>(_STLNotifPayload_QNAME, STLNotifPayload.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProblemInformation }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ProblemInformation }{@code >}
     */
    @XmlElementDecl(namespace = "http://services.sabre.com/STL_Payload/v02_01", name = "ProblemInformation")
    public JAXBElement<ProblemInformation> createProblemInformation(ProblemInformation value) {
        return new JAXBElement<ProblemInformation>(_ProblemInformation_QNAME, ProblemInformation.class, null, value);
    }

}
