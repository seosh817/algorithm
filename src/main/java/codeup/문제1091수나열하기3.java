package codeup;

import java.util.Scanner;

public class 문제1091수나열하기3 {

    //String.format("%.lf") 방식은 해당 소수점에서 반올림하여 나타내므로
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long m = sc.nextLong();
        long d = sc.nextLong();
        int n = sc.nextInt();

        for (int i = 1; i < n; i++) {
            a = (a * m) + d;
        }
        System.out.printf("%1d", a);
    }
}
