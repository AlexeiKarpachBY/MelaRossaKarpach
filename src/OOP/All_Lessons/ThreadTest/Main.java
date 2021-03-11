package OOP.All_Lessons.ThreadTest;

public class Main {

    public static void main(String[] args) {

        /*for (int i = 0; i < 10; i++) {
            ThreadTest myFirstThread = new ThreadTest();
            System.out.println(myFirstThread.getPriority());
            myFirstThread.start();
        }*/

        Thread th = Thread.currentThread();
        System.out.println(th.getName());
        System.out.println(th.getPriority());
        System.out.println(th);

    }
}
