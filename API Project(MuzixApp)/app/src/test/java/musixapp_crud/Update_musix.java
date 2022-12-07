package musixapp_crud;

import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class Update_musix {

	//public static void main(String[] args) {
	@Test
	public void put_method() {
		//Update a music : http://localhost:9090/UpdateSong/{song_Id}
		RestAssured.baseURI = "http://localhost:9090/UpdateSong/111";
		RequestSpecification http_request = RestAssured.given().log().all();//uri();
		//creating request in JSON
		JSONObject jsob = new JSONObject();
		jsob.put("movie_name","Jugjugg Jeeyo");//Jeeyo to Jugjugg Jeeyo
		/*Header-Adding*/
		http_request.header("Content-Type","application/json");
		http_request.body(jsob.toString());
		/*Posting header,Content*/
		Response res = http_request.request(Method.PUT);
		System.out.println("Status code "+res.getStatusCode());
		System.out.println("Body "+res.getBody().asPrettyString());
		@SuppressWarnings("rawtypes")
		/*POJO_Class*/
		ResponseBody res_body = res.getBody();
		Pojo_failure_Payload convert = res_body.as(Pojo_failure_Payload.class);
		/*PayLoad data*/
		try {
			Assert.assertEquals("500",convert.status);
			System.out.println("UPDATE MUSIX OPERATION ERROR...");
		}catch(Exception e) {
			System.out.println("UPDATE MUSIX OPERATION SUCCESSFUL");
		}	
	}
}