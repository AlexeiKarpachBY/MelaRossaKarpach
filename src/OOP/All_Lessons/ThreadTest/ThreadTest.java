package OOP.All_Lessons.ThreadTest;

public class ThreadTest extends Thread{
    @Override
    public void run() {
        System.out.println("I am thread  " + getName());
    }
}
