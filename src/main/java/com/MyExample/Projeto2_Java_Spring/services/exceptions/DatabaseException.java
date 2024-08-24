package com.MyExample.Projeto2_Java_Spring.services.exceptions;

public class DatabaseException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;

	//Declarando Consturutor
	public DatabaseException(String msg) {
		super(msg);
	}
	
}
