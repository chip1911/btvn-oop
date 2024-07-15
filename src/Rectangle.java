import java.awt.*;
import java.util.Objects;

public class Rectangle extends Shape {
    private int width;
    private int length;

    private Point topLeft;

    public Rectangle(int w, int l) {
        super();
        width = w;
        length = l;
    }

    public Rectangle(Point p, int w, int l) {
        super();
        topLeft = p;
        width = w;
        length = l;
    }

    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }

    public Point getTopLeft() {
        return topLeft;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public void draw(Graphics g) {
        g.drawRect(topLeft.getPointX(), topLeft.getPointY(), width, length);

    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Rectangle) {
            Rectangle rec = (Rectangle) o;
            if (rec.topLeft.equals(this.topLeft)
            && rec.width == this.width && this.length == rec.length) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(topLeft, width, length);
    }

    @Override
    public void move(int x, int y) {
        int tmp1 = this.topLeft.getPointX() + x;
        int tmp2 = this.topLeft.getPointY() + y;

        this.topLeft.setPointX(tmp1);
        this.topLeft.setPointY(tmp2);
    }

}
