package com.phone.book.Jsontoken;

import com.phone.book.entity.User;

public class Jsontoken {
private String token;
private int code;
private int statuscode;
private String message;
private User data;



public User getData() {
	return data;
}

public void setData(User data) {
	this.data = data;
}

public String getToken() {
	return token;
}

public void setToken(String token) {
	this.token = token;
}



public int getCode() {
	return code;
}

public void setCode(int code) {
	this.code = code;
}

public int getStatuscode() {
	return statuscode;
}

public void setStatuscode(int statuscode) {
	this.statuscode = statuscode;
}

public String getMessage() {
	return message;
}

public void setMessage(String message) {
	this.message = message;
}

 
}
