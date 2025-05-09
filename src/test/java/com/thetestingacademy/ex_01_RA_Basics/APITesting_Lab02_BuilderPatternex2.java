package com.thetestingacademy.ex_01_RA_Basics;

import io.restassured.RestAssured;

import java.util.Scanner;

public class APITesting_Lab02_BuilderPatternex2 {
    public static void main(String[] args) {
        // Full URL - https://api.zippopotam.us/IN/560016
        // base URI - https://api.zippopotam.us
        // bath Path - /IN/560016

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the pincode");
        String pin_code=sc.next();

        RestAssured.given().baseUri("https://api.zippopotam.us").basePath("/IN/"+pin_code).
                when().get().
                then().log().all().statusCode(200);
    }


}
