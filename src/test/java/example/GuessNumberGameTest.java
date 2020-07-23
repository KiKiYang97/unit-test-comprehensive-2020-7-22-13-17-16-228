package example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @Author Dunka
 * @Description //TODO
 * @Date 21:33   2020/7/23
 * @ClassName GuessNumberGameTest
 */
public class GuessNumberGameTest {
    @Test
    void should_return_4A0B_when_guess_is_1234_given_answer_is_1234(){
//        given
        String number = "1234";
        GuessNumberGame guessNumberGame = new GuessNumberGame("1234");

//        when
        String actual = guessNumberGame.guess(number);

//        then
        assertEquals("4A0B",actual);
    }
}
