package musixapp_crud;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class ReadAll_musix {
	@SuppressWarnings("unused")
	@Test
	public void get_all_method() {
		//Get all music :http://localhost:9090//allsongs
		RestAssured.baseURI = "http://localhost:9090/allsongs";
		RequestSpecification http_request = RestAssured.given().log().all();//uri();
		Response response_request = http_request.request(Method.GET);
		int StatusCode = response_request.getStatusCode();
		System.out.println("Status"+StatusCode);
		System.out.println("Response"+response_request.getBody().asPrettyString());
		Assert.assertEquals(StatusCode,200);
		System.out.println("Assert validated Successfully for ReadAll MUSIX");
		@SuppressWarnings("rawtypes")
		ResponseBody res_body = response_request.getBody();
		//Pojo_failure_Payload convert = res_body.as(Pojo_failure_Payload.class);
		//PayLoad data
		try {
			Assert.assertEquals(200,StatusCode);
			System.out.println("READ_ALL MUSIX SUCCESSFUL");
		}catch(Exception e) {
			//System.out.println(e.getMessage());
			System.out.println("READ_ALL MUSIX OPERATION OPERATION ERROR...");
		}	
	}
}