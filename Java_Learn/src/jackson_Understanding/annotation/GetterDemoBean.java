package jackson_Understanding.annotation;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;

public class GetterDemoBean {
	
	public long personId = 123L;
	public String personName = "James - Clark";
	
	@JsonGetter(value = "person-id")
	public long getPersonId() {
		return personId;
	}
	public void setPersonId(long personId) {
		this.personId = personId;
	}
	
	@JsonGetter(value = "person-name")
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	
	
	
	

}
