package com.project.quanlybanhang.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.multipart.MultipartFile;

import com.project.quanlybanhang.dto.ProductDTO;

public interface IProductService {

	 List<ProductDTO> findAll();
	 
	 ProductDTO save(ProductDTO productDTO, MultipartFile file);
}
