
package com.kingdee.controller.kingdee;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Voucher complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="Voucher"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FExplanation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FAttachments" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="FCashier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FHandler" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="FPeriod" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="FPoster" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FPreparer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FSerialNum" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="FTransDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FYear" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="Entries" type="{http://www.kingdee.com/VoucherData}Entries" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="CashFlow" type="{http://www.kingdee.com/VoucherData}CashFlow" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Voucher", propOrder = {
    "fDate",
    "fExplanation",
    "fAttachments",
    "fCashier",
    "fGroup",
    "fHandler",
    "fNumber",
    "fPeriod",
    "fPoster",
    "fPreparer",
    "fReference",
    "fSerialNum",
    "fTransDate",
    "fYear",
    "entries",
    "cashFlow"
})
public class Voucher {

    @XmlElement(name = "FDate")
    protected String fDate;
    @XmlElement(name = "FExplanation")
    protected String fExplanation;
    @XmlElement(name = "FAttachments")
    protected Long fAttachments;
    @XmlElement(name = "FCashier")
    protected String fCashier;
    @XmlElement(name = "FGroup")
    protected String fGroup;
    @XmlElement(name = "FHandler")
    protected String fHandler;
    @XmlElement(name = "FNumber")
    protected Long fNumber;
    @XmlElement(name = "FPeriod")
    protected Long fPeriod;
    @XmlElement(name = "FPoster")
    protected String fPoster;
    @XmlElement(name = "FPreparer")
    protected String fPreparer;
    @XmlElement(name = "FReference")
    protected String fReference;
    @XmlElement(name = "FSerialNum")
    protected Long fSerialNum;
    @XmlElement(name = "FTransDate")
    protected String fTransDate;
    @XmlElement(name = "FYear")
    protected Long fYear;
    @XmlElement(name = "Entries")
    protected List<Entries> entries;
    @XmlElement(name = "CashFlow")
    protected List<CashFlow> cashFlow;

    /**
     * ��ȡfDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFDate() {
        return fDate;
    }

    /**
     * ����fDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFDate(String value) {
        this.fDate = value;
    }

    /**
     * ��ȡfExplanation���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFExplanation() {
        return fExplanation;
    }

    /**
     * ����fExplanation���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFExplanation(String value) {
        this.fExplanation = value;
    }

    /**
     * ��ȡfAttachments���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFAttachments() {
        return fAttachments;
    }

    /**
     * ����fAttachments���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFAttachments(Long value) {
        this.fAttachments = value;
    }

    /**
     * ��ȡfCashier���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFCashier() {
        return fCashier;
    }

    /**
     * ����fCashier���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFCashier(String value) {
        this.fCashier = value;
    }

    /**
     * ��ȡfGroup���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFGroup() {
        return fGroup;
    }

    /**
     * ����fGroup���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFGroup(String value) {
        this.fGroup = value;
    }

    /**
     * ��ȡfHandler���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFHandler() {
        return fHandler;
    }

    /**
     * ����fHandler���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFHandler(String value) {
        this.fHandler = value;
    }

    /**
     * ��ȡfNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFNumber() {
        return fNumber;
    }

    /**
     * ����fNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFNumber(Long value) {
        this.fNumber = value;
    }

    /**
     * ��ȡfPeriod���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFPeriod() {
        return fPeriod;
    }

    /**
     * ����fPeriod���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFPeriod(Long value) {
        this.fPeriod = value;
    }

    /**
     * ��ȡfPoster���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFPoster() {
        return fPoster;
    }

    /**
     * ����fPoster���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFPoster(String value) {
        this.fPoster = value;
    }

    /**
     * ��ȡfPreparer���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFPreparer() {
        return fPreparer;
    }

    /**
     * ����fPreparer���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFPreparer(String value) {
        this.fPreparer = value;
    }

    /**
     * ��ȡfReference���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFReference() {
        return fReference;
    }

    /**
     * ����fReference���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFReference(String value) {
        this.fReference = value;
    }

    /**
     * ��ȡfSerialNum���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFSerialNum() {
        return fSerialNum;
    }

    /**
     * ����fSerialNum���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFSerialNum(Long value) {
        this.fSerialNum = value;
    }

    /**
     * ��ȡfTransDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFTransDate() {
        return fTransDate;
    }

    /**
     * ����fTransDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFTransDate(String value) {
        this.fTransDate = value;
    }

    /**
     * ��ȡfYear���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFYear() {
        return fYear;
    }

    /**
     * ����fYear���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFYear(Long value) {
        this.fYear = value;
    }

    /**
     * Gets the value of the entries property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the entries property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEntries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Entries }
     * 
     * 
     */
    public List<Entries> getEntries() {
        if (entries == null) {
            entries = new ArrayList<Entries>();
        }
        return this.entries;
    }

    /**
     * Gets the value of the cashFlow property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cashFlow property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCashFlow().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CashFlow }
     * 
     * 
     */
    public List<CashFlow> getCashFlow() {
        if (cashFlow == null) {
            cashFlow = new ArrayList<CashFlow>();
        }
        return this.cashFlow;
    }

}
