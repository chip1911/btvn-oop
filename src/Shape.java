import java.awt.*;
import java.util.Objects;

public abstract class Shape {

    public Shape() {

    }


    public abstract void draw(Graphics g);
    public abstract boolean equals(Object o);

    @Override
    public abstract int hashCode();
    public abstract void move(int x, int y);
}
