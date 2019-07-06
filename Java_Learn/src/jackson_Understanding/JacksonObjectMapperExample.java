package jackson_Understanding;

import java.io.IOException;
import java.io.StringWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class JacksonObjectMapperExample {

	public static void main(String[] args) throws IOException {
		
		byte[] jsondata = Files.readAllBytes(Paths.get("C:\\Users\\admodi.ORADEV\\Desktop\\Personal\\employee.txt"));
		
		ObjectMapper mapper = new ObjectMapper();
		
		Employee emp = mapper.readValue(jsondata, Employee.class);
		
		System.out.println(emp);
		
		
		Employee emp1 = createEmployee();
		
		mapper.configure(SerializationFeature.INDENT_OUTPUT, true);
		
		StringWriter stringWriter = new StringWriter();
		mapper.writeValue(stringWriter, emp1);
		
		System.out.println(stringWriter);
	}

	private static Employee createEmployee() {
		// TODO Auto-generated method stub
		Employee emp = new Employee();
		emp.setId(100);
		emp.setName("David");
		emp.setPermanent(false);
		emp.setPhoneNumbers(new long[] { 123456, 987654 });
		emp.setRole("Manager");

		Address add = new Address();
		add.setCity("Bangalore");
		add.setStreet("BTM 1st Stage");
		add.setZipcode(560100);
		emp.setAddress(add);

		List<String> cities = new ArrayList<String>();
		cities.add("Los Angeles");
		cities.add("New York");
		emp.setCities(cities);

		Map<String, String> props = new HashMap<String, String>();
		props.put("salary", "1000 Rs");
		props.put("age", "28 years");
		emp.setProperties(props);

		return emp;
	}
}
