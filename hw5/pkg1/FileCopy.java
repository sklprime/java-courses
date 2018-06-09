/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hw5.pkg1;

import java.io.File;
import java.io.FileFilter;

/**
 *
 * @author Администратор
 */
public class FileCopy implements FileFilter {

    private String[] arr;

    public FileCopy(String... arr) {
        super();
        this.arr = arr;
    }

    private boolean check(String ext) {
        for (String stringExt : arr) {
            if (stringExt.equals(ext)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean accept(File pathname) {
        int pointerIndex = pathname.getName().lastIndexOf(".");
        if (pointerIndex == -1) {
            return false;
        }
        String ext = pathname.getName().substring(pointerIndex + 1);
        return check(ext);
    }
}
