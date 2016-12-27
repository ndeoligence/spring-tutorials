package org.nodexy.intro;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by phoenix on 12/27/16.
 */
public class Triangle implements Shape {
    private List<Point> points;
    public Triangle() {
        points = new LinkedList<>();
    }
    @Override
    public void draw() {
        System.out.println(toString());
    }

    public List<Point> getPoints() {
        return points;
    }

    public void setPoints(List<Point> points) {
        this.points = points;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Triangle{ ");
        points.forEach(point -> sb.append(point).append(" "));
        return sb.append("}").toString();
    }
}
