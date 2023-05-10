package requests;

import io.restassured.RestAssured;
import io.restassured.internal.common.assertion.Assertion;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Put_Request {

    @Test
    void updateBookTest() {
        RestAssured.baseURI = "http://bookstore.toolsqa.com";
        RequestSpecification request = RestAssured.given();

        request.header("Authorrization","Basic VE9PTFNRQS1UZXN0O1R1c3RAQDEyMw==")
                .header("Content-Type","application/json");

        String replacementDetails = "{\n" +
                "    \"userId\":\"9b5f49ab-eea9-45f4-9d66-bcf56a531b85\",\r\n" +
                "    \"isbn\":\"9781449331818\"\r\n" +
                "}";

        Response replaceBookResponse =request.body(replacementDetails).put("BookStore/v1/Books/9781449325862");

        //Assertions.assertEquals(200,replaceBookResponse.getStatusCode());
        Assertions.assertEquals(301,replaceBookResponse.getStatusCode());

        replaceBookResponse.prettyPrint();

    }
}
