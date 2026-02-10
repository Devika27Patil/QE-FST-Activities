package demos;

import static io.restassured.RestAssured.*;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.Assert;

import io.restassured.http.ContentType;
import io.restassured.response.Response;


public class TestActivity1 {
    static int petId = 12345;
    @BeforeClass
    public void setUp() {
        baseURI = "https://petstore.swagger.io/v2";
    }

    @Test(priority = 1)
    public void addNewPet() {
        String reqBody = """
                {
                    "id": 12345,
                    "name": "Doggie",
                    "status": "available"
                }
                    """;

        Response response = given()
                .contentType(ContentType.JSON)
                .body(reqBody)
                .when()
                .post("/pet")
                .then().statusCode(200).extract().response();
        Assert.assertEquals(response.jsonPath().getString("name"), "Doggie" );
        System.out.println("POST Request Executed");
    }

    @Test(priority = 2)
    public void getPetInfo() {
        Response res = given().when().get("/pet/" + petId).then().statusCode(200).extract().response();
        Assert.assertEquals(res.jsonPath().getString("name"), "Doggie");
        System.out.println("GET Request Executed");
    }

    @Test(priority = 3)
    public void deletePet() {
        given().when().delete("/pet/" + petId).then().statusCode(200);
        System.out.println("DELETE Request Executed");
    }
}
