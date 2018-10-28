package Tests;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import Steps.CountriesSearchSteps;

@RunWith(SerenityRunner.class)
public class InvalidCountrySearchTest {

    @Steps
    CountriesSearchSteps countriesSearchSteps;

    @Test
    public void verifyInvalidCountryCode(){
        countriesSearchSteps.searchCountryByISOAlpha2Code("sdfa");
        countriesSearchSteps.invalidContryCode("sdfa");
    }

    @Test
    public void verifyInvalidLowercaseCountryCode(){
        countriesSearchSteps.searchCountryByISOAlpha2Code("ua");
        countriesSearchSteps.invalidContryCode("ua");
    }

    @Test
    public void verifyInvalidNumberCountryCode(){
        countriesSearchSteps.searchCountryByISOAlpha2CodeNumber(45);
        countriesSearchSteps.invalidContryCode("45");
    }

    @Test
    public void verifyInvalidCyrillicCountryCode(){
        countriesSearchSteps.searchCountryByISOAlpha2Code("юс");
        countriesSearchSteps.invalidContryCode("юс");
    }

}
