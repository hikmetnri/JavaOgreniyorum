import java.util.Scanner;

public class NoteOrt {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.println("Puan ortalasını bulma");

        System.out.println("Matematik Notunuzu girin");
        int mat=girdi.nextInt();
        System.out.println("fizik Notunuzu girin");
        int fizik=girdi.nextInt();
        System.out.println("kimya Notunuzu girin");
        int kimya=girdi.nextInt();
        System.out.println("türkce Notunuzu girin");
        int türkce=girdi.nextInt();
        System.out.println("biyoloji Notunuzu girin");
        int biyoloji=girdi.nextInt();
        System.out.println("İngilizce Notunuzu girin");
        int ing=girdi.nextInt();

        double ortalama=(mat+fizik+kimya+biyoloji+türkce+ing)/6;

        boolean sonuc= ortalama<49;
        String kaldımı= sonuc ? " Kaldınız " : "Geçtiniz";
        System.out.println("Ortalama puanınız: "+ ortalama +kaldımı);

    }
}
