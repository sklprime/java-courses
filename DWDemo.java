// Демонстрация использования цикла do-while
package dwdemo;

public class DWDemo {

    public static void main(String[] args)
            throws java.io.IOException {
        char ch;
        do {
            System.out.print("Нажмите нужную клавишу, а затем <Enter>: ");
            ch = (char) System.in.read();
        } while (ch != 'q');
    }

}
