package org.nodexy.intro;

/**
 * Created by phoenix on 12/26/16.
 */
public class Rectangle implements Shape {
    private double x;
    private double y;
    private double width;
    private double height;

    public Rectangle(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
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
    public String toString() {
        return "Rectangle{" +
                "x=" + x +
                ", y=" + y +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}
