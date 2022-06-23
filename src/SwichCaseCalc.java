import java.util.Scanner;

public class SwichCaseCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Bir sayı girin");
            int sayi1 = sc.nextInt();
            System.out.println("İkinci sayı girin");
            int sayi2 = sc.nextInt();

            System.out.println("Yapmak istediğiniz işlemi seçin;");
            System.out.println("Toplam için (1), Cıkartma için (2),Çarpma için (3),Bölme için (4)");
            int durum = sc.nextInt();
            switch (durum) {
                case 1:
                    int topla = sayi1 + sayi2;
                    System.out.println("Toplam " + topla);
                    break;
                case 2:
                    int cikar = sayi1 - sayi2;
                    System.out.println("Çıkar " + cikar);
                    break;
                case 3:
                    int carp = sayi1 * sayi2;
                    System.out.println("Çarpım " + carp);
                    break;
                case 4:
                    int böl = sayi1 / sayi2;
                    System.out.println("Bölüm " + böl);
                    break;
            }
            System.out.println("Hesap buluntu tekrar işlem için ");
        }

    }
}
