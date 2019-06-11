package com.caio.senai.services;

public class ObjectNotFoundException extends RuntimeException {
	private static final long serialVersion = 1L;
	
	public ObjectNotFoundException(String msg) {
		super(msg);
		}
public ObjectNotFoundException(String msg, Throwable cause) {
	super(msg, cause);

   }

}
