/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw52;

import java.io.File;

/**
 *
 * @author Администратор
 */
public class HW52 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TextHandler.saveRepetitions(new File("a.txt"),
                new File("b.txt"), new File("c.txt"));
    }

}
