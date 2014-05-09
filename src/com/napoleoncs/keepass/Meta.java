//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.11 at 03:02:41 PM EDT 
//


package com.napoleoncs.keepass;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Meta complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Meta">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Generator" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DatabaseName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DatabaseNameChanged" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DatabaseDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DatabaseDescriptionChanged" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DefaultUserName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DefaultUserNameChanged" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="MaintenanceHistoryDays" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="Color" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="MasterKeyChanged" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="MasterKeyChangeRec" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="MasterKeyChangeForce" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="MemoryProtection">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ProtectTitle" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="ProtectUserName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="ProtectPassword" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="ProtectURL" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="ProtectNotes" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CustomIcons">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Icon" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="UUID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Data" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RecycleBinEnabled" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RecycleBinUUID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="RecycleBinChanged" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="EntryTemplatesGroup" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="EntryTemplatesGroupChanged" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="HistoryMaxItems" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="HistoryMaxSize" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="LastSelectedGroup" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LastTopVisibleGroup" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Binaries" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CustomData" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Meta", propOrder = {
    "generator",
    "databaseName",
    "databaseNameChanged",
    "databaseDescription",
    "databaseDescriptionChanged",
    "defaultUserName",
    "defaultUserNameChanged",
    "maintenanceHistoryDays",
    "color",
    "masterKeyChanged",
    "masterKeyChangeRec",
    "masterKeyChangeForce",
    "memoryProtection",
    "customIcons",
    "recycleBinEnabled",
    "recycleBinUUID",
    "recycleBinChanged",
    "entryTemplatesGroup",
    "entryTemplatesGroupChanged",
    "historyMaxItems",
    "historyMaxSize",
    "lastSelectedGroup",
    "lastTopVisibleGroup",
    "binaries",
    "customData"
})
public class Meta {

