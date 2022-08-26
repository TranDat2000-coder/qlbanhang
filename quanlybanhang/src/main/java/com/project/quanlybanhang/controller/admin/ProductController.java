package com.project.quanlybanhang.controller.admin;


import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.project.quanlybanhang.dto.ProductDTO;
import com.project.quanlybanhang.service.IProductService;

@Controller
@RequestMapping("/admin")
//@RestController
public class ProductController {
	
	@Autowired
	private IProductService productService;
	
	@GetMapping("/danh-sach-san-pham")
	public String listProduct(Model model) {
		model.addAttribute("listProduct", productService.findAll());
		return "admin/product/list_products";
	}
	
//	@GetMapping("/danh-sach-san-pham")
//	public List<ProductDTO> listProduct(Model model) {
//		return productService.findAll();
//		
//	}
	
	@GetMapping("/san-pham")
	public String product(Model model) {
		
		ProductDTO productDTO = new ProductDTO();
		model.addAttribute("products", productDTO);
		
		return "admin/product/insert_product";
	}
	
	@PostMapping("/san-pham")
	public String insertProduct(@ModelAttribute ProductDTO productDTO,
								@RequestParam("file")MultipartFile file) {
		
		productService.save(productDTO, file);
		
		return "redirect:/admin/danh-sach-san-pham?success";
	}
}
