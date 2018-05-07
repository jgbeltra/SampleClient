package co.com.service.client;

import org.apache.cxf.jaxws.javaee.PropertyType;

import co.com.service.consumer.GreetingImplService;
import co.com.service.consumer.IGreeting;

public class GreetingClient {
	
	public static void main(String[] args) {
		GreetingImplService greetingImplService = new GreetingImplService();
		IGreeting operation = greetingImplService.getGreetingImplPort();
		String response = operation.greetingWithName("johitan");
		System.out.println(response);
		
		java.util.Map<String, Object> responseContext =
				  ((javax.xml.ws.BindingProvider)operation).getResponseContext();
		

	
	}

}
