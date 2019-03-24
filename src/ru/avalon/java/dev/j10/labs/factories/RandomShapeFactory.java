package ru.avalon.java.dev.j10.labs.factories;

import java.util.Random;
import ru.avalon.java.dev.j10.labs.shapes.*;

/**
 * "Фабрика" фигур, возвращающая фигуры случайной природы.
 * <p>
 * Фабрика возвращает не только фигуры случайных типов, но
 * также обеспечивает случайную природу самих фигур. Другими,
 * словами, если фабрика возвращает две фигуры одного и того
 * же типа, их структура, с высокой вероятностью, будет
 * отличатся.
 */
public class RandomShapeFactory implements ShapeFactory {


    public RandomShapeFactory() {
    }
    /*
     * TODO: Реализуйте класс 'RandomShapeFactory'
     * Подумайте о том, какой может быть реализация.
     *
     * Как можно улучшить реализацию, создав специализированные
     * фабрики, создающие конкретные подвиды фигур?
     */

    /**
     * Возвращает случайную фигуру.
     * <p>
     * Разные вызовы метода могут возвращать экземпляры
     * различных типов. Например, два последовательных вызова
     * метода могут вернуть фигуры одного и того же типа,
     * но могут вернуть и фигуры различных типов.
     * <p>
     * Структура полученных фигур, также носит случайный
     * характер. Например, если два вызова метода возвращают
     * окружность, то это будут окружности с различным
     * радиусом.
     *
     * @return новый экземпляр типа {@link Shape}.
     */
    @Override
    public Shape getInstance() {
        Shape shape = null;
        Random r = new Random();
        switch (r.nextInt(7)){
            case 0:
                shape = new Circle(r.nextInt(20) + 1);
                break;
            case 1:
                shape = new Rectangle(r.nextInt(15) + 1, r.nextInt(15) + 1);
                break;
            case 2:
                shape = new Rhombus(r.nextInt(15) + 1, r.nextInt(15) + 1);
                break;
            case 3:
                shape = new Trapezium(r.nextInt(15) + 1, r.nextInt(15) + 1, r.nextInt(15) + 1, r.nextInt(15) + 1);
                break;
            case 4:
                shape = new Triangle(r.nextInt(5) + 1, r.nextInt(5) + 1, r.nextInt(5) + 1);
                break;
            case 5:
                shape = new Ellipse(r.nextInt(20) + 1, r.nextInt(20) + 1);
                break;
            case 6:
                shape = new Point(r.nextInt(20) + 1, r.nextInt(20) + 1);
                break;
        }
        return shape;
    }
        /*
        * TODO: Реализовать метод 'getInstance()' класса 'RandomShapeFactory'
        */
}
