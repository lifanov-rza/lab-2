package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Представление об окружности.
 * <p>
 * Окру́жность — замкнутая плоская кривая, которая состоит из
 * всех точек на плоскости, равноудалённых от заданной точки.
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%9E%D0%BA%D1%80%D1%83%D0%B6%D0%BD%D0%BE%D1%81%D1%82%D1%8C">Окружность</a>
 */
public class Circle extends Ellipse {
    private float r;

    public Circle(float r) {
        super(r);
        this.r = r;
    }

    @Override
    public float getArea() {
        return PI * r*r;
    }

    @Override
    public int getRotation() {
        return 360; 
    }

    /*
     * TODO: Реализовать класс 'Circle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */

    
    @Override
    public float getLength() {
        return 2*PI*r;
    }

    @Override
    public String getName() {
        return "Круг";
    }
}
