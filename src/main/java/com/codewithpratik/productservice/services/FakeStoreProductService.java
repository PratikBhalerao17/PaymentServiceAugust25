package com.codewithpratik.productservice.services;

import com.codewithpratik.productservice.Dtos.FakeStoreProductDto;
import com.codewithpratik.productservice.exceptions.ProductNotFoundException;
import com.codewithpratik.productservice.models.Category;
import com.codewithpratik.productservice.models.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class FakeStoreProductService implements ProductService {
//    private FakeStoreProductDto fakeStoreProductDto;
//
//    public FakeStoreProductService(FakeStoreProductDto fakeStoreProductDto) {
//        this.fakeStoreProductDto = fakeStoreProductDto;
//    }

    private RestTemplate restTemplate;

    public FakeStoreProductService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

//    RestTemplate restTemplate = new RestTemplate();

    @Override
    public Product getProductById(Long productId) throws ProductNotFoundException{
        FakeStoreProductDto fakeStoreProductDto = restTemplate.getForObject(
                "https://fakestoreapi.com/products/" + productId,
                FakeStoreProductDto.class
        );
        if (fakeStoreProductDto == null) {
            throw new ProductNotFoundException(productId,"Product not found");
        }
        return convertFakeStoreToProduct(fakeStoreProductDto);
    }

    private Product convertFakeStoreToProduct(FakeStoreProductDto fakeStoreProductDto) {
        Product product = new Product();
        product.setCategory(new Category());
        product.setId(fakeStoreProductDto.getId());
        product.setTitle(fakeStoreProductDto.getTitle());
        product.setPrice(fakeStoreProductDto.getPrice());
        product.getCategory().setCategoryName(fakeStoreProductDto.getCategory());
        product.setDescription(fakeStoreProductDto.getDescription());
        product.setImage(fakeStoreProductDto.getImage());
        product.setCreatedAt(new Date());
        product.setUpdatedAt(new Date());

        return product;
    }

    @Override
    public List<Product> getAllProducts() {
        FakeStoreProductDto[] fakeStoreProductDtos = restTemplate.getForObject(
                "https://fakestoreapi.com/products",
                FakeStoreProductDto[].class
        );
        List<Product> products = new ArrayList<>();
        for (FakeStoreProductDto fakeStoreProductDto : fakeStoreProductDtos) {
            Product product = convertFakeStoreToProduct(fakeStoreProductDto);
            products.add(product);
        }
        return products;
    }

    @Override
    public Product saveProduct(Product product) {
        return null;
    }

    @Override
    public Product updateProduct(Product product) {
        return null;
    }

    @Override
    public void deleteProduct(Long productId) {

    }
}
