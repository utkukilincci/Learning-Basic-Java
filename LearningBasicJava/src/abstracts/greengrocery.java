package abstracts;

import java.util.HashMap;
import java.util.Scanner;


public abstract class greengrocery {
   private HashMap<String, Integer> basket = new HashMap<String, Integer>();
   private int totalPrice = 0;
   public abstract void listItems();
   public abstract void addToBasket();
   private Scanner scanner = new Scanner(System.in);

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice += totalPrice;
    }

    public HashMap<String, Integer> getBasket() {
        return basket;
    }

    public void setBasket(String item, Integer price) {
        this.basket.put(item,price);
    }

    public boolean showBasket() {

        String selection;

        for (String i : getBasket().keySet()) {
                System.out.println( i + " : " + getBasket().get(i) + "$");
            }
            System.out.println("Total : "+getTotalPrice()+" $");
            System.out.println("Type 'b' for buying...Press 'enter' for back to previous menu : ");
            selection = scanner.nextLine();
            if (selection.equals("b")){
                System.out.println("...Purchased...");
                return false;
            }


        return true;
    }
}
