/*
 * Ad Soyad: Emirhan Arıkan
 * Ogrenci No: 250541005
 * Tarih: 06.11.25
 * Aciklama: Gorev 1 - Ogrenci Bilgi Sistemi
 * 
 * Bu program kullanicidan ogrenci bilgilerini alir ve
 * duzenli bir formatta ekrana yazdirir.
 * Diğer java dosyalarının başında da bu örnek formattaki gibi kısa bilgi giriniz
 */

import java.util.Scanner;

public class OgrenciBilgi {
    public static void main(String[] args) {
        final double BASARI_SINIRI = 2.50;
        Scanner input = new Scanner(System.in);

        System.out.printf("=== OGRENCI BILGI SISTEMI ===%n");

        System.out.printf("Adinizi girin: ");
        String ad = input.next();

        System.out.printf("Soyadinizi girin: ");
        String soyad = input.next();

        System.out.printf("Ogrenci numaraniz: ");
        int ogrenciNo = input.nextInt();

        System.out.printf("Yasiniz: ");
        int yas = input.nextInt();

        System.out.printf("GPA (0.00-4.00): ");
        double gpa = input.nextDouble();

        System.out.printf("%n=== OGRENCI BILGI SISTEMI ===%n");
        System.out.printf("Ad Soyad: %s %s%n", ad, soyad);
        System.out.printf("Ogrenci No: %d%n", ogrenciNo);
        System.out.printf("Yas: %d%n", yas);
        System.out.printf("GPA: %.2f%n", gpa);

        input.close();
    }
}
