package com.project.quanlybanhang.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.quanlybanhang.entities.ProductsEntity;

@Repository
public interface ProductRepository extends JpaRepository<ProductsEntity, Long> {

}
