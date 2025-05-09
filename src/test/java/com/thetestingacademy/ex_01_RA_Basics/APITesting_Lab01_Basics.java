package com.thetestingacademy.ex_01_RA_Basics;
import io.restassured.RestAssured;

public class APITesting_Lab01_Basics {
    public static void main(String[] args) {
        RestAssured.
                given()
                         .baseUri("https://restful-booker.herokuapp.com/ping")

                .when()
                         .get()
                .then()
                         .log().all().statusCode(200);

    }
}
//Builder pattern ....
// Gherkins Syntax
//        // Given() -> Pre Req. - URL, Headers, Auth, Body....
//        // When() -> HTTP method? - GET/POST/PUT/PATCH, DELETE...
//        // Then() -> Validation -> 200 oK, firstname == PRAMOD// Gherkins Syntax
//        // Given() -> Pre Req. - URL, Headers, Auth, Body....
//        // When() -> HTTP method? - GET/POST/PUT/PATCH, DELETE...
