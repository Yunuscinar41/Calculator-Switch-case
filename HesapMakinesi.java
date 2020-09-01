package hesap.makinesi;

import java.util.Scanner;

public class HesapMakinesi {

    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
        System.out.println("*******************************");
        String islemler = "1. Toplama islemi\n"
                        + "2. Çıkarma islemi\n"
                        + "3. Çarpma islemi\n"
                        + "4. Bölme islemi";
        System.out.println(islemler);
        System.out.println("********************************");
        System.out.print("İşlemi seçiniz : ");
        String islem = scanner.nextLine();
        double a;
        double b;
        switch(islem){
            case "1":
         System.out.print("1.sayıyı giriniz : ");
            a = scanner.nextDouble();
         System.out.print("2.sayıyı giriniz : ");
            b = scanner.nextDouble();
            double toplam = ((double)a + b);
         System.out.println("İşlemin sonucu : "+ toplam);
            break;
            case "2":
          System.out.print("1.sayıyı giriniz : ");
            a = scanner.nextDouble();
         System.out.print("2.sayıyı giriniz : ");
            b = scanner.nextDouble();
            double toplam1 = ((double)a - b);
         System.out.println("İşlemin sonucu : "+ toplam1);
            break;
            case "3":
          System.out.print("1.sayıyı giriniz : ");
            a = scanner.nextDouble();
         System.out.print("2.sayıyı giriniz : ");
            b = scanner.nextDouble();
            double toplam2 = ((double)a * b);
          System.out.println("İşlemin sonucu : "+ toplam2);
            break;
            case "4":
         System.out.print("1.sayıyı giriniz : ");
            a = scanner.nextDouble();
         System.out.print("2.sayıyı giriniz : ");
            b = scanner.nextDouble();
            double toplam3 = ((double)a/b);     
         System.out.println("İşlemin sonucu : "+ toplam3);
            break;
            default:
         System.out.println("İşlem geçersiz....");
        }
                    
    }
    
}
