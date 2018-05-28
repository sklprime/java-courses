/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw53;

import java.io.File;

/**
 *
 * @author Администратор
 */
public class HW53 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Group group1 = new Group("B1MKP17");
        try {
            group1.addStudent(new Student("Кирилл", "Сокол", 28, true, 12345, "B1MKP17"));
            group1.addStudent(new Student("Василий", "Заиц", 25, true, 23456, "B1MKP17"));
            group1.addStudent(new Student("Александра", "Блощицкая", 18, false, 34567, "B1MKP17"));
            group1.addStudent(new Student("Ольга", "Пархоменко", 17, false, 45678, "B1MKP17"));
            group1.addStudent(new Student("Павел", "Кондес", 26, true, 56789, "B1MKP17"));
            group1.addStudent(new Student("Сергей", "Парфентъев", 27, true, 67890, "B1MKP17"));
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(group1);

        File folder = new File("GROUPS");
        folder.mkdirs();

        GroupBD groupBD = new GroupBDFileImplementation(folder);
        GroupHandler handler = new GroupHandler(groupBD);
        handler.groupSaver(group1);
        System.out.println();
        Group group2 = handler.loadGroupByName("B1MKP17");
        System.out.println(group2);
    }

}
