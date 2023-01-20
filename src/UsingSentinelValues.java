public class UsingSentinelValues {
    public static void main(String[] args){

        // We often use sentinel variables to control how many iterations of a loop will happen.

        //The sentinel variable
        int count = 1;
        char letter = 'a';
        String letters = "";

        //Convert 'a' to 'aaaaaaaaaa'
        while (count <= 10)
        {
            letters += letter;
            count++;
        }

    /*
    *      TODO: Write a while loop that prints out the sum of the first 100 positive integers.
    *      TODO: Wil need an integer variable to hold the sum.
    *      TODO: Will also need a sentinel value that controls the loop, ensuring
    *            that your loop from 1 - 100.
    * */

        // An Accumulator variable is used to calculate a sum or product of a series of values.
        int sum = 0;
        int coun = 2;

        while (coun <= 10)
        {
            sum += coun;
            coun+= 2;
        }
        System.out.println("Sum total: " + coun);
    }

}
