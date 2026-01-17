package sınav;

import java.util.ArrayList;
import java.util.Scanner;

public class OtoparkYonetimSistemi {

    static ArrayList<String> araclar = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int secim;

        do {
            menuGoster();
            secim = scanner.nextInt();
            scanner.nextLine(); // buffer temizleme

            switch (secim) {
                case 1:
                    aracEkle();
                    break;
                case 2:
                    aracCikar();
                    break;
                case 3:
                    araclariListele();
                    break;
                case 4:
                    aracSayisi();
                    break;
                case 0:
                    System.out.println("Programdan çıkılıyor...");
                    break;
                default:
                    System.out.println("Geçersiz seçim!");
            }

        } while (secim != 0);
    }

    public static void menuGoster() {
        System.out.println("\n--- OTOPARK YÖNETİM SİSTEMİ ---");
        System.out.println("1 - Araç Girişi");
        System.out.println("2 - Araç Çıkışı");
        System.out.println("3 - Araçları Listele");
        System.out.println("4 - Toplam Araç Sayısı");
        System.out.println("0 - Çıkış");
        System.out.print("Seçiminiz: ");
    }

    public static void aracEkle() {
        System.out.print("Araç plakası giriniz: ");
        String plaka = scanner.nextLine();
        araclar.add(plaka);
        System.out.println("Araç otoparka eklendi.");
    }

    public static void aracCikar() {
        System.out.print("Çıkış yapacak aracın plakası: ");
        String plaka = scanner.nextLine();

        if (araclar.remove(plaka)) {
            System.out.println("Araç otoparktan çıkarıldı.");
        } else {
            System.out.println("Araç bulunamadı!");
        }
    }

    public static void araclariListele() {
        if (araclar.isEmpty()) {
            System.out.println("Otoparkta araç yok.");
        } else {
            System.out.println("Otoparktaki araçlar:");
            for (String plaka : araclar) {
                System.out.println("- " + plaka);
            }
        }
    }

    public static void aracSayisi() {
        System.out.println("Toplam araç sayısı: " + araclar.size());
    }
}

