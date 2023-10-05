package hexlet.code.games;

import org.apache.commons.lang3.RandomUtils;
public class Game3 {
    public static String[] calc() {
        String[] data = new String[2];

        int num1 = RandomUtils.nextInt(1, 100);
        int num2 = RandomUtils.nextInt(1, 100);

        int opNumber = RandomUtils.nextInt(1, 4);
        String op = null;
        int answer = 0;

        switch (opNumber) {
            case 1 :
                op = " + ";
                answer = num1 + num2;
                break;
            case 2 :
                op = " - ";
                answer = num1 - num2;
                break;
            case 3 :
                op = " * ";
                answer = num1 * num2;
                break;
            default:
                break;
        }

        data[0] = num1 + op + num2;
        data[1] = String.valueOf(answer);

        return data;
    }
}