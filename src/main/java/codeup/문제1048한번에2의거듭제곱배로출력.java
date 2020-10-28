package codeup;

import java.util.Scanner;

public class 문제1048한번에2의거듭제곱배로출력 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(String.format("%d", a << b));
    }
}
