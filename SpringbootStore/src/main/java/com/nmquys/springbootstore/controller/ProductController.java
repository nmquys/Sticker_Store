package com.nmquys.springbootstore.controller;

import com.nmquys.springbootstore.dto.ProductDto;
import com.nmquys.springbootstore.service.IProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/products")
@RequiredArgsConstructor
public class ProductController
{
    private final IProductService iProductService;

    @GetMapping
    public List<ProductDto> getProducts() throws InterruptedException
    { // DTO Pattern
        List<ProductDto> productList = iProductService.getProducts();
        return productList;
    }
}
