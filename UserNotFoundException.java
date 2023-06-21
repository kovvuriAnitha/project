package com.example.demo.ProjectAha;




public class UserNotFoundException extends RuntimeException{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UserNotFoundException(Long id){

        super("The user is not exist: " + id);
    }
}