package com.qa;

import static io.restassured.RestAssured.*;

import java.util.ArrayList;
import java.util.HashMap;

import org.hamcrest.core.Is;
import org.hamcrest.core.IsEqual;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class test_withoutSeialization {
	public HashMap map;
	@Test
	public void testToPut() {
		map=new HashMap();
		map.put("id", 102);
		map.put("firstName", "Puchssu");
		map.put("lastName", "Roysss");
		map.put("email", "xppvyssss@gmail.com");
		map.put("programme", "FaltsQa");
		ArrayList ar=new ArrayList();
		ar.add("Java");
		ar.add("Python");
		map.put("courses", ar);
		
		given()
			.contentType(ContentType.JSON)
			.body(map)
		.when()
			.post("http://localhost:8085/student")
		.then()
			.statusCode(201)
			.assertThat().body("msg",IsEqual.equalTo("Student added"));
	}

}
