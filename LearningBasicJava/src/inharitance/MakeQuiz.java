package inharitance;

import java.util.ArrayList;
import java.util.Scanner;

public class MakeQuiz extends Quiz {
    public MakeQuiz() {
        super();
    }

    private ArrayList<String> answers;

    public void makeQuiz(){
        Scanner scanner = new Scanner(System.in);
        answers  = new ArrayList<>();

        for (int i = 0 ; i<getQuestions().length; i++){
            System.out.println("Question"+(i+1)+" : "+getQuestions()[i]);
            answers.add(scanner.nextLine().toUpperCase());
        }

    }
    public void checkAnswers(){
        System.out.println("*************RESULTS*****************");
        for (int i = 0; i<answers.size(); i++){
            if(getCorrectAnswers()[i].equals(answers.get(i))){
                System.out.println("Question "+(i+1)+" true congratulations...");
            }
            else{
                System.out.println("Question "+(i+1)+" is wrong...");
            }
        }
    }


}
