package example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @Author Dunka
 * @Description //TODO
 * @Date 22:15   2020/7/23
 * @ClassName RandomAnswerGenerateTest
 */
public class RandomAnswerGeneratorTest {
    @Test
    void should_length_is_4_when_generate() {
//        given
//        when
        AnswerGenerator randomAnswerGenerator = new RandomAnswerGenerator();
        int length = randomAnswerGenerator.generate().length();

//        then
        assertEquals(4, length);
    }

    @Test
    void should_different_4_number_in_string_when_generate() {
        AnswerGenerator randomAnswerGenerator = new RandomAnswerGenerator();
        String actual = randomAnswerGenerator.generate();
        char[] chars = actual.toCharArray();

        final HashSet<Character> characters = new HashSet<>();

        for (int i = 0; i < chars.length; i++) {
            characters.add(chars[i]);
        }
        assertEquals(4, characters.size());
    }
}
