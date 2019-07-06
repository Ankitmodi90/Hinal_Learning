package jackson_Understanding.readOneValue;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator; 
import java.util.Map; 
  
import org.json.simple.JSONArray; 
import org.json.simple.JSONObject; 
import org.json.simple.parser.*; 

public class ReadData {

	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		// TODO Auto-generated method stub
		
		// parsing file "JSONExample.json" 
        Object obj = new JSONParser().parse(new FileReader("C:\\Users\\admodi.ORADEV\\Desktop\\Work\\JSONExample.json")); 
          
        // typecasting obj to JSONObject 
        JSONObject jo = (JSONObject) obj; 
          
        // getting firstName and lastName 
//        int firstName = (Integer) jo.get("count"); 
//        String lastName = (String) jo.get("lastName"); 
//          
//        System.out.println(firstName); 
//        System.out.println(lastName); 
          
        // getting age 
        long count = (long) jo.get("count"); 
        System.out.println(count); 
          
        // getting address 
//        Map address = ((Map)jo.get("items")); 
//          
//        System.out.println(address);
        // iterating address Map 
//        Iterator<Map.Entry> itr1 = address.entrySet().iterator(); 
//        while (itr1.hasNext()) { 
//            Map.Entry pair = itr1.next(); 
//            System.out.println(pair.getKey() + " : " + pair.getValue()); 
//        } 
          
        // getting phoneNumbers 
        JSONArray ja = (JSONArray) jo.get("items"); 
          
        // iterating phoneNumbers 
        Iterator itr2 = ja.iterator(); 
          
        while (itr2.hasNext())  
        { 
        	JSONObject a = (JSONObject) itr2.next();
        	
//           System.out.println(a);
        } 
        for(Object o : ja)
        {
        	JSONObject jsonLineItem = (JSONObject) o;
        	
        	String expenseTypeName = (String) jsonLineItem.get("ExpenseTypeName");
//        	System.out.println(expenseTypeName);
//        	System.out.println(jsonLineItem.get("links"));
        	JSONArray a = (JSONArray) jsonLineItem.get("links");
        	for(Object o1 : a)
        	{
//        		System.out.println(o1);
        		JSONObject link = (JSONObject) o1;
        		System.out.println(link.get("rel"));
        		
        	}
        	
        }
    } 
//} 

	}

//}
