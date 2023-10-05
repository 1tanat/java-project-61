package hexlet.code;

import hexlet.code.games.*;

import java.util.Scanner;

public class Engine {
    public static void engine(int choice) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = scanner.next();
        System.out.println("Hello, " + name + "!");

        switch (choice) {
            case 2:
                System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
                break;
            case 3:
                System.out.println("What is the result of the expression?");
                break;
            case 4:
                System.out.println("Find the greatest common divisor of given numbers.");
                break;
            case 5:
                System.out.println("What number is missing in the progression?");
            case 6:
                System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
            default:
                break;
        }

        boolean notTheEnd = true;
        int count = 0;

        String question;
        String correct;
        String[] data = new String[2];

        while (notTheEnd && count < 3) {

            switch (choice) {
                case 2:
                    data = Game2.even();
                    break;
                case 3:
                    data = Game3.calc();
                    break;
                case 4:
                    data = Game4.gcd();
                    break;
                case 5:
                    data = Game5.progression();
                    break;
                case 6:
                    data = Game6.prime();
                    break;
                default:
                    break;
            }

            question = data[0];
            correct = data[1];

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
