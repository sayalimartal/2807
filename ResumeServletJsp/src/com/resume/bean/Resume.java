package com.resume.bean;

public class Resume {
	private String firstName,lastName,gender,qualification,dob,hobbies,address,email,weburl,contact,description;
	private String[] skills;
	
	
	public Resume(String firstName, String lastName, String gender, String qualification, String dob, String hobbies,
			String address, String email, String weburl, String contact, String description, String[] skills) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.qualification = qualification;
		this.dob = dob;
		this.hobbies = hobbies;
		this.address = address;
		this.email = email;
		this.weburl = weburl;
		this.contact = contact;
		this.description = description;
		this.skills = skills;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getGender() {
		return gender;
	}
	public String getQualification() {
		return qualification;
	}
	public String getDob() {
		return dob;
	}
	public String getHobbies() {
		return hobbies;
	}
	public String getAddress() {
		return address;
	}
	public String getEmail() {
		return email;
	}
	public String getWeburl() {
		return weburl;
	}
	public String getContact() {
		return contact;
	}
	public String getDescription() {
		return description;
	}
	public String[] getSkills() {
		return skills;
	}
	
	

}
