package ru.avalon.java.dev.j10.labs.shapes;

/**
 * Абстрактное представление об эллипсе.
 * <p>
 * Э́ллипс — замкнутая кривая на плоскости, которая может
 * быть получена как пересечение плоскости и кругового
 * цилиндра или как ортогональная проекция окружности на
 * плоскость.
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%AD%D0%BB%D0%BB%D0%B8%D0%BF%D1%81">Эллипс</a>
 */
public class Ellipse extends Shape {
    private float a; // Большая полуось
    private float b; // Малая полуось

    public Ellipse(float a, float b) {
        this.a = a;
        this.b = b;
    }
    
    public Ellipse(float r) {
        this.a = r;
        this.b = r;
    }
    /*
     * TODO: Закончить определение интерфейса 'Ellipse'
     *
     * 1. Включите интерфейс в общую систему типов.
     *
     * 2. При необходимости, дополните структуру интерфеса.
     */

    /**
     * Возвращает длину эллипса.
     *
     * @return длина эллипса
     */
    float getLength() {
        return (float)(a * (2.28 * Math.pow((b/a), 1.44) + 4));
    }
    
    @Override
    public String getName() {
        return "Эллипс";
    }
    
    @Override
    public float getArea() {
        return PI * a*b;
    }
    
}
