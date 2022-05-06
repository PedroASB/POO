package Exercício1;

public class Client {
    private boolean connected = false;

    public void connect(String address) {
        connected = true;
    }

    public String request(String req) throws ExceptionNotConnected {
        if (connected) {
            System.out.println(req);
            return "String";
        }

        throw new ExceptionNotConnected(req);
    }

}