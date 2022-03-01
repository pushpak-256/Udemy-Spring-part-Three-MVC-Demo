package com.pushpak.springdemo.mvc.controllers;

import java.util.Arrays;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pushpak.springdemo.mvc.Entities.pojo.Student;

@Controller
@RequestMapping("/student")
public class StudentController {

	@InitBinder
	public void doValidation(WebDataBinder binder) {
		StringTrimmerEditor editor = new StringTrimmerEditor(true);
		binder.registerCustomEditor(String.class,editor);
		
		
	}
	
	@RequestMapping("/showForm")
	public String showForm(Model theModel) {

		// create new student object
		Student student = new Student();

		// add student to model
		theModel.addAttribute("student", student);

		return "userForms/student-form";
	}

	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("student") Student student , BindingResult res) {

		System.out.println(student.getFirstName() + "\t" + student.getLastName());
		if (student.getCountry() != null) {
			System.out.println("--" + student.getCountry().isBlank() + "--");
		} else
			System.out.println("country is unselected");
		System.out.println(student.getFavoriteLanguage());
		System.out.println(Arrays.toString(student.getOs()) + "\n");

		System.out.println("\n\n"+res+"\n\n");
		
		if (res.hasErrors()) {
			return "userForms/student-form";
		} else
			return "resultPages/student-conformation";
	}

}
