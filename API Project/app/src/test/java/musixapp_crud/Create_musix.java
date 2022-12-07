package musixapp_crud;

import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class Create_musix {
	@Test
	public void post_method(){
		//Add a music: http://localhost:9090/AddSong
		RestAssured.baseURI = "http://localhost:9090/AddSong";
		RequestSpecification http_request = RestAssured.given().log().all();
		/*creating request in JSON*/
		JSONObject jsob = new JSONObject();
		jsob.put("song_Id",111);
		jsob.put("song","The Punjabian song");
		jsob.put("singer","Kavita Seth");
		jsob.put("movie_name","Jeeyo");
		jsob.put("genere","Country music");
		/*Header-adding*/
		http_request.header("Content-Type","application/json");//header("Accept","data/json");
		http_request.body(jsob.toString());
		/*Posting header,Content*/
		Response res = http_request.request(Method.POST);
		System.out.println("Status code : "+res.getStatusCode());
		System.out.println("Body "+res.getBody().asPrettyString());
		/*POJO_Class*/
		@SuppressWarnings("rawtypes")
		ResponseBody res_body = res.getBody();
		Pojo_success_Payload convert = res_body.as(Pojo_success_Payload.class);
		try {
			Assert.assertEquals("The Punjabian song",convert.song);//PayLoad Data
			System.out.println("POST MUSIX OPERATION SUCCESSFUL");
		}catch(Exception e) {
			System.out.println("POST MUSIX OPERATION ERROR...");
		}
	}
}