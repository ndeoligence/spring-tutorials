package org.nodexy.intro;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by phoenix on 12/26/16.
 */
public class DITest {
    private ApplicationContext context = null;
    @BeforeClass
    protected void setup() {
        context = new ClassPathXmlApplicationContext("spring.xml");
    }
    /**
     * No dependency inversion here. Old style of things
     */
    @Test public void test1() {
        Circle c = new Circle(1,2,13);
        c.draw();
        Rectangle r = new Rectangle(0,0,100,50);
        r.draw();
    }

    /**
     * Here we make an interface called Shape.
     * And then the classes that draw implement it.
     * However a shape object is still created in code below, which is a problem.
     */
    @Test public void test2poly1() {
        Shape s = new Circle(17);
        s.draw();
        s = new Rectangle(32,43);
        s.draw();
    }

    /**
     * Now we've insulated the class ShapeDrawer from the implementations of shape classes.
     * We are almost there...
     */
    @Test public void test3() {
        ShapeDrawer drawer = new ShapeDrawer();
        drawer.push(new Circle(25));
        drawer.drawShapes();
        drawer.push(new Rectangle(90,40));
        drawer.drawShapes();
    }
}
