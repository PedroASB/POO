package Formas;
import java.awt.*;

public class Circle extends Shape {
    private int raio;

    public Circle(int x, int y, int raio)  {
        super(x, y);
        this.raio = raio;
    }

    @Override
    public void draw(Graphics g) {
        g.drawOval(getX(), getY(), raio, raio);
    }

    public int getRaio() {
        return raio;
    }

    public void setRaio(int raio) {
        this.raio = raio;
    }
}
