package com.hometask.hometask;
import java.util.Random;
import java.util.ArrayList;

public class Request {
	private final int accountNumber;
	private ArrayList<String> sources = new ArrayList<String>();
	
	
	public Request(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public Request(int accountNumber,ArrayList<String> sources) {
		this.accountNumber = accountNumber;
		this.sources = sources;
	}
	
	public int getAccountNumber(){
		return accountNumber;
	}
	
	public ArrayList<String> getSources(){
		return sources;
	}
	
	//use default sources or sources given in input to create an arraylist of Responses
	public ArrayList<Response> generateResponses() {
		
		Random rd = new Random();//new random object which simulates getting a true false value from data source
		boolean sourceVal = rd.nextBoolean();
		
		ArrayList<String> arrList = this.sources; 
		//if sources are not given we look at sources "already configured"
		if(arrList.size() == 0) {
			arrList.add("configSource1");
			arrList.add("configSource2");
		}
		
		ArrayList<Response> responses = new ArrayList<Response>();
		for(int i = 0; i < arrList.size();i++){
			
			//instead of a random function we need a function in this class to look at data source
			Response r = new Response(arrList.get(i), sourceVal);
			responses.add(r);
		}
		
		return responses;
	}
	
}
