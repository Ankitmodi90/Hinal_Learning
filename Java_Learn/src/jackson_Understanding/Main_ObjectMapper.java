package jackson_Understanding;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.Map;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main_ObjectMapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		ObjectMapper objectMapper = new ObjectMapper();
		String carJson =
			    "{ \"brand\" : \"Mercedes\", \"doors\" : 5 }";
		
		String jsonArray = "[{\"brand\":\"ford\"}, {\"brand\":\"Fiat\"}]";
		
		Reader reader = new StringReader(carJson);
		
		String jsonObject = "{\"brand\":\"ford\", \"doors\":5}";
		
		System.out.println(jsonObject);
		
		objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		
		objectMapper.configure(DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES, true);
		

		try {
		    Car car = objectMapper.readValue(carJson, Car.class);
		    
		    
		    Car[] car2 = objectMapper.readValue(jsonArray, Car[].class);
		    
		    Map<String, Object> jsonMap = objectMapper.readValue(jsonObject, new TypeReference<Map<String, Object>>() {
			});
		    
		    System.out.println(jsonMap);

//		    System.out.println("car brand = " + car.getBrand());
//		    System.out.println("car doors = " + car.getDoors());
//		    System.out.println("car brand = " + car2[0].getBrand());
//		    System.out.println("car doors = " + car2[1].getBrand());
		} catch (IOException e) {
		    e.printStackTrace();
		}
		
		System.out.println(carJson);

	}

}
