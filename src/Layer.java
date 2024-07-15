import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Layer {
    private List<Shape> shapes;

    public Layer() {
        shapes = new ArrayList<>();
    }

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    public void removeShape(Shape shape) {
        shapes.remove(shape);
    }

    public void moveShape(Shape shape, int x, int y) {
        shape.move(x, y);
    }

    public void drawShape(Graphics g) {
        for (Shape tmp : shapes) {
            tmp.draw(g);
        }
    }

    public void removeDuplicates() {
        for (int i = 0; i < shapes.size(); i++) {
            for (int j = i + 1; j < shapes.size(); j++) {
                if (shapes.get(i).equals(shapes.get(j))) {
                    shapes.remove(j);
                    j--;
                }
            }
        }
    }
}
