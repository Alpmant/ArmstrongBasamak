import java.io.Console;
import java.util.Scanner;





public class Test {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı:");
        int sayi,basamak=0,toplam=0;
        sayi = input.nextInt();
        while (sayi>0)
        {
            toplam= toplam+(sayi%10);
            sayi = sayi/10;
            basamak++;
        }
        System.out.println("Basamak Toplamı:"+toplam);



    }



}




