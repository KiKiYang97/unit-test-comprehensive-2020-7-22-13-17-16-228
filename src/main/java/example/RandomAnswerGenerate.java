package example;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * @Author Dunka
 * @Description //TODO
 * @Date 22:14   2020/7/23
 * @ClassName RandomAnswerGenerate
 */
public class RandomAnswerGenerate implements AnswerGenerate {
    @Override
    public String generate() {
        Random random = new Random();
        String answer = "";
        Set set = new HashSet<Integer>();
        while (answer.length()<4){
            int number = random.nextInt(10);
            if(!set.contains(number)){
                set.add(number);
                answer += number;
            }
        }
        return answer;
    }
}
