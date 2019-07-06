package jackson_Understanding;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

public class JsonParser_Understanding {

	public static void main(String[] args) throws JsonParseException, IOException {
		
		String carJson =
		        "{ \"brand\" : \"Mercedes\", \"doors\" : 5 }";
		
		System.out.println(carJson);
		
		JsonFactory factory = new JsonFactory();
		JsonParser parser = factory.createParser(carJson);
		
		Car car = new Car();
		
		while(!parser.isClosed())
		{
			JsonToken jsonToken = parser.nextToken();
			if (jsonToken.FIELD_NAME.equals(jsonToken)) {
				
				String fieldName = parser.getCurrentName();
				System.out.println(fieldName);
				
				jsonToken = parser.nextToken();
				
				if("brand".equalsIgnoreCase(fieldName))
				{
					car.setBrand(parser.getValueAsString());
				}
				else if("doors".equalsIgnoreCase(fieldName))
				{
					car.setDoors(parser.getValueAsInt());
				}
			}
		}
		
		System.out.println(car.getBrand());
		System.out.println(car.getDoors());
	}
}
