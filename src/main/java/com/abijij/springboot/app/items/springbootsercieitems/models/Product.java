package com.abijij.springboot.app.items.springbootsercieitems.models;

import java.util.Date;

public class Product {

    private Long id;
    private String name;
    private String description;
    private Double precio;
    private int stock;
    private Date createAt;

    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
   
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public Double getPrecio() {
        return precio;
    }
    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    public Date getCreateAt() {
        return createAt;
    }
    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    

    

}
