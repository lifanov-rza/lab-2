package ru.avalon.java.dev.j10.labs.factories;

import java.util.Random;
import ru.avalon.java.dev.j10.labs.shapes.*;

/**
 * "Фабрика" фигур, возвращающая эллипсы случайной природы.
 */
public class EllipseShapeFactory implements ShapeFactory {

    public EllipseShapeFactory() {
    }
    
    @Override
    public Shape getInstance() {
        Shape shape = null;
        Random r = new Random();
        switch (r.nextInt(2)){
            case 0:
                shape = new Circle(r.nextInt(20) + 1);
                break;
            case 1:
                shape = new Ellipse(r.nextInt(20) + 1, r.nextInt(20) + 1);
                break;
        }
        return shape;
    }
}