    @XmlElement(name = "Generator", required = true)
    protected String generator;
    @XmlElement(name = "DatabaseName", required = true)
    protected String databaseName;
    @XmlElement(name = "DatabaseNameChanged", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar databaseNameChanged;
    @XmlElement(name = "DatabaseDescription", required = true)
    protected String databaseDescription;
    @XmlElement(name = "DatabaseDescriptionChanged", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar databaseDescriptionChanged;
    @XmlElement(name = "DefaultUserName", required = true)
    protected String defaultUserName;
    @XmlElement(name = "DefaultUserNameChanged", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar defaultUserNameChanged;
    @XmlElement(name = "MaintenanceHistoryDays")
    protected short maintenanceHistoryDays;
    @XmlElement(name = "Color", required = true)
    protected String color;
    @XmlElement(name = "MasterKeyChanged", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar masterKeyChanged;
    @XmlElement(name = "MasterKeyChangeRec")
    protected byte masterKeyChangeRec;
    @XmlElement(name = "MasterKeyChangeForce")
    protected byte masterKeyChangeForce;
    @XmlElement(name = "MemoryProtection", required = true)
    protected Meta.MemoryProtection memoryProtection;
    @XmlElement(name = "CustomIcons", required = true)
    protected Meta.CustomIcons customIcons;
    @XmlElement(name = "RecycleBinEnabled", required = true)
    protected String recycleBinEnabled;
    @XmlElement(name = "RecycleBinUUID", required = true)
    protected String recycleBinUUID;
    @XmlElement(name = "RecycleBinChanged", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar recycleBinChanged;
    @XmlElement(name = "EntryTemplatesGroup", required = true)
    protected String entryTemplatesGroup;
    @XmlElement(name = "EntryTemplatesGroupChanged", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar entryTemplatesGroupChanged;
    @XmlElement(name = "HistoryMaxItems")
    protected byte historyMaxItems;
    @XmlElement(name = "HistoryMaxSize")
    protected int historyMaxSize;
    @XmlElement(name = "LastSelectedGroup", required = true)
    protected String lastSelectedGroup;
    @XmlElement(name = "LastTopVisibleGroup", required = true)
    protected String lastTopVisibleGroup;
    @XmlElement(name = "Binaries", required = true)
    protected String binaries;
    @XmlElement(name = "CustomData", required = true)
    protected String customData;

    /**
     * Gets the value of the generator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenerator() {
        return generator;
    }

    /**
     * Sets the value of the generator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenerator(String value) {
        this.generator = value;
    }

    /**
     * Gets the value of the databaseName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatabaseName() {
        return databaseName;
    }

    /**
     * Sets the value of the databaseName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatabaseName(String value) {
        this.databaseName = value;
    }

    /**
     * Gets the value of the databaseNameChanged property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatabaseNameChanged() {
        return databaseNameChanged;
    }

    /**
     * Sets the value of the databaseNameChanged property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatabaseNameChanged(XMLGregorianCalendar value) {
        this.databaseNameChanged = value;
    }

    /**
     * Gets the value of the databaseDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatabaseDescription() {
        return databaseDescription;
    }

    /**
     * Sets the value of the databaseDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatabaseDescription(String value) {
        this.databaseDescription = value;
    }

    /**
     * Gets the value of the databaseDescriptionChanged property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatabaseDescriptionChanged() {
        return databaseDescriptionChanged;
    }

    /**
     * Sets the value of the databaseDescriptionChanged property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatabaseDescriptionChanged(XMLGregorianCalendar value) {
        this.databaseDescriptionChanged = value;
    }

    /**
     * Gets the value of the defaultUserName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultUserName() {
        return defaultUserName;
    }

    /**
     * Sets the value of the defaultUserName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultUserName(String value) {
        this.defaultUserName = value;
    }

    /**
     * Gets the value of the defaultUserNameChanged property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDefaultUserNameChanged() {
        return defaultUserNameChanged;
    }

    /**
     * Sets the value of the defaultUserNameChanged property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDefaultUserNameChanged(XMLGregorianCalendar value) {
        this.defaultUserNameChanged = value;
    }

    /**
     * Gets the value of the maintenanceHistoryDays property.
     * 
     */
    public short getMaintenanceHistoryDays() {
        return maintenanceHistoryDays;
    }

    /**
     * Sets the value of the maintenanceHistoryDays property.
     * 
     */
    public void setMaintenanceHistoryDays(short value) {
        this.maintenanceHistoryDays = value;
    }

    /**
     * Gets the value of the color property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColor() {
        return color;
    }

    /**
     * Sets the value of the color property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColor(String value) {
        this.color = value;
    }

    /**
     * Gets the value of the masterKeyChanged property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getMasterKeyChanged() {
        return masterKeyChanged;
    }

    /**
     * Sets the value of the masterKeyChanged property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setMasterKeyChanged(XMLGregorianCalendar value) {
        this.masterKeyChanged = value;
    }

    /**
     * Gets the value of the masterKeyChangeRec property.
     * 
     */
    public byte getMasterKeyChangeRec() {
        return masterKeyChangeRec;
    }

    /**
     * Sets the value of the masterKeyChangeRec property.
     * 
     */
    public void setMasterKeyChangeRec(byte value) {
        this.masterKeyChangeRec = value;
    }

    /**
     * Gets the value of the masterKeyChangeForce property.
     * 
     */
    public byte getMasterKeyChangeForce() {
        return masterKeyChangeForce;
    }

    /**
     * Sets the value of the masterKeyChangeForce property.
     * 
     */
    public void setMasterKeyChangeForce(byte value) {
        this.masterKeyChangeForce = value;
    }

    /**
     * Gets the value of the memoryProtection property.
     * 
     * @return
     *     possible object is
     *     {@link Meta.MemoryProtection }
     *     
     */
    public Meta.MemoryProtection getMemoryProtection() {
        return memoryProtection;
    }

    /**
     * Sets the value of the memoryProtection property.
     * 
     * @param value
     *     allowed object is
     *     {@link Meta.MemoryProtection }
     *     
     */
    public void setMemoryProtection(Meta.MemoryProtection value) {
        this.memoryProtection = value;
    }

    /**
     * Gets the value of the customIcons property.
     * 
     * @return
     *     possible object is
     *     {@link Meta.CustomIcons }
     *     
     */
    public Meta.CustomIcons getCustomIcons() {
        return customIcons;
    }

    /**
     * Sets the value of the customIcons property.
     * 
     * @param value
     *     allowed object is
     *     {@link Meta.CustomIcons }
     *     
     */
    public void setCustomIcons(Meta.CustomIcons value) {
        this.customIcons = value;
    }

    /**
     * Gets the value of the recycleBinEnabled property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecycleBinEnabled() {
        return recycleBinEnabled;
    }

    /**
     * Sets the value of the recycleBinEnabled property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecycleBinEnabled(String value) {
        this.recycleBinEnabled = value;
    }

    /**
     * Gets the value of the recycleBinUUID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecycleBinUUID() {
        return recycleBinUUID;
    }

    /**
     * Sets the value of the recycleBinUUID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecycleBinUUID(String value) {
        this.recycleBinUUID = value;
    }

    /**
     * Gets the value of the recycleBinChanged property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRecycleBinChanged() {
        return recycleBinChanged;
    }

    /**
     * Sets the value of the recycleBinChanged property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRecycleBinChanged(XMLGregorianCalendar value) {
        this.recycleBinChanged = value;
    }

    /**
     * Gets the value of the entryTemplatesGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntryTemplatesGroup() {
        return entryTemplatesGroup;
    }

    /**
     * Sets the value of the entryTemplatesGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntryTemplatesGroup(String value) {
        this.entryTemplatesGroup = value;
    }

    /**
     * Gets the value of the entryTemplatesGroupChanged property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEntryTemplatesGroupChanged() {
        return entryTemplatesGroupChanged;
    }

    /**
     * Sets the value of the entryTemplatesGroupChanged property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEntryTemplatesGroupChanged(XMLGregorianCalendar value) {
        this.entryTemplatesGroupChanged = value;
    }

    /**
     * Gets the value of the historyMaxItems property.
     * 
     */
    public byte getHistoryMaxItems() {
        return historyMaxItems;
    }

    /**
     * Sets the value of the historyMaxItems property.
     * 
     */
    public void setHistoryMaxItems(byte value) {
        this.historyMaxItems = value;
    }

    /**
     * Gets the value of the historyMaxSize property.
     * 
     */
    public int getHistoryMaxSize() {
        return historyMaxSize;
    }

    /**
     * Sets the value of the historyMaxSize property.
     * 
     */
    public void setHistoryMaxSize(int value) {
        this.historyMaxSize = value;
    }

    /**
     * Gets the value of the lastSelectedGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastSelectedGroup() {
        return lastSelectedGroup;
    }

    /**
     * Sets the value of the lastSelectedGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastSelectedGroup(String value) {
        this.lastSelectedGroup = value;
    }

    /**
     * Gets the value of the lastTopVisibleGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastTopVisibleGroup() {
        return lastTopVisibleGroup;
    }

    /**
     * Sets the value of the lastTopVisibleGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastTopVisibleGroup(String value) {
        this.lastTopVisibleGroup = value;
    }

    /**
     * Gets the value of the binaries property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBinaries() {
        return binaries;
    }

    /**
     * Sets the value of the binaries property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBinaries(String value) {
        this.binaries = value;
    }

    /**
     * Gets the value of the customData property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomData() {
        return customData;
    }

    /**
     * Sets the value of the customData property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomData(String value) {
        this.customData = value;
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
     *         &lt;element name="Icon" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="UUID" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Data" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "icon"
    })
    public static class CustomIcons {

        @XmlElement(name = "Icon")
        protected List<Meta.CustomIcons.Icon> icon;

        /**
         * Gets the value of the icon property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the icon property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getIcon().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Meta.CustomIcons.Icon }
         * 
         * 
         */
        public List<Meta.CustomIcons.Icon> getIcon() {
            if (icon == null) {
                icon = new ArrayList<Meta.CustomIcons.Icon>();
            }
            return this.icon;
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
         *         &lt;element name="UUID" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Data" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "uuid",
            "data"
        })
        public static class Icon {

            @XmlElement(name = "UUID", required = true)
            protected String uuid;
            @XmlElement(name = "Data", required = true)
            protected String data;

            /**
             * Gets the value of the uuid property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUUID() {
                return uuid;
            }

            /**
             * Sets the value of the uuid property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUUID(String value) {
                this.uuid = value;
            }

            /**
             * Gets the value of the data property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getData() {
                return data;
            }

            /**
             * Sets the value of the data property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setData(String value) {
                this.data = value;
            }

        }

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
     *         &lt;element name="ProtectTitle" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="ProtectUserName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="ProtectPassword" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="ProtectURL" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="ProtectNotes" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "protectTitle",
        "protectUserName",
        "protectPassword",
        "protectURL",
        "protectNotes"
    })
    public static class MemoryProtection {

        @XmlElement(name = "ProtectTitle", required = true)
        protected String protectTitle;
        @XmlElement(name = "ProtectUserName", required = true)
        protected String protectUserName;
        @XmlElement(name = "ProtectPassword", required = true)
        protected String protectPassword;
        @XmlElement(name = "ProtectURL", required = true)
        protected String protectURL;
        @XmlElement(name = "ProtectNotes", required = true)
        protected String protectNotes;

        /**
         * Gets the value of the protectTitle property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProtectTitle() {
            return protectTitle;
        }

        /**
         * Sets the value of the protectTitle property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProtectTitle(String value) {
            this.protectTitle = value;
        }

        /**
         * Gets the value of the protectUserName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProtectUserName() {
            return protectUserName;
        }

        /**
         * Sets the value of the protectUserName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProtectUserName(String value) {
            this.protectUserName = value;
        }

        /**
         * Gets the value of the protectPassword property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProtectPassword() {
            return protectPassword;
        }

        /**
         * Sets the value of the protectPassword property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProtectPassword(String value) {
            this.protectPassword = value;
        }

        /**
         * Gets the value of the protectURL property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProtectURL() {
            return protectURL;
        }

        /**
         * Sets the value of the protectURL property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProtectURL(String value) {
            this.protectURL = value;
        }

        /**
         * Gets the value of the protectNotes property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProtectNotes() {
            return protectNotes;
        }

        /**
         * Sets the value of the protectNotes property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProtectNotes(String value) {
            this.protectNotes = value;
        }

    }

}
