package com.kwabena.posdataapi.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "product")
public class ProductEntity {

    @Id
    @Column(name = "productid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String attribute, category, description, name, size, ALU, UPC, vendorcode;
    private BigDecimal costprice, unitprice;
    private String quantity, reorderlevel;


    public ProductEntity() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getALU() {
        return ALU;
    }

    public void setALU(String ALU) {
        this.ALU = ALU;
    }

    public String getUPC() {
        return UPC;
    }

    public void setUPC(String UPC) {
        this.UPC = UPC;
    }

    public String getVendorcode() {
        return vendorcode;
    }

    public void setVendorcode(String vendorcode) {
        this.vendorcode = vendorcode;
    }

    public BigDecimal getCostprice() {
        return costprice;
    }

    public void setCostprice(BigDecimal costprice) {
        this.costprice = costprice;
    }

    public BigDecimal getUnitprice() {
        return unitprice;
    }

    public void setUnitprice(BigDecimal unitprice) {
        this.unitprice = unitprice;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getReorderlevel() {
        return reorderlevel;
    }

    public void setReorderlevel(String reorderlevel) {
        this.reorderlevel = reorderlevel;
    }

    public ProductEntity(long id, String attribute, String category, String description, String name, String size, String ALU, String UPC, String vendorcode, BigDecimal costPrice, BigDecimal unitprice, String quantity, String reorderlevel) {
        this.id = id;
        this.attribute = attribute;
        this.category = category;
        this.description = description;
        this.name = name;
        this.size = size;
        this.ALU = ALU;
        this.UPC = UPC;
        this.vendorcode = vendorcode;
        this.costprice = costPrice;
        this.unitprice = unitprice;
        this.quantity = quantity;
        this.reorderlevel = reorderlevel;
    }
}
