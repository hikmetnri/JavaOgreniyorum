import java.util.Scanner;

public class KdvCalc {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.println("Kdv hesaplanacak tutarı girin");
        int tutar = girdi.nextInt();
        if (tutar <= 1000) {
            double kdvliTutari = tutar * 0.18;
            double toplamTutar = kdvliTutari + tutar;
            System.out.println("Kdvsiz fiyat: " + tutar);
            System.out.println("Kdvli fiyat: " + toplamTutar);
            System.out.println("kdv turarı: " + kdvliTutari);
        } else {
            double kdvliTutari = tutar * 0.08;
            double toplamTutar = kdvliTutari + tutar;
            System.out.println("Kdvsiz fiyat: " + tutar);
            System.out.println("Kdvli fiyat: " + toplamTutar);
            System.out.println("kdv turarı: " + kdvliTutari);
        }
    }
}






