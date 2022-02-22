package com.pushpak.springdemo.mvc.Entities.pojo;

import java.util.HashMap;
import java.util.Map;

public class Student {

	public String firstName, lastName, country, favoriteLanguage;
	public String[] os;

	private Map<String, String> countryList;
	private Map<String, String> languageList;
	private Map<String, String> operationgSysList;

	public Student() {

		countryList = new HashMap<>();
		languageList = new HashMap<>();
		operationgSysList = new HashMap<>();

		languageList.put("JAVA", "Java");
		languageList.put("PYTHON", "python");
		languageList.put("CPP", "c++");
		languageList.put("C SHARP", "c#");

		countryList.put("", "-- select country --");
		countryList.put("BR", "Brazil");
		countryList.put("IN", "India");
		countryList.put("CA", "Canda");
		countryList.put("DE", "Germany");

		operationgSysList.put("windows", "windows");
		operationgSysList.put("Mac", "Mac");
		operationgSysList.put("Linux", "Linux");
		operationgSysList.put("Ubuntu", "Ubuntu");

	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Map<String, String> getCountryList() {
		return countryList;
	}

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	public Map<String, String> getLanguageList() {
		return languageList;
	}

	public String[] getOs() {
		return os;
	}

	public void setOs(String[] os) {
		this.os = os;
	}

	public Map<String, String> getOperationgSysList() {
		return operationgSysList;
	}

}
