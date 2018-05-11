package hw2.pkg1;

public class HW21 {

    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(0, 6);
        Point c = new Point(5, 0);
        Point d = new Point(5, 6);

        Circle circleOne = new Circle(a, b);
        Triangle triangleOne = new Triangle(a, b, c);
        Rectangle rectangleOne = new Rectangle(a, b, c, d);
        
        Board boardOne = new Board();
        
        boardOne.addShape(circleOne, 1);
        boardOne.addShape(triangleOne, 2);
        boardOne.addShape(rectangleOne, 3);
        boardOne.addShape(circleOne, 4);
        System.out.println(boardOne);
        System.out.println();
        
        boardOne.deleteShapeBI(4);
        System.out.println(boardOne);
        
        
    }
}
