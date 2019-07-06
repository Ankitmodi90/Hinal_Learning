package jackson_Understanding;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonArrayFormatVisitor;

public class Main_Node {
	
	public static void main(String[] args) {

		// TODO Auto-generated constructor stub
		
		String carJson =
		        "{ \"brand\" : \"Mercedes\", \"doors\" : 5," +
		        "  \"owners\" : [\"John\", \"Jack\", \"Jill\"]," +
		        "  \"nestedObject\" : { \"field\" : \"value\" } }";
		
		System.out.println(carJson);
		
		ObjectMapper objectMapper = new ObjectMapper();
		
		try {
			
			JsonNode jsonNode = objectMapper.readTree(carJson);
			
			JsonNode brandNode = jsonNode.get("brand");
			System.out.println(brandNode.asText());
			
			JsonNode array = jsonNode.get("owners");
			System.out.println(array.get(1).asText());
			
			JsonNode child = jsonNode.get("nestedObject");
			System.out.println(child.get("field").asText());
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	
	}
	

}
