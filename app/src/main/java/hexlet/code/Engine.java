package hexlet.code;

import hexlet.code.games.*;

import java.util.Scanner;

public class Engine {
    public static void engine(int choice) {
        Scanner scanner = new Scanner(System.in);

        String name = Cli.greeting();

        boolean notTheEnd = true;
        int count = 0;

        String[] data = new String[2];

        while (notTheEnd && count < 3) {

            switch (choice) {
                case 2:
                    if (count == 0) {
                        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
                    }
                    data = Game2.even();
                    break;
                case 3:
                    if (count == 0) {
                        System.out.println("What is the result of the expression?");
                    }
                    data = Game3.calc();
                    break;
                case 4:
                    if (count == 0) {
                        System.out.println("Find the greatest common divisor of given numbers.");
                    }
                    data = Game4.gcd();
                    break;
                case 5:
                    if (count == 0) {
                        System.out.println("What number is missing in the progression?");
                    }
                    data = Game5.progression();
                    break;
                case 6:
                    if (count == 0) {
                        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
                    }
                    data = Game6.prime();
                    break;
                default:
                    break;
            }

            String question = data[0];
            String correct = data[1];

            System.out.println("Question: " + question);

            System.out.print("Your answer: ");
            String guess = scanner.next();

            if (guess.equals(correct)) {
                System.out.println("Correct!");
                if (count == 2) {
                    System.out.println("Congratulations, " + name + "!");
                }
            } else {
                System.out.println("'" + guess + "' is wrong answer ;(. Correct answer was '" + correct + "'.");
                System.out.println("Let's try again, " + name + "!");
                notTheEnd = false;
            }
            count++;
        }
    }
}
