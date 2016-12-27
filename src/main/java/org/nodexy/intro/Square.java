package org.nodexy.intro;

import java.util.Objects;

/**
 * Created by phoenix on 12/27/16.
 */
public class Square implements Shape {
    private Point base;
    private double length;

    public Square(Point base, double length) {
        this.base=base;
        this.length =length;
    }
    public Square() {
        this(new Point(), 0.0);
    }

    public Point getBase() {
        return base;
    }

    public void setBase(Point base) {
        this.base = base;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Square)) return false;
        Square square = (Square) o;
        return Double.compare(square.length, length) == 0 &&
                Objects.equals(base, square.base);
    }

    @Override
    public int hashCode() {
        return Objects.hash(base, length);
    }

    @Override
    public String toString() {
        return "Square{" +
                "base=" + base +
                ", length=" + length +
                '}';
    }

    @Override
    public void draw() {
        System.out.println(toString());
    }

}
