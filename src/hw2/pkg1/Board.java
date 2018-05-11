// Создание класса доска
package hw2.pkg1;

public class Board {

    // создаем массив для хранения фигур
    private Shape[] board = new Shape[4];

    public Board() {
        super();
    }

    // метод который добавляет фигуры в массив(на доску)
    public void addShape(Shape a, int position) {
        if ((position - 1 >= 0) && (position - 1 < board.length)
                && (board[position - 1] == null)) {
            board[position - 1] = a;
        } else {
            System.out.println("Не возможно вставить фигуру!");
            System.out.println("Выберите другое место!");
        }
    }

    // метод который удаляет фигуру через индекс из массива(с доски)
    public void deleteShapeBI(int position) {
        if (position - 1 >= 0 && position - 1 < board.length
                && board[position - 1] != null) {
            board[position - 1] = null;
            System.out.println("Фигура удалена!");
        } else {
            System.out.println("Вы вибрали не верную позицию!");
        }
    }

    // метод который находи общую площадь всех фигур на доске
    public double getTotalShapesArea() {
        double area = 0;
        for (Shape shape : board) {
            if (shape != null) {
                area += shape.getArea();
            }
        }
        return area;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < board.length; i++) {
            if (board[i] != null) {
                sb.append(((i + 1) + ") " + board[i]));
            } else {
                sb.append((i + 1) + ") " + "Пусто");
            }
            sb.append(System.lineSeparator());
        }
        sb.append("Общая площадь = " + getTotalShapesArea());
        return sb.toString();
    }

}
