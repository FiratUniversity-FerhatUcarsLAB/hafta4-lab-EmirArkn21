/*
 * Ad Soyad: Emirhan Arıkan
 * Ogrenci No: 250541005
 * Tarih: 06.11.25
 * Aciklama: Gorev 2 - Geometrik Hesap
 * 
 */

import java.util.Scanner;

public class GeometrikHesap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final double PI = 3.14159;

        System.out.println("=== GEOMETRIK HESAPLAYICI ===");
        System.out.print("Dairenin yaricapini girin (cm): ");
        double yaricap = input.nextDouble();

        double daireAlani = PI * yaricap * yaricap;
        double daireCevresi = 2 * PI * yaricap;
        double daireCapi = 2 * yaricap;
        double kureHacmi = (4.0 / 3.0) * PI * Math.pow(yaricap, 3);
        double kureYuzeyAlani = 4 * PI * yaricap * yaricap;

        System.out.println("SONUCLAR:");
        System.out.println("----------");
        System.out.printf("Daire Alani        : %.2f cm^2%n", daireAlani);
        System.out.printf("Daire Cevresi      : %.2f cm%n", daireCevresi);
        System.out.printf("Daire Capi         : %.2f cm%n", daireCapi);
        System.out.printf("Kure Hacmi         : %.2f cm^3%n", kureHacmi);
        System.out.printf("Kure Yuzey Alani   : %.2f cm^2%n", kureYuzeyAlani);

        input.close();
    }
}
