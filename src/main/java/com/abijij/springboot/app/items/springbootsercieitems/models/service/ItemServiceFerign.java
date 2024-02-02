package com.abijij.springboot.app.items.springbootsercieitems.models.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.abijij.springboot.app.items.springbootsercieitems.clients.ProductClientRest;
import com.abijij.springboot.app.items.springbootsercieitems.models.Item;

@Service("serviceFerign")
@Primary
public class ItemServiceFerign implements ItemService { 

    @Autowired
    private ProductClientRest clientFeign;

    @Override
    public List<Item> findAll() {
        return clientFeign.toList().stream().map(p -> new Item(p, 1)).collect(Collectors.toList());
        
    }

    @Override
    public Item findById(Long id, Integer cantidad) {
       return new Item(clientFeign.detail(id), cantidad);
    }










    
}
