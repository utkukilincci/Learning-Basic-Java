package abstracts;

import java.util.HashMap;
import java.util.Scanner;

public class vegetables extends greengrocery {

    private HashMap<String, Integer> vegetableList = new HashMap<String, Integer>();

    private Scanner scanner = new Scanner(System.in);

    public void items(){
        vegetableList.put("on1-Onion", 9);
        vegetableList.put("t1-Tomato", 10);
        vegetableList.put("p1-Potato", 8);
    }

    @Override
    public void listItems() {
        items();

        for (String i : vegetableList.keySet()) {
            System.out.println(i + " : " + vegetableList.get(i) + "$");

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
            } else if (selection.equals("t1")) {
                setBasket("Tomato", 10);
                setTotalPrice(10);
                System.out.println("added tomato");
            } else if (selection.equals("p1")) {
                setBasket("Potato", 8);
                setTotalPrice(8);
                System.out.println("added potato");
            } else if (selection.equals("on1")) {
                setBasket("Onion", 9);
                setTotalPrice(9);
                System.out.println("added onion");
            } else {
                System.out.println("wrong selection...");
            }
        }
    }
}
