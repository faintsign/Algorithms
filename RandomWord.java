/* *****************************************************************************
 *  Name:   Faint
 *  File: RandomWord.java
 *  Project: Algorithms part 1
 *  Last modified:     4/13/22
 *  Description:
 *  A program that selects a random word from standard input.
 **************************************************************************** */

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
    public static void main(String[] args) {
        String champion = StdIn.readString();

        while (!StdIn.isEmpty()) {
            String candidate = StdIn.readString();
            int i = 2;

            if (StdRandom.bernoulli((double) 1 / i)) {
                champion = candidate;
            }

            i++;
        }

        System.out.println("The random word is: " + champion);


    }
}
