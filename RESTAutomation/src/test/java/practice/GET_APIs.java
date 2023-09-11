package practice;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

import org.apache.http.HttpStatus;
import org.testng.annotations.Test;

public class GET_APIs {
	
	@Test
	
	public static void get_APPFORM() {
		
		RestAssured.baseURI="https://shield.uat.creditsaison.xyz";
		Response getappformdata = given().auth().basic("@dM1N", "P@$$W0rD")
								.header("Content-Type", "application/json")
								.when().get("/api/v1/appForm/af51ca96-476f-45dc-91fa-c354c094d750")
								.then().statusCode(HttpStatus.SC_OK).extract().response();
		
				System.out.println(getappformdata);
	}
	
	@Test
	public static void get_HealthCheck() {
		
		RestAssured.baseURI = "https://asgard.uat.creditsaison.xyz";
		Response getHealthCheck = given().auth().basic("@dM1N", "P@$$W0rD")
								  .header("Content-Type", "application/json")
								  .when().get("/api/v1/healthCheck")
								  .then().statusCode(HttpStatus.SC_OK).extract().response();
		
		System.out.println(getHealthCheck);						  
	}
	
	@Test
	public static void get_LoanDetails() {
		
		RestAssured.baseURI = "https://asgard.uat.creditsaison.xyz";
		Response getLoanDetails = given().auth().basic("@dM1N", "P@$$W0rD")
								  .header("Content-Type", "application/json")
								  .when().get("/api/v1/lms/loan/275116")
								  .then().statusCode(HttpStatus.SC_OK).extract().response();
		
		System.out.println(getLoanDetails);
	}
	

	
}

