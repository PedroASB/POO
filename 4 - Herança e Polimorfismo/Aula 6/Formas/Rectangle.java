package Formas;
import java.awt.*;

public class Rectangle extends Shape {
	private int altura;
	private int largura;

	public Rectangle(int x, int y, int altura, int largura) {
		super(x, y);
		this.altura = altura;
		this.largura = largura;
	}

	@Override
	public void draw(Graphics g) {
		g.drawRect(getX(), getY(), largura, altura);
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public void setLargura(int largura) {
		this.largura = largura;
	}

	public int getAltura() {
		return altura;
	}

	public int getLargura() {
		return largura;
	}
}
