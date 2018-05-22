package hw4.pkg1;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class Group implements Prizuv {

    private Student[] studentArr = new Student[10];
    private String nameGroup;

    public Group() {
        super();
        this.nameGroup = "Нет данных";
    }

    public Group(String nameGroup) {
        super();
        this.nameGroup = nameGroup;
    }

    public String getNameGroup() {
        return nameGroup;
    }

    public void setNameGroup(String nameGroup) {
        this.nameGroup = nameGroup;
    }

    public void addStudentInter() throws MyException {
        try {
            String name = getName("Введите имя студента");
            String surname = getName("Введите фамилию студента");
            int age = getAge();
            boolean sex = getSex("Введите пол -> М или Ж");
            long zach = getZach("Введите номер зачетки");
            String group = this.nameGroup;
            Student st = new Student(name, surname, age, sex, zach, group);
            this.addStudent(st);
        } catch (NullPointerException e) {
            System.out.println("Отмененно");
            return;
        }
    }

    public void addStudent(Student student) throws MyException {
        if (student == null) {
            throw new IllegalArgumentException("Пусто");
        }
        for (int i = 0; i < studentArr.length; i++) {
            if (studentArr[i] == null) {
                student.setGroup(this.nameGroup);
                studentArr[i] = student;
                return;
            }
        }
        throw new MyException();
    }

    public Student searchStudent(String surname) {
        for (Student student : studentArr) {
            if (student != null
                    && student.getSurname().equals(surname)) {
                return student;
            }
        }
        return null;
    }

    public boolean deleteStudent(int number) {
        for (int i = 0; i < studentArr.length; i++) {
            if (studentArr[i] != null
                    && studentArr[i].getnOfZach() == number) {
                studentArr[i] = null;
                return true;
            }
        }
        return false;

    }

    private void sort() {
        for (int i = 0; i < studentArr.length - 1; i++) {
            for (int j = i + 1; j < studentArr.length; j++) {
                if (compareStudent(studentArr[i], studentArr[j]) > 0) {
                    Student temp = studentArr[i];
                    studentArr[i] = studentArr[j];
                    studentArr[j] = temp;
                }
            }
        }
    }

    private int compareStudent(Student a, Student b) {
        if (a != null && b == null) {
            return 1;
        }
        if (a == null && b != null) {
            return -1;
        }
        if (a == null && b == null) {
            return 0;
        }
        return a.getSurname().compareTo(b.getSurname());

    }

    public void sortByParametr(int i) {
        Arrays.sort(this.studentArr, new StudentSort(i));
    }

    public void sortByParametr(int i, boolean forward) {
        Arrays.sort(this.studentArr, new StudentSort(i, forward));
    }

    private int getAge() throws NullPointerException {
        boolean done = false;
        int age = 0;
        for (; !done;) {
            try {
                age = Integer.valueOf(JOptionPane.showInputDialog("Введите возраст студента"));
                done = true;
            } catch (NumberFormatException e) {
                JOptionPane.showInternalMessageDialog(null, "Неверный формат ввода");
            }
        }
        return age;
    }

    private String getName(String message) throws NullPointerException {
        boolean done = false;
        String name = "";
        for (; !done;) {
            try {
                name = JOptionPane.showInputDialog(message);
                done = true;
            } catch (NumberFormatException e) {
                JOptionPane.showInternalMessageDialog(null, "Неверный формат ввода");
            }
        }
        return name;
    }

    private boolean getSex(String message) throws NullPointerException {
        boolean done = false;
        boolean name = false;
        for (; !done;) {
            try {
                name = JOptionPane.showInputDialog(message).equals("М");
                done = true;
            } catch (NumberFormatException e) {
                JOptionPane.showInternalMessageDialog(null, "Неверный формат ввода");
            }
        }
        return name;
    }

    private long getZach(String message) throws NullPointerException {
        boolean done = false;
        long name = 0;
        for (; !done;) {
            try {
                name = Long.valueOf(JOptionPane.showInputDialog(message));
                done = true;
            } catch (NumberFormatException e) {
                JOptionPane.showInternalMessageDialog(null, "Неверный формат ввода");
            }
        }
        return name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Group: " + this.nameGroup).append(System.lineSeparator());
        int i = 0;
        sort();
        for (Student student : studentArr) {
            if (student != null) {
                sb.append((++i) + ") ").append(student);
                sb.append(System.lineSeparator());
            }
        }
        return sb.toString();
    }

    @Override
    public Student[] getRecrut() {
        int n = 0;
        for (Student student : studentArr) {
            if (student != null && student.isSex() && student.getAge() >= 18) {
                n += 1;
            }
        }
        Student[] recruterArray = new Student[n];
        int i = 0;
        for (Student student : this.studentArr) {
            if (student != null && student.isSex() && student.getAge() >= 18) {
                recruterArray[i++] = student;
            }
        }
        return recruterArray;
    }

}
