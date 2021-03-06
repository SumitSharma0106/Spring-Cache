package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHandle {
	
	@ExceptionHandler
	public ResponseEntity<NotFoundExceptionResponse> handleNotFound(NotFoundException exc){
		NotFoundExceptionResponse error=new NotFoundExceptionResponse();
		error.setStatus(HttpStatus.NOT_FOUND.value());
		error.setMessage(exc.getMessage());
		error.setTimestamp(System.currentTimeMillis());
		
		return new ResponseEntity<>(error,HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler
	public ResponseEntity<NotFoundExceptionResponse> handleNotFound(Exception exc){
		NotFoundExceptionResponse error=new NotFoundExceptionResponse();
		error.setStatus(HttpStatus.BAD_REQUEST.value());
		error.setMessage(exc.getMessage());
		error.setTimestamp(System.currentTimeMillis());
		
		return new ResponseEntity<>(error,HttpStatus.BAD_REQUEST);
	}

}
