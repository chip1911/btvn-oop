import java.awt.*;
import java.util.Objects;

public class Circle extends Shape {
    private Point center;
    private int radius;
    public Circle(int radius) {
        super();
        this.radius = radius;
    }

    public Circle(Point p, int r) {
        center = p;
        radius = r;
    }


    @Override
    public void draw(Graphics g) {
        g.drawOval(center.getPointX(), center.getPointY(), radius * 2, radius * 2);
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Circle) {
            Circle tmp = (Circle) o;
            if (tmp.radius == this.radius && tmp.center.equals(this.center)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(center, radius);
    }

    @Override
    public void move(int x, int y) {
        int tmp1 = this.center.getPointX() + x;
        int tmp2 = this.center.getPointY() + y;

        this.center.setPointX(tmp1);
        this.center.setPointY(tmp2);
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public Point getCenter() {
        return center;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }
}
