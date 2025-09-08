package StepDef.apiStepDef;

import api.ApiClient;
import api.Endpoints;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

import static org.testng.Assert.assertEquals;

public class ApiSteps {

    private Response response;

    @When("I send GET request to {string}")
    public void i_send_get_request_to(String endpointKey) {
        String endpoint = getEndpoint(endpointKey);
        response = ApiClient.get(endpoint);
    }

    @When("I send POST request to {string} with body")
    public void i_send_post_request_to_with_body(String endpointKey, String body) {
        String endpoint = getEndpoint(endpointKey);
        response = ApiClient.post(endpoint, body);
    }

    @Then("the response status code should be {int}")
    public void the_response_status_code_should_be(int statusCode) {
        assertEquals(response.statusCode(), statusCode);
    }

    private String getEndpoint(String key) {
        switch (key.toLowerCase()) {
            case "users": return Endpoints.USERS;
            case "login": return Endpoints.LOGIN;
            default: throw new RuntimeException("Unknown endpoint: " + key);
        }
    }
}
