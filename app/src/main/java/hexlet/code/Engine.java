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
                    data = Game2.even(count);
                    break;
                case 3:
                    data = Game3.calc(count);
                    break;
                case 4:
                    data = Game4.gcd(count);
                    break;
                case 5:
                    data = Game5.progression(count);
                    break;
                case 6:
                    data = Game6.prime(count);
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
