package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {
	
	
	@Autowired
	private CustomerRepo customerRepo;
	
	
	@RequestMapping("/")
	public String courses()
	{
		return "customer";
	}
	
	@RequestMapping("/savedetails")
	public String details(Customer customer)
	{
		
		/*
		 * Customer c = new Customer(); c.setCid(1); c.setCname("Manibharathi");
		 * c.setAddress("Nagercoil"); c.setAge("22");
		 */
		customerRepo.save(customer);
		return "customer";
	}
	
	@PostMapping("/details")
	public String details(@RequestParam("cname") String name, 
			@RequestParam("address") String address, @RequestParam("age") String age, ModelMap modelMap) {
			modelMap.put("cname", name);
			modelMap.put("age", age);
			modelMap.put("address", address);
			return "viewcustomer";
	}
}
