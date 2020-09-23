package codeup;

import java.util.Scanner;

public class 문제1087여기까지이제그만 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        int a = 0;
        while (true) {
            a += 1;
            sum += a;
            if(sum >= num) {
                System.out.println(sum);
                break;
            }
        }
    }
}
