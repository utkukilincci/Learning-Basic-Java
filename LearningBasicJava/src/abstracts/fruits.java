package abstracts;

import java.util.HashMap;
import java.util.Scanner;

public class fruits extends greengrocery {

    private HashMap<String, Integer> fruitsList = new HashMap<String, Integer>();

    private Scanner scanner = new Scanner(System.in);

    public void items(){
        fruitsList.put("o1-Orange", 9);
        fruitsList.put("b1-Banana", 10);
        fruitsList.put("a1-Apple", 8);
    }

    @Override
    public void listItems() {
        items();

        for (String i : fruitsList.keySet()) {
            System.out.println(i + " : " + fruitsList.get(i) + "$");

        }
        addToBasket();
    }

    @Override
    public void addToBasket() {

       while (true) {
            System.out.print("Type the code of the fruit for add to basket or type 'q' for back to previous menu :");
            String selection = scanner.nextLine();
            if (selection.equals("q")) {
                break;
            } else if (selection.equals("b1")) {
                setBasket("Banana", 10);
                setTotalPrice(10);
                System.out.println("added banana");
            } else if (selection.equals("a1")) {
                setBasket("Apple", 8);
                setTotalPrice(8);
                System.out.println("added apple");
            } else if (selection.equals("o1")) {
                setBasket("Orange", 9);
                setTotalPrice(9);
                System.out.println("added orange");
            } else {
                System.out.println("wrong selection...");
            }
        }
    }

}