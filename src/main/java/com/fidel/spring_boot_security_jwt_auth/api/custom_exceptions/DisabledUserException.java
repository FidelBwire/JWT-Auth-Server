package com.fidel.spring_boot_security_jwt_auth.api.custom_exceptions;

public class DisabledUserException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public DisabledUserException(String msg) {
		super(msg);
	}
}
