package com.phone.book.entity;

public class ExceptionMessage extends Exception{
	
   private	String message = "Name is required" ;

public ExceptionMessage(String message) {
	super();
	this.message = message;
}
   
public ExceptionMessage() {

}

public String getMessage() {
	return message;
}


   
    
}
