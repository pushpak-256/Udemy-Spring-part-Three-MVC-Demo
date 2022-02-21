package com.pushpak.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Silly {

	@RequestMapping("/showForm")
	public String displayForm() {
		return "silly";
	}
}
