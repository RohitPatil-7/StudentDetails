package com.bitsnbytes.product.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.bitsnbytes.product.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
