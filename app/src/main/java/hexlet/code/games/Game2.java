package hexlet.code.games;

import org.apache.commons.lang3.RandomUtils;
public class Game2 {
    public static String[] even(int count) {
        String[] data = new String[2];

        if (count == 0) {
            System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        }

        final int maxNum = 100;

        int num = RandomUtils.nextInt(1, maxNum);
        data[0] = Integer.toString(num);
        data[1] = (num % 2 == 0) ? "yes" : "no";

        return data;
    }
}
