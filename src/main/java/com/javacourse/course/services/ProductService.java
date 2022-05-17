package com.javacourse.course.services;

import com.javacourse.course.entities.Product;
import com.javacourse.course.repositories.ProductRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Data
@AllArgsConstructor
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> findAll() {
        return repository.findAll();
    }

    public Product finById(Long id) {
        Optional<Product> obj = repository.findById(id);
        return obj.orElse(null);
    }
}

