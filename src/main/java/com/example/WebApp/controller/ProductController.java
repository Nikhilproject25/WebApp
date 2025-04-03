package com.example.WebApp.controller;

import com.example.WebApp.model.Product;
import com.example.WebApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @RequestMapping("/Details")
    public String ProductDetails() {
        return "Product Details";
    }

    @RequestMapping("/products")
    public List<Product> getProducts() {
       return productService.getProducts();
    }

    @RequestMapping("/products/{productId}")
    public Product getProduct(@PathVariable int productId) {
        return productService.getProductsById(productId);
    }

    @RequestMapping("/products/add")
    public Product addProducts(@RequestBody Product products) {
        return productService.addProducts(products);
    }
    @PutMapping("/products")
    public void updateProducts(@RequestBody Product products) {
          productService.updateProduct(products);
    }
    @DeleteMapping("/products{productId}")
    public void deleteProduct(@PathVariable int productId) {
         productService.deleteProduct(productId);
    }
}
