import java.awt.*;
import java.util.Objects;

public class Triangle extends Shape {
    private Point top;
    private Point botLeft;

    private Point botRight;

    public Triangle(Point t, Point l, Point r) {
        if (!isTriangle(t, l, r)) {
            return;
        } else {
            this.top = t;
            this.botLeft = l;
            this.botRight = r;
        }

    }

    public Point getBotLeft() {
        return botLeft;
    }

    public Point getBotRight() {
        return botRight;
    }

    public Point getTop() {
        return top;
    }

    public void setBotLeft(Point l) {
        if (isTriangle(top, l, botRight)) {
        this.botLeft = l;
        } else {
            return;
        }
    }

    public void setBotRight(Point r) {
        if (isTriangle(top, r, botLeft)) {
            this.botRight = r;
        } else {
            return;
        }
    }

    public void setTop(Point t) {
        if (isTriangle(botLeft, t, botRight)) {
            this.top = t;
        } else {
            return;
        }
    }

    public boolean isTriangle(Point t, Point l, Point r) {
        int x1 = t.getPointX();
        int x2 = l.getPointX();
        int x3 = r.getPointX();

        int y1= t.getPointY();
        int y2 = l.getPointY();
        int y3 = r.getPointY();
        double area = Math.abs(x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)) / 2.0;
        if (area == 0) {
            return false;
        } else return true;
    }

    @Override
    public void draw(Graphics g) {
        int[] xPoints = {top.getPointY(), botLeft.getPointX(), botRight.getPointX()};
        int[] yPoints = {top.getPointY(), botLeft.getPointY(), botRight.getPointY()};
        g.drawPolygon(xPoints, yPoints, 3);
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Triangle) {
            Triangle triangle = (Triangle) o;
            if (triangle.top.equals(this.top) && triangle.botLeft.equals(this.botLeft)
            && triangle.botRight.equals(this.botRight)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(top, botLeft, botRight);
    }

    @Override
    public void move(int x, int y) {
        this.top.setPointX(top.getPointX() + x);
        this.top.setPointY(top.getPointY() + y);

        this.botRight.setPointX(botRight.getPointX() + x);
        this.botRight.setPointY(botRight.getPointY() + y);

        this.botLeft.setPointX(botLeft.getPointX() + x);
        this.botLeft.setPointY(botLeft.getPointY() + y);
    }
}
