package com.kwabena.posdataapi.model;


import javax.persistence.*;

@Entity
@Table(name = "saleitems")
public class SaleItem {

    @Id
    @Column(name = "saleid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String ticketnumber;
    private int productid;
    private int quantity;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTicketnumber() {
        return ticketnumber;
    }

    public void setTicketnumber(String ticketnumber) {
        this.ticketnumber = ticketnumber;
    }

    public int getProductid() {
        return productid;
    }

    public void setProductid(int productid) {
        this.productid = productid;
    }

    public int getQuantity() {
        return quantity;
    }

    public SaleItem() {
    }

    public SaleItem(Long id, String ticketnumber, int productid, int quantity) {
        this.id = id;
        this.ticketnumber = ticketnumber;
        this.productid = productid;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "SaleItem{" +
                "id=" + id +
                ", ticketnumber='" + ticketnumber + '\'' +
                ", productid=" + productid +
                ", quantity=" + quantity +
                '}';
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
