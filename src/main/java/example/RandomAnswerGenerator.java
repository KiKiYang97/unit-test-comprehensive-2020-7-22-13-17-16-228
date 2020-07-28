package example;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author Dunka
 * @Description //TODO
 * @Date 22:14   2020/7/23
 * @ClassName RandomAnswerGenerate
 */
public class RandomAnswerGenerator implements AnswerGenerator {

    public static final int ANSWER_LENGTH = 4;

    @Override
    public String generate() {
        StringBuilder answer = new StringBuilder();
        Set<Integer> set = new HashSet<>();
        while (answer.length() < ANSWER_LENGTH) {
            int number = (int) (Math.random() * 10);
            if (!set.contains(number)) {
                set.add(number);
                answer.append(number);
            }
        }
        return answer.toString();
    }
}
