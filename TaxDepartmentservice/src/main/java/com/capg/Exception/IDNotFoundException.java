package com.capg.Exception;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class IDNotFoundException extends Exception {

	public IDNotFoundException(String message) {
		// TODO Auto-generated constructor stub
		super(message);
	}

}
