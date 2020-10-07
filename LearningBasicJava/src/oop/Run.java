package oop;
import java.util.Scanner;
public class Run {
    public static Gallery gallery = new Gallery();
    public static  Scanner scanner = new Scanner(System.in);
    public static void main(String arg[]){
        while(true){
            System.out.println("Press 1 to add car / Press q for quit and list cars : ");
            String selection = scanner.nextLine();
            if (selection.equals("q")){
                break;
            }
            else if(selection.equals("1")){
                addCar();
            }
            else{
                System.out.println("Wrong Type...");
            }
        }
        gallery.showCars();
    }
    public static void addCar(){
        String[] properties = new String[4];
        System.out.print("Brand : ");
        properties[0]  = scanner.nextLine();
        System.out.print("Model : ");
        properties[1]  = scanner.nextLine();
        System.out.print("Max speed : ");
        properties[2]  = "MaxSpeed:"+scanner.nextLine();
        System.out.print("Price : ");
        properties[3]  = "Price:"+scanner.nextLine()+"$";
        gallery.setProperties(properties);
        gallery.addCar();
        System.out.println("Added...");
    }

}
