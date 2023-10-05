package hexlet.code;

import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.\n"
                            + "1 - Greet\n"
                            + "2 - Even\n"
                            + "0 - Exit");
        int choice = scanner.nextInt();

        if (choice == 0) {
            System.exit(0);
        }

        System.out.println("Welcome to the Brain Games!");
        String name = Cli.greeting();

        switch (choice) {
            case 1 :
                break;
            case 2:
                Game2.evenOrNot(name);
                break;
            default:
                break;
        }

        scanner.close();
    }
}
