/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw5.pkg1;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;

/**
 *
 * @author Администратор
 */
public class HW51 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FileFilter ffilt = new FileCopy("doc");
        File folderFrom = new File("folderFrom");
        File folderTo = new File("folderTo");
        try {
            FileHandler.folderCopy(folderFrom, folderTo, ffilt);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
