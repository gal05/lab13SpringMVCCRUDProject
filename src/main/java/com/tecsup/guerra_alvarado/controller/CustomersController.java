package com.tecsup.guerra_alvarado.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.tecsup.guerra_alvarado.model.Customers;

import com.tecsup.guerra_alvarado.services.CustomersService;

@Controller
public class CustomersController {
	
	private static final Logger logger = LoggerFactory.getLogger(CustomersController.class);
	
	@Autowired
	private CustomersService customersService;
	
	
	
	@GetMapping("/admin/customers/listCust")
	public String list(@ModelAttribute("SpringWeb") Customers customers, ModelMap model) {

		try {
			model.addAttribute("customers", customersService.findAll());
		} catch (Exception e) {
			logger.info(e.getMessage());
			model.addAttribute("message", e.getMessage());
		}

		return "admin/customer/listCust";
	}

}
