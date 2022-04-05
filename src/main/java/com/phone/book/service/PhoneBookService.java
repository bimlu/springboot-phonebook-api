package com.phone.book.service;

import java.util.List;

import com.phone.book.entity.Contacts;
import com.phone.book.entity.OtpDetails;
import com.phone.book.entity.User;

public interface PhoneBookService {

	public void addUser(User user);

	public List<User >getAll(List<User> user);

	public String getOtp();

	public void saveOrUpdate(User user);

	public void addOtpDetails(OtpDetails otpdetails);

	public void check();


	public void saveOrUupdate(User user);

	public void addContacts(Contacts contacts);

	public void saveOrUpdate(Contacts contacts);

	public void getContactDetails(List<Contacts> contacts);

	public void viewContactDetails(int id);



	
	public void loginlogic(User user);


	public void saveOrUpdate(OtpDetails otpDetails);

	public void saveOrUpdate(int id);


	



	
	
	
}


