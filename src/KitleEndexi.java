import java.util.Scanner;

public class KitleEndexi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen kilonuzu giriniz");
        double kilo = input.nextDouble();
        System.out.println("Lütfen boyunuzu (santimetre cinsinde) giriniz");
        double boy = input.nextDouble();
        double endeks = kilo / (boy * boy);
        System.out.println("Kilo endeksiniz: " + endeks);
    }
}
