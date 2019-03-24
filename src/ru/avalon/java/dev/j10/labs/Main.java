package ru.avalon.java.dev.j10.labs;

import ru.avalon.java.dev.j10.labs.factories.*;
import ru.avalon.java.dev.j10.labs.shapes.*;

public class Main {

    public static void main(String[] args) {
        
        ShapeFactory factory = new RandomShapeFactory();

        Shape[] shapes = new Shape[20];
        for(int i = 0; i < shapes.length; i++) {
            shapes[i] = factory.getInstance();
        }

        for (Shape shape : shapes) {
            System.out.println(shape.getName() + ", площадью:\t" + shape.getArea());
        }
        
        System.out.println();
        Shape.shapeMaxArea(shapes);
        
//        Shape sh = ShapeFactory.random().getInstance();
//        System.out.println(sh.getName() + ", площадью:\t" + sh.getArea());
        
        /*
         * TODO: Выполнить действия над массивом 'shapes'
         *
         * 1. Проинициализировать элементы массива 'shapes'
         *    20-ю случайными фигурами.
         *
         * 2. Найти в массиве 'shapes' фигуру с максимальной
         *    площадью.
         */
    }
}
