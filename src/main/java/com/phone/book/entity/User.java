package com.phone.book.entity;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="User", uniqueConstraints = @UniqueConstraint(columnNames = {"phoneNumber"}))
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties({ "status", "created","updated","id"})

public class User {
	
	
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "id")
    private int id;
    
    @Size(min=3, max=10, message= "size should be between 3 to 10 digits")
	@Column(name= "name")
    @NotBlank(message="name is required")
    private String name;
	
    @Email
	@NotBlank(message = "email is required")
	@Column(name= "email")
    private String email;
	
	//@NotBlank(message = "countryCode is required")
	@Column(name= "countryCode")
    private String countryCode;
  
    @Size(min=8, max=12, message= "size should  be between 8 to 12 digits.")
    @NotBlank(message = "phoneNumber is required")
	@Column(name= "phoneNumber", unique = true)
	private String phoneNumber;
	
    @Size(min=4, max=10, message= "Size should be between 4 to 10 digits")
    @NotBlank(message = "passCode is required")
	@Column(name= "passCode")
	private String passCode;
	
	//@NotBlank(message = "status is required")
	@Column(name= "status")
    private int status = 0;
   
    @CreatedDate
    @Column(name = "created", updatable=false)
    private Date created;
    
    @LastModifiedDate
    @Column(name = "updated" ,updatable = false)
    private Date updated;
    
    @JsonIgnore
    @OneToOne(mappedBy = "user")
    private OtpDetails otpDetails;
    
    @JsonIgnore
    @OneToMany(mappedBy = "user")
  	 private Set<Contacts> contacts;

    
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

 public String getEmail() {
		return email;
	}

  public void setEmail(String email) {
		this.email = email;
	}

  public String getCountryCode() {
		return countryCode;
	}

    public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

    public String getPhoneNumber() {
		return phoneNumber;
	}

   public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

   public String getPassCode() {
		return passCode;
	}

   public void setPassCode(String passCode) {
		this.passCode = passCode;
	}
   public int getStatus() {
		return status;
	}
   public void setStatus(int status) {
		this.status = status;
	}

  public Date getCreated() {
		return created;
	}
  public void setCreated(Date created) {
		this.created = created;
	}

   public Date getUpdated() {
		return updated;
	}
  public void setUpdated(Date updated) {
		this.updated = updated;
	}
  	  
	 
	 

	public Set<Contacts> getContacts() {
	return contacts;
}

public void setContacts(Set<Contacts> contacts) {
	this.contacts = contacts;
}

	public OtpDetails getOtpDetails() {
	return otpDetails;
}

public void setOtpDetails(OtpDetails otpDetails) {
	this.otpDetails = otpDetails;
}

	

  @Override
public String toString() {
	return "User [id=" + id + ", name=" + name + ", email=" + email + ", countryCode=" + countryCode + ", phoneNumber="
			+ phoneNumber + ", passCode=" + passCode + ", status=" + status + ", created=" + created + ", updated="
			+ updated + ", otpDetails=" + otpDetails + "]";
}

  
public User(int id, String name, String email, String countryCode, String phoneNumber, String passCode, int status,
		Date created, Date updated, OtpDetails otpDetails) {
	super();
	this.id = id;
	this.name = name;
	this.email = email;
	this.countryCode = countryCode;
	this.phoneNumber = phoneNumber;
	this.passCode = passCode;
	this.status = status;
	this.created = created;
	this.updated = updated;
	this.otpDetails = otpDetails;
}

public User() {}
   
}



    