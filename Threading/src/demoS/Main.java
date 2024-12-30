package demoS;

public class Main {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        new MyThread(resource, "1").start();
        new MyThread(resource, "2").start();
        new MyThread(resource, "3").start();
        new MyThread(resource, "4").start();
    }
}