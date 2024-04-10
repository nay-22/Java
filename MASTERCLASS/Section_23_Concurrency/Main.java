package MASTERCLASS.Section_23_Concurrency;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main Thread");
        Thread anotherThread = new AnotherThread();
        anotherThread.start();
        Thread myRunnable = new Thread(new MyRunnable());
        myRunnable.start();
        System.out.println("Main Thread again");
    }
}
