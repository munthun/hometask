package com.hometask.hometask;

public class Response {
	
	private String source;
	private boolean isValid;
	
	public Response(String source,boolean isValid) {
		this.source = source;
		this.isValid = isValid;
	}
	
	public String getSource() {
		return source;
	}
	
	public boolean getIsValid(){
		return isValid;
	}

}
