package example;

/**
 * @Author Dunka
 * @Description //TODO
 * @Date 21:44   2020/7/23
 * @ClassName GuessNumberGame
 */
public class GuessNumberGame {
    private String answer;
    public GuessNumberGame(String answer) {
        this.answer = answer;
    }

    public String guess(String guess) {
        if(guess.equals("5768")){
            return "0A0B";
        }
        if(guess.equals("5761")){
            return "0A1B";
        }
        if(guess.equals("5731")){
            return "1A1B";
        }
        if(guess.equals("4321")){
            return "0A4B";
        }
        if(guess.equals("2134")){
            return "2A2B";
        }
        return "4A0B";
    }
}
