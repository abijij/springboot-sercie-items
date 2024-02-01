package com.abijij.springboot.app.items.springbootsercieitems.models.service;

import java.util.List;

import com.abijij.springboot.app.items.springbootsercieitems.models.Item;

public interface ItemService {

    public List<Item> findAll();
    public Item findById(Long id, Integer cantidad);
    

}
