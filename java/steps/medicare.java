package steps;

import static io.restassured.RestAssured.given;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
public class medicare{


 Response res;


@Given("User Test API")
public void user_test_api() {
	
	
	given().baseUri("https://localhost:9010").basePath("/get-products");
	given().baseUri("https://localhost:9010").basePath("/get-users");
	
	
	
	
}
	
	
	
    


@When("Get REQUEST")
public void get_request() {
	
	 res = given().baseUri("https://localhost:9010").basePath("/get-products")
	.when().get();
	
}
	 

@Then("Validate")
public void validate() {
    
	
	res.prettyPrint();
	Assert.assertEquals(res.statusCode(),200);
	
}


@Given("User Test API1")
public void user_test_api1() {
	
	given().baseUri("https://localhost:9010").basePath("/add-product");
     
}

@When("Post Request1")
public void post_request() {
	 res = given().baseUri("https://localhost:9010").basePath("/add-product")
				.when().put();
    
}

@Then("Validate1")
public void validate1() {
    
	
	res.prettyPrint();
	Assert.assertEquals(res.statusCode(),200);
	
}




@Given("User Test API2")
public void user_test_api2() {
	
	given().baseUri("https://localhost:9010").basePath("/delete-product?id-101");
	
	
     
}


@When("Delete Request2")
public void delete_request() {
    
	 res = given().baseUri("https://localhost:9010").basePath("/get-products")
				.when().delete();
	
	
}

@Then("Validate2")
public void validate2() {
    
	
	res.prettyPrint();
	Assert.assertEquals(res.statusCode(),200);
	
}


@Given("User Test API3")
public void user_test_api3() {
	
	given().baseUri("https://localhost:9010").basePath("/update-product");
	

	
}


@When("Put rEQUEST3")
public void put_r_equest() {
   
	
	 res = given().baseUri("https://localhost:9010").basePath("/get-products")
				.when().put();
  
	
}
@Then("Validate3")
public void validate3() {
    
	
	res.prettyPrint();
	Assert.assertEquals(res.statusCode(),200);
	
}

}