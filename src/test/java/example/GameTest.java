package example;

import javafx.animation.Animation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @Author Dunka
 * @Description //TODO
 * @Date 23:03   2020/7/23
 * @ClassName GameTest
 */
public class GameTest {
    @Test
    void should_win_when_inputs_valid_and_passed_given_list(){


        Game game = new Game();
        String actual = game.play(new String[]{"1234"}) ;
        assertEquals("4A0B",actual);
    }

}
