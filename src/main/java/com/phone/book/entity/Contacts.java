package com.phone.book.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="contacts")

@JsonIgnoreProperties({ "status" })


public class Contacts {
	
	@Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "id")
	private int id;
	
	@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "userid", referencedColumnName = "id")
    private User user;
	
	@Size(min=3, max=15, message="Size should be between 3 to 15 characters.")
	@NotBlank(message= "name is required")
	@Column(name= "name",nullable = false)
     private String name;
	
	    @Size(min=8, max=12, message="Size should be between 8 to 12 digits")
		@NotBlank(message= "Phonenumber is required")
        @Column(name= "phoneNumber")
        private String phoneNumber;
	
        @Column(name= "countryCode")
        private String countryCode;
	
		@NotBlank(message= "email is required")
        @Email
	    @Column(name= "email")
        private String email;

		@Column(name= "status")
	    private int status;
	
	
	public int getStatus() {
			return status;
		}




		public void setStatus(int status) {
			this.status = status;
		}




	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public String getPhoneNumber() {
		return phoneNumber;
	}




	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}




	public String getCountryCode() {
		return countryCode;
	}




	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}



	public Contacts(int id, User userId, String name, String phoneNumber, String countryCode, String email) {
		super();
		this.id = id;
		this.user = user;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.countryCode = countryCode;
		this.email = email;
	}




	public User getUser() {
		return user;
	}




	public void setUser(User user) {
		this.user = user;
	}




	@Override
	public String toString() {
		return "Contacts [id=" + id + ", user=" + user + ", name=" + name + ", phoneNumber=" + phoneNumber
				+ ", countryCode=" + countryCode + ", email=" + email + "]";
	}




	public Contacts() {}



	
	
}
	
	
	
	


