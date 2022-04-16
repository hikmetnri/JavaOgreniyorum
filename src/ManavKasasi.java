import java.util.Scanner;

public class ManavKasasi {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Kasaya hoşgeldiniz");
        double armut,elma,domates,muz,patlıcan;

        armut = 2.14;
        elma =3.67;
        domates = 1.11;
        muz= 0.95;
        patlıcan = 5.00;

        System.out.println("Aldığınız Armutun kilosunu girin:   "+"Armutun kilosu: "+armut);
        int armutKilo=input.nextInt();
        System.out.println("Aldığınız elma kilosunu girin:  "+"Elmanın kilosu: "+elma);
        int elmaKilo=input.nextInt();
        System.out.println("Aldığınız domates kilosunu girin:   "+"Domatesin Kilosu: "+domates);
        int domatesKilo=input.nextInt();
        System.out.println("Aldığınız muz kilosunu girin:   "+"Muzun Kilosu: "+muz);
        int muzKilo=input.nextInt();
        System.out.println("Aldığınız patlıcan kilosunu girin:  "+"Patlıcanın Kilosu: "+patlıcan);
        int patlıcanKilo=input.nextInt();

        double armutUcret,elmaUcret,domatesUcret,muzUcret,patlıcanUcret,toplamUcret;

        armutUcret=armut*armutKilo;
        elmaUcret=elma*elmaKilo;
        domatesUcret=domates*domatesKilo;
        muzUcret=muz*muzKilo;
        patlıcanUcret=patlıcan*patlıcanKilo;
        toplamUcret=armutUcret+elmaUcret+domatesUcret+muzUcret+patlıcanUcret;

        System.out.println("Armut ücreti: "+armutUcret);
        System.out.println("Elma ücreti: "+elmaUcret);
        System.out.println("Domates ücreti: "+domatesUcret);
        System.out.println("Muz ücreti: "+muzUcret);
        System.out.println("Patlıcan ücreti: "+patlıcanUcret);
        System.out.println("Toplam ödenecek tutar: "+toplamUcret);

    }
}
