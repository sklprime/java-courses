/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw61;

/**
 *
 * @author Администратор
 */
public class MultithreadedExecution {

    private Thread[] threadArr;
    private int n;

    public MultithreadedExecution(int n) {
        super();
        this.n = n;
        this.threadArr = new Thread[this.n];
    }

    public MultithreadedExecution() {
        super();
        this.threadArr = new Thread[0];
    }

    public void startTreatment() {
        for (int i = 0; i < threadArr.length; i++) {
            threadArr[i] = new Thread(new ThreadFactorial(i));
            threadArr[i].start();
        }
    }
}
