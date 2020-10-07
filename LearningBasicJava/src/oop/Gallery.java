package oop;
import java.util.ArrayList;
import java.util.Arrays;

public class Gallery {

    private ArrayList<String[]> cars = new ArrayList<>();
    private String[] properties;

    public String[] getProperties() {
        return properties;
    }

    public void setProperties(String[] properties) {
        this.properties = properties;
    }

    public void addCar(){
        cars.add(properties);
    }
    public void showCars(){
        String[] show;
        System.out.println("*******Car List********");
        for(int i = 0; i<cars.size(); i++){
            show = cars.get(i);
            System.out.println(Arrays.toString(show));
        }
    }
}
