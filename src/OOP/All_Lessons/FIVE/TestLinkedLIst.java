package OOP.All_Lessons.FIVE;
import java.util.LinkedList;

public class TestLinkedLIst {

    //LinkedList

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList<>();
        linkedList.add("2");
        linkedList.add("3");
        linkedList.add("4");

        linkedList.addLast("Five");
        linkedList.addFirst("Fifth");

        linkedList.add(1, "Hi");

        System.out.println(linkedList);

        linkedList.removeFirst();
        linkedList.removeLast();
        linkedList.remove("Hi");

        linkedList.set(0, "changed " + linkedList.get(0));

        System.out.println(linkedList);
    }
}
