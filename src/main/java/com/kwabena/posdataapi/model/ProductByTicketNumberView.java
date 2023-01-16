package com.kwabena.posdataapi.model;

import org.hibernate.annotations.Immutable;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Immutable
@Table(name = "productsbyticketnumber")
public class ProductByTicketNumberView {

    @Id
//    @Column(name = "salereportid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String productname;
    private String ticketnumber;
    private String productdescription;


    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public String getTicketnumber() {
        return ticketnumber;
    }

    public void setTicketnumber(String ticketnumber) {
        this.ticketnumber = ticketnumber;
    }

    @Override
    public String toString() {
        return "ProductByTicketNumberView{" +
                "productname='" + productname + '\'' +
                ", ticketnumber='" + ticketnumber + '\'' +
                ", productdescription='" + productdescription + '\'' +
                ", unitprice=" + unitprice +
                ", total=" + total +
                ", quantitybought=" + quantitybought +
                ", productid=" + productid +
                '}';
    }

    public String getProductdescription() {
        return productdescription;
    }

    public void setProductdescription(String productdescription) {
        this.productdescription = productdescription;
    }

    public BigDecimal getUnitprice() {
        return unitprice;
    }

    public void setUnitprice(BigDecimal unitprice) {
        this.unitprice = unitprice;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public int getQuantitybought() {
        return quantitybought;
    }

    public void setQuantitybought(int quantitybought) {
        this.quantitybought = quantitybought;
    }

    public int getProductid() {
        return productid;
    }

    public void setProductid(int productid) {
        this.productid = productid;
    }

    public ProductByTicketNumberView() {
    }



    private BigDecimal unitprice;
    private BigDecimal total;
    private int quantitybought;
    private int productid;



}
