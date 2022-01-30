package com.ex.boot3.exceptions;

public class InvalidUserCredentialsException extends RuntimeException {
	public InvalidUserCredentialsException(String msg) {
		super(msg);
	}
}
