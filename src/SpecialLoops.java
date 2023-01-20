public class SpecialLoops {

    public static void main(String[] args) {

        // There are no output for this program because there's no 10 that's less than 10 LOL.
        // We'll never enter this loop.
        for (int num = 10; num < 10; num++)
        {
            System.out.println(num);
        }


        // The output will keep going negative number non-stop until JDK crashes(or it's called Infinite loop).
        // We will never exit this loop;
        for(int i = 1; i < 100; i--)
        {
            System.out.println(i);
        }

    }


}
