import jakarta.xml.ws.Endpoint;
import ws.BanqueService;

public class ServerJWS {
    public static void main(String[] args) {
        Endpoint.publish("http://0.0.0.0:8087/",new BanqueService());
        System.out.println("Web service deploye sur http://0.0.0.0:8087/");
    }
}
