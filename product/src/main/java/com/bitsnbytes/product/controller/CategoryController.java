package com.bitsnbytes.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bitsnbytes.product.DTO.CategoryDTO;
import com.bitsnbytes.product.service.CategoryService;

@RestController
@RequestMapping("api/category")
public class CategoryController {
	
	@Autowired
	private CategoryService categoryService;
	
//	@PostMapping
//	public CategoryDTO createCategory(@RequestBody CategoryDTO categoryDTO ) {
//		
//		return categoryService.createCategory(categoryDTO);
//	}
//	 This Or
	@PostMapping
	public ResponseEntity<CategoryDTO> createCategory(@RequestBody CategoryDTO categoryDTO ) {
		
		return new ResponseEntity<>(categoryService.createCategory(categoryDTO),HttpStatus.CREATED);
	}
	

}
