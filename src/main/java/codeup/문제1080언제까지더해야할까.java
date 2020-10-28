package codeup;

import java.util.Scanner;

public class 문제1080언제까지더해야할까 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 0;
        int b = 0;
        while (true) {
            b++;
            sum += b;
            if (sum >= a) {
                System.out.println(b);
                break;
            }
        }
    }
}
