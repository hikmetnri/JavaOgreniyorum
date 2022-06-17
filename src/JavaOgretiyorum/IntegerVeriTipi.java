package JavaOgretiyorum;

public class IntegerVeriTipi {
    public static void main(String[] args) {
        // Javada Sayısal(Numeric) veri tiplerini İnteger yani int ile tutarız.
        //Örnek olarak Yaşımızı , Tc numaramızı , Telefon numaralarımız gibi vs.
        // JAVADA DEĞİŞKEN TANIMLARKEN ÖNCE DEĞİŞKENİN TİPİNİ SONRA DEĞİŞKEN İSMİNİ VE ATAMAK İSTEDİĞİMİZ DEĞERİ YAZIYORUZ.
        // Aşağıdaki kodda okul numaramızı yani 379 değerini okulNo değişkenimize atadık.
        int okulNO=379;
        //Hemen bir consol ekranında görelim.
        // Javada konsolda birşey görüntülemek istiyorsak System.out.println(); Kullanırız.
        System.out.println(okulNO);
        //Gördüğünüz gibi consol ekranında yazdırmak istediğim değişken ismini parantez içine yazarak değerimizi görüntüledik


        /* Şimdi daha fazla örnek yaparak Pekiştirelim Konu anlatımında ne demişik değişken tanımlama kurallarına uymamız lazım.
        Önce hatalı kullanımları gösterip daha sonra doğrularını yazalım.
        Hatalı kodları konsolda göremeyeceğimiz için doğru olanları ekrana yazdıracağım.
        **/
       /* int yaşım=15;     //Türkçe karakter kullanmak yazım olarak hata vermese bile kodları çalıştırırken verebilir örnek.
        int 1yaşım=18;   // Gördüğünüz gibi sayıyla başlanmayacağını bize kırmızı olarak hata veriyor ve kodumuzu düzeltmemizi istiyor.
        int .ifadesi=57; // özel karakterler de kullanmamıza izin vermiyor 2 tane karekter hariç ( $ ve _ ) */
        int yasim =22;
        int birinciYasim=15;
        int _ifadesiDogruKullanımdır=25;
        System.out.println(yasim);
        System.out.println(birinciYasim);
        System.out.println(_ifadesiDogruKullanımdır);
    }
}
