package com.pushpak.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

	// controller-method to show initial form
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloWorld-form";
	}

	// controller-method to process the HTML form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloWorld";
	}

	//	new controller to read  form data 
	//	and add data to model
	
	@RequestMapping("/processFormVersion-2.0")
	public String letsShoutDude(HttpServletRequest request , Model model) {
		
		//get studentName form request partam. HTML form
		String theName = request.getParameter("studentName");
		
		// uppercase data
		theName=theName.toUpperCase();
		
		//create message 
		String result = "Yo! "+theName;
		
		//add message to model
		model.addAttribute("message", result);
		
		return "helloWorld";
	}

}
