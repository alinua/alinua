package com.m1Info.action;

//import org.json.simple.JSONObject;

//import jdk.nashorn.internal.ir.debug.JSONWriter;

import com.m1Info.user.User;

public class UserSpringAction {

	//DI via Spring
	User userBo;
	
	
	
	
	
	private String variableAjax;
	private String resultAjx;
	
	public String getVariableAjax() {
		return variableAjax;
	}


	public void setVariableAjax(String variableAjax) {
		this.variableAjax = variableAjax;
	}
	public String getResultAjx() {
		return resultAjx;
	}


	public void setResultAjx(String resultAjx) {
		this.resultAjx = resultAjx;
	}


	public String methondeAjx(){
		System.out.println("variableAjax = "+variableAjax);
		resultAjx="coucouJava";
		
		//JSONObject json = new JSONObject();

		//json.put("test1", "value1");
		

		return "success";
	}
	
	
	
	
	
	
	
	

	public User getUser() {
		return userBo;
	}

	public void setUser(User userBo) {
		this.userBo = userBo;
	}

	public String execute() throws Exception {

		System.out.println("variableAjax = "+variableAjax);
		userBo.printUser();
		return "success";

	}
}
