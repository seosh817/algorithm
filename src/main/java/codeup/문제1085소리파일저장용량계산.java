package codeup;

import java.util.Scanner;

public class 문제1085소리파일저장용량계산 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int s = sc.nextInt();

        double Byte = (double) h * b * c * s / 8;

        double MByte = (Byte / Math.pow(2, 10) / Math.pow(2, 10));
        System.out.println(String.format("%.1f MB", MByte));
    }
}
