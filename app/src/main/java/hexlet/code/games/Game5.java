package hexlet.code.games;

import org.apache.commons.lang3.RandomUtils;
public class Game5 {
    public static String[] progression() {
        String[] data = new String[2];

        int lengthOgProgression = RandomUtils.nextInt(5, 11);
        int emptySpace = RandomUtils.nextInt(1, lengthOgProgression + 1);
        int first_num = RandomUtils.nextInt(1, 21);
        int difference = RandomUtils.nextInt(1, 10);
        
        int number = first_num;
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
