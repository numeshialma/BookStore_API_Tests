package requests;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.Assertions;

public class GET_Request1 {
    public static void main(String[] args) {
        RestAssured.baseURI = "http://bookstore.toolsqa.com";
        RequestSpecification httpRequest = RestAssured.given();
        Response response = httpRequest.request(Method.GET, "/Bookstore/v1/Books/test");

        int statusCode = response.getStatusCode();
        Assertions.assertEquals(200,statusCode);

        Headers headers= response.getHeaders();
        int countOfHeaders=headers.asList().size();
        Assertions.assertEquals(8,countOfHeaders);

        String headerValue= response.getHeader("Content-Type");
        Assertions.assertEquals("text/html; charset=utf-8",headerValue);

        String responseBodyAsString=response.getBody().asString();
        Assertions.assertTrue(responseBodyAsString.contains("Swagger UI"));
    }
}
