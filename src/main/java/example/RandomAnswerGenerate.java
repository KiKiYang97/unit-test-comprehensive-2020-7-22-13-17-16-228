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
//todo name
public class RandomAnswerGenerate implements AnswerGenerate {
    @Override
    public String generate() {
        //todo
        Random random = new Random();
        String answer = "";
        //todo
        Set<Integer> set = new HashSet<>();
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
