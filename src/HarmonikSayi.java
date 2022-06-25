import java.util.Scanner;
public class HarmonikSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;
        System.out.println("n sayisini giriniz : ");
        n = input.nextInt();

        double sonuc = 0.0;

        for (double i = 1.0; i <= n; i++){
            sonuc += (1.0/i);
        }
        System.out.println(sonuc);
    }
}
