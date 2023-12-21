package CapstoneProject;

import java.util.HashMap;

import org.junit.Test;

import io.restassured.RestAssured;
 
public class GetAllShoes {

	
	@Test
	
	public void get_all_products() {
		
		
		
		
		
		RestAssured.given()
		.baseUri("https://localhost:9010")
		.basePath("/get-products")
		.when().get()
		.then().statusCode(200)
		.log().all();
	}
	
	public void get_all_users() {
		RestAssured.given()
		.baseUri("https://localhost:9010")
		.basePath("/get-users")
		.when().get()
		.then().statusCode(200)
		.log().all();
		
	}
	
	public void add_products() {
		
		
		HashMap <String, String> map = new HashMap<String, String>();
		map.put("id", "999");
		map.put("image", ".png");
		map.put("name", "Disprin");
		map.put("category", "medicine");

		map.put("brand", "BZ Medico");
		map.put("status", "1");
		map.put("price", "100");
		
		RestAssured.given()
		.baseUri("http://localhost:9010")
		.basePath("/add-product")
		.contentType("application/json")
		.body(map)
		.when().post()
		.then().statusCode(200).log().all();
	
		
		
	}
	
	@Test
	public void update_ProductName() {
		
		
		HashMap<String, String> map = new HashMap<String, String>();
		
		map.put("id", "999");
		map.put("image", "2.png");
		map.put("name", "Disprin+");
		map.put("category", "medicine");
		map.put("brand", "BZ Medico");
		map.put("status", "1");
		map.put("price", "120");
		
		RestAssured.given()
		.baseUri("http://localhost:9010")
		.basePath("/update-product")
		.contentType("application/json")
		.body(map)
		.when().put()
		.then().statusCode(200).log().all();
	
		
		
	}
	
	@Test
	public void update_ProductStatus() {
		
		
		HashMap<String, String> map = new HashMap<String, String>();
		
		map.put("id", "999");
		map.put("image", "2.png");
		map.put("name", "Disprin+");
		map.put("category", "medicine");
		map.put("brand", "BZ Medico");
		map.put("status", "0");
		map.put("price", "120");
		
		RestAssured.given()
		.baseUri("http://localhost:9010")
		.basePath("/update-product-status")
		.contentType("application/json")
		.body(map)
		.when().put()
		.then().statusCode(200).log().all();
	
		
		
	}
	
	@Test
	public void deleteProduct() {
		
		RestAssured.given()
		.baseUri("http://localhost:9010")
		.basePath("/delete-product")
		.queryParam("id", "101")
		.when().delete()
		.then().statusCode(200)
		.log().all();
		
		

	}
	
}
