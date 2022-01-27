import java.util. Scanner;
public class Main
{
    public static void main(String[] args) {

        Scanner inp = new Scanner (System.in);

        System.out.print("Matematik notunuzu girin: ");
        double mat = inp.nextInt();

        System.out.print("Fizik notunuzu girin: ");
        double fizik = inp.nextInt();

        System.out.print("Kimya notunuzu girin: ");
        double kimya = inp.nextInt();

        System.out.print("Türçe notunuzu girin: ");
        double turce = inp.nextInt();


        System.out.print("Tarih notunuzu girin: ");
        double tarih = inp.nextInt();


        System.out.print("Müzik notunuzu girin: ");
        double music = inp.nextInt();

        double sonuc = mat+fizik+kimya+turce+tarih+music;

        double ortalama = sonuc/6;

        String durum = (ortalama>60) ? " Geçti" : " Kaldı";
        System.out.println("Ortalama notunuz: "+ ortalama );
        System.out.print( durum);
    }

}



