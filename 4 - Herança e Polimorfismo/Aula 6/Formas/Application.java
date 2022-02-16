package Formas;

public class Application {
    public static void main(String[] args) {
        Controller ctrl = new Controller();
        Window window = new Window("Desenhando Figuras");

        // Faz o controlador conhecer a janela
        // e a janela conhecer o controlador.
        ctrl.setWindow(window);
        window.setController(ctrl);

        ctrl.addShape(new Circle(100, 100, 50));
        ctrl.addShape(new Rectangle(200, 200, 50, 100));
        ctrl.addShape(new Square(500, 300, 150));

        window.setVisible(true);
    }
}