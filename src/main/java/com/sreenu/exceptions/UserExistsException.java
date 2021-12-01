package com.sreenu.exceptions;

public class UserExistsException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6311743418596838947L;

	public UserExistsException() {
		super();
	}

	public UserExistsException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public UserExistsException(String message, Throwable cause) {
		super(message, cause);
	}

	public UserExistsException(String message) {
		super(message);
	}

	public UserExistsException(Throwable cause) {
		super(cause);
	}
	
	

}
