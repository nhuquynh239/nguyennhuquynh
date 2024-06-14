package com.example.NguyenNhuQuynh7954.repository;

import com.example.NguyenNhuQuynh7954.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICategoryRepository extends JpaRepository<Category, Long> {
}
