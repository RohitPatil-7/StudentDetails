package com.bitsnbytes.product.mapper;


import com.bitsnbytes.product.mapper.ProductMapper;

import com.bitsnbytes.product.DTO.CategoryDTO;
import com.bitsnbytes.product.entity.Category;

public class CategoryMapper {
	
	public static CategoryDTO toCategoryDTO(Category category) {
		if(category == null) {
			return null;
		}
		CategoryDTO categoryDTO = new CategoryDTO();
		categoryDTO.setId(category.getId());
		categoryDTO.setName(category.getName());
		categoryDTO.setProducts(category.getProducts().stream()
			    .map(ProductMapper::toProductDTO)
			    .toList()); // <-- this requires Java 16+
		return categoryDTO;
	}

	public static Category toCategoryEntity(CategoryDTO categoryDTO) {
		Category category= new Category();
		category.setName(categoryDTO.getName());
		return category;
	}
}
