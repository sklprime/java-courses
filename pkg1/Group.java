package hw3.pkg1;

public class Group {

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

    public void addStudent(Student student) throws MyException {
        if (student == null) {
            throw new IllegalArgumentException("Null");
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

}
