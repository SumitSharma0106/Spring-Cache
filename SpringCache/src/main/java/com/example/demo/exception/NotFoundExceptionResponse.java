package com.example.demo.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NotFoundExceptionResponse {
	
	private int status;
	private String message;
	private long timestamp;

}
