package Exercício2;

public class Client {
	private boolean connected = false;

	public void connect(String address) {
		connected = true;
	}

	public void disconnect() {
		connected = false;
		System.out.println("Cliente desconectado");
	}

	public String request(String req) throws ExceptionNotConnected {
		if (connected) {
			System.out.println(req);
			return "String";
		}
		throw new ExceptionNotConnected(req);
	}

}