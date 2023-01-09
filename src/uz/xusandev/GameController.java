package uz.xusandev;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

public class GameController {

    private ArrayList<QuestionData> questionData;
    private int position = 0;
    private int totalCorrects = 0;
    private int totalMistakes = 0;

    private Date startDate;
    private Date endDate;

    public GameController(ArrayList<QuestionData> questionData) {
        this.questionData = questionData;
        startDate = new Date();
    }

    private QuestionData getCurrentQuestion() {
        return questionData.get(position);
    }

    public String getQuestion() {
        return getCurrentQuestion().getQuestion();
    }

    public ArrayList<String> getVariants() {
        Collections.shuffle(getCurrentQuestion().getVariants());
        return getCurrentQuestion().getVariants();
    }

    public int getTotalMistakes() {
        return totalMistakes;
    }

    public int getTotalCorrects() {
        return totalCorrects;
    }

    public int getTotalQuestions() {
        return questionData.size();
    }

    public boolean checkAnswer(String userAnswer) {
        boolean isTrue = getCurrentQuestion().getAnswer().equalsIgnoreCase(userAnswer);

        if (isTrue) {
            totalCorrects++;
        } else {
            totalMistakes++;
        }

        if (!isFinished()) {
            position++;
        }

        return isTrue;
    }

    public boolean isFinished() {
        return position == questionData.size();
    }

    public int getPosition() {
        return position + 1;
    }
}
