public class forLoops {
    public static void main(String[] args){

        // Definition: Definite Loop is a loop where the number of (iterations) is known in advance.
        // Java's definite loop is called a for loop.
        // Types of Problems to use definite loops:
        //     - Counting and Sums
        //     - Calculating factorials
        //     - Calculating prime numbers
        //     - Looping over a group of data values in an array.
        for(int i = 0; i < 4; i++)
        {
            System.out.println(i);
        }

        for(int i =2; i <= 10; i +=2)
        {
            System.out.println(i);
        }

        for(int m = 1; m <=100; m*= 2)
        {
            System.out.println("Num: "+m);
        }

        for(int i = 8; i >= 0; i--)
        {
            System.out.println(i);
        }

        // Create a program for loop that prints out each of the following series of numbers
        // -3, -2, -1, 0, 1, 2, 3,
        // 10, 14, 18, 22, 26, 30,
        // 50, 48, 46, 44, 42, 40,
        // 81, 27, 9, 3, 1,
        // 1, 3, 7, 15, 31,

        for (int i = -3; i <= 3; i++)
        {
            System.out.print(i + ", ");
        }

        System.out.println();

        for(int i = 10; i <= 32; i += 4)
        {
            System.out.print(i + ", ");
        }
        System.out.println();

        for (int i = 50; i > 40; i -= 2)
        {
            System.out.print(i + ", ");
        }

        System.out.println();

        for(int i = 81; i >= 1; i /= 3)
        {
            System.out.print(i + ", ");
        }

        System.out.println();

        for (int i = 1; i <= 31; i = 2 * i + 1)
        {
            System.out.print(i + ", ");
        }

        System.out.println();




        // This program same as above just different values assigned to the variable.
        for (int i = -6; i <= 6; i++)
        {
            System.out.print(i + ", ");
        }
        System.out.println();

        for (int i = 20; i <= 44; i += 4)
        {
            System.out.print(i +", " );
        }

        System.out.println();

        for (int i = 100; i >= 10; i-= 10)
        {
            System.out.print(i +", " );
        }

        System.out.println();

        for (int i = 64; i >= 1; i /= 4)
        {
            System.out.print(i + ", ");
        }

        System.out.println();

        for (int i = 2; i <= 52; i = 2 * i + 1)
        {
            System.out.print(i +", " );
        }
        System.out.println();













    }
}
