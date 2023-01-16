package com.kwabena.posdataapi.model;

import org.hibernate.annotations.Immutable;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Immutable
@Table(name = "reorderlist")
public class ReorderView {
    private String attribute;
    private String category;
    private String description;
    private String name;
    private String size;
    private String ALU;
    private String UPC;

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

    @Override
    public String toString() {
        return "ReorderView{" +
                "attribute='" + attribute + '\'' +
                ", category='" + category + '\'' +
                ", description='" + description + '\'' +
                ", name='" + name + '\'' +
                ", size='" + size + '\'' +
                ", ALU='" + ALU + '\'' +
                ", UPC='" + UPC + '\'' +
                ", vendorcode='" + vendorcode + '\'' +
                ", costprice=" + costprice +
                ", unitprice=" + unitprice +
                ", id=" + id +
                ", quantity=" + quantity +
                ", reorderlevel=" + reorderlevel +
                '}';
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

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getReorderlevel() {
        return reorderlevel;
    }

    public void setReorderlevel(Integer reorderlevel) {
        this.reorderlevel = reorderlevel;
    }

    private String vendorcode;
    private BigDecimal costprice, unitprice;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    @Column(name = "productid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer quantity, reorderlevel;

}
