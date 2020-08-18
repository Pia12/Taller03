package clientAPI;

/**
 * @autor : eynar.pari
 * @date : 01/08/2020.
 **/
public class CustomResponse {
    private String responseCode;
    private String responseBody;

    public CustomResponse(){}

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public String getResponseBody() {
        return responseBody;
    }

    public void setResponseBody(String responseBody) {
        this.responseBody = responseBody;
    }
}
