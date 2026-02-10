package demos;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class TestAddPet {
    String baseURl = "https://petstore.swagger.io/v2";

    @Test
    public void addNewPet() {
        String reqBody = """
                {
                    "id": 100,
                    "name": "Rex",
                    "status": "available"
                }
                    """;

        Response response = given()
                .contentType(ContentType.JSON)
                .body(reqBody)
                .when()
                .post(baseURl + "/pet");

        System.out.println(response.asPrettyString());
        response.then().statusCode(200);
    }
}
