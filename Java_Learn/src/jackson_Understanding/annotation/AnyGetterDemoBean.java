package jackson_Understanding.annotation;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"personName", "personId"})
public class AnyGetterDemoBean {

	public long personId = 123L;
	public String personName = "James Clark";
	private Map<String , String > properties = new HashMap<String , String >();
	
	@JsonAnyGetter
	public Map<String, String> getProperties() {
		return properties;
	}
	
	

}
