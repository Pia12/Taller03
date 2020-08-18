package clientAPI;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;

public abstract class HttpClient {
    Client client = ClientBuilder.newBuilder().build();
    public abstract CustomResponse send(String url,String body);
}
