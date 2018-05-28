/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw53;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Администратор
 */
public class GroupBDFileImplementation implements GroupBD {

    private File folder;

    public GroupBDFileImplementation() {
        super();
    }

    public GroupBDFileImplementation(File folder) {
        super();
        this.folder = folder;
    }

    public File getFolder() {
        return folder;
    }

    public void setFolder(File folder) {
        this.folder = folder;
    }

    @Override
    public void groupSaver(Group group) {
        try (PrintWriter pw = new PrintWriter(new File(folder, group.getNameGroup() + ".txt"))) {
            for (Student student : group.getStudentArr()) {
                if (student != null) {
                    pw.println(student.getName() + "," + student.getSurname() 
                            + "," + student.getAge() + "," + student.isSex() 
                            + "," + student.getnOfZach() + "," 
                            + student.getGroup());
                }
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    @Override
    public Group loadGroupByName(String groupName) {
        Group groupC = new Group(groupName);
        try (BufferedReader br = new BufferedReader(new FileReader(new File(folder, groupName + ".txt")))) {
            String text = "";
            for (; (text = br.readLine()) != null;) {
                String[] studentDate = text.split(",");
                String name = studentDate[0];
                String lastname = studentDate[1];
                int age = Integer.valueOf(studentDate[2]);
                boolean sex = (studentDate[3].equals("true"));
                long zach = Long.valueOf(studentDate[4]);
                String group = groupName;
                Student student = new Student(name, lastname, age, sex, zach, group);
                groupC.addStudent(student);

            }
        } catch (IOException | MyException e) {
            System.out.println(e);
            return null;
        }
        return groupC;
    }

}
