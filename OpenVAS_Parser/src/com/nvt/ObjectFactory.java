//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.03.02 at 09:01:48 PM CET 
//


package com.nvt;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.nvt package. 
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

    private final static QName _Tags_QNAME = new QName("", "tags");
    private final static QName _Summary_QNAME = new QName("", "summary");
    private final static QName _Count_QNAME = new QName("", "count");
    private final static QName _ModificationTime_QNAME = new QName("", "modification_time");
    private final static QName _CvssBase_QNAME = new QName("", "cvss_base");
    private final static QName _Xrefs_QNAME = new QName("", "xrefs");
    private final static QName _Copyright_QNAME = new QName("", "copyright");
    private final static QName _Type_QNAME = new QName("", "type");
    private final static QName _Version_QNAME = new QName("", "version");
    private final static QName _Category_QNAME = new QName("", "category");
    private final static QName _CveId_QNAME = new QName("", "cve_id");
    private final static QName _Family_QNAME = new QName("", "family");
    private final static QName _Name_QNAME = new QName("", "name");
    private final static QName _Value_QNAME = new QName("", "value");
    private final static QName _PreferenceCount_QNAME = new QName("", "preference_count");
    private final static QName _CreationTime_QNAME = new QName("", "creation_time");
    private final static QName _BugtraqId_QNAME = new QName("", "bugtraq_id");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.nvt
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CertRef }
     * 
     */
    public CertRef createCertRef() {
        return new CertRef();
    }

    /**
     * Create an instance of {@link GetNvtsResponse }
     * 
     */
    public GetNvtsResponse createGetNvtsResponse() {
        return new GetNvtsResponse();
    }

    /**
     * Create an instance of {@link Nvt }
     * 
     */
    public Nvt createNvt() {
        return new Nvt();
    }

    /**
     * Create an instance of {@link UserTags }
     * 
     */
    public UserTags createUserTags() {
        return new UserTags();
    }

    /**
     * Create an instance of {@link Qod }
     * 
     */
    public Qod createQod() {
        return new Qod();
    }

    /**
     * Create an instance of {@link CertRefs }
     * 
     */
    public CertRefs createCertRefs() {
        return new CertRefs();
    }

    /**
     * Create an instance of {@link Timeout }
     * 
     */
    public Timeout createTimeout() {
        return new Timeout();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "tags")
    public JAXBElement<String> createTags(String value) {
        return new JAXBElement<String>(_Tags_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "summary")
    public JAXBElement<String> createSummary(String value) {
        return new JAXBElement<String>(_Summary_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "count")
    public JAXBElement<Byte> createCount(Byte value) {
        return new JAXBElement<Byte>(_Count_QNAME, Byte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "modification_time")
    public JAXBElement<XMLGregorianCalendar> createModificationTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ModificationTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "cvss_base")
    public JAXBElement<BigDecimal> createCvssBase(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_CvssBase_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "xrefs")
    public JAXBElement<String> createXrefs(String value) {
        return new JAXBElement<String>(_Xrefs_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "copyright")
    public JAXBElement<String> createCopyright(String value) {
        return new JAXBElement<String>(_Copyright_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "type")
    public JAXBElement<String> createType(String value) {
        return new JAXBElement<String>(_Type_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "version")
    public JAXBElement<String> createVersion(String value) {
        return new JAXBElement<String>(_Version_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "category")
    public JAXBElement<String> createCategory(String value) {
        return new JAXBElement<String>(_Category_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "cve_id")
    public JAXBElement<String> createCveId(String value) {
        return new JAXBElement<String>(_CveId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "family")
    public JAXBElement<String> createFamily(String value) {
        return new JAXBElement<String>(_Family_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "name")
    public JAXBElement<String> createName(String value) {
        return new JAXBElement<String>(_Name_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "value")
    public JAXBElement<Byte> createValue(Byte value) {
        return new JAXBElement<Byte>(_Value_QNAME, Byte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "preference_count")
    public JAXBElement<Byte> createPreferenceCount(Byte value) {
        return new JAXBElement<Byte>(_PreferenceCount_QNAME, Byte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "creation_time")
    public JAXBElement<XMLGregorianCalendar> createCreationTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CreationTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "bugtraq_id")
    public JAXBElement<String> createBugtraqId(String value) {
        return new JAXBElement<String>(_BugtraqId_QNAME, String.class, null, value);
    }

}