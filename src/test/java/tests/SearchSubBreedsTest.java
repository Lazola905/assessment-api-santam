package tests;

import io.restassured.RestAssured;
import jdk.jfr.Description;
import org.testng.annotations.Test;

import static common.TestData.*;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.is;

public class SearchSubBreedsTest {

    @Test
    @Description("Verify that a given sub-breed exists under its corresponding parent breed")
    public void verifySubBreedExistsUnderParentBreed() {
        RestAssured.baseURI = "https://dog.ceo/api";

        given()
                .when()
                .get("/breed/" + BREED_MASTIFF + "/list")
                .then()
                .body("status", is(SUCCESS_STATUS))
                .body("message", hasItem(SUB_BREED_ENGLISH));
    }
}