package Tests;

import net.serenitybdd.junit.runners.SerenityParameterizedRunner;
import net.thucydides.core.annotations.Steps;
import net.thucydides.junit.annotations.TestData;
import Steps.CountriesSearchSteps;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Arrays;
import java.util.Collection;

@RunWith(SerenityParameterizedRunner.class)
public class CountriesSearchTests {

    private String alpha2Code;
    private String country;
    private String alpha3Code;

    @TestData
    public static Collection< Object[] > testData() {
        return Arrays.asList(new Object[][] {
                {"UA", "Ukraine", "UKR"},
                {"US", "United States of America", "USA"},
                {"IN", "India", "IND"},
                {"BR", "Brazil", "BRA"},
                {"NL", "Netherlands", "NLD"},
                {"IT", "Italy", "ITA"},
                {"CA", "Canada", "CAN"},
                {"AU", "Australia", "AUS"},
                {"BE", "Belgium", "BEL"},
                {"CN", "China", "CHN"},
                {"CU", "Cuba", "CUB"},
                {"DK", "Denmark", "DNK"},
                {"GE", "Georgia", "GEO"},
                {"JP", "Japan", "JPN"},
                {"MX", "Mexico", "MEX"},
                {"ME", "Montenegro", "MNE"},
                {"TH", "Thailand", "THA"},
                {"CH", "Switzerland", "CHE"},
                {"GB", "United Kingdom of Great Britain and Northern Ireland", "GBR"},
                {"AE", "United Arab Emirates", "ARE"}
        });
    }

    public CountriesSearchTests(String alpha2Code, String country, String alpha3Code) {
        this.alpha2Code = alpha2Code;
        this.country = country;
        this.alpha3Code = alpha3Code;
    }

    @Steps
    CountriesSearchSteps countriesSearchSteps;

    @Test
    public void verifyContryCodeAndCountry(){
        countriesSearchSteps.searchCountryByISOAlpha2Code(alpha2Code);
        countriesSearchSteps.searchIsExecutedSuccesfully();
        countriesSearchSteps.isShouldFindCountry(country);
        countriesSearchSteps.searchCountryByISOAlpha3Code(alpha3Code);
        countriesSearchSteps.verifyResponseCorrectMessage(alpha2Code);
    }

}