/*
 * Ad Soyad: Emirhan Arıkan
 * Ogrenci No: 250541005
 * Tarih: 06.11.25
 * Aciklama: Gorev 2 - Geometrik Hesap
 * 
 */

import java.util.Scanner;

public class MaasHesap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Sabit oranlar
        final double SGK_ORANI = 0.14;
        final double GELIR_VERGISI_ORANI = 0.15;
        final double DAMGA_VERGISI_ORANI = 0.00759;

        // Kullanıcıdan bilgiler alınır
        System.out.printf("Çalışanın adı soyadı: ");
        String adSoyad = input.nextLine();

        System.out.printf("Aylık brüt maaş (TL): ");
        double brutMaas = input.nextDouble();

        System.out.printf("Haftalık çalışma saati: ");
        int haftalikSaat = input.nextInt();

        System.out.printf("Mesai saati sayısı: ");
        int mesaiSaat = input.nextInt();

        // Hesaplamalar
        double mesaiUcreti = (brutMaas / 160) * mesaiSaat * 1.5;
        double toplamGelir = brutMaas + mesaiUcreti;

        double sgkKesintisi = toplamGelir * SGK_ORANI;
        double gelirVergisi = toplamGelir * GELIR_VERGISI_ORANI;
        double damgaVergisi = toplamGelir * DAMGA_VERGISI_ORANI;
        double toplamKesinti = sgkKesintisi + gelirVergisi + damgaVergisi;

        double netMaas = toplamGelir - toplamKesinti;

        // İstatistikler
        double kesintiOrani = (toplamKesinti / toplamGelir) * 100;
        double saatlikNetKazanc = netMaas / 176;
        double gunlukNetKazanc = netMaas / 22;

        // Çıktı
        System.out.printf("====================================%n");
        System.out.printf("          MAAS BORDROSU             %n");
        System.out.printf("====================================%n");
        System.out.printf("Calisan: %s%n", adSoyad);
        System.out.printf("GELIRLER:%n");
        System.out.printf("Brut Maas : %.2f TL%n", brutMaas);
        System.out.printf("Mesai Ucreti (%d saat) : %.2f TL%n", mesaiSaat, mesaiUcreti);
        System.out.printf("------------------------%n");
        System.out.printf("TOPLAM GELIR : %.2f TL%n", toplamGelir);
        System.out.printf("KESINTILER:%n");
        System.out.printf("SGK Kesintisi (%.1f%%) : %.2f TL%n", SGK_ORANI * 100, sgkKesintisi);
        System.out.printf("Gelir Vergisi (%.1f%%) : %.2f TL%n", GELIR_VERGISI_ORANI * 100, gelirVergisi);
        System.out.printf("Damga Vergisi (%.1f%%) : %.2f TL%n", DAMGA_VERGISI_ORANI * 100, damgaVergisi);
        System.out.printf("------------------------%n");
        System.out.printf("TOPLAM KESINTI : %.2f TL%n", toplamKesinti);
        System.out.printf("NET MAAS : %.2f TL%n", netMaas);
        System.out.printf("====================================%n");
        System.out.printf("KESINTI ORANI : %.1f%%%n", kesintiOrani);
        System.out.printf("Saatlik Net Kazanc : %.2f TL%n", saatlikNetKazanc);
        System.out.printf("Gunluk Net Kazanc : %.2f TL%n", gunlukNetKazanc);
        System.out.printf("====================================%n");

        input.close();
    }
}

