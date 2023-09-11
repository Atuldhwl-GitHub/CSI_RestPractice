package practice;

import static io.restassured.RestAssured.*;

import org.apache.http.HttpStatus;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GET_CIF extends JsonBody {
	
	@Test
	
	public static void getCIFDetails() {
		
		RestAssured.baseURI = "https://shield.uat.creditsaison.xyz";
		
		Response getCIFDetails = given().header("Content-Type", "application/json")
								.when().get("/api/v1/appForm/67a31907-3f44-4351-bac0-1eba001aa635")
								.then().statusCode(HttpStatus.SC_OK).extract().response();
		
		System.out.println(getCIFDetails);
	}
	
	
	@Test
	public static void postSelfiVerification() {
		RestAssured.baseURI = "https://morpheus.uat.creditsaison.xyz";
		Response postSelfi = given().header("Content-Type", "application/json")
							.when().post("/api/v1/appForm/67a31907-3f44-4351-bac0-1eba001aa635/selfie")
							.body(JsonBody.selfiBody())
							.then().statusCode(HttpStatus.SC_OK).extract().response();
							
		System.out.println(postSelfi);
	}
	
	
	@Test
	public static void putKYCVerification() {
		RestAssured.baseURI = "https://morpheus.uat.creditsaison.xyz";
		Response putKYC = given().header("Content-Type", "application/json")
						.when().put("/api/v1/appForm/deb98707-7c53-458a-851f-69a1abc50a52/kyc")
						.body(JsonBody.kycBody())
						.then().statusCode(HttpStatus.SC_OK).extract().response();
		
		System.out.println(putKYC);
	}
	
	@Test
	public static void getStatus() {
		RestAssured.baseURI = "https://api-privo.uat.creditsaison.xyz";
		Response getStatus = given().auth().basic("@dM1N", "P@$$W0rD")
							.when().get("/partner/api/v1/TESTCS-724e3596-41ab-4036-b4ba-1def5f66b184/status")
							.header("Content-Type", "application/json")
							.then().statusCode(HttpStatus.SC_OK).extract().response();
	}

}
