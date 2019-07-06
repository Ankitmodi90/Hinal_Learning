package jackson_Understanding;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;

public class JsonGenerator_Understanding {

	public static void main(String[] args) throws IOException {
		
		JsonFactory jsonFactory = new JsonFactory();
		
		JsonGenerator generator = jsonFactory.createGenerator(new File("data/output.json"), JsonEncoding.UTF8);
		
		generator.writeStartObject();
		generator.writeStringField("brand", "Mercedes");
		generator.writeNumberField("doors", 5);
		generator.writeEndObject();
		
		generator.close();
	}
}
