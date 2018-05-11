// Создание класса круг который наследует класс фигура
package hw2.pkg1;

public class Circle extends Shape {

    private Point a;
    private Point b;

    public Circle(Point a, Point b) {
        super();
        this.a = a;
        this.b = b;
    }

    public Circle() {
        super();
    }

    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public Point getB() {
        return b;
    }

    public void setB(Point b) {
        this.b = b;
    }

    // Находим периметр
    @Override
    public double getPerimetr() {
        return Math.PI * 2 * a.getDistance(b);
    }

    // Находим площадь
    @Override
    public double getArea() {
        return Math.PI * Math.pow(a.getDistance(b), 2);
    }

    @Override
    public String toString() {
        return "Circle{" + "a=" + a + ", b=" + b + '}';
    }

}
