package example;

import sun.java2d.SurfaceDataProxy;

import java.util.Scanner;

/**
 * @Author Dunka
 * @Description //TODO
 * @Date 23:05   2020/7/23
 * @ClassName Game
 */
public class Game {
    private GuessNumberGame guessNumberGame;
    private Integer count;
    public Game(AnswerGenerator answerGenerator) {
        guessNumberGame = new GuessNumberGame(answerGenerator.generate());
        count = 6;
    }

    public static void main(String[] args) {
        AnswerGenerator answerGenerator = new RandomAnswerGenerator();
        Game game = new Game(answerGenerator);
        int i;
        boolean flag = false;
        for (i = 0; i < game.count ; i++) {
            Scanner scanner = new Scanner(System.in);
            final String input = scanner.next();
            final String guessAnswer = game.play(input);
            System.out.println(guessAnswer);
            if (guessAnswer.equals("4A0B")){
                flag = true;
                System.out.println("win,game over");
                break;
            }
        }
        if(!flag){
            System.out.println("You only have six chances");
        }
    }
    public String play(String input) {
        CheckInput checkInput = new CheckInput();
        final boolean valid = checkInput.isValid(input);
        if(!valid) {
            return "Wrong Input，Input again";
        }else{
            final String guess = guessNumberGame.guess(input);
            return guess;
        }
    }
}
