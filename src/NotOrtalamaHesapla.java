import java.util.Scanner;

public class NotOrtalamaHesapla {
    public static void main(String[] args) {
        /**
         * @author O.Temizel
         */

        // Değişkenleri oluştur
        int mat, fizik, kimya, turkce, tarih, müzik;

        // Scanner sınıfımızı tanımladık
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan değerleri al.
        System.out.println("Matematik notunu giriniz..");
        mat= input.nextInt();

        System.out.println("Fizik notunu giriniz..");
        fizik= input.nextInt();

        System.out.println("Kimya notunu giriniz..");
        kimya= input.nextInt();

        System.out.println("Türkçe notunu giriniz");
        turkce= input.nextInt();

        System.out.println("Tarih notunu giriniz..");
        tarih= input.nextInt();

        System.out.println("Müzik notunu giriniz..");
        müzik= input.nextInt();

        int toplam = (mat+fizik+kimya+turkce+tarih+müzik);
        double ortalama = toplam/6;
        System.out.println("Ortalamanız: "+ortalama);

        // Ortalama 60dan büyük ya da küçük olma durumuna göre sınıfı geçme durumu

        boolean sonuc = (ortalama>=60);
        String str = (sonuc)? "Sınıfı geçtiniz" : "Sınıfta kaldınız";
        System.out.println(str);

    }
}
