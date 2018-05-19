package hw3.pkg1;

public class MyException extends Exception{

    @Override
    public String getMessage() {
        return "Вы исключены!!";
    }
}
