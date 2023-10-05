package hexlet.code.games;

import org.apache.commons.lang3.RandomUtils;
public class Game2 {
    public static String[] even() {
        String[] data = new String[2];

        int num = RandomUtils.nextInt(1, 100);
        data[0] = Integer.toString(num);
        data[1] = (num % 2 == 0) ? "yes" : "no";

        return data;
    }
}
