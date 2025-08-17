package taborda.lucas.e_commerce.service;

import taborda.lucas.e_commerce.dto.ProductRequest;
import taborda.lucas.e_commerce.dto.ProductResponse;

import java.util.List;

public interface ProductService {
    ProductResponse create(ProductRequest request);
    ProductResponse update(Long id, ProductRequest request);
    ProductResponse findById(Long id);
    List<ProductResponse> findAll();
    void delete(Long id);
}

