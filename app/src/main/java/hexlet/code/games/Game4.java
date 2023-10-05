package hexlet.code.games;

import org.apache.commons.lang3.RandomUtils;

public class Game4 {
    public static String[] gcd(int count) {
        String[] data = new String[2];

        if (count == 0) {
            System.out.println("Find the greatest common divisor of given numbers.");
        }

        int num1 = RandomUtils.nextInt(1, 100);
        int num2 = RandomUtils.nextInt(1, 100);

        data[0] = num1 + " " + num2;
        data[1] = String.valueOf(findGCD(num1, num2));

        return data;
    }
    public static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return findGCD(b, a % b);
        }
    }
}
