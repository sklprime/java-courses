
package hw4.pkg1;

import java.util.Comparator;

public class StudentSort implements Comparator {

    private int i = 0;
    private boolean forward = true;

    public StudentSort(int i) {
        super();
        this.i = i;
    }

    public StudentSort(int i, boolean forward) {
        super();
        this.i = i;
        this.forward = forward;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    @Override
    public int compare(Object a, Object b) {

        int n = (this.forward) ? 1 : -1;

        if (a != null && b == null) {
            return 1;
        }
        if (a == null && b != null) {
            return -1;
        }
        if (a == null && b == null) {
            return 0;
        }
        Student studentOne = (Student) a;
        Student studentTwo = (Student) b;
        switch (this.i) {
            case 0:
                return (studentOne.getName().compareTo(studentTwo.getName())) * n;
            case 1:
                return (studentOne.getSurname().compareTo(studentTwo.getSurname())) * n;
            case 2:
                return (studentOne.getAge() - studentTwo.getAge()) * n;
            case 3:
                return ((studentOne.isSex()) ? 1 : -1) * n;
            case 4:
                return ((studentOne.getnOfZach() > studentTwo.getnOfZach()) ? 1 : -1) * n;
            case 5:
                return (studentOne.getGroup().compareTo(studentTwo.getGroup())) * n;
        }
        return 0;
    }

}
