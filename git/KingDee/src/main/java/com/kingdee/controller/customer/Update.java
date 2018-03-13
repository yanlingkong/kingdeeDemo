
package com.kingdee.controller.customer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="iAisID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="strUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Data" type="{http://www.kingdee.com/Customer}ArrayOfCustomer" minOccurs="0"/&gt;
 *         &lt;element name="bCheckByUUID" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="bAddNewOnly" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "iAisID",
    "strUser",
    "strPassword",
    "data",
    "bCheckByUUID",
    "bAddNewOnly"
})
@XmlRootElement(name = "Update")
public class Update {

    protected int iAisID;
    protected String strUser;
    protected String strPassword;
    @XmlElement(name = "Data")
    protected ArrayOfCustomer data;
    protected boolean bCheckByUUID;
    protected boolean bAddNewOnly;

    /**
     * ��ȡiAisID���Ե�ֵ��
     * 
     */
    public int getIAisID() {
        return iAisID;
    }

    /**
     * ����iAisID���Ե�ֵ��
     * 
     */
    public void setIAisID(int value) {
        this.iAisID = value;
    }

    /**
     * ��ȡstrUser���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrUser() {
        return strUser;
    }

    /**
     * ����strUser���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrUser(String value) {
        this.strUser = value;
    }

    /**
     * ��ȡstrPassword���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrPassword() {
        return strPassword;
    }

    /**
     * ����strPassword���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrPassword(String value) {
        this.strPassword = value;
    }

    /**
     * ��ȡdata���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfCustomer }
     *     
     */
    public ArrayOfCustomer getData() {
        return data;
    }

    /**
     * ����data���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfCustomer }
     *     
     */
    public void setData(ArrayOfCustomer value) {
        this.data = value;
    }

    /**
     * ��ȡbCheckByUUID���Ե�ֵ��
     * 
     */
    public boolean isBCheckByUUID() {
        return bCheckByUUID;
    }

    /**
     * ����bCheckByUUID���Ե�ֵ��
     * 
     */
    public void setBCheckByUUID(boolean value) {
        this.bCheckByUUID = value;
    }

    /**
     * ��ȡbAddNewOnly���Ե�ֵ��
     * 
     */
    public boolean isBAddNewOnly() {
        return bAddNewOnly;
    }

    /**
     * ����bAddNewOnly���Ե�ֵ��
     * 
     */
    public void setBAddNewOnly(boolean value) {
        this.bAddNewOnly = value;
    }

}
