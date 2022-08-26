package com.project.quanlybanhang.service.impl;

import java.io.IOException;
import java.nio.file.*;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.project.quanlybanhang.convert.ProductConvert;
import com.project.quanlybanhang.dto.ProductDTO;
import com.project.quanlybanhang.entities.ProductsEntity;
import com.project.quanlybanhang.repository.ProductRepository;
import com.project.quanlybanhang.service.IProductService;
import com.project.quanlybanhang.utils.CommonConstant;

@Service
public class ProductServiceImpl implements IProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private ProductConvert productConvert;
	
	@Override
	public List<ProductDTO> findAll() {
		List<ProductsEntity> productsEntity = productRepository.findAll(); 
		List<ProductDTO> productDTO = new ArrayList<ProductDTO>();
		for (ProductsEntity entity : productsEntity) {
			ProductDTO dto = new ProductDTO();
			dto = productConvert.toDTO(entity);
			productDTO.add(dto);
		}
		return productDTO;
	}


	@Override
	public ProductDTO save(ProductDTO productDTO, MultipartFile file) {
		
		String filename = System.currentTimeMillis() + "_" + file.getOriginalFilename();
		String rootPath = CommonConstant.root;
		Path pathFile = Paths.get(rootPath + filename);
		
		ProductsEntity productsEntity = new ProductsEntity();
		productsEntity = productConvert.toEntity(productDTO);
		
		if (filename.charAt(filename.length() - 1) != '_') {
			try {
				productsEntity.setImage(filename);
				Files.copy(file.getInputStream(), pathFile);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		productsEntity = productRepository.save(productsEntity);
		return productConvert.toDTO(productsEntity);
	}

}
