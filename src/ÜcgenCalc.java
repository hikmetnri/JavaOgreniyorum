import java.util.Scanner;

public class ÜcgenCalc {
    public static void main(String[] args) {
        Scanner girdi= new Scanner(System.in);
        System.out.println("A Kenarı girin");
       int aKenar=girdi.nextInt();
        System.out.println("B Kenarı girin");
       int bKenar=girdi.nextInt();
        System.out.println("C Kenarı girin");
        int cKenar=girdi.nextInt();

       double u=(aKenar+bKenar+cKenar)/2;
       double cevre=u*2;
       double alan=aKenar*bKenar/2;
        System.out.println("Ücgenin cevresi:"+cevre);
        System.out.println("Ücgenin alanı: "+alan);

    }
}
