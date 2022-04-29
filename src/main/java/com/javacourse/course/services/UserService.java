package com.javacourse.course.services;

import com.javacourse.course.entities.User;
import com.javacourse.course.repositories.UserRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Data
@AllArgsConstructor
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }

    public User finById(Long id) {
        Optional<User> user = repository.findById(id);
        return user.get();
    }
}

