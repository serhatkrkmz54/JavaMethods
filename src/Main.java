import java.util.Scanner;
public class Main {
    static void guleGule(){
        System.out.println("Çıkış Yaptınız...Güle Güle!");
    }
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
    static int bolme(int ilkSayi, int ikinciSayi){
        int sonuc = ilkSayi/ikinciSayi;
        System.out.println("Cevap: "+sonuc);
        return sonuc;
    }
    static int usAlma(int usluSayi, int us){
        int sonuc = 1;
        for(int i=0;i<us;i++){
            sonuc*=usluSayi;
        }
        System.out.println("Cevap: "+sonuc);
        return sonuc;
    }
    static int modAlma(int modSayi, int mod){
        int sonuc = modSayi%mod;
        System.out.println("Cevap: "+sonuc);
        return sonuc;
    }
    static int dikdortgenAlan(int kisaKenar, int uzunKenar){
        int sonuc = kisaKenar*uzunKenar;
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
            if(select==5){
                System.out.print("Üslü Sayı Giriniz: ");
                int usluSayi = giris.nextInt();
                System.out.print("Üs Giriniz: ");
                int us = giris.nextInt();
                usAlma(usluSayi,us);
                continue;
            }
            if(select==6){
                System.out.print("Modu Alınacak Sayıyı Giriniz: ");
                int modSayi = giris.nextInt();
                System.out.print("Mod Giriniz: ");
                int mod = giris.nextInt();
                modAlma(modSayi,mod);
                continue;
            }
            if(select==7){
                System.out.print("Kısa Kenarı Giriniz: ");
                int kisaKenar = giris.nextInt();
                System.out.print("Uzun Kenarı Giriniz: ");
                int uzunKenar = giris.nextInt();
                dikdortgenAlan(kisaKenar,uzunKenar);
                continue;
            }
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
                case 4:
                    bolme(ilkSayi,ikinciSayi);
                    break;
            }
        }
        guleGule();
    }
}