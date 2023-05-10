package requests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.commons.codec.binary.Base64;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DELETE_Request {

    @Test
    void removeBookFromUser() {
        RestAssured.baseURI = "http://bookstore.toolsqa.com";
        RequestSpecification request = RestAssured.given();

        String removeBookDetails = "{\n" +
                "    \"userId\":\"9b5f49ab-eea9-45f4-9d66-bcf56a531b85\",\r\n" +
                "    \"isbn\":\"9781449331818\"\r\n" +
                "}";

        String credentails="TOOLSQA-Test:Test@@123";

        byte[] encodedCredentials= Base64.encodeBase64(credentails.getBytes());

        String encodedCredentialsAsString=new String(encodedCredentials);

        request.header("Authorrization","Basic VE9PTFNRQS1UZXN0O1R1c3RAQDEyMw==")
                .header("Content-Type","application/json");

        Response response =request.body(removeBookDetails).delete("BookStore/v1/Book");

        System.out.println("Response Status Code is "+response.getStatusCode());

//        Assertions.assertEquals(204,response.getStatusCode());
        Assertions.assertEquals(301,response.getStatusCode());
    }
}
