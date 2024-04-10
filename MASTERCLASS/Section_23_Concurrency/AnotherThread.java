package MASTERCLASS.Section_23_Concurrency;

public class AnotherThread extends Thread{
    @Override
    public void run() {
        System.out.println("Another Thread");
    }
}
