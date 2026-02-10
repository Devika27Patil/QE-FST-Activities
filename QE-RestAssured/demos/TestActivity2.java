package demos;

import static io.restassured.RestAssured.*;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import java.io.File;

public class TestActivity2 {

    static String username = "testuser123";

    @BeforeClass
    public void setup() {
        baseURI = "https://petstore.swagger.io/v2";
    }

    @Test(priority = 1)
    public void createUser() {
        Response response = given()
                .contentType(ContentType.JSON)
                .body(new File("src/test/resources/user.json"))
                .when()
                .post("/user")
                .then()
                .statusCode(200)
                .extract().response();

        Assert.assertEquals(response.jsonPath().getString("message"), "101");
        System.out.println("POST request executed successfully");
    }

    @Test(priority = 2)
    public void getUser() {

        Response response = given()
                .when()
                .get("/user/" + username)
                .then()
                .statusCode(200)
                .extract().response();

        Assert.assertEquals(response.jsonPath().getString("username"), username);
        Assert.assertEquals(response.jsonPath().getString("firstName"), "Test");

        System.out.println("GET request executed successfully");
    }

    @Test(priority = 3)
    public void deleteUser() {

        given()
                .when()
                .delete("/user/" + username)
                .then()
                .statusCode(200);

        System.out.println("DELETE request executed successfully");
    }
}
