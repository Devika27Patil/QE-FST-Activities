package project;

import static io.restassured.RestAssured.*;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GitHubRestAssuredTest {

    RequestSpecification requestSpec;

    String sshKey = "Public SSH Key to be added to run this program win+r";
    int keyId;

    @BeforeClass
    public void setup() {
        requestSpec = new RequestSpecBuilder()
                .setBaseUri("https://api.github.com")
                .setContentType(ContentType.JSON)
                .addHeader("Authorization", "Github Token")
                .build();
    }

    @Test(priority = 1)
    public void addSSHKey() {

        String requestBody = """
                {
                  "title": "TestAPIKey",
                  "key": "%s"
                }
                """.formatted(sshKey);

        Response response = given()
                .spec(requestSpec)
                .body(requestBody)
                .when()
                .post("/user/keys")
                .then()
                .statusCode(201)
                .extract().response();

        keyId = response.jsonPath().getInt("id");

        Reporter.log("SSH Key Created with ID: " + keyId, true);
        Assert.assertTrue(keyId > 0);
    }

    @Test(priority = 2)
    public void getSSHKey() {

        Response response = given()
                .spec(requestSpec)
                .pathParam("keyId", keyId)
                .when()
                .get("/user/keys/{keyId}")
                .then()
                .statusCode(200)
                .extract().response();

        Reporter.log("GET Response: " + response.asString(), true);

        Assert.assertEquals(response.jsonPath().getInt("id"), keyId);
        Assert.assertEquals(response.jsonPath().getString("title"), "TestAPIKey");
    }

    @Test(priority = 3)
    public void deleteSSHKey() {

        Response response = given()
                .spec(requestSpec)
                .pathParam("keyId", keyId)
                .when()
                .delete("/user/keys/{keyId}")
                .then()
                .statusCode(204)
                .extract().response();

        Reporter.log("SSH Key Deleted Successfully", true);
        Assert.assertEquals(response.getStatusCode(), 204);
    }
}
