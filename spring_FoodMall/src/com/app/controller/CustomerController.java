package com.app.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.pojos.Customer;
import com.app.service.ICustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private ICustomerService service;

	public CustomerController() {
		System.out.println("in ctor of " + getClass().getName());
	}

	@GetMapping("/login")
	public String showLoginForm() {
		System.out.println("in show login form");
		return "/customer/login";// actual view name : /WEB-INF/views/user/login.jsp
	}

	@PostMapping("/login")
	public String processLoginForm(@RequestParam String em, @RequestParam String pass, Model map, HttpSession hs) {
		System.out.println("in process login form " + map);
		try {
			// invokes service layer method for auth
			Customer authenticateUser = service.authenticateUser(em, pass);
			// login successful : valid user login
			hs.setAttribute("customer_dtls", authenticateUser);
			hs.setAttribute("mesg", "Login Successful");
			return "/customer/operations";
		} catch (RuntimeException e) {
			// e.printStackTrace();
			System.out.println("err in controller " + e);
			map.addAttribute("mesg", "Invalid Login , Pls retry");
			return "/customer/login";
		}
	}
}
