package behavioral.pattern.chainofresponsibility;

public class Client {
    public static void main(String[] args) {
        AuthenticationHandler authenticationHandler = new AuthenticationHandler("123456");
        ContentTypeHandler contentTypeHandler = new ContentTypeHandler("application/json");
        PayloadHandler payloadHandler = new PayloadHandler("{\"username\":\"password\"}");

        authenticationHandler.next = contentTypeHandler;
        contentTypeHandler.next = payloadHandler;

        String withAuthentication = authenticationHandler.addHandler("Headers with authentication");
        System.out.println(withAuthentication);

        System.out.println("");
        String withoutAuthentication = contentTypeHandler.addHandler("Headers without authentication");
        System.out.println(withoutAuthentication);
    }
}
