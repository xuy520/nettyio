package com.xy.tree.thread;

import java.util.concurrent.locks.ReentrantLock;
/*
 *
 *   产生死锁
 */

public class ThreadTest {

    ReentrantLock lock = new ReentrantLock();

    private String name = "11";
    private String password = "11";

    public static void main(String[] args) {
        final ThreadTest threadTest = new ThreadTest();
        Thread thread = new Thread() {
            @Override
            public void run() {

            }
        };
        thread.setName("a");
        Thread thread1 = new Thread() {
            @Override
            public void run() {
                threadTest.print();
            }
        };
        thread.start();
        thread1.start();
    }

    public void setValue(String name, String password) {
        lock.lock();
        this.name = name;
        if (Thread.currentThread().getName().equals("a")) {
            System.out.println("线程停止了");
            Thread.currentThread().suspend();
        }
        this.password = password;
        lock.unlock();
    }

    public void print() {
        lock.lock();
        System.out.println(name + "----" + password);
        lock.unlock();
    }
}
