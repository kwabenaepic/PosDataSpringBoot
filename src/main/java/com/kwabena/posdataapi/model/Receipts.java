package com.kwabena.posdataapi.model;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "receipts")
public class Receipts {

    @Id
    @Column(name = "receiptsid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String customerid;
    private String receiptdate;
    private String employeeid;
    private String modeofpayment;
    private String salesoutletid;
//    @Column(unique=true)
    private String ticketnumber;
    private BigDecimal amountpaid;
    private BigDecimal balance;

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Receipts{" +
                "id=" + id +
                ", customerid='" + customerid + '\'' +
                ", receiptdate='" + receiptdate + '\'' +
                ", employeeid='" + employeeid + '\'' +
                ", modeofpayment='" + modeofpayment + '\'' +
                ", salesoutletid='" + salesoutletid + '\'' +
                ", ticketnumber='" + ticketnumber + '\'' +
                ", amountpaid=" + amountpaid +
                ", balance=" + balance +
                '}';
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustomerid() {
        return customerid;
    }

    public void setCustomerid(String customerid) {
        this.customerid = customerid;
    }

    public String getReceiptdate() {
        return receiptdate;
    }

    public void setReceiptdate(String receiptdate) {
        this.receiptdate = receiptdate;
    }

    public String getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(String employeeid) {
        this.employeeid = employeeid;
    }

    public String getModeofpayment() {
        return modeofpayment;
    }

    public void setModeofpayment(String modeofpayment) {
        this.modeofpayment = modeofpayment;
    }

    public String getSalesoutletid() {
        return salesoutletid;
    }

    public void setSalesoutletid(String salesoutletid) {
        this.salesoutletid = salesoutletid;
    }

    public String getTicketnumber() {
        return ticketnumber;
    }

    public void setTicketnumber(String ticketnumber) {
        this.ticketnumber = ticketnumber;
    }

    public BigDecimal getAmountpaid() {
        return amountpaid;
    }

    public void setAmountpaid(BigDecimal amountpaid) {
        this.amountpaid = amountpaid;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public Receipts() {
    }

    public Receipts(Long id, String customerid, String receiptdate, String employeeid, String modeofpayment, String salesoutletid, String ticketnumber, BigDecimal amountpaid, BigDecimal balance) {
        this.id = id;
        this.customerid = customerid;
        this.receiptdate = receiptdate;
        this.employeeid = employeeid;
        this.modeofpayment = modeofpayment;
        this.salesoutletid = salesoutletid;
        this.ticketnumber = ticketnumber;
        this.amountpaid = amountpaid;
        this.balance = balance;
    }
}
