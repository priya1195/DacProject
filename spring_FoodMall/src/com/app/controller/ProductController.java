package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.service.IProductService;

@Controller
@RequestMapping("/customer/product")
public class ProductController {
	//dependency : service i/f
	@Autowired
	private IProductService service;
	
	public ProductController() {
		System.out.println("in cnstr of " + getClass().getName());
	}

    //req handling method
	@GetMapping("/list")
	public String listProducts(Model map) {
		System.out.println("in list products"+map);
		map.addAttribute("product_list", service.getAllProducts());
		return "/product/list";//forward view :actual view : /WEB-INF/views/product/list
	}
	
	
}
