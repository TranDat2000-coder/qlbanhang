package com.project.quanlybanhang.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomeWEBController {

	@GetMapping("/")
	public String index() {
		return "index";
	}
}
