package com.javacourse.course.repositories;

import com.javacourse.course.entities.Category;
import com.javacourse.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
