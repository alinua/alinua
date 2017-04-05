package com.m1Info.action;

//import org.json.simple.JSONObject;

//import jdk.nashorn.internal.ir.debug.JSONWriter;

import java.io.FileReader;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;

import org.apache.struts2.ServletActionContext;

public class SpringAction {

	//DI via Spring	
	private JSONArray annonceJson;
	private String id;
	
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setAnnonceJson(JSONArray annonceJson) {
		this.annonceJson = annonceJson;
	}
	
	public JSONArray getAnnonceJson() {
		return annonceJson;
	}

	
	public String getJson(){
		annonceJson=new JSONArray();
		JSONParser parser= new JSONParser();
		
		try {
			annonceJson=(JSONArray) parser.parse(new FileReader("/home/etudiant/workspace/Alinua/src/main/webapp/MyAnnounce.json"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		System.out.println("nnonceJson "+annonceJson.toJSONString());
		
		return "success";
	}
	
	
	
	
	
	
	public String execute2() throws Exception {		

		System.out.println(" execute2() ");
		
		HttpServletRequest request = ServletActionContext.getRequest();
		
		System.out.println(" execute() "+request.getMethod());
		System.out.println(" execute() "+request.getContextPath());
		System.out.println(" execute() "+request.getLocalAddr());
		System.out.println(" execute() "+request.getPathInfo());
		System.out.println(" execute() "+request.getQueryString());
		System.out.println(" execute() "+request.getUserPrincipal());
		System.out.println(" execute() "+request.getRequestURL());
		
		
		
		return "success";

	}
	



	public String execute() throws Exception {		

		System.out.println(" execute() ");
		
		

		HttpServletRequest request = ServletActionContext.getRequest();
		
		System.out.println(" execute() "+request.getMethod());
		System.out.println(" execute() "+request.getContextPath());
		System.out.println(" execute() "+request.getLocalAddr());
		System.out.println(" execute() "+request.getPathInfo());
		System.out.println(" execute() "+request.getQueryString());
		System.out.println(" execute() "+request.getUserPrincipal());
		System.out.println(" execute() "+request.getRequestURL());
		
		
		
		return "success";

	}
	public String execute3() throws Exception {		
		System.out.println(" execute()3 ");
		HttpServletRequest request = ServletActionContext.getRequest();
		System.out.println(" execute() "+request.getMethod());
		System.out.println(" execute() "+request.getRequestURL());
		return "success";

	}
	
	public String execute4() throws Exception {		
		System.out.println(" execute4() ");
		HttpServletRequest request = ServletActionContext.getRequest();
		System.out.println(" execute() "+request.getMethod());
		System.out.println(" execute() "+request.getRequestURL());
		return "success";

	}
	
	public String execute5() throws Exception {		
		System.out.println(" execute5() "+id);
		HttpServletRequest request = ServletActionContext.getRequest();
		System.out.println(" execute() "+request.getMethod());
		System.out.println(" execute() "+request.getRequestURL());
		return "success";

	}
}
