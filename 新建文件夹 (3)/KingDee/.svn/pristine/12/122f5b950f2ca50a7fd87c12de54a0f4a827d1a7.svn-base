package com.kingdee.model;

import lombok.Data;
import java.math.BigDecimal;
import java.util.Date;

/**
 * User: liuc
 * Date: 2017/6/13
 * Time: 17:08
 */
@Data
public class BpCustProsperctive {//新建意向客户及修改意向客户实体类

    /**
     * 客户来源类型
     * 1代表投资端客户,0代表借款端客户
     */
    protected Integer personType;//客户类型1代表投资端客户,0代表借款端客户
    /**
     * 客户类型
     * 1：企业，2：个人
     */
    protected String customerType;
    /**
     * 客户名称
     */
    protected String customerName;
    /**
     * 联系电话
     */
    protected String telephoneNumber;
    /**
     * 主键
     */
    protected Long perId;
    /**
     * 所属分公司
     */
    protected Long companyId;
    /**
     * 客户类型
     */
    protected String customerChannel;
    /**
     * 地区
     */
    protected String area;
    /**
     * 地区Id
     */
    protected String areaId;
    /**
     * 邮箱
     */
    protected String email;
    /**
     * 所属门店
     */
    private String department;
    /**
     * 所属门店Id
     */
    private Long departmentId;
    /**
     * 邮政编码
     */
    private String postalcode;
    /**
     * 通讯地址
     */
    protected String postaddress;
    /**
     * 用款金额
     */
    protected BigDecimal loanMoney;
    /**
     * 用款时间
     */
    protected Date loanDate;
    /**
     * 用款期限
     */
    protected Integer loanPeriod;
    /**
     * 贷款方式
     */
    protected Integer loanType;
    /**
     *
     */
    protected String remark;

    @Override
    public String toString() {
        return "bpCustProsperctive.personType=" + personType +
                "&bpCustProsperctive.customerType='" + customerType + '\'' +
                "&bpCustProsperctive.customerName='" + customerName + '\'' +
                "&bpCustProsperctive.telephoneNumber='" + telephoneNumber + '\'' +
                "&bpCustProsperctive.perId=" + perId +
                "&bpCustProsperctive.companyId=" + companyId +
                "&bpCustProsperctive.customerChannel='" + customerChannel + '\'' +
                "&bpCustProsperctive.area='" + area + '\'' +
                "&bpCustProsperctive.areaId='" + areaId + '\'' +
                "&bpCustProsperctive.email='" + email + '\'' +
                "&bpCustProsperctive.department='" + department + '\'' +
                "&bpCustProsperctive.departmentId=" + departmentId +
                "&bpCustProsperctive.postalcode='" + postalcode + '\'' +
                "&bpCustProsperctive.postaddress='" + postaddress + '\'' +
                "&bpCustProsperctive.loanMoney=" + loanMoney +
                "&bpCustProsperctive.loanDate=" + loanDate +
                "&bpCustProsperctive.loanPeriod=" + loanPeriod +
                "&bpCustProsperctive.loanType=" + loanType +
                "&bpCustProsperctive.remark='" + remark + '\'';
    }
}
