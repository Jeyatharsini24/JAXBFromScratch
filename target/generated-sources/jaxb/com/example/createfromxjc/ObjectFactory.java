//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.09.17 at 06:56:09 PM IST 
//


package com.example.createfromxjc;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.example.createfromxjc package. 
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

    private final static QName _Training_QNAME = new QName("", "training");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.example.createfromxjc
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Main }
     * 
     */
    public Main createMain() {
        return new Main();
    }

    /**
     * Create an instance of {@link Person }
     * 
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link Training }
     * 
     */
    public Training createTraining() {
        return new Training();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Training }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "training")
    public JAXBElement<Training> createTraining(Training value) {
        return new JAXBElement<Training>(_Training_QNAME, Training.class, null, value);
    }

}
