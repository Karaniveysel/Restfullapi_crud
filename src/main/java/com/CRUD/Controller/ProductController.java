package com.CRUD.Controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.CRUD.CrudDbRestfulApplication;
import com.CRUD.Entity.Product;
import com.CRUD.Service.ProductService;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

@RestController
public class ProductController {

    static Logger log = Logger.getLogger(CrudDbRestfulApplication.class.getName());
    @Autowired
    private ProductService service;

    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product product) {
        log.info("Service addProduc: "+product.getName());
        return service.saveProduct(product);
    }

    @PostMapping("/addProducts")
    public List<Product> addProducts(@RequestBody List<Product> products) {
        log.info("Service products size :"+products.size());
        return service.saveProducts(products);
    }

    @GetMapping("/products")
    public List<Product> findAllProducts() {

        log.info("Service findAllProducts :");
        return service.getProducts();
    }

    @GetMapping("/productById/{id}")
    public Product findProductById(@PathVariable int id) {
        log.info("Service productById :"+id);
        return service.getProductById(id);
    }

    @GetMapping("/product/{name}")
    public Product findProductByName(@PathVariable String name) {
        log.info("Service findAllProducts :");
        return service.getProductByName(name);
    }

    @PutMapping("/update")
    public Product updateProduct(@RequestBody Product product) {
        log.info("Service update product:"+product.getId());
        return service.updateProduct(product);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable int id) {
        log.info("Service delete id :"+id);
        return service.deleteProduct(id);
    }
}