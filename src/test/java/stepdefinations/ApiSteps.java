package stepdefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import static org.hamcrest.Matchers.equalTo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class ApiSteps {
    private Response response;
    
    Properties prop = new Properties();
   

    
    @Given("I set the base URL")
    public void setBaseUri() throws IOException {
        FileInputStream fis = new FileInputStream("src/test/resources/data.properties");
        prop.load(fis);
        RestAssured.baseURI = prop.getProperty("URL");
    }


    @When("I send a GET request to {string}")
    public void sendGetRequest(String endpoint) {
        response = RestAssured.get(endpoint);
        response.prettyPrint();
    }

    @Then("the response status code should be {int}")
    public void verifyStatusCode(int statusCode) {
         response.then().statusCode(statusCode);
    }

    @Then("the response should contain the user's details")
    public void verifyUserDetails() {
        response.then().body("data.id", equalTo(2));
        response.then().body("data.email", equalTo("janet.weaver@reqres.in"));
        response.then().body("data.first_name", equalTo("Janet"));
        response.then().body("data.last_name", equalTo("Weaver"));
    }
}