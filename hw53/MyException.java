/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw53;

/**
 *
 * @author Администратор
 */
public class MyException extends Exception{

    @Override
    public String getMessage() {
        return "Вы исключены!!";
    }
}
