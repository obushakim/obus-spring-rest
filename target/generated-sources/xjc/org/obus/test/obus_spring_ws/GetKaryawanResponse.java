//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.03 at 11:38:46 PM ICT 
//


package org.obus.test.obus_spring_ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="karyawanInfo" type="{http://obus.org/test/obus-spring-ws}karyawanInfo"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "karyawanInfo"
})
@XmlRootElement(name = "getKaryawanResponse")
public class GetKaryawanResponse {

    @XmlElement(required = true)
    protected KaryawanInfo karyawanInfo;

    /**
     * Gets the value of the karyawanInfo property.
     * 
     * @return
     *     possible object is
     *     {@link KaryawanInfo }
     *     
     */
    public KaryawanInfo getKaryawanInfo() {
        return karyawanInfo;
    }

    /**
     * Sets the value of the karyawanInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link KaryawanInfo }
     *     
     */
    public void setKaryawanInfo(KaryawanInfo value) {
        this.karyawanInfo = value;
    }

}
