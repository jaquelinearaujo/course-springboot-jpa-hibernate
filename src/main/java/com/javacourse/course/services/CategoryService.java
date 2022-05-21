package com.javacourse.course.services;

import com.javacourse.course.entities.Category;
import com.javacourse.course.repositories.CategoryRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

@Component
@Data
@AllArgsConstructor
public class CategoryService implements Serializable {

    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll() {
        return repository.findAll();
    }

    public Category finById(Long id) {
        Optional<Category> obj = repository.findById(id);
        return obj.orElse(null);
    }
}

