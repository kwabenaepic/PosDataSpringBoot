package com.kwabena.posdataapi.model;

import org.springframework.hateoas.server.core.Relation;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Relation(collectionRelation = "products", itemRelation = "album")
//@Table(name = "product")
public class Product {
    private String attribute, category, description, name, size, ALU, UPC, vendorcode;
    private BigDecimal costprice, unitprice;
    @Id
    @Column(name = "productid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer quantity, reorderlevel;


    public Product() {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id && Objects.equals(attribute, product.attribute) && Objects.equals(category, product.category) && Objects.equals(description, product.description) && Objects.equals(name, product.name) && Objects.equals(size, product.size) && Objects.equals(ALU, product.ALU) && Objects.equals(UPC, product.UPC) && Objects.equals(vendorcode, product.vendorcode) && Objects.equals(costprice, product.costprice) && Objects.equals(unitprice, product.unitprice) && Objects.equals(quantity, product.quantity) && Objects.equals(reorderlevel, product.reorderlevel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(attribute, category, description, name, size, ALU, UPC, vendorcode, costprice, unitprice, id, quantity, reorderlevel);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Product{" +
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
                ", quantity='" + quantity + '\'' +
                ", reorderlevel='" + reorderlevel + '\'' +
                '}';
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Product(Long id, String attribute, String category, String description, String name, String size, String ALU, String UPC, String vendorcode, BigDecimal costprice, BigDecimal unitprice, Integer quantity, Integer reorderlevel) {
        this.id = id;
        this.attribute = attribute;
        this.category = category;
        this.description = description;
        this.name = name;
        this.size = size;
        this.ALU = ALU;
        this.UPC = UPC;
        this.vendorcode = vendorcode;
        this.costprice = costprice;
        this.unitprice = unitprice;
        this.quantity = quantity;
        this.reorderlevel = reorderlevel;
    }
}
