//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.12.23 at 04:59:05 PM PST 
//


package com.intuit.ipp.data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.Equals2;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy2;
import org.jvnet.jaxb2_commons.lang.HashCode2;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy2;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="threshold" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="limit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="enforced" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="currentCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="aboveThreshold" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "threshold"
})
@XmlRootElement(name = "Thresholds", namespace = "")
public class Thresholds implements Serializable, Equals2, HashCode2
{

    private final static long serialVersionUID = 1L;
    @XmlElement(namespace = "")
    protected List<Thresholds.Threshold> threshold;

    /**
     * Gets the value of the threshold property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the threshold property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getThreshold().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Thresholds.Threshold }
     * 
     * 
     */
    public List<Thresholds.Threshold> getThreshold() {
        if (threshold == null) {
            threshold = new ArrayList<Thresholds.Threshold>();
        }
        return this.threshold;
    }

    /**
     * Sets the value of the threshold property.
     * 
     * @param threshold
     *     allowed object is
     *     {@link Thresholds.Threshold }
     *     
     */
    public void setThreshold(List<Thresholds.Threshold> threshold) {
        this.threshold = threshold;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Thresholds that = ((Thresholds) object);
        {
            List<Thresholds.Threshold> lhsThreshold;
            lhsThreshold = (((this.threshold!= null)&&(!this.threshold.isEmpty()))?this.getThreshold():null);
            List<Thresholds.Threshold> rhsThreshold;
            rhsThreshold = (((that.threshold!= null)&&(!that.threshold.isEmpty()))?that.getThreshold():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "threshold", lhsThreshold), LocatorUtils.property(thatLocator, "threshold", rhsThreshold), lhsThreshold, rhsThreshold, ((this.threshold!= null)&&(!this.threshold.isEmpty())), ((that.threshold!= null)&&(!that.threshold.isEmpty())))) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy2 strategy) {
        int currentHashCode = 1;
        {
            List<Thresholds.Threshold> theThreshold;
            theThreshold = (((this.threshold!= null)&&(!this.threshold.isEmpty()))?this.getThreshold():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "threshold", theThreshold), currentHashCode, theThreshold, ((this.threshold!= null)&&(!this.threshold.isEmpty())));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="limit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="enforced" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="currentCount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="aboveThreshold" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "name",
        "limit",
        "enforced",
        "currentCount",
        "aboveThreshold"
    })
    public static class Threshold implements Serializable, Equals2, HashCode2
    {

        private final static long serialVersionUID = 1L;
        @XmlElement(namespace = "")
        protected String name;
        @XmlElement(namespace = "")
        protected String limit;
        @XmlElement(namespace = "")
        protected String enforced;
        @XmlElement(namespace = "")
        protected String currentCount;
        @XmlElement(namespace = "")
        protected String aboveThreshold;

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * Gets the value of the limit property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLimit() {
            return limit;
        }

        /**
         * Sets the value of the limit property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLimit(String value) {
            this.limit = value;
        }

        /**
         * Gets the value of the enforced property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEnforced() {
            return enforced;
        }

        /**
         * Sets the value of the enforced property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEnforced(String value) {
            this.enforced = value;
        }

        /**
         * Gets the value of the currentCount property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCurrentCount() {
            return currentCount;
        }

        /**
         * Sets the value of the currentCount property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCurrentCount(String value) {
            this.currentCount = value;
        }

        /**
         * Gets the value of the aboveThreshold property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAboveThreshold() {
            return aboveThreshold;
        }

        /**
         * Sets the value of the aboveThreshold property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAboveThreshold(String value) {
            this.aboveThreshold = value;
        }

        public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
            if ((object == null)||(this.getClass()!= object.getClass())) {
                return false;
            }
            if (this == object) {
                return true;
            }
            final Thresholds.Threshold that = ((Thresholds.Threshold) object);
            {
                String lhsName;
                lhsName = this.getName();
                String rhsName;
                rhsName = that.getName();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "name", lhsName), LocatorUtils.property(thatLocator, "name", rhsName), lhsName, rhsName, (this.name!= null), (that.name!= null))) {
                    return false;
                }
            }
            {
                String lhsLimit;
                lhsLimit = this.getLimit();
                String rhsLimit;
                rhsLimit = that.getLimit();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "limit", lhsLimit), LocatorUtils.property(thatLocator, "limit", rhsLimit), lhsLimit, rhsLimit, (this.limit!= null), (that.limit!= null))) {
                    return false;
                }
            }
            {
                String lhsEnforced;
                lhsEnforced = this.getEnforced();
                String rhsEnforced;
                rhsEnforced = that.getEnforced();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "enforced", lhsEnforced), LocatorUtils.property(thatLocator, "enforced", rhsEnforced), lhsEnforced, rhsEnforced, (this.enforced!= null), (that.enforced!= null))) {
                    return false;
                }
            }
            {
                String lhsCurrentCount;
                lhsCurrentCount = this.getCurrentCount();
                String rhsCurrentCount;
                rhsCurrentCount = that.getCurrentCount();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "currentCount", lhsCurrentCount), LocatorUtils.property(thatLocator, "currentCount", rhsCurrentCount), lhsCurrentCount, rhsCurrentCount, (this.currentCount!= null), (that.currentCount!= null))) {
                    return false;
                }
            }
            {
                String lhsAboveThreshold;
                lhsAboveThreshold = this.getAboveThreshold();
                String rhsAboveThreshold;
                rhsAboveThreshold = that.getAboveThreshold();
                if (!strategy.equals(LocatorUtils.property(thisLocator, "aboveThreshold", lhsAboveThreshold), LocatorUtils.property(thatLocator, "aboveThreshold", rhsAboveThreshold), lhsAboveThreshold, rhsAboveThreshold, (this.aboveThreshold!= null), (that.aboveThreshold!= null))) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object object) {
            final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
            return equals(null, null, object, strategy);
        }

        public int hashCode(ObjectLocator locator, HashCodeStrategy2 strategy) {
            int currentHashCode = 1;
            {
                String theName;
                theName = this.getName();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName, (this.name!= null));
            }
            {
                String theLimit;
                theLimit = this.getLimit();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "limit", theLimit), currentHashCode, theLimit, (this.limit!= null));
            }
            {
                String theEnforced;
                theEnforced = this.getEnforced();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "enforced", theEnforced), currentHashCode, theEnforced, (this.enforced!= null));
            }
            {
                String theCurrentCount;
                theCurrentCount = this.getCurrentCount();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "currentCount", theCurrentCount), currentHashCode, theCurrentCount, (this.currentCount!= null));
            }
            {
                String theAboveThreshold;
                theAboveThreshold = this.getAboveThreshold();
                currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "aboveThreshold", theAboveThreshold), currentHashCode, theAboveThreshold, (this.aboveThreshold!= null));
            }
            return currentHashCode;
        }

        public int hashCode() {
            final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
            return this.hashCode(null, strategy);
        }

    }

}