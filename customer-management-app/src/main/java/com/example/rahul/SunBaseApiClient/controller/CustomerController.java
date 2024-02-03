package com.example.rahul.SunBaseApiClient.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.example.rahul.SunBaseApiClient.entity.Customer;
import com.example.rahul.SunBaseApiClient.service.DatabaseService;

import jakarta.validation.Valid;

@RestController
public class CustomerController {
	@Autowired
	DatabaseService databaseService;
	
	@PostMapping("/addCustomer")
	public ModelAndView submitCustomerForm(@Valid @ModelAttribute("customerListItem") Customer customer , BindingResult bindingResult) {
		if(bindingResult.hasErrors()) {
			return new ModelAndView("addCustomer");
		}
		Long id = customer.getId();
		if(id==null) {
			
			databaseService.create(customer);
		}else {
			databaseService.update(customer,id);
		}
		RedirectView rd = new RedirectView();
		rd.setUrl("/customerList");
		
		return new ModelAndView(rd); 
	
	}
	
	@GetMapping("/addCustomer")
	public ModelAndView showWatchListForm(@RequestParam (required =false) Long id) {
		
		String viewName = "addCustomer";
		Map<String,Object> model = new HashMap<>();
		if(id == null) {
			model.put("customerListItem", new Customer());
			
		}else {
			model.put("customerListItem", databaseService.getCustomerById(id));
		}
		
		
		return new ModelAndView(viewName , model);
		
	}
	
	@GetMapping("/customerList")
    public ModelAndView getcustomeList() {
		String viewName = "customerList";
		Map<String,Object> model = new HashMap<>();
		List<Customer>custList = databaseService.getAllCustomers();
		model.put("custrows",custList);
		
		return new ModelAndView(viewName,model);
	}
	@GetMapping("/deleteCustomer")
    public ModelAndView deleteCustomer(@RequestParam Long id) {
        // delete the customer by ID
        databaseService.deleteCustomer(id);

        RedirectView rd = new RedirectView();
        rd.setUrl("/customerList");

        return new ModelAndView(rd);
    }

}
