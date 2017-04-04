package com.alinua.action;

//import org.json.simple.JSONObject;

//import jdk.nashorn.internal.ir.debug.JSONWriter;

import java.io.FileReader;

import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;

public class SpringAction {

	//DI via Spring	
	private JSONArray annonceJson;
	
	

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



	public String execute() throws Exception {		

		System.out.println(" execute() ");
		return "success";

	}
}
