package com.project.quanlybanhang.controller.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.quanlybanhang.dto.ProductDTO;
import com.project.quanlybanhang.service.IProductService;

@Controller
@RequestMapping("/product")
public class ProductWEBController {

	@Autowired
	private IProductService productService;
	
	@GetMapping("/list_product")
	public String listProduct(Model model) {
		model.addAttribute("listProduct", productService.findAll());
		return "index";
	}
	
//	@GetMapping("/list_product")
//	public List<ProductDTO> listProduct(){
//		return productService.findAll();
//		
//	}
}
