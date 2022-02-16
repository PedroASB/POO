package Formas;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

class Window extends JFrame {
    private Controller ctrl;

    public Window(String title) {
        super(title);
        // Termina o programa quando a janela é fechada
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 680);
    }

    // Chamado automaticamente por Java para desenhar os elementos da janela
    public void paint(Graphics g) {
        ctrl.drawShapes(g);
    }

    public void setController(Controller ctrl) {
        this.ctrl = ctrl;
    }
}