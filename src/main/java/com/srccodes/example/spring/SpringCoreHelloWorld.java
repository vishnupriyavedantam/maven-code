/**
 * 
 */
package com.srccodes.example.spring;

/**
 * @author Abhijit Ghosh
 * @version 1.0
 * 
 */
public class SpringCoreHelloWorld {
	private String message = null;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}	
	
	public void sayHello() {
		System.out.println(getMessage());
	}
}
