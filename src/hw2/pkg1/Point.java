// Создание класса точка для нахождение расстояния до точки от начала координат
package hw2.pkg1;

public class Point {

    private double x;
    private double y;

    public Point(double x, double y) {
        super();
        this.x = x;
        this.y = y;
    }

    public Point() {
        super();
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    // Сам метод, который находит расстояния до точки от начала координат
    public double getDistance(Point a) {
        double x1 = (this.getX() - a.getX()) * (this.getX() - a.getX());
        double y1 = (this.getY() - a.getY()) * (this.getY() - a.getY());
        return Math.sqrt(x1 + y1);
    }

    @Override
    public String toString() {
        return "Point{" + "x=" + x + ", y=" + y + '}';
    }

}
