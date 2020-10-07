package inharitance;

import java.util.Scanner;

public class Run {

    public static MakeQuiz quiz = new MakeQuiz();

    public static void main(String arg[]){
        Scanner scanner = new Scanner(System.in);
        String[] questions = {"blah blah blah\nA-true B-false C-False","ja ja ja\nA-false B-true C-false"};
        String[] answers = {"A","B"};
       quiz.setQuestions(questions);
       quiz.setCorrectAnswers(answers);
        String menu = "press 1 to make quiz\n" +
                      "press q to quit";
        while(true){
            System.out.println(menu);
            String selection = scanner.nextLine();
            if (selection.equals("q")){
                break;
            }
            else if (selection.equals("1")){
                quiz.makeQuiz();
                quiz.checkAnswers();
                break;
            }
            else{
                System.out.println("wrong selection...");
            }
        }
    }
}
