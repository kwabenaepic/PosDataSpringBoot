package com.kwabena.posdataapi.model;


import org.hibernate.annotations.Immutable;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Immutable
@Table(name = "salereports")
public class SalesReportView {

    @Id
//    @Column(name = "salereportid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
    private String receiptsid;
    private String salesoutletid;
    private String ticketnumber;
    private String modeofpayment;
    private BigDecimal total;
    private String numberofitems;
    private String employeeid;
    private String employeelastname;

    public String getReceiptsid() {
        return receiptsid;
    }

    public SalesReportView() {
    }

    @Override
    public String toString() {
        return "SalesReportView{" +
                "receiptsid='" + receiptsid + '\'' +
                ", salesoutletid='" + salesoutletid + '\'' +
                ", ticketnumber='" + ticketnumber + '\'' +
                ", modeofpayment='" + modeofpayment + '\'' +
                ", total=" + total +
                ", numberofitems='" + numberofitems + '\'' +
                ", employeeid='" + employeeid + '\'' +
                ", employeelastname='" + employeelastname + '\'' +
                ", amountpaid=" + amountpaid +
                ", balance=" + balance +
                '}';
    }

    public void setReceiptsid(String receiptsid) {
        this.receiptsid = receiptsid;
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

    public String getModeofpayment() {
        return modeofpayment;
    }

    public void setModeofpayment(String modeofpayment) {
        this.modeofpayment = modeofpayment;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public String getNumberofitems() {
        return numberofitems;
    }

    public void setNumberofitems(String numberofitems) {
        this.numberofitems = numberofitems;
    }

    public String getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(String employeeid) {
        this.employeeid = employeeid;
    }

    public String getEmployeelastname() {
        return employeelastname;
    }

    public void setEmployeelastname(String employeelastname) {
        this.employeelastname = employeelastname;
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

    private BigDecimal amountpaid;
    private BigDecimal balance;




}
