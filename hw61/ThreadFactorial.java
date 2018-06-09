/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw61;

import java.math.BigInteger;

/**
 *
 * @author Администратор
 */
public class ThreadFactorial implements Runnable {

    private int n;

    public ThreadFactorial(int n) {
        super();
        this.n = n;
    }

    public ThreadFactorial() {
        super();
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " "
                + this.n + "! = " + this.calcFactorial());
    }

    private BigInteger calcFactorial() {
        BigInteger fact = new BigInteger("1");
        for (int i = 1; i <= this.n; i++) {
            fact = fact.multiply(new BigInteger("" + i));
        }
        return fact;
    }
}
