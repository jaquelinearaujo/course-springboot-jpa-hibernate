package com.javacourse.course.services;

import com.javacourse.course.entities.Order;
import com.javacourse.course.entities.User;
import com.javacourse.course.repositories.OrderRepository;
import com.javacourse.course.repositories.UserRepository;
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
public class OrderService implements Serializable {

    @Autowired
    private OrderRepository repository;

    public List<Order> findAll() {
        return repository.findAll();
    }

    public Order finById(Long id) {
        Optional<Order> order = repository.findById(id);
        return order.orElse(null);
    }
}

