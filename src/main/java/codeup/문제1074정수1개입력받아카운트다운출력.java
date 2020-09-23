package codeup;

import java.util.Scanner;

public class 문제1074정수1개입력받아카운트다운출력 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (true) {
            if(n<1 || n>100) {
                break;
            }
            System.out.println(n);
            n--;
        }
    }
}