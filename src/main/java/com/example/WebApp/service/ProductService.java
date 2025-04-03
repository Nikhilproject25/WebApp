package com.example.WebApp.service;

import com.example.WebApp.model.Product;
import com.example.WebApp.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductRepo productRepo;

    /*List<Product> products = new ArrayList<>(Arrays.asList(new Product(1,"Phone","Iphone",100),
            new Product(2,"Phone","Samsung",200),
            new Product(3,"Phone","Nokia",300)));
*/
    public ProductService(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    public List<Product> getProducts() {
        return productRepo.findAll();
    }

    public Product getProductsById(int id) {
        return productRepo.findById(id).orElse(null);
    }


    public Product addProducts(Product product) {
        return productRepo.save(product);
    }

    public void updateProduct(Product product) {
        productRepo.save(product);
    }

    public void deleteProduct(int id) {
         productRepo.deleteById(id);
    }
}
