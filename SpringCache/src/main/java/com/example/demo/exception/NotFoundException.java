package com.example.demo.exception;

public class NotFoundException extends RuntimeException {
	
	

	/**
	 * 
	 */
	private static final long serialVersionUID = -6077836309300531691L;

	public NotFoundException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public NotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public NotFoundException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

}
