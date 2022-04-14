import java.util.Scanner;

public class KilometreHesap {
    public static void main(String[] args) {
        Scanner girdi=new Scanner(System.in);
        System.out.println("Kaç kilometre Yol gidildi");
        int gidilenYol= girdi.nextInt();
        double birKm=2.20;
        double taksimetreTutari=birKm*gidilenYol;
        int metraAcılıs=10;
        if (taksimetreTutari>=20){
            System.out.println("Gidilen Mesafe: "+gidilenYol+" Kilometre");
            System.out.println("Taksimetre açılış tutarı : "+metraAcılıs);
            System.out.println("Toplam tutar: "+taksimetreTutari+metraAcılıs);
        }
        else {
            System.out.println("Gidilen yol ücreti: "+gidilenYol);
            System.out.println("Taksi Metra açılış Ücreti 10 tldir");
            System.out.println("Taksiye en düşük biniş ücreti Minimum 20'dir : "+(taksimetreTutari+metraAcılıs)+"Ödenecek tutar 20 TL");
        }

    }

}
