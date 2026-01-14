package com.project.microservices.product_service.Controller;

import com.project.microservices.product_service.dto.ProductRequest;
import com.project.microservices.product_service.dto.ProductResponse;
import com.project.microservices.product_service.model.Product;
import com.project.microservices.product_service.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductController
{
    private final ProductService productService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ProductResponse CreateProduct(@RequestBody ProductRequest productRequest)
    {
        return productService.createProduct(productRequest);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductResponse> getAllProducts()
    {

        return productService.getAllProducts();

    }

//    @GetMapping("/{id}")
//    @ResponseStatus(HttpStatus.OK)
//    public ProductResponse getProductById(@PathVariable String id)
//    {
//        return productService.getProductById(id);
//    }


}
