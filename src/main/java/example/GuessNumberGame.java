package example;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author Dunka
 * @Description //TODO
 * @Date 21:44   2020/7/23
 * @ClassName GuessNumberGame
 */
public class GuessNumberGame {
    private String answer;

    public GuessNumberGame(String answer) {
        this.answer = answer;
    }

    public String guess(String guess) {
        Set<String> answerSet = new HashSet<>();
        String[] split = answer.split("");
        final String[] guessSpilt = guess.split("");
        int countNumberAndPositionRight = 0, countNumberRight = 0;
        for (int i = 0, j = 0; i < split.length && j < guessSpilt.length; i++, j++) {
            answerSet.add(split[i]);
            if (guessSpilt[j].equals(split[i])) {
                countNumberAndPositionRight++;
            }
        }
        for (String guessNum : guessSpilt) {
            if (answerSet.contains(guessNum)) {
                countNumberRight++;
            }
        }
        return String.format("%dA%sB", countNumberAndPositionRight, countNumberRight - countNumberAndPositionRight);
    }
}
