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
        String guess = "1234";
        GuessNumberGame guessNumberGame = new GuessNumberGame("1234");

//        when
        String actual = guessNumberGame.guess(guess);

//        then
        assertEquals("4A0B",actual);
    }

    @Test
    void should_return_2A2B_when_guess_is_2134_given_answer_is_1234(){
//        given
        String guess = "2134";
        GuessNumberGame guessNumberGame = new GuessNumberGame("1234");

//        when
        String actual = guessNumberGame.guess(guess);

//        then
        assertEquals("2A2B",actual);
    }

    @Test
    void should_return_0A4B_when_guess_is_4321_given_answer_is_1234(){
//        given
        String guess = "4321";
        GuessNumberGame guessNumberGame = new GuessNumberGame("1234");

//        when
        String actual = guessNumberGame.guess(guess);

//        then
        assertEquals("0A4B",actual);
    }
}
