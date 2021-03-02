package OOP.All_Lessons.FIVE;

public class Main {
    public static void main(String[] args) {
        System.out.println(Seasons.WINTER);
        System.out.println(Seasons.SPRING);
        System.out.println(Seasons.SUMMER);
        System.out.println(Seasons.FALL);

        System.out.println("---------------------------------------");

        for (Seasons s : Seasons.values()) {
            System.out.println(s);
        }

        System.out.println("---------------------------------------");
        String str = "abc";
        Seasons x;
        x = Seasons.valueOf("FALL");

        System.out.println(Seasons.FALL.name());
        System.out.println(Seasons.FALL.ordinal());
        System.out.println(x);



    }
}
