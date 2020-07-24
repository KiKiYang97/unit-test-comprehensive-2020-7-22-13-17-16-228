package example;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.BDDMockito.given;

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
        AnswerGenerate answer = Mockito.mock(AnswerGenerate.class);
        given(answer.generate()).willReturn("1234");
        GuessNumberGame guessNumberGame = new GuessNumberGame(answer.generate());

//        when
        String actual = guessNumberGame.guess(guess);

//        then
        assertEquals("4A0B",actual);
    }

    @Test
    void should_return_2A2B_when_guess_is_2134_given_answer_is_1234(){
//        given
        String guess = "2134";
        AnswerGenerate answer = Mockito.mock(AnswerGenerate.class);
        given(answer.generate()).willReturn("1234");
        GuessNumberGame guessNumberGame = new GuessNumberGame(answer.generate());

//        when
        String actual = guessNumberGame.guess(guess);

//        then
        assertEquals("2A2B",actual);
    }

    @Test
    void should_return_0A4B_when_guess_is_4321_given_answer_is_1234(){
//        given
        String guess = "4321";
        AnswerGenerate answer = Mockito.mock(AnswerGenerate.class);
        given(answer.generate()).willReturn("1234");
        GuessNumberGame guessNumberGame = new GuessNumberGame(answer.generate());

//        when
        String actual = guessNumberGame.guess(guess);

//        then
        assertEquals("0A4B",actual);
    }

    @Test
    void should_return_1A1B_when_guess_is_5731_given_answer_is_1234(){
//        given
        String guess = "5731";
        AnswerGenerate answer = Mockito.mock(AnswerGenerate.class);
        given(answer.generate()).willReturn("1234");
        GuessNumberGame guessNumberGame = new GuessNumberGame(answer.generate());

//        when
        String actual = guessNumberGame.guess(guess);

//        then
        assertEquals(
                "1A1B",actual);
    }

    @Test
    void should_return_0A1B_when_guess_is_5761_given_answer_is_1234(){
//        given
        String guess = "5761";
        AnswerGenerate answer = Mockito.mock(AnswerGenerate.class);
        given(answer.generate()).willReturn("1234");
        GuessNumberGame guessNumberGame = new GuessNumberGame(answer.generate());

//        when
        String actual = guessNumberGame.guess(guess);

//        then
        assertEquals("0A1B",actual);
    }

    @Test
    void should_return_0A0B_when_guess_is_5768_given_answer_is_1234(){
//        given
        String guess = "5768";
        AnswerGenerate answer = Mockito.mock(AnswerGenerate.class);
        given(answer.generate()).willReturn("1234");
        GuessNumberGame guessNumberGame = new GuessNumberGame(answer.generate());

//        when
        String actual = guessNumberGame.guess(guess);

//        then
        assertEquals("0A0B",actual);
    }
}
