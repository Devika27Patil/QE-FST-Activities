package demos;

import static io.restassured.RestAssured.*;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class TestActivity3 {

    RequestSpecification requestSpec;
    ResponseSpecification responseSpec;
    
    @BeforeClass
    public void setup() {

        requestSpec = new RequestSpecBuilder()
                .setBaseUri("https://petstore.swagger.io/v2/pet")
                .setContentType(ContentType.JSON)
                .build();

        responseSpec = new ResponseSpecBuilder()
                .expectStatusCode(200)
                .expectContentType(ContentType.JSON)
                .expectBody("status", org.hamcrest.Matchers.equalTo("alive"))
                .build();
    }

    @Test(priority = 1)
    public void addPets() {

        String pet1 = """
                {
                  "id": 77232,
                  "name": "Riley",
                  "status": "alive"
                }
                """;

        String pet2 = """
                {
                  "id": 77233,
                  "name": "Hansel",
                  "status": "alive"
                }
                """;

        given()
                .spec(requestSpec)
                .body(pet1)
                .when()
                .post()
                .then()
                .spec(responseSpec);

        given()
                .spec(requestSpec)
                .body(pet2)
                .when()
                .post()
                .then()
                .spec(responseSpec);
    }

    @DataProvider(name = "petData")
    public Object[][] petData() {
        return new Object[][] {
                { 77232, "Riley", "alive" },
                { 77233, "Hansel", "alive" }
        };
    }

    @Test(priority = 2, dataProvider = "petData")
    public void getPet(int id, String name, String status) {

        var response = given()
                .spec(requestSpec)
                .pathParam("petId", id)
                .when()
                .get("/{petId}")
                .then()
                .spec(responseSpec)
                .extract().response();

        Assert.assertEquals(response.jsonPath().getInt("id"), id);
        Assert.assertEquals(response.jsonPath().getString("name"), name);
        Assert.assertEquals(response.jsonPath().getString("status"), status);
    }

    @Test(priority = 3, dataProvider = "petData")
    public void deletePet(int id, String name, String status) {

        given()
                .spec(requestSpec)
                .pathParam("petId", id)
                .when()
                .delete("/{petId}")
                .then()
                .statusCode(200);
    }
}
