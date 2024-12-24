package JAVA101;
import java.util.Scanner;
public class yirmidokuzncu_ornek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("sayı giriniz");
        int n = input.nextInt();
        for (int i = n  ; i >= 1; i--) {

            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        }
    }
