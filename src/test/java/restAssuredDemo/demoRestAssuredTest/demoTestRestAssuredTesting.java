package restAssuredDemo.demoRestAssuredTest;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class demoTestRestAssuredTesting {

	@Test
	public void test1() {
		Response response = RestAssured.get("https://reqres.in/api/users/2");
		
		Assert.assertEquals(response.getStatusCode(), 200);
		JsonPath jsonPathEvaluator = response.jsonPath(); 	
		String email = jsonPathEvaluator.get("data.email");
		String fname = jsonPathEvaluator.get("data.first_name");
		System.out.println("***********************************");
		System.out.println("Start of test1...");
		System.out.println("Email id is: "+email);
		System.out.println("First Name is: "+fname);
		System.out.println("End of test1...");
		System.out.println("***********************************");
	
	}

	@Test
	public void test2() {
		Response response = RestAssured.get("https://reqres.in/api/users/5");
		
		Assert.assertEquals(response.getStatusCode(), 200);
		JsonPath jsonPathEvaluator = response.jsonPath(); 	
		String email = jsonPathEvaluator.get("data.email");
		String lname = jsonPathEvaluator.get("data.last_name");
		System.out.println("Start of test2...");
		System.out.println("Email id is: "+email);
		System.out.println("Last Name is: "+lname);
		System.out.println("End of test2...");
		System.out.println("***********************************");
		
	}
	
	
	@Test
	public void test3() {
		Response response = RestAssured.get("https://reqres.in/api/users/1");
		
		Assert.assertEquals(response.getStatusCode(), 200);
		JsonPath jsonPathEvaluator = response.jsonPath(); 	
		String email = jsonPathEvaluator.get("data.email");
		String lname = jsonPathEvaluator.get("data.last_name");
		System.out.println("Start of test3...");
		System.out.println("Email id is: "+email);
		System.out.println("Last Name is: "+lname);
		System.out.println("End of test3...");
		System.out.println("***********************************");
		
	}

}
