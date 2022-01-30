package com.ex.boot3.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ex.boot3.beans.Response;
import com.ex.boot3.exceptions.InvalidUserCredentialsException;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(value = InvalidUserCredentialsException.class)
	@ResponseBody
	public Response invalidCredentialsHandler() {
		Response response = new Response();
		response.setMessage("Invalid id or password");
		response.setStatus(500);
		return response;
	}
}
