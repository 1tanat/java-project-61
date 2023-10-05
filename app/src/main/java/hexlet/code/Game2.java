package hexlet.code;

import org.apache.commons.lang3.RandomUtils;

import java.util.Scanner;
public class Game2 {
    public static void evenOrNot(String name) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        boolean end = true;
        int i = 0;

        while (end && i < 3) {
            int num = RandomUtils.nextInt(1, 100);
            String correct = (num % 2 == 0) ? "yes" : "no";

            System.out.println("Question: " + num);

            System.out.print("Answer: ");
            String guess = scanner.next();

            if (guess.equals(correct)) {
                System.out.println("Correct!");
                if (i == 2) {
                    System.out.println("Congratulations, " + name + "!");
                }
            } else {
                System.out.println("'" + guess + "' is wrong answer ;(. Correct answer was '" + correct + "'.");
                System.out.println("Let's try again, " + name + "!");
                end = false;
            }
            i++;
        }
    }
}
