package com.oktaliem;

import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetEmployee {

    @Test
    public void getEmployee() {
        Response response = given()
                .filter(new AllureRestAssured())
                .when()
                .get("http://dummy.restapiexample.com/api/v1/employee/1")
                .then()
                .extract().response();
        System.out.println(response.prettyPeek().prettyPrint());
        Assert.assertEquals(response.statusCode(), 200);
    }

}
