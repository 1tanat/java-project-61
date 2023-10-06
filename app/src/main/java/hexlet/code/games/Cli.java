package hexlet.code.games;

import java.util.Scanner;
public class Cli {
    public static String greeting() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("May I have your name? ");
        String name = scanner.next();
        System.out.println("Hello, " + name + "!");
        return name;
    }
}
