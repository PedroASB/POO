package Formas;
import java.awt.*;

/*
A classe "Square" possui as características de "Rectangle",
mas as propriedades de um retângulo são diferentes, como,
por exemplo, pode-se usar setAltura ou setLargura sem problemas,
mas em um quadrado os lados devem ser iguais.
Para resolver isso, pode-se utilizar os dois Override apresentados
 */
public class Square extends Rectangle {

	public Square(int x, int y, int lado){
		super(x, y, lado, lado);
	}

	@Override
	public void setAltura(int altura) {
		super.setAltura(altura);
		super.setLargura(altura);
	}

	@Override
	public void setLargura(int largura) {
		super.setAltura(largura);
		super.setLargura(largura);
	}

}
