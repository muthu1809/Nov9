package com.payilagam.exceptionhan;

public class VoterIDCheckException extends Exception {

	int voterAge; 
	public VoterIDCheckException(int age) {
		// TODO Auto-generated constructor stub
		
		this.voterAge = age; 
		ageFinder(voterAge); 
		
	}
	public VoterIDCheckException() {
		// TODO Auto-generated constructor stub
	}
	private void ageFinder(int age) {
		// TODO Auto-generated method stub
		if(age<18)
		{
			try {
				throw new VoterIDCheckException();
			} catch (VoterIDCheckException e) {
				// TODO Auto-generated catch block
				System.out.println("Please check your age");
				ThrowLearning.voterAgeCheck();
			} 
		}
		
			System.out.println("Age "+ age);
		
		
		
	}
	
	

}
