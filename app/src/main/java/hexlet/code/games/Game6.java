package hexlet.code.games;

import org.apache.commons.lang3.RandomUtils;
public class Game6 {
    public static String[] prime() {
        String[] data = new String[2];

        int num = RandomUtils.nextInt(1, 101);
        boolean isPrime = false;

        for (int i = 2; i < num / 2; i++) {
            if ((num % i != 0) || num == 2) {
                isPrime = true;
            } else {
                isPrime = false;
                break;
            }
        }

        data[0] = String.valueOf(num);
        data[1] = (isPrime) ? "yes" : "no";

        return data;
    }
}
