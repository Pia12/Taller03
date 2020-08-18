package clientAPI;

/**
 * @autor : eynar.pari
 * @date : 01/08/2020.
 **/
public class FactoryRequest {

    public static HttpClient make(String typeRequest){
        HttpClient client;

        // enum
        switch (typeRequest.toLowerCase()){
            case "get":
                client = new RequestGet();
                break;
            case "put":
                client = new RequestPut();
                break;
            case "post":
                client = new RequestPost();
                break;
            case "patch":
                client = new RequestGet();
                break;
            case "delete":
                client = new RequestGet();
                break;
            default:
                client = new RequestGet();
                break;
        }
        return  client;
    }
}
