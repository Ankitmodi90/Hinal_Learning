package jackson_Understanding.annotation;

import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.internal.ExactComparisonCriteria;
import org.junit.internal.Throwables;
import org.junit.jupiter.api.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ValueDemoBeanTest {

	private ObjectMapper objectMapper;
	
	@Before
	public void setUp() throws Exception{
		objectMapper = new ObjectMapper();
	}
	
	@After
	public void tearDown() throws Exception{
		objectMapper = null;
	}
	
	/*@org.junit.Test
	public void testSeriallizingWithJsonValue() throws Exception {
		
		String jsonString = objectMapper.writeValueAsString(new ValueDemoBean());
		
		System.out.println(jsonString);
		
	}
	
	@org.junit.Test
	public void testSerializingWithJsonInclude() throws JsonProcessingException {
		String jsonString = objectMapper.writeValueAsString(new IncludeDemoBean());
		System.out.println(jsonString);
	}*/
	
	/*@org.junit.Test
	public void testSerializingWithJsonGetter() throws JsonProcessingException {
		String jsonString = objectMapper.writeValueAsString(new GetterDemoBean());
		System.out.println(jsonString);
		
	}*/
	
	/*@org.junit.Test
	public void testSerializingWithJsonAnyGetter() throws JsonProcessingException {
		AnyGetterDemoBean bean = new AnyGetterDemoBean();
		Map<String, String> stringMap = bean.getProperties();
		stringMap.put("emailId","james@gmail.com");
		stringMap.put("gender","male");
		String jsonString = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(bean);
		System.out.println(jsonString);
		
	}*/
	
	@org.junit.Test
	public void testSerializingWithJsonRawValue() throws JsonProcessingException {
		String jsonString = objectMapper.writeValueAsString(new RawValueDemoBean());
		System.out.println(jsonString);
		
	}
}
