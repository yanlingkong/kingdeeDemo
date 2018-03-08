
package com.kingdee.controller.kingdee;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CashFlow complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="CashFlow"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FEntryid" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="FEntryid2" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="FAmountFor" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="FAmount" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="FAccNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FAccName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FItemNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FItemName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FClassNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FClassName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FSubItemNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FSubItemName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FSubClassNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FSubClassName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FCurrencyNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FCurrencyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashFlow", propOrder = {
    "fEntryid",
    "fEntryid2",
    "fAmountFor",
    "fAmount",
    "fAccNumber",
    "fAccName",
    "fItemNumber",
    "fItemName",
    "fClassNumber",
    "fClassName",
    "fSubItemNumber",
    "fSubItemName",
    "fSubClassNumber",
    "fSubClassName",
    "fCurrencyNumber",
    "fCurrencyName"
})
public class CashFlow {

    @XmlElement(name = "FEntryid")
    protected Long fEntryid;
    @XmlElement(name = "FEntryid2")
    protected Long fEntryid2;
    @XmlElement(name = "FAmountFor")
    protected Double fAmountFor;
    @XmlElement(name = "FAmount")
    protected Double fAmount;
    @XmlElement(name = "FAccNumber")
    protected String fAccNumber;
    @XmlElement(name = "FAccName")
    protected String fAccName;
    @XmlElement(name = "FItemNumber")
    protected String fItemNumber;
    @XmlElement(name = "FItemName")
    protected String fItemName;
    @XmlElement(name = "FClassNumber")
    protected String fClassNumber;
    @XmlElement(name = "FClassName")
    protected String fClassName;
    @XmlElement(name = "FSubItemNumber")
    protected String fSubItemNumber;
    @XmlElement(name = "FSubItemName")
    protected String fSubItemName;
    @XmlElement(name = "FSubClassNumber")
    protected String fSubClassNumber;
    @XmlElement(name = "FSubClassName")
    protected String fSubClassName;
    @XmlElement(name = "FCurrencyNumber")
    protected String fCurrencyNumber;
    @XmlElement(name = "FCurrencyName")
    protected String fCurrencyName;

    /**
     * ��ȡfEntryid���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFEntryid() {
        return fEntryid;
    }

    /**
     * ����fEntryid���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFEntryid(Long value) {
        this.fEntryid = value;
    }

    /**
     * ��ȡfEntryid2���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFEntryid2() {
        return fEntryid2;
    }

    /**
     * ����fEntryid2���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFEntryid2(Long value) {
        this.fEntryid2 = value;
    }

    /**
     * ��ȡfAmountFor���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFAmountFor() {
        return fAmountFor;
    }

    /**
     * ����fAmountFor���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFAmountFor(Double value) {
        this.fAmountFor = value;
    }

    /**
     * ��ȡfAmount���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getFAmount() {
        return fAmount;
    }

    /**
     * ����fAmount���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setFAmount(Double value) {
        this.fAmount = value;
    }

    /**
     * ��ȡfAccNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFAccNumber() {
        return fAccNumber;
    }

    /**
     * ����fAccNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFAccNumber(String value) {
        this.fAccNumber = value;
    }

    /**
     * ��ȡfAccName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFAccName() {
        return fAccName;
    }

    /**
     * ����fAccName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFAccName(String value) {
        this.fAccName = value;
    }

    /**
     * ��ȡfItemNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFItemNumber() {
        return fItemNumber;
    }

    /**
     * ����fItemNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFItemNumber(String value) {
        this.fItemNumber = value;
    }

    /**
     * ��ȡfItemName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFItemName() {
        return fItemName;
    }

    /**
     * ����fItemName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFItemName(String value) {
        this.fItemName = value;
    }

    /**
     * ��ȡfClassNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFClassNumber() {
        return fClassNumber;
    }

    /**
     * ����fClassNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFClassNumber(String value) {
        this.fClassNumber = value;
    }

    /**
     * ��ȡfClassName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFClassName() {
        return fClassName;
    }

    /**
     * ����fClassName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFClassName(String value) {
        this.fClassName = value;
    }

    /**
     * ��ȡfSubItemNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFSubItemNumber() {
        return fSubItemNumber;
    }

    /**
     * ����fSubItemNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFSubItemNumber(String value) {
        this.fSubItemNumber = value;
    }

    /**
     * ��ȡfSubItemName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFSubItemName() {
        return fSubItemName;
    }

    /**
     * ����fSubItemName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFSubItemName(String value) {
        this.fSubItemName = value;
    }

    /**
     * ��ȡfSubClassNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFSubClassNumber() {
        return fSubClassNumber;
    }

    /**
     * ����fSubClassNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFSubClassNumber(String value) {
        this.fSubClassNumber = value;
    }

    /**
     * ��ȡfSubClassName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFSubClassName() {
        return fSubClassName;
    }

    /**
     * ����fSubClassName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFSubClassName(String value) {
        this.fSubClassName = value;
    }

    /**
     * ��ȡfCurrencyNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFCurrencyNumber() {
        return fCurrencyNumber;
    }

    /**
     * ����fCurrencyNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFCurrencyNumber(String value) {
        this.fCurrencyNumber = value;
    }

    /**
     * ��ȡfCurrencyName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFCurrencyName() {
        return fCurrencyName;
    }

    /**
     * ����fCurrencyName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFCurrencyName(String value) {
        this.fCurrencyName = value;
    }

}
