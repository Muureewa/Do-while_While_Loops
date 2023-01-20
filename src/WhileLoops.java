/*
* Definition: An indefinite loop is a loop where the number of (iterations) is not known in advance.
* Java's indefinite loop are called (while) and (do-while) loops.
* Many types of problems using indefinite loops:
*    - Looping over a file
*    - Repeatedly promoting a user in a console program until we receive valid input.
*
*                   General Forms
*     while (condition)                             do
*       {                                           {
*           //do something ...                          //do something
*       }                                           }while(condition);
* */

import java.util.Random;

public class WhileLoops {
    public static void main(String[] args){

        // This While loop code.
        Random coin = new Random();

//         flip coin until tails comes up
        while (coin.nextBoolean())
        {
            System.out.println("Heads!");
        }
        System.out.println("Tails!");

        // This do-while loop code.
        // Flip coin until heads comes up twice
        int heads = 0;
        do{
            boolean flip = coin.nextBoolean();
            {
                if (flip)
                {
                    System.out.println("Heads!");
                    heads++;
                }
                else {
                    System.out.println("Tails!");
                }
            }
        }while (heads < 2);

    }
}
