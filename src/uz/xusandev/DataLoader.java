package uz.xusandev;

import java.util.ArrayList;

public class DataLoader {

    public static ArrayList<QuestionData> makeData() {
        ArrayList<QuestionData> data = new ArrayList<>();

        QuestionData questionData1 = new QuestionData("1+1=?", "2");
        questionData1.addVariant("2");
        questionData1.addVariant("1");
        questionData1.addVariant("5");
        questionData1.addVariant("9");
        data.add(questionData1);

        QuestionData questionData2 = new QuestionData("11*2=?", "22");
        questionData2.addVariant("22");
        questionData2.addVariant("10");
        questionData2.addVariant("15");
        questionData2.addVariant("2");
        data.add(questionData2);

        QuestionData questionData3 = new QuestionData("1+1*1=?", "2");
        questionData3.addVariant("2");
        questionData3.addVariant("1");
        questionData3.addVariant("3");
        questionData3.addVariant("9");
        data.add(questionData3);

        QuestionData questionData4 = new QuestionData("5%2=?", "1");
        questionData4.addVariant("2.5");
        questionData4.addVariant("1");
        questionData4.addVariant("2");
        questionData4.addVariant("1.5");
        data.add(questionData4);

        QuestionData questionData5 = new QuestionData("1+5*3=?", "16");
        questionData5.addVariant("16");
        questionData5.addVariant("15");
        questionData5.addVariant("18");
        questionData5.addVariant("20");
        data.add(questionData5);

        return data;
    }

}
