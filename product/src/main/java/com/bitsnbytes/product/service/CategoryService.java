package com.bitsnbytes.product.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitsnbytes.product.DTO.CategoryDTO;
import com.bitsnbytes.product.entity.Category;
import com.bitsnbytes.product.mapper.CategoryMapper;
import com.bitsnbytes.product.repository.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository  CategoryRepo;
	
	public CategoryDTO createCategory(CategoryDTO categoryDTO) {
		
		Category category=CategoryMapper.toCategoryEntity(categoryDTO);
		category=CategoryRepo.save(category);
		
		return CategoryMapper.toCategoryDTO(category);
	
	}

}
