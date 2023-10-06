package hexlet.code.games;

import org.apache.commons.lang3.RandomUtils;
public class Game5 {
    public static String[] progression(int count) {
        if (count == 0) {
            System.out.println("What number is missing in the progression?");
        }

        String[] data = new String[2];

        final int maxLength = 11;
        final int minLength = 5;
        final int maxDifference = 10;
        final int maxFirstNum = 21;

        int lengthOgProgression = RandomUtils.nextInt(minLength, maxLength);
        int emptySpace = RandomUtils.nextInt(1, lengthOgProgression + 1);
        int firstNum = RandomUtils.nextInt(1, maxFirstNum);
        int difference = RandomUtils.nextInt(1, maxDifference);

        int number = firstNum;
        int answer = 0;

        StringBuilder question = new StringBuilder();

        for (int i = 1; i <= lengthOgProgression; i++) {
            number = number + difference;
            if (i == emptySpace) {
                question.append(".. ");
                answer = number;
            } else {
                question.append(number);
                question.append(" ");
            }
        }

        data[0] = question.toString();
        data[1] = String.valueOf(answer);

        return data;
    }
}
