package musixapp_crud;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class Delete_musix {
	@Test
	public void delete_method() throws InterruptedException {
		//Delete a music : http://localhost:9090/DeleteSong/{song_Id}
		RestAssured.baseURI = "http://localhost:9090/DeleteSong/111";
		Thread.sleep(2000);
		RequestSpecification http_request = RestAssured.given().log().all();
		Response response_request = http_request.request(Method.DELETE);
		/*Response code*/
		Integer StatusCode = response_request.getStatusCode();
		System.out.println("Status code "+StatusCode);
		System.out.println("Response"+response_request.getBody().asPrettyString());
		@SuppressWarnings("rawtypes")
		ResponseBody res_body = response_request.getBody();
		Pojo_failure_Payload convert = res_body.as(Pojo_failure_Payload.class);
		/*POJO_Class*/
		try {
			Assert.assertEquals("Internal Server Error",convert.error);//PayLoad data
			System.out.println("DELETE MUSIX OPERATION ERROR...");
		}catch(Exception e) {
			//System.out.println(e.getMessage());
			System.out.println("DELETE MUSIX OPERATION SUCCESSFUL");
		}	
	}
}