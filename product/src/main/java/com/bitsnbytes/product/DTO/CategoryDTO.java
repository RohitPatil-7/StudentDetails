package com.bitsnbytes.product.DTO;

import java.util.List;

import com.bitsnbytes.product.entity.Product;

import lombok.Data;

@Data
public class CategoryDTO {
	private Long id;
	private String name;
	private List<ProductDTO> products;
}
