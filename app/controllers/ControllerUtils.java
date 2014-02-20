package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ControllerUtils {

	private static ObjectMapper mapper = new ObjectMapper();
	
	public static JsonNode messageToJson(String message) {
		try {
			return mapper.readTree("{\"description\": \"" + message + "\"}");
		} catch (Exception e) {
			e.printStackTrace();
			
			return mapper.createObjectNode();
		}
	}
	
	public static JsonNode gradeScoreToJson(String grade, String percentage) {
	    String output = "{\"grade\": \"" + grade + "\", \"percentage\": \"" + percentage + "\"}";
	    
	    try {
			return mapper.readTree(output);
		} catch (Exception e) {
			e.printStackTrace();
			
			return mapper.createObjectNode();
		}
	}
	
}
