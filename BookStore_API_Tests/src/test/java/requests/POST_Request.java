package requests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.Test;

public class POST_Request {
    @Test
    void createUserTest() {
        RestAssured.baseURI="http://bookstore.toolsqa.com";
        String payload="{\n" +
                "  \"userName\": \"POST_Request101\",\n" +
                "  \"password\": \"POSTRequest@123\"\n" +
                "}";

        RequestSpecification httpRequest=RestAssured.given();
        httpRequest.header("Content-Type"," application/json");
        Response response=httpRequest.body(payload).post("/Account/v1/User");
        int statusCode= response.getStatusCode();
        System.out.println("Response status code is "+statusCode);
    }
}
