import java.util.Scanner;

public class DaireAlan {
    public static void main(String[] args) {
        /*
         Alan Formülü : π * r * r;

Çevre Formülü : 2 * π * r;

Ödev
Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.

𝜋 sayısını = 3.14 alınız.

Formül : (𝜋 * (r*r) * 𝛼) / 360

         */
        Scanner input = new Scanner(System.in);
        double pi = 3.14;
        System.out.println("Yarı çapı girin");
        int r = input.nextInt();
        double cevre = 2 * pi * r;
        double alan = (pi * (r * r));
        double daireDilim = (pi * (r * r) * alan) / 360;
        System.out.println("Çevre: " + cevre);
        System.out.println("Alan: " + alan);
        System.out.println("Daire diliminin Alanı : " + daireDilim);
    }
}
