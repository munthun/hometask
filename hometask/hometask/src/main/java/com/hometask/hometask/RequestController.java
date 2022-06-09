package com.hometask.hometask;


import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class RequestController {
	
	private static final String greeting = "Hello! This is Manthan.";
	private static final String error = "Error 404! --- MV";
	
	@RequestMapping(path = "/error", method = RequestMethod.GET)
	public String error() {
		return error;
	}
	
	@GetMapping("/greeting")
	public String greeting(String name) {
		return greeting;
	}
	
	@GetMapping("/request")
	public String greeting() {
		return "You need to have an account number!";
	}
	
	@RequestMapping(path = "/request/{accountNumber}/{sources}",method = RequestMethod.GET)
	public ArrayList<Response> request(@PathVariable int accountNumber,@PathVariable ArrayList <String> sources) {
		Request newRequest =  new Request(accountNumber,sources);
		ArrayList<Response> solution = newRequest.generateResponses();
		return solution;	
	}
	
	ArrayList<String> sources = new ArrayList<String>();
	@RequestMapping(path = "/request/{accountNumber}/",method = RequestMethod.GET)
	public ArrayList<Response> requestNoSources(@PathVariable int accountNumber,ArrayList<String> sources) {
		
		Request newRequest =  new Request(accountNumber,sources);
		ArrayList<Response> solution = newRequest.generateResponses();
		return solution;	
	}
	
	
	@RequestMapping(path = "/requestProd/{accountNumber}/{sources}",method = RequestMethod.GET)
	public ArrayList<Response> requestProd(@PathVariable int accountNumber,@PathVariable ArrayList <String> sources) {
		Request newRequest =  new Request(accountNumber,sources);
		ArrayList<Response> solution = newRequest.generateResponses();
		return solution;	
	}
	
	
	
	
	
	
	

}
