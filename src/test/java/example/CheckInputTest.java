package example;

import javafx.beans.binding.DoubleBinding;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @Author Dunka
 * @Description //TODO
 * @Date 22:36   2020/7/23
 * @ClassName CheckInputTest
 */
public class CheckInputTest {
    @Test
    void should_false_when_input_12_given_check(){

        CheckInput checkInput = new CheckInput();
        boolean actual = checkInput.isValid("12");
        assertEquals(false,actual);
    }

    @Test
    void should_false_when_input_1122_given_check(){

        CheckInput checkInput = new CheckInput();
        boolean actual = checkInput.isValid("1122");
        assertEquals(false,actual);
    }

    @Test
    void should_return_false_when_input_A123_given_check() {
        CheckInput checkInput = new CheckInput();
        boolean actual = checkInput.isValid("A123");
        assertEquals(false,actual);
    }

    @Test
    void should_true_when_input_has_different_number_given_check(){
        CheckInput checkInput = new CheckInput();
        boolean actual = checkInput.isValid("1234");
        assertEquals(true,actual);
    }
}
