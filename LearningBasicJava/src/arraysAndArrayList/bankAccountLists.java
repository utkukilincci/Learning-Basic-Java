package arraysAndArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class bankAccountLists {

    public static void main (String arg[]){

        ArrayList<String[]> bankAccounts = new ArrayList<String[]>();
        String[] account1 = {"Utku Kilincci","1000"};
        String[] account2 = {"Güngör Kişmir","5000"};
        bankAccounts.add(account1);
        bankAccounts.add(account2);
        String[] hesap1;

        for(int i = 0 ; i<bankAccounts.size(); i++){

            hesap1 = bankAccounts.get(i);
            System.out.println(Arrays.toString(hesap1));
        }






    }

}
