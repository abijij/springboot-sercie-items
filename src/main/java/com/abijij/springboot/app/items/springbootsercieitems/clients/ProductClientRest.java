package com.abijij.springboot.app.items.springbootsercieitems.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.abijij.springboot.app.items.springbootsercieitems.models.Product;

@FeignClient(name = "service-products", url="localhost:8001")
public interface ProductClientRest {  

    @GetMapping("/toList")
    public List<Product> toList();

    @GetMapping("/detal/{id}")
    public Product detail(@PathVariable Long id);
}
