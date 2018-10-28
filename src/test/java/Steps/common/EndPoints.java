package Steps.common;

public interface EndPoints {

    String BASE_URl = "http://services.groupkt.com";
    String GET_COUNTRY_SEARCH = "/country/get/";
    String GET_STATE = "/state/get";
    String ISO_CODE = "iso2code/";
    String INVALID_URL = "%D0%BE%D1%96%D1%80%D0%B2%D0%B0%D0%BB%D0%BE%D0%B2%D1%80%D1%96%D0%B0%D0%BB";
    String ALL_OF_COUNTRY = "/all";

    String ISO_CODE_SEARCH = BASE_URl + GET_COUNTRY_SEARCH + ISO_CODE;
    String BAD_ISO_CODE_SEARCH = BASE_URl + GET_COUNTRY_SEARCH + INVALID_URL;
    String GET_STATE_COUNTRY = BASE_URl + GET_STATE;
}
