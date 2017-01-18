package org.nodexy.intro;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleObjectProperty;
import org.springframework.beans.factory.annotation.Required;

import java.util.Objects;

/**
 * Created by phoenix on 12/26/16.
 */
public class Circle implements Shape {
    private ObjectProperty<Point> center = new SimpleObjectProperty<>();
    private DoubleProperty radius = new SimpleDoubleProperty();

    public Circle(Point center, double radius) {
        setCenter(center);
        setRadius(radius);
    }
    public Circle(double x, double y, double radius) {
        this(new Point(x,y),radius);
    }
    public Circle(double radius) {
        this(0,0,radius);
    }
    public Circle() {
        this(0,0,0);
    }
    @Override
    public void draw() {
        System.out.println(toString());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle)) return false;
        Circle circle = (Circle) o;
        return Objects.equals(circle.radius, radius) &&
                Objects.equals(center, circle.center);
    }

    @Override
    public int hashCode() {
        return Objects.hash(center, radius);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "center=" + getCenter() +
                ", radius=" + getRadius() +
                '}';
    }

    public double getRadius() {
        return radius.get();
    }

    public void setRadius(double radius) {
        this.radius.set(radius);
    }

    public Point getCenter() {
        return center.get();
    }
    @Required
    public void setCenter(Point center) {
        this.center.set(center);
    }
}
