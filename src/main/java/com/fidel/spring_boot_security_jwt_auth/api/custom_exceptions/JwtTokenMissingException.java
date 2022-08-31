package com.fidel.spring_boot_security_jwt_auth.api.custom_exceptions;

import org.springframework.security.core.AuthenticationException;

public class JwtTokenMissingException extends AuthenticationException {

	private static final long serialVersionUID = 1L;

	public JwtTokenMissingException(String msg) {
		super(msg);
	}

}
