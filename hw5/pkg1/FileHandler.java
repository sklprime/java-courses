/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw5.pkg1;

import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 *
 * @author Администратор
 */
public class FileHandler {

    public static void fileCopy(File from, File to) throws IOException {
        if (from == null || to == null) {
            throw new IllegalArgumentException("Файл не найден");
        }
        try (InputStream fis = new FileInputStream(from);
                OutputStream fos = new FileOutputStream(to)) {
            byte[] buffer = new byte[1024 * 1024];
            int readByte = 0;
            for (; (readByte = fis.read(buffer)) > 0;) {
                fos.write(buffer, 0, readByte);
            }
        } catch (IOException e) {
            throw e;
        }

    }

    public static void folderCopy(File folderFrom, File folderTo,
            FileFilter ffilt) throws IOException {
        if (folderFrom == null || folderTo == null || ffilt == null) {
            throw new IllegalArgumentException("Папки не существует");
        }

        File[] files = folderFrom.listFiles(ffilt);
        for (File file : files) {
            fileCopy(file, new File(folderTo, file.getName()));
        }
    }
}
