package com.tutorialspoint;

public class HelloWorld {
	
	   private String message;
	   private String person;

	   public void setMessage(String message){
	      this.message  = message;
	   }

	   public void getMessage(){
	      System.out.println( message);
	   }

	public void getPerson() {
		System.out.println( person);
	}

	public void setPerson(String person) {
		this.person = person;
	}

}
