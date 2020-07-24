package example;

/**
 * @Author Dunka
 * @Description //TODO
 * @Date 23:05   2020/7/23
 * @ClassName Game
 */
public class Game {

    public String play(String[] strings) {
        final GuessNumberGame guessNumberGame = new GuessNumberGame(new RandomAnswerGenerator().generate());
        for (int i = 0; i < (strings.length >= 6 ? 6 : strings.length); i++) {
            final String guess = guessNumberGame.guess(strings[i]);
            if (guess.equals("4A0B")) {
                return "4A0B";
            }
        }
        return "failed";
    }
}
