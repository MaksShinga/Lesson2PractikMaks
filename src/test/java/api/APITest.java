package api;

import io.restassured.http.ContentType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchema;
import static org.hamcrest.Matchers.equalTo;

public class APITest extends BaseApiTest {
    String API_key = "9a236fe404c4df08829c05164e49d334";
    Map<String, Object> reqBody = new HashMap<>();

    @BeforeEach
    public void setReqBody() {
        Map<String, String> methodProperties = new HashMap<>();
        methodProperties.put("Page", "1");
        methodProperties.put("Warehouse", "1");
        methodProperties.put("FindByString", "Київ");
        methodProperties.put("Limit", "20");

        reqBody.put("apiKey", API_key);
        reqBody.put("modelName", "Address");
        reqBody.put("calledMethod", "getSettlements");
        reqBody.put("methodProperties", methodProperties);
    }


    @Test
    public void checkThatSuccess() {
        given()
                .spec(requestSpecification)
                .contentType(ContentType.JSON)
                .body(reqBody)
                .when()
                .post()
                .then()
                .spec(responseSpecification)
                .assertThat()
                .body("success", equalTo(true));
    }

    @Test
    public void checkJsonSchema() {
        given()
                .spec(requestSpecification)
                .body(reqBody)
                .contentType(ContentType.JSON)
                .when()
                .post()
                .then()
                .spec(responseSpecification)
                .statusCode(200)
                .assertThat()
                .body(matchesJsonSchema(new File(System.getProperty("user.dir") +
                        "/src/main/resources/validators/np_address_schema.json")));
    }

    @Test
    public void checkRegions() {
        given()
                .spec(requestSpecification)
                .body(reqBody)
                .contentType(ContentType.JSON)
                .when()
                .post()
                .then()
                .spec(responseSpecification)
                .statusCode(200)
                .assertThat()
                .body("success", equalTo(true))
                .body("data[1].Description", equalTo("Київець"))
                .body("info.totalCount", equalTo(2));
    }
    @Test
    public void checkRegionsWithPojoUsage(){

     List<Address> dataList = given()
                .spec(requestSpecification)
                .body(reqBody)
                .contentType(ContentType.JSON)
                .when()
                .post()
                .then()
                .spec(responseSpecification)
                .extract()
                .body().jsonPath().getList("data", Address.class);

        System.out.println(dataList);
        dataList.forEach(x -> Assertions.assertTrue(x.getDescription().contains("Київ")));
    }
}
