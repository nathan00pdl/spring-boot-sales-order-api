package com.MyExample.Projeto2_Java_Spring.services.exceptions;

public class ResourceNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	//Declarando construtor
	public ResourceNotFoundException(Object id){
		super("Resource Not Found!  ID: " + id);
	}
	
	
}
