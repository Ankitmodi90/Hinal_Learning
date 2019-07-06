package jackson_Understanding;

import java.io.IOException;
import java.io.StringWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class JacksonObjectMapperExample2 {

	public static void main(String[] args) throws IOException {
		
		byte[] jsondata = Files.readAllBytes(Paths.get("C:\\Users\\admodi.ORADEV\\Desktop\\Personal\\employee.txt"));
		
		ObjectMapper mapper = new ObjectMapper();
		
//		Employee emp = mapper.readValue(jsondata, Employee.class);
		
		JsonNode rootPath = mapper.readTree(jsondata);
		
		System.out.println(rootPath.path("id").asInt());
		
		Iterator<JsonNode> elements = rootPath.path("phoneNumbers").elements();
		
		while(elements.hasNext())
		{
			System.out.println(elements.next().asLong());
		}
		
//		List<JsonNode> elementsList = rootPath.path("phoneNumbers").findValues("phoneNumbers");
		
		
	}

}
