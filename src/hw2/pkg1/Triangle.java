// Создание класса треугольник который наследует класс фигура
package hw2.pkg1;

public class Triangle extends Shape {

    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c) {
        super();
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle() {
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

    public Point getC() {
        return c;
    }

    public void setC(Point c) {
        this.c = c;
    }

    // Находим периметр
    @Override
    public double getPerimetr() {
        return a.getDistance(b) + b.getDistance(c) + c.getDistance(a);
    }

    // Находим площадь
    @Override
    public double getArea() {
        double aB = a.getDistance(b);
        double bC = b.getDistance(c);
        double cA = c.getDistance(a);
        double polP = this.getPerimetr() / 2.0;
        return Math.sqrt(polP
                * (polP - aB) * (polP - bC) * (polP - cA));
    }

    @Override
    public String toString() {
        return "Triangle{" + "a=" + a + ", b=" + b + ", c=" + c + '}';
    }

}
