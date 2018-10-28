package Steps;

import Steps.common.EndPoints;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.is;

public class CountriesSearchSteps {

    private Response response;

    @Step
    public void searchCountryByISOAlpha2Code(String alpha2Code){
        response = SerenityRest.when().get(EndPoints.ISO_CODE_SEARCH + alpha2Code);
    }

    @Step
    public void searchCountryByInvalidQuery(){
        response = SerenityRest.when().get(EndPoints.BAD_ISO_CODE_SEARCH);
    }

    @Step
    public void searchCountryByISOAlpha2CodeNumber(int code){
        response = SerenityRest.when().get(EndPoints.ISO_CODE_SEARCH + code);
    }

    @Step
    public void searchIsExecutedSuccesfully(){
        response.then().statusCode(200);
    }

    @Step
    public void searchIsExecutedBadRequestError(){
        response.then().statusCode(400);
    }

    @Step
    public void isShouldFindCountry(String country){
        response.then().body("RestResponse.result.name", is(country));
    }

    @Step
    public void searchCountryByISOAlpha3Code(String aplha3Code){
       response.then().body("RestResponse.result.alpha3_code", is(aplha3Code));
    }

    @Step
    public void verifyResponseCorrectMessage(String alpha2Code){
        response.then().body("RestResponse.messages", contains("Country found matching code ["  + alpha2Code + "]."));
    }

    @Step
    public void invalidContryCode(String code){
        response.then().body("RestResponse.messages", contains("No matching country found for requested code [" + code + "]."));
    }

}