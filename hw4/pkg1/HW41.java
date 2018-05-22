package hw4.pkg1;

public class HW41 {

    public static void main(String[] args) {
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
        group1.sortByParametr(3, true);
        System.out.println(group1);

        System.out.println();
        Student[] recrutArr = group1.getRecrut();
        for (Student student : recrutArr) {
            System.out.println("Тебя призвали " + student);
        }
    }

}
