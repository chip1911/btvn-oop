import javax.swing.*;
import java.awt.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main extends JPanel {

    private Layer layer;
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        layer.drawShape(g);
    }

    public Main() {
        layer = new Layer();
        Point p = new Point(50, 50);
        layer.addShape(new Rectangle(p, 100, 50));
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Layer");
        Main panel = new Main();
        frame.add(panel);
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}