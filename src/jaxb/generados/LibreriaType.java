
package jaxb.generados;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para libreriaType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="libreriaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="libro" type="{}libroType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "libreriaType", propOrder = {
    "libro"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-02-18T08:57:01+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class LibreriaType {

    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-02-18T08:57:01+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected List<LibroType> libro;

    /**
     * Gets the value of the libro property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the libro property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLibro().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LibroType }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-02-18T08:57:01+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public List<LibroType> getLibro() {
        if (libro == null) {
            libro = new ArrayList<LibroType>();
        }
        return this.libro;
    }

}
