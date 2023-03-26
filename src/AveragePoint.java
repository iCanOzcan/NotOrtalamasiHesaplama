import java.util.Scanner;

public class AveragePoint {

    public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    int mat,kimya,fizik,tarih,muzik;

        System.out.print("Matematik notunuz :");
        mat =input.nextInt();

        System.out.print("Kimya notunuz :");
        kimya =input.nextInt();

        System.out.print("Fizik notunuz :");
        fizik =input.nextInt();

        System.out.print("Tarih notunuz :");
        tarih =input.nextInt();

        System.out.print("Muzik notunuz :");
        muzik =input.nextInt();

        int toplam = mat+kimya+fizik+tarih+muzik;
        double ortalama =toplam/5.0;

        System.out.println("Not ortalamaniz :"+ortalama);

        boolean durum = ortalama>=60;
        String sonuc = durum ? "Sınıfı Geçtiniz" : "Sınıfta Kaldınız";
        System.out.println(sonuc);


    }
}
