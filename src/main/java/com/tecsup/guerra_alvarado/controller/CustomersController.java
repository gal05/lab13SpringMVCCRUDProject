package com.tecsup.guerra_alvarado.controller;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.tecsup.guerra_alvarado.exception.DAOException;
import com.tecsup.guerra_alvarado.exception.EmptyResultException;
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


	@RequestMapping(value="/createformcus",method = RequestMethod.GET)
	public String showFormNewCustomers (Model model) {
		Customers customers=new Customers();
			model.addAttribute("customersForm",customers);
			return "admin/customer/custForm";
	}
	

	
	 @RequestMapping(value="/createCustomer",method = RequestMethod.POST)
	    public ModelAndView  processRegistration(@ModelAttribute("customersForm") Customers customers,
	    		ModelMap model) {
	       
		 
		 	ModelAndView modelAndView = null;
	        // implement your own registration logic here...
	        try {
				customersService.crear(customers);
			} catch (DAOException e) {
				
				e.printStackTrace();
			} catch (EmptyResultException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		 	
	        // for testing purpose:
	        System.out.println("username: " + customers.getCompanyName());
	        System.out.println("password: " + customers.getContactName());
	        System.out.println("email: " + customers.getContactTitle());
	        System.out.println("birth date: " + customers.getAddress());
	        System.out.println("profession: " + customers.getCity());
	        
	       
			model.addAttribute("message", "Registro correcto!");
			return modelAndView = new ModelAndView("redirect: /guerra_alvarado/admin/customers/listCust");
	    }
	

}
