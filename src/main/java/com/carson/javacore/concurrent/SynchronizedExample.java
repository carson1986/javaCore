package com.carson.javacore.concurrent;

/**
 * 测试synchronized在静态方法和实例方法，在多线程下是否会阻塞
 * 注：加锁的对象不一样，所以不会阻塞
 */
public class SynchronizedExample {

    public static synchronized void staticMethod(){
        System.out.println("static method start");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("static method end");
    }

    public synchronized void instanceMethod(){
        System.out.println("instance method start");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("instance method end");
    }

    private static class ThreadA implements Runnable{

        private SynchronizedExample example;

        public ThreadA(SynchronizedExample example){
            super();
            this.example = example;
        }

        public void run() {
            example.staticMethod();
        }
    }

    private static class ThreadB implements Runnable{

        private SynchronizedExample example;

        public ThreadB(SynchronizedExample example){
            super();
            this.example = example;
        }

        public void run() {
            example.instanceMethod();
        }
    }

    public static void main(String[] args) {
        SynchronizedExample example = new SynchronizedExample();
        new Thread(new ThreadA(example)).start();
        new Thread(new ThreadB(example)).start();
    }
}
