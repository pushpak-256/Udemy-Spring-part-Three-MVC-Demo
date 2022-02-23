package com.pushpak.springdemo.mvc.controllers;


import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pushpak.springdemo.mvc.Entities.pojo.Customer;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	//add an Initbinder ... to convert trim input settings

	@InitBinder
	public void initBuinder(WebDataBinder binder) {
		StringTrimmerEditor editor = new StringTrimmerEditor(true);
		binder.registerCustomEditor(String.class, editor);
	}
	
	@RequestMapping("/showForm")
	public String showForm(Model model) {

		model.addAttribute("customer", new Customer());

		return "userForms/customer-form";
	}

	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("customer") Customer customer, BindingResult res) {
		if (res.hasErrors()) {
			return "userForms/customer-form";
		} else {
			System.out.println( customer.getLastName().isBlank());
			return "resultPages/customer-confirmation";
		}
}
	
	

}
