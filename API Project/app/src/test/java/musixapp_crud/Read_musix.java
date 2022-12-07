package musixapp_crud;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class Read_musix {
	@Test
	public void get_method() {
		//Get a music by Id: http://localhost:9090/Song/{song_Id}
		RestAssured.baseURI = "http://localhost:9090/allsongs/111";
		RequestSpecification http_request = RestAssured.given().log().all();
		Response response_request = http_request.request(Method.GET);
		Integer StatusCode = response_request.getStatusCode();
		System.out.println("Status  "+StatusCode);
		System.out.println("Response  "+response_request.getBody().asPrettyString());
		if(StatusCode!=200) {
			System.out.println("FAILED TO READ MUSIX");
		}else {
			System.out.println("READ MUSIX SUCCESSFUL");
		}
		@SuppressWarnings("rawtypes")
		ResponseBody res_body = response_request.getBody();
		Pojo_failure_Payload convert = res_body.as(Pojo_failure_Payload.class);
		/*PayLoad data*/
		try {
			Assert.assertEquals("404",convert.status);
			System.out.println("READ MUSIX OPERATION ERROR...");
		}catch(Exception e) {
			System.out.println("READ MUSIX OPERATION SUCCESSFUL");
		}	
	}
}