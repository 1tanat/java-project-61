package hexlet.code;

import hexlet.code.games.Cli;

import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit""");
        System.out.print("Your choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 0:
                System.exit(0);
                break;
            case 1:
                Cli.greeting();
                break;
            default:
                Engine.engine(choice);
                break;
        }

        scanner.close();
    }
}
