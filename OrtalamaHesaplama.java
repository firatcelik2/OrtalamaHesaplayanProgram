package JavaCalisma;

// util scannerı import ediyoruz
import java.util.Scanner;
public class OrtalamaHesaplama {
    public static void main(String[] args){
        int mat,fizik,kimya,turkce,tarih,muzik,toplam,gecernot,sonuc;
        gecernot = 60;
        String durum;
        Scanner s = new Scanner(System.in); //scanner sınıfımızı tanımladık

        //Kullanıcıdan değerleri alıyoruz.
        System.out.print("Matematik notunuzu girin:");
        mat = s.nextInt();
        System.out.print("Fizik notunuzu girin:");
        fizik= s.nextInt();
        System.out.print("Kimya notunuzu girin:");
        kimya = s.nextInt();
        System.out.print("Türkce notunuzu girin:");
        turkce = s.nextInt();
        System.out.print("Tarih notunuzu girin:");
        tarih = s.nextInt();
        System.out.print("Müzik notunuzu girin:");
        muzik = s.nextInt();

        toplam = mat+fizik+kimya+turkce+tarih+muzik;
        sonuc = toplam/6;

        boolean kosul = sonuc>=gecernot;
        durum = (kosul) ? "Durumunuz: Sınıfı geçti" : "Durumunuz: Sınıfta kaldı";


        System.out.println("Ortalamanız : " + sonuc);
        System.out.print(durum);

    }
}

