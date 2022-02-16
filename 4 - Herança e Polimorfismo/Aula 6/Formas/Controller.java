package Formas;
import java.awt.Graphics;
import javax.swing.JFrame;
import java.util.ArrayList;

public class Controller {
    private JFrame window;
    private ArrayList<Shape> shapes = new ArrayList<>();

    public void setWindow(JFrame window) {
        this.window = window;
    }

    public void drawShapes(Graphics g) {

        for (Shape s : shapes) {
            s.draw(g);
            /*
            if (s instanceof Circle) {
               Circle c = (Circle) s;
               g.drawOval(c.getX(), c.getY(), c.getRaio(), c.getRaio());
            }

            if (s instanceof Rectangle) {
               Rectangle r = (Rectangle) s;
               g.drawRect(r.getX(), r.getY(), r.getLargura(), r.getAltura());
            }
             */
        }
    }

    public void addShape(Shape s) {
        if (s.getX() < window.getWidth() && s.getY() < window.getHeight())
            shapes.add(s);
    }
}
