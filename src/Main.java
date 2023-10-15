import java.util.Scanner;

public class Main {
    static int topla(int ilkSayi, int ikinciSayi){
        int sonuc = ilkSayi+ikinciSayi;
        System.out.println("Cevap: "+sonuc);
        return sonuc;
    }
    static int cikartma(int ilkSayi, int ikinciSayi){
        int sonuc = (ilkSayi)-(-ikinciSayi);
        System.out.println("Cevap: "+sonuc);
        return sonuc;
    }
    static int carpma(int ilkSayi, int ikinciSayi){
        int sonuc = ilkSayi*ikinciSayi;
        System.out.println("Cevap: "+sonuc);
        return sonuc;
    }

    public static void main(String[] args) {
        int select;
        Scanner giris = new Scanner(System.in);
        String menu = "1 - Toplama\n" +
                "2 - Çıkarma \n" +
                "3 - Çarpma\n" +
                "4 - Bölme\n" +
                "5 - Üslü Sayı Hesaplama\n" +
                "6 - Mod Alma\n" +
                "7 - Dikdörtgen Alan ve Çevre Hesaplama\n" +
                "0 - Çıkış Yap...";

        while(true){
            System.out.println(menu);
            System.out.print("Yapmak istediğiniz işlemi seçiniz: ");
            select = giris.nextInt();
            if(select==0)
                break;
            System.out.println("İlk Sayıyı giriniz: ");
            int ilkSayi = giris.nextInt();
            System.out.println("İkinci Sayıyı Giriniz: ");
            int ikinciSayi = giris.nextInt();

            switch (select){
                case 1:
                    topla(ilkSayi,ikinciSayi);
                    break;
                case 2:
                    cikartma(ilkSayi,ikinciSayi);
                    break;
                case 3:
                    carpma(ilkSayi,ikinciSayi);
                    break;
            }
        }
        System.out.println("Güle Güle...");

    }
}