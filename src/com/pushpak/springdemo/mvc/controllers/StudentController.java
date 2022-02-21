package com.pushpak.springdemo.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pushpak.springdemo.mvc.Entities.pojo.Student;

@Controller
@RequestMapping("/student")
public class StudentController {

	@RequestMapping("/showForm")
	public String showForm(Model theModel) {

		// create new student object
		Student student = new Student();

		// add student to model
		theModel.addAttribute("student", student);

		return "userForms/student-form";
	}

	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student student) {
		System.out.println(student.getFirstName() + "\t" + student.getLastName());
		System.out.println("--"+student.getCountry().isEmpty()+"--");
		return "resultPages/student-conformation";
	}

}
