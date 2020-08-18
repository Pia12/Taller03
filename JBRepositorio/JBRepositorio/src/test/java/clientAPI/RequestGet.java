package clientAPI;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**

 * @autor : eynar.pari
 * @date : 01/08/2020.
 **/
public class RequestGet extends HttpClient {
    @Override
    public CustomResponse send(String url, String body) {

        Response response;
        response= this.client.target(url).request(MediaType.APPLICATION_JSON_TYPE).get();

        CustomResponse customResponse= new CustomResponse();
        customResponse.setResponseCode(response.getStatus()+"");
        customResponse.setResponseBody(response.readEntity(String.class));

        response.close();
        return customResponse;
    }
}
