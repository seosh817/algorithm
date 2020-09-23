package codeup;

import java.util.Scanner;

public class 문제1083삼육구369게임의왕이되자 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            boolean is369 = false; // 369중 하나가 있는지 판단
            String numString = String.valueOf(i);
            for (int j = 0; j < numString.length(); j++) {
                char checkChar = numString.charAt(j);
                if (checkChar == '3' || checkChar == '6' || checkChar == '9') {
                    System.out.print("X");
                    is369 = true;
                }
            }
            if (!is369) {
                System.out.print(i);
            }
            if (i % 10 == 0) {
                System.out.println();
            } else {
                System.out.print(" ");
            }
        }

    }
}