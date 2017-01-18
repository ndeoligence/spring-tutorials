package org.nodexy.intro;

import java.util.Stack;

/**
 * Created by phoenix on 12/26/16.
 */
public class ShapeDrawer extends Stack<Shape> {
    public void drawShapes() {
        iterator().forEachRemaining(shape -> shape.draw());
    }
}
