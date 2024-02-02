package com.abijij.springboot.app.items.springbootsercieitems.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.abijij.springboot.app.items.springbootsercieitems.models.Item;
import com.abijij.springboot.app.items.springbootsercieitems.models.service.ItemService;

@RestController
public class ItemController {
    @Autowired
    @Qualifier("serviceFerign")
    private ItemService itemService;

    @GetMapping("/toList")
    public List<Item> toList() {
        return itemService.findAll();
    }

    @GetMapping("/detail/{id}/cantidad/{cantidad}")
    public Item detail(@PathVariable Long id, @PathVariable Integer cantidad) {
        return itemService.findById(id, cantidad);
    }

}
