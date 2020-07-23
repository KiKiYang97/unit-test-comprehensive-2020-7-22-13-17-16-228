package example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @Author Dunka
 * @Description //TODO
 * @Date 22:15   2020/7/23
 * @ClassName RandomAnswerGenerateTest
 */
public class RandomAnswerGenerateTest {
    @Test
    void should_length_is_4_when_generate(){
//        given
//        when
        AnswerGenerate randomAnswerGenerate = new RandomAnswerGenerate();
        int length = randomAnswerGenerate.generate().length();

//        then
        assertEquals(4,length);
    }
}
