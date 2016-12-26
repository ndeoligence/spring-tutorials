package org.nodexy.intro;

/**
 * Created by phoenix on 12/26/16.
 */
public class Circle implements Shape {
    private double x;
    private double y;
    private double r;
    public Circle() {
        this(0,0,0);
    }
    public Circle(double radius) {
        this(0,0,radius);
    }
    public Circle(double x, double y, double radius) {
        this.x=x;
        this.y=y;
        this.r=radius;
    }
    public void draw() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Circle{" +
                "x=" + x +
                ", y=" + y +
                ", r=" + r +
                '}';
    }
}
