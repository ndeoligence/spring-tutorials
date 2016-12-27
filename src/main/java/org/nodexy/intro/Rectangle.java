package org.nodexy.intro;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleObjectProperty;

import java.util.Objects;

/**
 * Created by phoenix on 12/26/16.
 */
public class Rectangle implements Shape {
    private ObjectProperty<Point> base = new SimpleObjectProperty<>();
    private DoubleProperty width = new SimpleDoubleProperty();
    private DoubleProperty height = new SimpleDoubleProperty();

    public Rectangle(Point base, double width, double height) {
        setBase(base);
        setWidth(width);
        setHeight(height);
    }
    public Rectangle(double x, double y, double width, double height) {
        this(new Point(x,y), width,height);
    }
    public Rectangle(double width, double height) {
        this(0,0,width,height);
    }
    public Rectangle() {
        this(0,0);
    }

    public void draw() {
        System.out.println(toString());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rectangle)) return false;
        Rectangle rectangle = (Rectangle) o;
        return Objects.equals(base, rectangle.base) &&
                Objects.equals(width, rectangle.width) &&
                Objects.equals(height, rectangle.height);
    }

    @Override
    public int hashCode() {
        return Objects.hash(base, width, height);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "base=" + getBase() +
                ", width=" + getWidth() +
                ", height=" + getHeight() +
                '}';
    }

    public double getWidth() {
        return width.get();
    }

    public void setWidth(double width) {
        this.width.set(width);
    }

    public double getHeight() {
        return height.get();
    }

    public void setHeight(double height) {
        this.height.set(height);
    }

    public Point getBase() {
        return base.get();
    }

    public void setBase(Point base) {
        this.base.set(base);
    }
}
