/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw52;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Администратор
 */
public class TextHandler {

    public static String textLoader(File file) {
        if (file == null) {
            throw new IllegalArgumentException("Файл не найден");
        }
        StringBuilder sb = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String text = "";
            for (; (text = br.readLine()) != null;) {
                sb.append(text);
                sb.append(System.lineSeparator());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

    public static String[] getWords(String textline) {
        String[] words = textline.split("[ .,\n!]");
        return words;
    }

    public static boolean searchForRepetitions(String word, String text) {
        String[] textArray = getWords(text);
        for (String wordOne : textArray) {
            if (word.equals(wordOne)) {
                return true;
            }
        }
        return false;
    }

    public static void textSaver(String text, File file) {
        if (file == null || text == null) {
            throw new IllegalArgumentException("Файла нет");
        }
        try (PrintWriter pw = new PrintWriter(file)) {
            pw.println(text);
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void saveRepetitions(File one, File two, File result) {
        if (one == null || two == null || result == null) {
            throw new IllegalArgumentException("Файла нет");
        }
        String textOne = textLoader(one);
        String textTwo = textLoader(two);
        StringBuilder sb = new StringBuilder();
        String[] words = getWords(textOne);
        for (String word : words) {
            if (searchForRepetitions(word, textTwo)) {
                sb.append(word + " ");
            }
        }
        textSaver(sb.toString(), result);
    }
}
