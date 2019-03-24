package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Представление о ромбе.
 * <p>
 * Ромб (др.-греч. ῥόμβος, лат. rombus, в буквальном
 * переводе: «бубен») — это параллелограмм, у которого все
 * стороны равны
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%A0%D0%BE%D0%BC%D0%B1">Ромб</a>
 */
public class Rhombus extends Polygon{
    private float a; // Основание ромба
    private float h; // Высота ромба

    public Rhombus(float a, float h) {
        this.a = a;
        this.h = h;
    }

    @Override
    public float getPerimeter() {
        return 4*a;
    }

    @Override
    public float getArea() {
        return a*h;
    }

    /*
     * TODO: Реализовать класс 'Rhombus'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */

    @Override
    public String getName() {
        return "Ромб";
    }
}
