package org.nodexy.intro;

import java.util.Stack;

/**
 * Created by phoenix on 12/26/16.
 */
public class ShapeDrawer {
    private Stack<Shape> shapes = new Stack<>();
    public void push(Shape shape) {
        shapes.push(shape);
    }
    public Shape pop() {
        return shapes.pop();
    }
    public void drawShapes() {
        shapes.forEach(shape -> shape.draw());
    }
}
