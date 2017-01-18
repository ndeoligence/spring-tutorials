package org.nodexy.intro;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by phoenix on 12/26/16.
 */
public class DrawingApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        ShapeDrawer drawer = new ShapeDrawer();
        drawer.push((Shape) context.getBean("circle"));
        drawer.push((Shape) context.getBean("circle"));
        ((Circle) drawer.peek()).setRadius(2);
        drawer.push((Shape) context.getBean("rectangle"));
        drawer.push((Shape) context.getBean("triangle"));
        drawer.push((Shape) context.getBean("square"));
        drawer.drawShapes();
    }
}
