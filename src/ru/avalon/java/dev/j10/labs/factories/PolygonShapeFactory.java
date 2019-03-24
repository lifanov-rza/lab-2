package ru.avalon.java.dev.j10.labs.factories;

import java.util.Random;
import ru.avalon.java.dev.j10.labs.shapes.*;

/**
 * "Фабрика" фигур, возвращающая фигуры полигональной (многоугольники) природы.
 * <p>
 * Фабрика возвращает не только фигуры случайных многоугольников, но
 * также обеспечивает случайную природу самих фигур. Другими,
 * словами, если фабрика возвращает две фигуры одного и того
 * же типа, их структура, с высокой вероятностью, будет
 * отличатся.
 */
public class PolygonShapeFactory implements ShapeFactory{

    public PolygonShapeFactory() {
    }
    
    /**
     * Возвращает случайный многоугольник.
     * <p>
     * Разные вызовы метода могут возвращать экземпляры
     * различных типов. Например, два последовательных вызова
     * метода могут вернуть фигуры одного и того же типа,
     * но могут вернуть и фигуры различных типов.
     *
     * @return новый экземпляр типа {@link Shape}.
     */
    @Override
    public Shape getInstance() {
        Shape shape = null;
        Random r = new Random();
        switch (r.nextInt(4)){
            case 0:
                shape = new Rectangle(r.nextInt(15) + 1, r.nextInt(15) + 1);
                break;
            case 1:
                shape = new Rhombus(r.nextInt(15) + 1, r.nextInt(15) + 1);
                break;
            case 2:
                shape = new Trapezium(r.nextInt(15) + 1, r.nextInt(15) + 1, r.nextInt(15) + 1, r.nextInt(15) + 1);
                break;
            case 3:
                shape = new Triangle(r.nextInt(5) + 1, r.nextInt(5) + 1, r.nextInt(5) + 1);
                break;
        }
        return shape;
    }
}
