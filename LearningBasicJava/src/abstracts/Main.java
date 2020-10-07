package abstracts;

import java.util.Scanner;

public class Main {
    public static greengrocery fruits = new fruits();
    public static greengrocery vegetables = new vegetables();
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]){

        String mainMenu = "*********MAIN MENU***********\n" +
                          "Type '1' for list Fruit\n" +
                          "Type '2' for list Vegetable\n" +
                          "Type 'b' for your basket\n" +
                          "Type 'q' for quit : ";
        String selection ;
        boolean a = true;
        while (a){
            System.out.println(mainMenu);
            selection = scanner.nextLine();
            switch (selection){
                case "1":
                    fruits.listItems(); break;
                case "2":
                    vegetables.listItems();break;
                case "b":
                    a = fruits.showBasket();
                    a = vegetables.showBasket(); break;
                case "q":
                    a = false; break;
                default:
                    System.out.println("wrong selection.."); break;
            }

        }
    }
}
