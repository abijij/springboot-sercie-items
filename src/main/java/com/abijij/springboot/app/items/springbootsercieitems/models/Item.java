package com.abijij.springboot.app.items.springbootsercieitems.models;

public class Item {

    private Product product;
    private Integer cantidad;

    public Item() {
    }

    public Item(Product product, int cantidad) {
        this.product = product;
        this.cantidad = cantidad;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Double getTotal(){
        return product.getPrecio() * cantidad.doubleValue();
    }


}
