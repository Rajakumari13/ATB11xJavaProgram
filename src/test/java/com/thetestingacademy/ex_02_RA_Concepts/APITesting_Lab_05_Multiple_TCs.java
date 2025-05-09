package com.thetestingacademy.ex_02_RA_Concepts;

import io.restassured.RestAssured;

public class APITesting_Lab_05_Multiple_TCs {
    public static void main(String[] args) {
        String pin_code="560016";
        RestAssured.
                given()
                    .baseUri("https://api.zippopotam.us")
                    .basePath("/IN/"+pin_code)
                .when()
                    .get()
                .then()
                    .log()
                    .all()
                    .statusCode(200);
       pin_code="@";
        RestAssured.
                given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/"+pin_code)
                .when()
                .get()
                .then()
                .log()
                .all()
                .statusCode(200);
        pin_code=" ";
        RestAssured.
                given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/USA/"+pin_code)
                .when()
                .get()
                .then()
                .log()
                .all()
                .statusCode(200);
        //expected status code 404 for 2&3rd test cases
    }
}
