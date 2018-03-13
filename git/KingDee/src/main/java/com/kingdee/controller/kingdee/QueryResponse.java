
package com.kingdee.controller.kingdee;

import javax.xml.bind.annotation.*;


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
 *         &lt;element name="QueryResult" type="{http://www.kingdee.com/VoucherData}ArrayOfVoucher" minOccurs="0"/&gt;
 *         &lt;element name="strTimeStamp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strMaxTimeStamp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="strError" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "queryResult",
    "strTimeStamp",
    "strMaxTimeStamp",
    "strError"
})
@XmlRootElement(name = "QueryResponse")
public class QueryResponse {

    @XmlElement(name = "QueryResult")
    protected ArrayOfVoucher queryResult;
    protected String strTimeStamp;
    protected String strMaxTimeStamp;
    protected String strError;

    /**
     * ��ȡqueryResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfVoucher }
     *     
     */
    public ArrayOfVoucher getQueryResult() {
        return queryResult;
    }

    /**
     * ����queryResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfVoucher }
     *     
     */
    public void setQueryResult(ArrayOfVoucher value) {
        this.queryResult = value;
    }

    /**
     * ��ȡstrTimeStamp���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrTimeStamp() {
        return strTimeStamp;
    }

    /**
     * ����strTimeStamp���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrTimeStamp(String value) {
        this.strTimeStamp = value;
    }

    /**
     * ��ȡstrMaxTimeStamp���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrMaxTimeStamp() {
        return strMaxTimeStamp;
    }

    /**
     * ����strMaxTimeStamp���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrMaxTimeStamp(String value) {
        this.strMaxTimeStamp = value;
    }

    /**
     * ��ȡstrError���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrError() {
        return strError;
    }

    /**
     * ����strError���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrError(String value) {
        this.strError = value;
    }

}
