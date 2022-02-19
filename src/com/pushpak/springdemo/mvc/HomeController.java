package com.pushpak.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//@Controller extends @Component
@Controller
public class HomeController {

	@RequestMapping("/")
	public String showPage () {
		return "main-menu";
	}
	
}
