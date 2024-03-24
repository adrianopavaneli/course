package com.pavaneli.course.services.exceptions;

public class ResorceNotFoundException extends RuntimeException {

	
	private static final long serialVersionUID = 1L;
	public ResorceNotFoundException(Object id) {
		super("Resource not Found. Id " + id);
	}
	

}
