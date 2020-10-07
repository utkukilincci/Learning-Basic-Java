package methods;

import java.util.Scanner;

public class calculatorPhoneBill {

    static double charge = 0.25;
    static double tax = 0.15;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Normal fatura tutarınızı girin: ");
        double normalFatura = scanner.nextDouble();
        System.out.print("Ekstra harcadığınız dakikalar : ");
        int dakika = scanner.nextInt();
        scanner.close();

        double faturayaEk = ekstraUcret(dakika);
        double vergi = vergiHesapla(normalFatura, faturayaEk);
        toplamFatura(normalFatura, faturayaEk, vergi);

    }

    public static double ekstraUcret(int dakika){

        double ekstraucret = charge * dakika;
        return ekstraucret;
    }

    public static double vergiHesapla(double normalFatura, double faturayaEk){

        double vergi = (normalFatura+faturayaEk)*tax;
        return vergi;
    }
    public static void toplamFatura(double normalFatura, double faturayaEk, double vergi){

        double toplamFatura = normalFatura+faturayaEk+vergi;
        System.out.println("Normal fatura bedeliniz : "+normalFatura+"TL");
        System.out.println("Aşan dakikalarınızın bedeli : "+faturayaEk+"TL");
        System.out.println("Vergi : "+vergi+"TL");
        System.out.println("Toplam fatura tutarınız : "+toplamFatura+"TL");
    }

}
