package hw3.pkg1;

public class HW31 {

    public static void main(String[] args) {
        Group group1 = new Group("B1MKP17");
        try {
            group1.addStudent(new Student("Кирилл", "Сокол", 28, true, 12345, "B1MKP17"));
            group1.addStudent(new Student("Василий", "Заиц", 25, false, 23456, "B1MKP17"));
            group1.addStudent(new Student("Александра", "Блощицкая", 18, true, 34567, "B1MKP17"));
            group1.addStudent(new Student("Ольга", "Пархоменко", 17, false, 45678, "B1MKP17"));
            group1.addStudent(new Student("Павел", "Кондес", 26, false, 56789, "B1MKP17"));
            group1.addStudent(new Student("Сергей", "Парфентъев", 27, true, 67890, "B1MKP17"));
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(group1);

        System.out.println();

        Student student1 = group1.searchStudent("Кондес");

        System.out.println(student1);
    }

}
