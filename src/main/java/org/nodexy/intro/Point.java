package org.nodexy.intro;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import org.springframework.beans.factory.BeanNameAware;

import java.util.Objects;

/**
 * Created by phoenix on 12/27/16.
 */
public class Point implements BeanNameAware {
    private DoubleProperty x = new SimpleDoubleProperty();
    private DoubleProperty y = new SimpleDoubleProperty();
    private String beanName;

    public Point(double x, double y) {
        setX(x);
        setY(y);
    }

    public Point() {
        this(0,0);
    }

    public double getX() {
        return x.get();
    }

    public DoubleProperty xProperty() {
        return x;
    }

    public void setX(double x) {
        this.x.set(x);
    }

    public double getY() {
        return y.get();
    }

    public DoubleProperty yProperty() {
        return y;
    }

    public void setY(double y) {
        this.y.set(y);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Point)) return false;
        Point point = (Point) o;
        return Objects.equals(x, point.x) &&
                Objects.equals(y, point.y);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return "Point(" + getX() +
                ", " + getY() +
                ')';
    }

    @Override
    public void setBeanName(String name) {
        beanName = name;
    }
    public String getBeanName() {
        return beanName;
    }
}
