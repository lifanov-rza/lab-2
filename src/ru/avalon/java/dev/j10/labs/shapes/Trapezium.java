package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Представление о трапеции.
 * <p>
 * Трапе́ция (от др.-греч. τραπέζιον — «столик» от τράπεζα —
 * «стол») — выпуклый четырёхугольник, у которого две
 * стороны параллельны. Часто в определение трапеции
 * добавляют условие, что две другие стороны должны быть не
 * параллельны.
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%A2%D1%80%D0%B0%D0%BF%D0%B5%D1%86%D0%B8%D1%8F">Трапеция</a>
 */
public class Trapezium extends Polygon {
    private float a; // Верхнее основание
    private float b; // Нижнее основание
    private float c; // Левая сторона
    private float d; // правая сторона
    private float h; // Высота
    private float area;

    public Trapezium(float a, float b, float c, float d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        area = (float)((a+b)/2 * (Math.sqrt(c*c - ((Math.pow(a-b, 2) + c*c - d*d)/(2 * (a-b))))));
        
    }
    
    @Override
    public float getPerimeter() {
        return a + b + c + d;
    }

    @Override
    public float getArea() {
        area = (float)((a+b)/2 * (Math.sqrt(c*c - ((Math.pow(a-b, 2) + c*c - d*d)/(2 * (a-b))))));
        return area;
    }

    /*
     * TODO: Реализовать класс 'Trapezium'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */

    @Override
    public String getName() {
        return "Трапеция";
    }
    
    public float getHeight(float area) {
        h = (2 * area) / (a + b);
        return h;
    }
}
