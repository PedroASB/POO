public class Main {
	public static void main(String[] args){
		Robo robo1 = new Robo(100);
		Robo robo2 = new Robo(300);

		System.out.println("\nROBO 1 LIGANDO");
		robo1.ligar();
		System.out.println(robo1);

		System.out.println("\nROBO 1 ANDANDO");
		robo1.andar(30, 70);
		System.out.println(robo1);

		System.out.println("\nROBO 1 PARANDO");
		robo1.parar();
		System.out.println(robo1);

		System.out.println("\nROBO 1 ASPIRANDO");
		robo1.aspirar(40);
		System.out.println(robo1);

		System.out.println("\nROBO 1 DESLIGANDO");
		robo1.desligar();
		System.out.println(robo1);

		System.out.println("\n--------------------");

		System.out.println("\nROBO 2 LIGANDO");
		robo2.ligar();
		System.out.println(robo2);

		System.out.println("\nROBO 2 ASPIRANDO");
		robo2.aspirar(300);
		System.out.println(robo2);
	}
}
