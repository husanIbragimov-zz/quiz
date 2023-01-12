package uz.xusandev;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static GameController gameController;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<QuestionData> data = DataLoader.makeData();

        gameController = new GameController(data);

        gameController.startGame();

        while (!gameController.isFinished()) {
            System.out.println(gameController.getPosition() + " - Question: " + gameController.getQuestion());

            ArrayList<String> variants = gameController.getVariants();

            for (int i = 0; i < variants.size(); i++) {
                System.out.println(((char) (65 + i)) + ")" + variants.get(i));
            }

            System.out.print("Write correct answer: ");

            String answer = scanner.next();

            boolean isTrue = gameController.checkAnswer(answer);

            System.out.println(isTrue ? "Correct!\n" : "InCorrect!\n");

        }

        System.out.println("You found " + gameController.getTotalCorrects() + " out of " + gameController.getTotalQuestions() + " questions right");

        gameController.endGame();

        System.out.println("You have spent " + gameController.getTotalSpentTime());

    }

    public static void loadData() {

    }

}