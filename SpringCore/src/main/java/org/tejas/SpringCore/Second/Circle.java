package org.tejas.SpringCore.Second;

public class Circle 
{
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public void display()
	{
		System.out.println(getMessage());
	}
}
