package hexlet.code.games;

import org.apache.commons.lang3.RandomUtils;
public class Game3 {
    public static String[] calc(int count) {
        String[] data = new String[2];

        if (count == 0) {
            System.out.println("What is the result of the expression?");
        }

        final int maxNum = 100;
        final int opAmount = 3;

        int num1 = RandomUtils.nextInt(1, maxNum);
        int num2 = RandomUtils.nextInt(1, maxNum);

        int opNumber = RandomUtils.nextInt(1, opAmount + 1);
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
            case opAmount :
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
