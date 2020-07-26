package example;

import javafx.animation.Animation;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.BDDMockito.given;

/**
 * @Author Dunka
 * @Description //TODO
 * @Date 23:03   2020/7/23
 * @ClassName GameTest
 */
public class GameTest {
    @Test
    void should_win_when_inputs_valid_and_passed_given_list(){
        AnswerGenerator answerGenerator = Mockito.mock(RandomAnswerGenerator.class);
        given(answerGenerator.generate()).willReturn("1234");
        Game game = new Game(answerGenerator);
        String[] inputs = new String[]{"1234"};
        String actual="";
        for (int i = 0; i < inputs.length; i++) {
            actual = game.play(inputs[i]);
        }
        assertEquals("4A0B",actual);
    }
    @Test
    void should_return_wrong_input_when_inputs_wrong_guess_given_list() {
        AnswerGenerator answerGenerator = Mockito.mock(RandomAnswerGenerator.class);
        given(answerGenerator.generate()).willReturn("1234");
        Game game = new Game(answerGenerator);
        String[] inputs = new String[]{"A234", "A234"};
        String actual="";
        for (int i = 0; i < inputs.length; i++) {
            actual = game.play(inputs[i]);
        }
        assertEquals("Wrong Input，Input again", actual);
    }

}
