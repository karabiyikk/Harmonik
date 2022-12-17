import java.util.Scanner;

public class Harmonik {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("'n' sayısını giriniz : ");
        n = input.nextInt();
        double i, toplam = 0;
        for (i = 1; i <= n; i++) {
            toplam += (1 / i);
        }
        System.out.println(toplam);
    }
}
