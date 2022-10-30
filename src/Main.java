import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayi Giriniz :");
        int n =input.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int a = 0; a < (n - i); a++) {
                System.out.print(" ");
            }
            for (int b = 1; b <= (2 * i - 1); b++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (int i=0;i<=n;i++) {
            for (int a= n; a > (n - i); a--) {
                System.out.print(" ");
            }
            for (int b = 1; b <= (2 * (n - i) - 1); b++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}