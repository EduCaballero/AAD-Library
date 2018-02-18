
package jaxb.generados;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para libroType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="libroType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="titulo">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="AAD1"/>
 *               &lt;enumeration value="AAD2"/>
 *               &lt;enumeration value="SEGA"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="autor" maxOccurs="unbounded" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Profesor 1"/>
 *               &lt;enumeration value="Yu Suzuki"/>
 *               &lt;enumeration value="Yuji Naka"/>
 *               &lt;enumeration value="Yuzo Koshiro"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="categoria" maxOccurs="unbounded" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Programación"/>
 *               &lt;enumeration value="Videojuegos"/>
 *               &lt;enumeration value="Ocio"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="lenguaje" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="anyo">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="2009"/>
 *               &lt;enumeration value="2008"/>
 *               &lt;enumeration value="1999"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="edicion" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="7"/>
 *               &lt;enumeration value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="precio">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="19.99"/>
 *               &lt;enumeration value="25.99"/>
 *               &lt;enumeration value="49.99"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="ISBN" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "libroType", propOrder = {
    "titulo",
    "autor",
    "categoria",
    "lenguaje",
    "anyo",
    "edicion",
    "precio"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-02-18T08:57:01+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class LibroType {

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-02-18T08:57:01+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String titulo;
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-02-18T08:57:01+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected List<String> autor;
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-02-18T08:57:01+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected List<String> categoria;
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-02-18T08:57:01+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String lenguaje;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-02-18T08:57:01+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String anyo;
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-02-18T08:57:01+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String edicion;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-02-18T08:57:01+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String precio;
    @XmlAttribute(name = "ISBN")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-02-18T08:57:01+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String isbn;

    /**
     * Obtiene el valor de la propiedad titulo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-02-18T08:57:01+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getTitulo() {
        return titulo;
    }

    /**
     * Define el valor de la propiedad titulo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-02-18T08:57:01+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setTitulo(String value) {
        this.titulo = value;
    }

    /**
     * Gets the value of the autor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the autor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAutor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-02-18T08:57:01+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public List<String> getAutor() {
        if (autor == null) {
            autor = new ArrayList<String>();
        }
        return this.autor;
    }

    /**
     * Gets the value of the categoria property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the categoria property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCategoria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-02-18T08:57:01+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public List<String> getCategoria() {
        if (categoria == null) {
            categoria = new ArrayList<String>();
        }
        return this.categoria;
    }

    /**
     * Obtiene el valor de la propiedad lenguaje.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-02-18T08:57:01+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getLenguaje() {
        return lenguaje;
    }

    /**
     * Define el valor de la propiedad lenguaje.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-02-18T08:57:01+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setLenguaje(String value) {
        this.lenguaje = value;
    }

    /**
     * Obtiene el valor de la propiedad anyo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-02-18T08:57:01+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getAnyo() {
        return anyo;
    }

    /**
     * Define el valor de la propiedad anyo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-02-18T08:57:01+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setAnyo(String value) {
        this.anyo = value;
    }

    /**
     * Obtiene el valor de la propiedad edicion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-02-18T08:57:01+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getEdicion() {
        return edicion;
    }

    /**
     * Define el valor de la propiedad edicion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-02-18T08:57:01+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setEdicion(String value) {
        this.edicion = value;
    }

    /**
     * Obtiene el valor de la propiedad precio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-02-18T08:57:01+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getPrecio() {
        return precio;
    }

    /**
     * Define el valor de la propiedad precio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-02-18T08:57:01+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setPrecio(String value) {
        this.precio = value;
    }

    /**
     * Obtiene el valor de la propiedad isbn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-02-18T08:57:01+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getISBN() {
        return isbn;
    }

    /**
     * Define el valor de la propiedad isbn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-02-18T08:57:01+01:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setISBN(String value) {
        this.isbn = value;
    }

}
