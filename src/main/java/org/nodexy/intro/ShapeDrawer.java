package org.nodexy.intro;

/**
 * Created by phoenix on 12/26/16.
 */
public class ShapeDrawer {
    private Shape shape=null;
    public void setShape(Shape shape) {this.shape=shape;}
    public void drawShape() {
        if (shape!=null) shape.draw();
    }
}
