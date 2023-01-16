package com.kwabena.posdataapi.model;

import org.hibernate.annotations.Immutable;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.*;
import java.math.BigDecimal;


@Entity
@Immutable
@Table(name = "toptenselling")
public class TopTenSellingView {
    @Id
    @Column(name = "productid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String itemname;
    private String description;
    private int quantitybought;

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "TopTenSellingView{" +
                "id=" + id +
                ", itemname='" + itemname + '\'' +
                ", description='" + description + '\'' +
                ", quantitybought=" + quantitybought +
                '}';
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantitybought() {
        return quantitybought;
    }

    public void setQuantitybought(int quantitybought) {
        this.quantitybought = quantitybought;
    }

    public TopTenSellingView() {
    }
}
