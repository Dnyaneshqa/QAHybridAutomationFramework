package api;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import utils.ConfigReader;

public class ApiClient {
    private static final String BASE_URL = ConfigReader.get("apiBaseUrl");

    public static Response get(String endpoint) {
        return RestAssured
                .given()
                .baseUri(BASE_URL)
                .when()
                .get(endpoint)
                .then()
                .extract()
                .response();
    }

    public static Response post(String endpoint, Object body) {
        return RestAssured
                .given()
                .baseUri(BASE_URL)
                .header("Content-Type", "application/json")
                .body(body)
                .when()
                .post(endpoint)
                .then()
                .extract()
                .response();
    }

    public static Response delete(String endpoint) {
        return RestAssured
                .given()
                .baseUri(BASE_URL)
                .when()
                .delete(endpoint)
                .then()
                .extract()
                .response();
    }
}
