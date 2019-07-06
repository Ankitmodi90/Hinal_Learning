package jackson_Understanding;

import java.io.IOException;

import com.fasterxml.jackson.core.json.ReaderBasedJsonParser;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class JsonNode_Understanding {

	
	public static void main(String[] args) throws IOException {
		
		String json = "{ \"f1\" : \"v1\" } ";
		
		System.out.println(json);
		
		ObjectMapper objectMapper = new ObjectMapper();
		
		JsonNode jsNode = objectMapper.readTree(json);
		
		System.out.println(jsNode.get("f1").asText());

		ObjectNode objectNode = objectMapper.createObjectNode();
		
		
	}
}
