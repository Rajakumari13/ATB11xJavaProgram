package com.thetestingacademy.ex_03_TestNG;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class APITesting_Lab_06_TestNG_MultipleTCS {
    //We can write TCs without main method using TestNG

    String pin_code = "560016";
@Test
public void test_GET_positive_TC1() {
        pin_code = "560016";
        RestAssured.
                given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/" + pin_code)
                .when()
                .get()
                .then()
                .log()
                .all()
                .statusCode(200);
    }

    @Test
    public void test_GET_negative_TC2() {
        pin_code="@";
        RestAssured.
                given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/IN/" + pin_code)
                .when()
                .get()
                .then()
                .log()
                .all()
                .statusCode(200);
    }

    @Test
    public void test_GET_negative_TC3() {
        pin_code=" ";
        RestAssured.
                given()
                .baseUri("https://api.zippopotam.us")
                .basePath("/USA/" + pin_code)
                .when()
                .get()
                .then()
                .log()
                .all()
                .statusCode(200);
    }
}
//add dependency of TestNG from Maven Repository
//Need to create a TestNG file(Permanent testNG file need to be configured
// Settings-> Plugin_> search TestNG -> Install -> Create testNG file automatically post installing
