package com.example.musicbookstoresantsg.controllers;

import com.example.musicbookstoresantsg.interfaces.IProductRepository;
import com.example.musicbookstoresantsg.models.ProductModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private IProductRepository repository;

    @PostMapping("/saveProducts")
    public  String SaveProducts(@RequestBody List<ProductModel> productmodels) {

        repository.saveAll(productmodels);
        return "Products saved..";
    }

    @GetMapping("/getAllProducts")
    public List<ProductModel> getAll() {
        return repository.findAll();
    }
}
