package hw4.pkg1;

public class Student extends Human {

    private long nOfZach;
    private String group;

    public Student(String name, String surname, int age, boolean sex,
            long nOfZach, String group) {
        super(name, surname, age, sex);
        this.nOfZach = nOfZach;
        this.group = group;
    }

    public Student() {
        super();
    }

    public long getnOfZach() {
        return nOfZach;
    }

    public void setnOfZach(long nOfZach) {
        this.nOfZach = nOfZach;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student{" + "nOfZach=" + nOfZach + ", group=" + group + '}';
    }

}
